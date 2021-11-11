package org.firstinspires.ftc.teamcode.RobotSystems.SubSystems;

import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.RobotSystems.RobotHardware;

public class ArmSystem {

    RobotHardware robotHardware = new RobotHardware();

    public void ArmControl(double p){
        robotHardware.arm.setPower(p);
    }

}
