package task_3;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class CatSave {
  public static void main(String[] args) {
   try {

     File file = new File("cat.xml");
     file.createNewFile();

     Cat cat = new Cat(3,"Black",4.56);
     System.out.println("Created object");
     System.out.println(cat);

     JAXBContext context = JAXBContext.newInstance(Cat.class);
     Marshaller marshaller = context.createMarshaller();
     marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
     marshaller.marshal(cat, file);


   } catch (Exception e) {

     System.out.println(e.getMessage());
   }


  }
}
