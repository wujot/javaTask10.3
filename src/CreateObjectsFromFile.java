import java.io.IOException;

public class CreateObjectsFromFile {

    public static void main(String[] args) throws IOException {

        Methods methods = new Methods();

        // name of a file with products
        String fileName = "produkty.csv";

        // read and assign objects from .csv file into array of Product objects
        Product[] products = methods.readAndAssign(fileName);

        // print sum of prices of all products
        System.out.printf("The sum of prices of all products is: %f\n", methods.sumOfPrices(products));

        // print the most expensive product
        System.out.printf("The most expensive product is: \n%s\n", methods.mostExpensive(products).toString());
    }
}
