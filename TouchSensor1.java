import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;
import ch.aplu.robotsim.Tools;
import ch.aplu.robotsim.TouchSensor;
public class TouchSensor1 {
TouchSensor1()
{
LegoRobot robot = new LegoRobot();
Gear gear = new Gear();
robot.addPart(gear);
TouchSensor ts1 = new TouchSensor(SensorPort.S1);
TouchSensor ts2 = new TouchSensor(SensorPort.S2);
robot.addPart(ts1);
robot.addPart(ts2);
gear.forward();
while (true)
{
boolean t1 = ts1.isPressed();
boolean t2 = ts2.isPressed();
if (t1 && t2)
{
gear.backward(500);
gear.left(400);
gear.forward();
}
else
{
if (t1)
{
gear.backward(500);
gear.left(400);
gear.forward();
}
else

{
if (t2)
{
gear.backward(500);
gear.right(100);
gear.forward();
}
}
}
Tools.delay(20);
}
}
public static void main(String[] args)
{
new TouchSensor1();
}
static
{
RobotContext.setLocation(10, 10);
RobotContext.setStartDirection(4);
RobotContext.setStartPosition(100, 240);
RobotContext.useObstacle("sprites/channel.gif", 250,
250);
}
}
