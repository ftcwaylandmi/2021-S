package org.firstinspires.ftc.teamcode.RobotSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class DriveTrain {

    RobotHardware robotHardware = new RobotHardware();

    public void initHW(HardwareMap ahw) { // init All Hardware/Devices
        robotHardware.init(ahw);
    }

    public void initRobot() {
    }

    public void Drive(double p) {
        robotHardware.leftFrontDrive.setPower(-p);
        robotHardware.rightFrontDrive.setPower(-p);
        robotHardware.leftBackDrive.setPower(-p);
        robotHardware.rightBackDrive.setPower(-p);
    }

    public void StopDrive() {
        robotHardware.leftFrontDrive.setPower(0);
        robotHardware.rightFrontDrive.setPower(0);
        robotHardware.leftBackDrive.setPower(0);
        robotHardware.rightBackDrive.setPower(0);
    }

    public void RightDrive(double p) {
        robotHardware.leftFrontDrive.setPower(p);
        robotHardware.rightFrontDrive.setPower(0);
        robotHardware.leftBackDrive.setPower(p);
        robotHardware.rightBackDrive.setPower(0);
    }

    public void LeftDrive(double p) {
        robotHardware.leftFrontDrive.setPower(0);
        robotHardware.rightFrontDrive.setPower(p);
        robotHardware.leftBackDrive.setPower(0);
        robotHardware.rightBackDrive.setPower(p);
    }

    public void SlideRight(double p){
        robotHardware.leftFrontDrive.setPower(-p);
        robotHardware.rightFrontDrive.setPower(-p);
        robotHardware.leftBackDrive.setPower(p);
        robotHardware.rightBackDrive.setPower(p);
    }

    public void SlideLeft(double p){
        robotHardware.leftFrontDrive.setPower(p);
        robotHardware.rightFrontDrive.setPower(p);
        robotHardware.leftBackDrive.setPower(-p);
        robotHardware.rightBackDrive.setPower(-p);
    }

    public void wait(int sleeptime) {
        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < sleeptime) {

        }
    }
}