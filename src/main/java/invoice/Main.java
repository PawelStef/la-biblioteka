package invoice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Program do operacjach na danych w bazie");
        System.out.println("Biblioteka");
        DataLoader dataL = new DataLoader();
        boolean quit = false;

        String menuItem;

        do {
            System.out.println("Możliwe opcje:");
            System.out.println("-addAuthor-  -listAuthor-  -deleteAuthor-  --  --  --  --  --  --  -quit-");
            int id;
            menuItem = dataL.getScanner().nextLine().toLowerCase();

            switch (menuItem) {

                case "addauthor":
                    dataL.addAuthor();
                    break;

                case "listauthor":
                    dataL.listAuthor();

                    break;

                case "deleteauthor":
                    dataL.deleteAuthor();

                    break;

                case "takeinvoice":
                    /*
                    System.out.println("Take invoice:");
                    System.out.println("Invoice id?:");
                    idL = Long.parseLong(sc.nextLine());
                    Invoice invoice3 = entityDao.getById(Invoice.class, idL).get();
                    invoice3.setDataWydania(LocalDateTime.now());
                    System.out.println("Client name :" + invoice3.getNazwaKlijenta());
                    System.out.println("Invoice sum :" + invoice3.getBillValue());
                    System.out.println("Invoice relese data :" + invoice3.getDataWydania());
                    System.out.println("Invoice open data :" + invoice3.getDataDodania());
                    System.out.println("Products:");
                    entityDao.getById(Invoice.class, idL).get().getProductList().forEach(System.out::println);
                    entityDao.saveOrUpdate(invoice3);
*/
                    break;

                case "pay":
                    /*
                    System.out.println("Pay invoice:");
                    System.out.println("Invoice id?:");
                    idL = Long.parseLong(sc.nextLine());
                    Invoice invoice2 = entityDao.getById(Invoice.class, idL).get();
                    invoice2.setCzyOplacony(true);

                    invoice2.setDataIGodzinaOpłacenia(LocalDateTime.now());
                    entityDao.saveOrUpdate(invoice2);
*/
                    break;

                case "allunpaid":
                    /*

                    System.out.println("All unpaid invoids:");

                    invoiceDao.getAllUnpaid().forEach(System.out::println);


*/

                    break;

                case "list":
                    /*
                    System.out.println("List invoices");


                    entityDao.getAll(Invoice.class).forEach(System.out::println);
                    //studentDao.listStudents().forEach(System.out::println);

*/
                    break;

                case "getid":
                    /*

                    System.out.println("Get one client by id.");

                    System.out.println("Client id?:");
                    idL = Long.parseLong(sc.nextLine());
                    System.out.println(entityDao.getById(Invoice.class, idL).toString());
*/
                    break;

                case "listprod":
                    /*

                    System.out.println("Invoice id:");
                    idL = Long.parseLong(sc.nextLine());
                    System.out.println(entityDao.getById(Invoice.class, idL).get().getProductList());

*/
                    break;

                case "edit":

                    System.out.println("Edit student");

                    break;

                case "quit":

                    System.out.println("You've chosen qiut ");

                    quit = true;
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (!quit);

        System.out.println("Bye-bye!");

    }
}
