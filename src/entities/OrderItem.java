package entities;

public class OrderItem {
    private Integer quantity;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantitu, Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return quantity * product.getPrice();
    }
}
