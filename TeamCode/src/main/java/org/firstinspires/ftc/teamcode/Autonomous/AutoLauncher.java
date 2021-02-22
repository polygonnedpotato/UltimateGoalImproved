package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

class AutoLauncher extends HardwareNames {
    public void launcherMotors(HardwareMap hwm) {
        super.launcherMotors(hwm);
    }
    public void shoot(double vis) {
        servolift.setPosition(vis);
        motorlaunch.setPower(1.0);
        servofeed.setPosition(1.0);//continuous
        servolift.setPosition(1.0);
        //need a wait statement
        servolift.setPosition(0.0);
    }
}