import java.util.ArrayList;

public class Drake_Burner extends Unit{

    public Drake_Burner(String name) {
        setType_name("Drake_Burner");
        setMoves(4);
        setMax_health(38);
        setName(name);

        Weapon Claws = new Weapon("claws",2,7,"blade",false);
        Weapon Fire_breath = new Weapon("fire breath",4,6,"fire",true);

        addWeapons(Claws);
        addWeapons(Fire_breath);
    }
}
