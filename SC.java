import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.Tools;
public class SC {
SC(){
LegoRobot robot = new LegoRobot();
Gear gear = new Gear();
robot.addPart(gear);
for (int k = 1; k < 6; k++ )
{
int speed;

switch(k)
{
case 1:
speed = 10;
break;
case 2:
speed = 50;
break;
case 3:
speed = 100;
break;
case 4:
speed = 150;
break;
default:
speed = 60;
}
gear.setSpeed(speed);
gear.forward();
Tools.delay(2000);
gear.right(550);
}}
public static void main(String[] args) {
new SC();
}}
