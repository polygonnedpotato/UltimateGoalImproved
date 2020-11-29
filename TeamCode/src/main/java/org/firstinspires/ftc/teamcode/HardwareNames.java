package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HardwareNames {
    // link to previous year's code https://github.com/teamftc8466/skystone8466
    // link for learning coding https://www.w3schools.com/java/java_for_loop.asp
    
    public DcMotor drivefr;
    public DcMotor drivefl;
    public DcMotor drivebr;
    public DcMotor drivebl;

    public void driveMotors(HardwareMap hwm) {
        drivefr = hwm.get(DcMotor.class, "drivefr");
        drivefl = hwm.get(DcMotor.class, "drivefl");
        drivebr = hwm.get(DcMotor.class, "drivebr");
        drivebl = hwm.get(DcMotor.class, "drivebl");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivefl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        drivefr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivefl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivebr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivebl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }


    public DcMotor motorlaunch;
    public Servo servolift;
    public Servo servoaim;
    public Servo servofeed;

    public void launcherMotors(HardwareMap hwm) {
        motorlaunch = hwm.get(DcMotor.class, "moterlaunch");
        servolift = hwm.get(Servo.class, "servolift");
        servoaim = hwm.get(Servo.class, "servoaim");
        servofeed = hwm.get(Servo.class, "servofeed");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }


    public DcMotor motoreject;

    public void storageMotors(HardwareMap hwm) {
        motoreject = hwm.get(DcMotor.class, "motoreject");

        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }


    public DcMotor motorintake1;
    public DcMotor motorintake2;
    public DcMotor motorintake3;
    /**MAYBE ANOTHER MOTOR NO CLUE**/

    public void intakeMotors(HardwareMap hwm) {
        motorintake1 = hwm.get(DcMotor.class, "motorintake1");
        motorintake2 = hwm.get(DcMotor.class, "motorintake2");
        motorintake3 = hwm.get(DcMotor.class, "motorintake3");

        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }


    public Servo servopinch;
    public Servo servograbrot;

      public void grabberMotors(HardwareMap hwm) {
          servopinch = hwm.get(Servo.class, "servopinch");
          servograbrot = hwm.get(Servo.class, "servograbrot");
     }



    public Servo servocam;
    //public sensor colorzone; color sensor

    public void sensors(HardwareMap hwm) {
        servocam = hwm.get(Servo.class, "servocam");
    }
    /**public sensors
     * public camera
     */
}
