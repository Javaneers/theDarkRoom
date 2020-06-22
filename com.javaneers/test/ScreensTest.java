import com.javaneers.game.Screens;
import com.javaneers.game.*;

import java.util.ArrayList;

public class ScreensTest {
  public static void main(String[] args) {
    Screens screen1 = new Screens("Header","Par",new ArrayList<String>());
    screen1.drawHeader();
  }
}
