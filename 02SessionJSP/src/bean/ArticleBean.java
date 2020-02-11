package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArticleBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ArticleBean(){}
	private String product;
	private String price;
	
	private Set<ArticleBean> ArticleBeanSet = new  HashSet<ArticleBean>();
	
	private List <ArticleBean> ArticleBeanList = new ArrayList<ArticleBean>();
	private List <Product> productos =new ArrayList<Product>();
	
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Set<ArticleBean> getArticleBeanSet() {
		return ArticleBeanSet;
	}
	public void setArticleBeanSet(Set<ArticleBean> articleBeanSet) {
		ArticleBeanSet = articleBeanSet;
	}
	public List<ArticleBean> getArticleBeanList() {
		return ArticleBeanList;
	}
	public void setArticleBeanList(ArticleBean articleBeanList) {

		ArticleBeanList.add(articleBeanList);
	}
	public List<Product> getProductos() {
		return productos;
	}
	public void setProductos(Product product) {
		productos.add(product);
	}

}
