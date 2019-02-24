interface Repairable{
}
class Unit{
    int hp;
    final int MAX_HP;
    Unit(int hp, int MAX_HP){
        this.hp=hp;
        this.MAX_HP=MAX_HP;
    }
}
class GroundUnit extends Unit{
    GroundUnit(int hp, int MAX_HP){
        super(hp,MAX_HP);
    }

}
class AirUnit extends Unit{
    AirUnit(int hp, int MAX_HP){
        super(hp,MAX_HP);
    }

}
class Marin extends GroundUnit{
    Marin(){
        super(60,60);
    }

}
class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(125,150);
    }

}
class Scv extends GroundUnit implements Repairable{
    Scv(){
        super(40,40);
    }
    void repair(Repairable r){
        Object unit =(Unit)r;

    }

}
class Dropship extends AirUnit implements Repairable{
    Dropship(){
        super(110,125);
    }

}
public class Hw7 {
    public static void main(String []args){

    }

}
