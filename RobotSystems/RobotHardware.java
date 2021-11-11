package org.firstinspires.ftc.teamcode.RobotSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class RobotHardware {
    public DcMotor leftFrontDrive = null;
    public DcMotor leftBackDrive = null;
    public DcMotor rightFrontDrive = null;
    public DcMotor rightBackDrive = null;

    public DcMotor arm = null;

    HardwareMap hwMap = null;

    public void init (HardwareMap ahwMap){
        hwMap = ahwMap;


        // DriveTrain
        leftFrontDrive = hwMap.get(DcMotor.class, "lfd");
        leftBackDrive = hwMap.get(DcMotor.class, "lbd");
        rightFrontDrive = hwMap.get(DcMotor.class, "rfd");
        rightBackDrive = hwMap.get(DcMotor.class, "rbd");

        leftFrontDrive.setDirection(DcMotor.Direction.FORWARD);
        leftBackDrive.setDirection(DcMotor.Direction.FORWARD);
        rightFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        rightBackDrive.setDirection(DcMotor.Direction.REVERSE);

        leftFrontDrive.setPower(0);
        rightFrontDrive.setPower(0);
        leftBackDrive.setPower(0);
        rightBackDrive.setPower(0);

        leftFrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightFrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftBackDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightBackDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        // DriveTrain End

        // ArmSystem
        arm = hwMap.get(DcMotor.class, "arm");
        arm.setDirection(DcMotorSimple.Direction.FORWARD);
        arm.setPower(0);
        arm.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        // ArmSystem End
    }
}




