import com.skillbox.airport.*;

import java.util.List;


public class main {


    public static void main (String[] args) {

        Airport airport = Airport.getInstance();

        List<Aircraft> aircrafts = airport.getAllAircrafts();
        List<Terminal> terminals = airport.getTerminals();

        System.out.println("Названия самолетов: " + aircrafts);
        System.out.println("Количество самолетов = " + aircrafts.size());
        System.out.println("Названия терминалов: " + terminals);
        System.out.println("Количество терминалов = " + terminals.size());
    }
}
