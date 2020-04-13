package lab8;
import lab8.simple.Flower;
import lab8.simple.Grass;
import lab8.simple.Mushroom;
import lab8.simple.OakTree;
import lab8.simple.PineTree;
import lab8.composite.Field;
import lab8.composite.Forest;

public class Main {
public static void main(String[] args) {
    Grass g=new Grass();
    Flower f=new Flower();
    Mushroom m=new Mushroom();
    Mushroom m2=new Mushroom();
    PineTree p=new PineTree();
    OakTree o=new OakTree();
    Field f1=new Field();
    f1.add(g);
    f1.add(f);
    Field f2=new Field();
    f2.add(m);
    f2.add(m2);
    Forest forest=new Forest();
    forest.add(f1);
    forest.add(f2);
    forest.add(p);
    forest.add(o);
    System.out.println(forest.getRepresentation());
    System.out.println(forest.getOxigenAmountPerYear());
    System.out.println(forest.getLifeTime());
}
}
