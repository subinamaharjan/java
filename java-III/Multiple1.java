interface A{
String name;
int age;
public A(String name,int age){
this.name;
this.age;
}
void show(){
System.out.println("name="+this.name+"age="+this.age);
}
}
interface B{
String fac;
int roll;
public B(String fac,int roll){
this.fac=fac;
this.roll=roll;
}
void show(){
System.out.println("fac="+this.fac+"roll="+this.roll);
}
}
class Multiple1 implements A,B{
public Multiple(String name,int age,String fac,int roll){
super(name,age,fac,roll);
}
public void(){
System.out.println("name="+this.name+"age="+this.age+"fac="+this.fac+"roll="+this.roll);
}
public static void main(String[] args){
Multiple1 m=new Multiple1("sam",20,"se",12);
m.show();
}
}

