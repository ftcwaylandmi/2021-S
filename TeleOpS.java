package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotSystems.Robot;

@TeleOp(name="TeleOpS", group="11846")
public class TeleOpS extends OpMode{
    Robot robot = new Robot();

    double left = 0.00;
    double right = 0.00;
    final double slidePower = 1.00;

    @Override
    public void init() {
        robot.initHW(hardwareMap);
    }

    @Override
    public void loop() {
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;



        if(gamepad1.right_bumper) { // Slide Right
            robot.SlideRight(slidePower);
        } else if(gamepad1.left_bumper) { // Slide Left
            robot.SlideLeft(slidePower);
        } else { // Drive Normal
            robot.LeftDrive(right);
            robot.RightDrive(left);
        }


        telemetry.update();

        }
    }