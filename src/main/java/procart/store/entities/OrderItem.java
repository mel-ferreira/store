package procart.store.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import procart.store.entities.pk.OrderItemPK;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_pedido_produto")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private Integer quantidade;
    private Double preco;

    public OrderItem(){}

    public OrderItem(Order pedido, Product produto, Integer quantidade, Double preco) {
        super();
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    @JsonIgnore
    public Order getPedido()
    {
        return id.getPedido();
    }
    public void setPedido(Order pedido)
    {
        id.setPedido(pedido);
    }

    public Product getProduto()
    {
        return id.getProduto();
    }
    public void setProduto(Product produto)
    {
        id.setProduto(produto);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
