 package carProject;

import java.util.ArrayList;
import java.util.List;

public class Mydata {
	public static   List<User> userList=new ArrayList<User>();
	 public static List<Product> products = new ArrayList<Product>();

 	public  List<User> getUserList() {
		return userList;
	}

	public  void setUserList(List<User> userList) {
		Mydata.userList = userList;
	}





	
	public static   List<User> listUser(){
	    userList.add(new User("Lama","example1@gmail.com", "password1" ,"customer", "18"));
        userList.add(new User("Ibtissam","example2@gmail.com", "password2" ,"installer", "27"));
        userList.add(new User("Sami","example3@gmail.com", "password3" ,"Admin"," 21"));
        
            return userList;
       }


	
	public static   List<Product> listProduct(){

	        products.add(new Product("Car Seat Cover",
	                "High-quality seat cover for cars",
	                49.99,
	                "Interior",
	                "available"));

	        products.add(new Product("Car GPS Navigation System",
	                "Advanced GPS navigation system for cars",
	                199.99,
	                "Electronics",
	                "available"));

	        products.add(new Product("Alloy Wheels",
	                "Set of 4 stylish alloy wheels",
	                249.99,
	                "Exterior",
	                "available"));

	        

	        products.add(new Product("Car Audio System",
	                "Premium car audio system with Bluetooth connectivity",
	                299.99,
	                "Electronics",
	                "available"));

	        return products;
	    }







}