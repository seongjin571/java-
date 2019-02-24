interface Repairable {
}

class Unit {
    int hp;
    final int MAX_HP;

    Unit(int hp, int MAX_HP) {
        this.hp = hp;
        this.MAX_HP = MAX_HP;
    }
}

class GroundUnit extends Unit {
    GroundUnit(int hp, int MAX_HP) {
        super(hp, MAX_HP);
    }

}

class AirUnit extends Unit {
    AirUnit(int hp, int MAX_HP) {
        super(hp, MAX_HP);
    }

}

class Marin extends GroundUnit {
    Marin() {
        super(60, 60);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(125, 150);
    }
    public String toString(){
        return "Tank";
    }

}

class Scv extends GroundUnit implements Repairable {
    Scv() {
        super(40, 40);
    }

    void repair(Repairable r) {

        Unit u = (Unit) r;
        while (u.hp != u.MAX_HP) {
            u.hp++;
        }

        System.out.println(u.toString()+"치료가 완료되었습니다. 현재 hp는 "+u.hp+"입니다.");
    }

}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(110, 125);
    }
    public String toString(){
        return "Dropship";
    }

}

public class Hw7 {
    public static void main(String[] args) {
        Scv scv = new Scv();
        Tank tank = new Tank();
        Marin marin = new Marin();
        Dropship dropship = new Dropship();
        scv.repair(tank);
        scv.repair(dropship);

    }

}
