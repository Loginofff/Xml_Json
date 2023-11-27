package lesson5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class CatSave {
  public static void main(String[] args) {
   try {

     File file = new File("cat.json");
     file.createNewFile();
     Cat cat = new Cat(3,"Black",4.56);
     System.out.println("Created object");
     System.out.println(cat);


     ObjectMapper mapper =new ObjectMapper();
     mapper.writeValue(file, cat);


   } catch (Exception e) {

     System.out.println(e.getMessage());
   }


  }
}
