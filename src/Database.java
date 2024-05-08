import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

public class Database {
    private static HashMap<String, String> accountList = new HashMap<>();
    private static Path accountPath = Paths.get("database\\nurse\\nurseAccount.txt");

    public static void loadFromFile(){    
        try (BufferedReader reader = new BufferedReader(new FileReader(accountPath.toAbsolutePath().toString()))) {
            String delimiter = ",";
            String line;
            String[] credentials = null;

            while((line = reader.readLine()) != null){
                credentials = line.split(delimiter);
                accountList.put(credentials[0], credentials[1]);
            }        
        } catch (IOException e) {
            System.out.println("Nurse Accounts Not Found");
        }        
    }

    public static void loadToFile(){
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(accountPath.toAbsolutePath().toString()), StandardOpenOption.TRUNCATE_EXISTING)) {
            for (Map.Entry<String, String> account : accountList.entrySet()) {
                writer.write(account.getKey());
                writer.write(',');
                writer.write(account.getValue());
                writer.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showAccounts(){
        for(Map.Entry<String, String> account: accountList.entrySet()){
            System.out.println("Account: " + account.getKey());
            System.out.println("Password: " + account.getValue());
            System.out.println();
        }
    }

    public static HashMap<String, String> getAccounts(){
        return accountList;
    }
}