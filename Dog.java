public class Dog{

private String name;
private String breed;
private double weight;
private String color;
private boolean houseTrained;

public Dog (String llname, String llbreed, double llweight, String llcolor, boolean llhouseTrained){
  name = llname;
  breed = llbreed;
  weight = llweight;
  color = llcolor;
  houseTrained = llhouseTrained;
}
public String getName(){
  return name;
}
public String getbreed(){
  return breed;
}
public double getWeight(){
  return weight;
}
public String getColor(){
  return color;
}
public boolean isTrained(){
  return houseTrained;
}
public String toString(){
  return name + "🐶"; 
}






}