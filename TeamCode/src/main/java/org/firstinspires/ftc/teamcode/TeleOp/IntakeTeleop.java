package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="IntakeTeleOp", group="TeleOp")
//@Disabled
public class IntakeTeleop extends OpMode {
    boolean leftbumper;
    boolean rightbumper;

    IntakeMethodTeleOp intake;
    IntakeStorageGauge gauge = null;
    double power = 1;
    @Override
    public void init() {
        intake = new IntakeMethodTeleOp();
        gauge = new IntakeStorageGauge();
        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {
        //dont intake >:()
      //  gauge.rings();
        //if (gauge.isyellow2 () == true && gauge.isyellow3 () == true) {
            intake.intake(true, leftbumper, rightbumper); }
       // else {
           // intake.intake(false, leftbumper, rightbumper);
        }

    //}
//}


