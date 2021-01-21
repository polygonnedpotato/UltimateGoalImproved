package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="GrabberTeleOp", group="TeleOp")
//@Disabled
public class GrabberTeleop extends OpMode {

    GrabberMethodTeleOp grabber = null;
    boolean dLeft = gamepad1.dpad_left;
    boolean dRight = gamepad1.dpad_right;
    boolean dUp = gamepad1.dpad_up;
    boolean dDown = gamepad1.dpad_down;

    @Override
    public void init() {
        grabber = new GrabberMethodTeleOp();
        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {
        grabber.grabbergrab( dLeft,  dRight);
        grabber.grabberlift( dUp,  dDown);
        if (dUp || dDown) {
            grabber.grabberlift( dUp,  dDown);
        }
        else if (dLeft || dRight) {
            grabber.grabbergrab( dLeft,  dRight);
        }

    }
}

