package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="EXAMPLE", group="TeleOp")
@Disabled
public class TeleOpExample extends OpMode {

        DriveTrainMethodTeleOp drivetrain = null;
    private Object HardwareMap;

    @Override
        public void init() {
        drivetrain = new DriveTrainMethodTeleOp();
        drivetrain.driveMotors((com.qualcomm.robotcore.hardware.HardwareMap) HardwareMap);
        }
        @Override
        public void loop() {
            drivetrain.omnidirectional(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.left_stick_x);
            /*robot.turndrive(gamepad1);*/
        }
}