package functionalprog;

/**
 * Created by dmalli on 10/19/2016.
 */
public class FunctionalDemo {

    public static void main(String args[]){
 /*       PrinterService printerService = new PrinterService() {
            public void print() {
                System.out.println("Functional Programming  Demo");
            }
        };

        printerService.print(); //old way of programmming
*/

        PrinterService newWay = () -> System.out.println("Display from new Lambda Expression");
        newWay.print();
    }
}
