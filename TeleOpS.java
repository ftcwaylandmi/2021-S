package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotSystems.DriveTrain;
import org.firstinspires.ftc.teamcode.RobotSystems.SubSystems.ArmSystem;

@TeleOp(name="TeleOpS", group="11846")
public class TeleOpS extends OpMode{
    DriveTrain driveTrain = new DriveTrain();
    ArmSystem armSystem = new ArmSystem();

    double left = 0.00;
    double right = 0.00;
    final double slidePower = 1.00;

    @Override
    public void init() {
        driveTrain.initHW(hardwareMap);
    }

    @Override
    public void loop() {
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;



        if(gamepad1.right_bumper) { // Slide Right
            driveTrain.SlideRight(slidePower);
        } else if(gamepad1.left_bumper) { // Slide Left
            driveTrain.SlideLeft(slidePower);
        } else { // Drive Normal
            driveTrain.LeftDrive(right);
            driveTrain.RightDrive(left);
        }

        armSystem.ArmControl(gamepad2.right_stick_y);

        telemetry.update();

        }
    }