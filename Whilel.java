import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.Tools;
public class Whilel
{
Whilel()
{
LegoRobot robot=new LegoRobot();
Gear gear=new Gear();
robot.addPart(gear);
int i=0;
while(i<4)
{
gear.forward();
Tools.delay(2000);
gear.left(550);
i++;
}
}
public static void main(String[] args)
{
new Whilel();
}
}
