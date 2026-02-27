package procart.store.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import procart.store.entities.User;
import procart.store.repositories.UserRepository;
import procart.store.services.exceptions.DatabaseException;
import procart.store.services.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll()
     {
         return userRepository.findAll();
     }

     public User findById(Long id)
     {
         Optional<User> obj = userRepository.findById(id);
         return obj.orElseThrow(() -> new ResourceNotFoundException(id));
     }

     public User insert(User obj)
     {
         return userRepository.save(obj);
     }

     public void delete(Long id)
     {
         try
         {
             userRepository.deleteById(id);
         }
         catch(EmptyResultDataAccessException e)
         {
             throw new ResourceNotFoundException(id);
         }
         catch(DataIntegrityViolationException e)
         {
            throw new DatabaseException(e.getMessage());
         }
     }

     public User update(Long id, User obj)
     {
         try {
             User entity = userRepository.getReferenceById(id);
             updateData(entity, obj);
             return userRepository.save(entity);
         }
         catch(EntityNotFoundException e)
         {
             throw new ResourceNotFoundException(id);
         }
     }

    private void updateData(User entity, User obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setTelefone(obj.getTelefone());
    }

}
