 import java.lang.reflect.Method;
public class A{
private void message(){
System.out.println("hello java");
}
}
//import java.lang.reflect.Method;
public class MethodCall{
public static void main(String[] args)throws Exception{
Class c=Class.forName("A");
Object o=c.newInstance();
Method m=c.getDeclaredMethod("message",null);
m.setAccessible(true);
m.invoke(0,null);
}
}
