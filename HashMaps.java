import java.io.*;
import java.util.*;
public class HashMaps{

    public static void main(String[] args){
        //creating a hash for the name
     String name = "Lizalise";
     int key = name.hashCode();
     System.out.println(key);
            // Initializing a Hashtable using Generics
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

	// Inserting elements to the hashtable using put() method
        ht.put(1, "My");
        ht.put(2, "CSC");
        ht.put(3, "211");
	ht.put(4, "Success");	

	// Printing the mappings (key/value) to the console
	System.out.println();
        System.out.println(" \n Mappings of ht are as follows:\n" + ht);
        System.out.println(ht.get(1));





    }



  
}
