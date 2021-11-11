package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.RobotSystems.Robot;

@Autonomous(name = "AutoTest", group = "11846")
public class AutoTest extends LinearOpMode{
    private ElapsedTime myruntime = new ElapsedTime();
    private Robot robot = new Robot();

    @Override
    public void runOpMode(){
        telemetry.addData("Status", "I am booting up. Almost there");
        telemetry.update();

        robot.initHW(hardwareMap);
        waitForStart();
        myruntime.reset();

        robot.wait(3000);
        robot.Drive(1);
        robot.wait(1000);
        robot.StopDrive();


    }

}