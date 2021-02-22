package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class IntakeStorageGauge {

   public  RevBlinkinLedDriver ledstrip;
    public ColorSensor colorstore1;
    public ColorSensor colorstore2;
    public ColorSensor colorstore3;

    public void storageledsensors(HardwareMap hwm) {
        ledstrip = hwm.get(RevBlinkinLedDriver.class, "blinkin");
        colorstore1 = hwm.colorSensor.get("colorstore1");
        colorstore3 = hwm.get(ColorSensor.class, "colorstore3");
        colorstore2 = hwm.get(ColorSensor.class, "colorstore2");
        colorstore1 = hwm.get(ColorSensor.class, "colorstore1");
    }

    public void rings() {
        if (isyellow1() && (!isyellow2() && !isyellow3())) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.GREEN);
        } else if (isyellow2() && (isyellow1() && !isyellow3())) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.YELLOW);
        } else if (isyellow3() && isyellow2()) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.RED);
        } else {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.RAINBOW_RAINBOW_PALETTE);
        }
    }

// lets go :)
    public boolean isyellow1 () {
        if (colorstore1.red() == 10) {

           if (colorstore1.green() == 10) {
               return colorstore1.blue() == 10;
           }
           else {
               return false;
           }
        }

        else  {
            return false;
        }
    }

    public boolean isyellow2() {
        if (colorstore1.red() == 10) {

            if (colorstore1.green() == 10) {
                return colorstore1.blue() == 10;
            } else {
                return false;
            }
        }

        else  {
            return false;
        }
    }

    public boolean isyellow3 () {
        if (colorstore1.red() == 10) {

            if (colorstore1.green() == 10) {
                return colorstore1.blue() == 10;
            }
            else {
                return false;
            }
        }

        else  {
            return false;
        }
    }


}

