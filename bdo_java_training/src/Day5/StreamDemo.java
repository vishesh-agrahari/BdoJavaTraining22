package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	Float price;
	 Product() {
		
	}
	Product(int id, String name,float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamDemo {

	public static void main(String[] args) {
		List<Product> product = new ArrayList<Product>();
        product.add(new Product(1,"samsung",3500f));
        product.add(new Product(2,"realme",3000f));
        product.add(new Product(3,"iphone",4000f));
        
//        Without use of stream
        List<Float> productpricelist = new ArrayList<Float>();
        for(Product p:product) {
        	if(p.price<4000) {
        		productpricelist.add(p.price);
        	}
        }
        System.out.println(productpricelist);
        
//        With use of streams
        List<Float> productpricelist2 = product.stream().filter(p->p.price<4000).map(p->p.price).collect(Collectors.toList());
        System.out.println(productpricelist2);
        
	}

}
