package productcrudapp.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import productcrudapp.model.Product;

@Component
public class ProductDao {

  @Autowired
  private SessionFactory factory;

  //create
  @Transactional
  public void createProduct(Product product) {
    this.factory.getCurrentSession().persist(product);
  }

  //get all productd
  public List<Product> getProducts() {
    List<Product> products =
      this.factory.getCurrentSession()
        .createQuery("from Product", Product.class)
        .getResultList();
    return products;
  }

  //delete the single product
  @Transactional
  public void deleteProduct(int pid) {
    Product p = this.factory.getCurrentSession().get(Product.class, pid);
    this.factory.getCurrentSession().remove(p);
  }

  //get single product
  public Product getProduct(int pid) {
    return this.factory.getCurrentSession().get(Product.class, pid);
  }

  @Transactional
  public void updateProduct(Product product) {
    this.factory.getCurrentSession().merge(product);
  }
}
