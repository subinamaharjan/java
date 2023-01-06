import java.awt.*;
class Piechart extends Frame{
final int[] data={50,15,10};
final Color[] colors={Color.RED,Color.BLUE,Color.PINK};
public Piechart(){
setSize(400,500);
setVisible(true);
}
public int getSum(){
int sum=0;
for(int value:data){
sum=sum+value;
}
return sum;
}
public int[] getAngles(int sum){
int[] angles=new int[data.length];
for(int i=0;i<data.length;i++){
angles[i]=Math.round(360*data[i]/sum);
}
return angles;
}

public void paint(Graphics g){
int sum=this.getSum();
int[] angles=this.getAngles(sum);
int StartAngle=0;
for(int i=0;i<angles.length;i++){
g.setColor(colors[i]);
g.fillArc(100,50,75,75,StartAngle,angles[i]);
StartAngle=StartAngle+angles[i];
}
}
public static void main(String[] args){
new Piechart();
}
}

