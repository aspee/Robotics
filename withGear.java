import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.Tools;
public class withGear {
withGear() {
LegoRobot robot=new LegoRobot();
Gear gear=new Gear();
robot.addPart(gear);
gear.forward();
Tools.delay(2000);
gear.left(550);
gear.forward();
Tools.delay(2000);
gear.left(550);
gear.forward();
Tools.delay(2000);
gear.left(550);
gear.forward();
Tools.delay(2000);
gear.right(550);
gear.forward();
Tools.delay(2000);
}
public static void main(String[] args) {
new withGear();
}
}