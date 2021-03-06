package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "GrabberTeleOp", group = "TeleOp")
//@Disabled
public class GrabberTeleop extends OpMode {


    GrabberMethodTeleOp grabber;

    @Override
    public void init() {
        grabber = new GrabberMethodTeleOp(hardwareMap);
    }

    /*@Override
    public void init() {
        drivetrain = new DriveTrainMethodTeleOp();
        drivetrain.driveMotors(hardwareMap);
    }*/
    @Override
    public void loop() {
        grabber.grabbergrab(gamepad1.dpad_left, gamepad1.dpad_right);
        grabber.grabberlift(gamepad1.dpad_up, gamepad1.dpad_down, gamepad1.left_bumper);
    }
}

