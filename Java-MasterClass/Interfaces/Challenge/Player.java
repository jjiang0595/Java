package Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    // write code here
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(0, this.name);
        list.add(1, "" + this.hitPoints);
        list.add(2, "" + this.strength);
        list.add(3, this.weapon);
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            this.name = list.get(0);
            this.weapon = list.get(1);
            this.hitPoints = Integer.parseInt(list.get(2));
            this.strength = Integer.parseInt(list.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{name='Jerry', hitPoints=" + this.hitPoints +
                ", strength=" + this.strength + ", weapon='Sword'";
    }

}