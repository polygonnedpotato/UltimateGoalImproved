package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

class LauncherTeleop extends HardwareNames {
    public void launcherMotor(HardwareMap hwm) {
        super.driveMotors(hwm);
    }
    //Method for on/off toggle, method for adjusting strength, method for tilt, method for launching rings ;)
    public void LauncherToggle (boolean leftbumper) {
        if (leftbumper) {
            launchmotor.setPower(1);
        }
    }
    //need to change second launchmotor for krabby flip
        public void Eject (double launcherpower, boolean rightbumper) {
            if (rightbumper) {
                launchmotor.setPower(launcherpower);
            }
        }

         public double launcherpower (double power, boolean buttonA, boolean buttonB, boolean buttonX, boolean buttonY) {
                if (buttonA) {
                    power = .25;
                }

                else if (buttonX) {
                    power = .50;
                }

                else if (buttonY) {
                    power = .75;
                }

                else if (buttonB) {
                    power = 1;
                }
                return power;
                }

                public void ejectangle (boolean lefttrigger, boolean righttrigger) {
                    while (lefttrigger) {
                            aimservo.getPosition();
                            aimservo.setPosition(aimservo.getPosition() - 0.1);
                    }

                    while (righttrigger) {
                            aimservo.getPosition();
                            aimservo.setPosition(aimservo.getPosition() + 0.1);
                    }
                }

            }