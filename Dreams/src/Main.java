import Caracters.Elf;
import Caracters.Santa;
import Caracters.Teddy;
import Form.GameScreen;

public class Main {
    public static void main(String[] args) {

//
            GameScreen gameScreen = new GameScreen("Teddy's X-mas murders");
            gameScreen.setVisible(true);


        Teddy teddy = new Teddy("Harold", "Home",  28);
        Santa santa = new Santa("Saint Nicholas", "North Pole", 1751);
        Elf elf = new Elf("Ithil", "North Pole", 750);



    }
}
