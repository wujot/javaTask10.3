import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Methods {

    // read and assign objects from .csv file
    public Product[] readAndAssign(String filename) {

        // create array of Product objects
        Product[] products = new Product[4];
        products[0] = new Product();
        products[1] = new Product();
        products[2] = new Product();
        products[3] = new Product();

        // variables
        FileReader fileReader = null;
        BufferedReader br = null;
        String line = null;
        String[] lines = null;
        int increase = 0;

        // read and assign objects from .csv file
        try {
            fileReader = new FileReader("produkty.csv");
            br = new BufferedReader(fileReader);

            while ((line = br.readLine()) != null) {
                lines = line.split(";");
                products[increase].setName(lines[0]);
                products[increase].setManufacture(lines[1]);
                products[increase].setPrice(Double.parseDouble(lines[2]));
                increase++;
            }
            br.close();
            System.out.println("CSV file was read successfully.\n");
            System.out.println("Objects were assigned successfully.\n");
        } catch (Exception e) {
            System.out.println("Error in CsvFileReader\n");
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader\n");
                e.printStackTrace();
            }

        }
        return products;
    }

    public double sumOfPrices(Product[] products) {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        return sum;
    }

    public Product mostExpensive(Product[] products) {
        Product expensive = new Product();
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > expensive.getPrice()) {
                expensive = products[i];
            }
        }
        return expensive;
    }
}
