import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListObject {
    public static void main(String[] args) {
        
        

        List<Band> listBand = new ArrayList<Band>();

        Band band1 = new Band();
        Band band2 = new Band();

        band1.setId(1);
        band1.setNama_band("The Black Dahlia Murder");
        band1.setGenre("Metol");

        band2.setId(2);
        band2.setNama_band("ST12");
        band2.setGenre("Punk");

        listBand.add(band1);
        listBand.add(band2);

        for(Band bandList : listBand) {
            System.out.println("id: " + bandList.getId());
            System.out.println("Nama Band: " + bandList.getNama_band());
            System.out.println("Genre: " + bandList.getGenre());
            System.out.println();
        }
    }
}