package client;
import java.util.Scanner;

import Buisness_logic.ProductRepo;
public class ProductManage {

	public static void main(String[] args) {
		while(true) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter your choice: "+'\n'+ 
				   "press 1 for insert"+'\n'+"press 2 for view"+'\n'+"press 3 for update"+'\n'+"press 4 for delete"+'\n'+"press 5 for exit  ");
		   int choice = sc.nextInt();
		   switch(choice){   
		      case 1: ProductRepo.createProduct();
		      break;  
		      case 2: ProductRepo.viewProduct();  
		      break;  
		      case 3: ProductRepo.updateProduct();
		      break;
		      case 4: ProductRepo.deleteProduct();
		      break;
		      case 5: System.exit(0);
		      default:System.out.println("wrong input!!! TRY Again");
		    } 
		   }

		
	}

}
