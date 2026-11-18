import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class CountrySetDemo {
    public static void main(String[] args) {

        HashSet<String> countries = new HashSet<>();

        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Indonesia");

        System.out.println(countries);
        System.out.println("Jumlah elemen = " + countries.size());

        System.out.println("\nCek Indonesia:");
        System.out.println(countries.contains("Indonesia"));

        countries.remove("Japan");

        System.out.println("\nSetelah menghapus Japan:");
        System.out.println(countries);

        System.out.println("Jumlah elemen = " + countries.size());

        ArrayList<String> countriesList = new ArrayList<>();

        countriesList.add("Japan");
        countriesList.add("Indonesia");
        countriesList.add("Malaysia");

        Collections.sort(countriesList);

        System.out.println("\nCountries setelah sorting:");
        System.out.println(countriesList);

        HashSet<String> countriesSet = new HashSet<>();
        // Collections.sort(new ArrayList<>(countriesSet));
    }
}