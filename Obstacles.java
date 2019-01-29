import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;
import ch.aplu.robotsim.TouchSensor;
public class Obstacles {
static
{
RobotContext.showNavigationBar();
RobotContext.useObstacle("sprites/bar0.gif",250,200); 
RobotContext.useObstacle("sprites/bar1.gif",400, 250);
RobotContext.useObstacle("sprites/bar2.gif", 250,400); 
RobotContext.useObstacle("sprites/bar3.gif",100, 250);
}
Obstacles(){
LegoRobot robot=new LegoRobot();
Gear gear=new Gear();
TouchSensor ts=new TouchSensor(SensorPort.S3);
robot.addPart(gear);
robot.addPart(ts);
gear.setSpeed(30);
gear.forward();
while(true)
{
if(ts.isPressed())
{
gear.backward();
gear.left(750);
gear.forward();
}
}
    }
public static void main(String[] args) {
new Obstacles();
}
}
