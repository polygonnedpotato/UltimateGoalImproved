package org.firstinspires.ftc.teamcode.TeleOp;

import android.graphics.Color;
import android.os.Build;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "test the color", group = "TeleOp")
//@Disabled
public class TestColor extends OpMode {

    //ntakeStorageGauge gauge = null;
    IntakeStorageGauge gauge = null;
    private final com.qualcomm.robotcore.hardware.HardwareMap HardwareMap;

    public TestColor(com.qualcomm.robotcore.hardware.HardwareMap hardwareMap) {
        HardwareMap = hardwareMap;
    }

    @Override
    public void init() {
        gauge = new IntakeStorageGauge();
        gauge.storageledsensors(hardwareMap);
        gauge.ledstrip = hardwareMap.get(RevBlinkinLedDriver.class, "blinkin");

        DriveTrainMethodTeleOp drivetrain = null;
        assert false;
        drivetrain.driveMotors(HardwareMap);
    }


    @Override
    public void loop() {
        //if (gauge.colorstore1.red() != 20) {
        //telemetry.addData("B", gauge.colorstore1.blue());
        // }
        //dont intake >:()
        Color colorstore1 = null;
        assert false;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            System.out.println("blue: " + colorstore1.blue());
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            System.out.println("red: " + colorstore1.red());
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            System.out.println("blue: " + colorstore1.green());
        }

        telemetry.addData("B", gauge.colorstore1.blue());
        telemetry.addData("Red  ", gauge.colorstore1.red());
        telemetry.addData("Green", gauge.colorstore1.green());
        telemetry.addData("isyellow; ", gauge.isyellow1());
        telemetry.update();

        if (gauge.colorstore1.blue() >= 0) {
            gauge.ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.GREEN);
        }
        else {
            gauge.ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.RED);


        }
    }
}
