package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

class IntakeMethodTeleOp {
    public DcMotor motorintake;

    /**
     * MAYBE ANOTHER MOTOR NO CLUE
     **/
    public IntakeMethodTeleOp(HardwareMap hwm) {
        motorintake = hwm.get(DcMotor.class, "motorintake");


        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }

    public void intake(/*boolean full*/ boolean leftbumper, boolean rightbumper) {
        if (leftbumper == true /*&& full == false*/) {
            motorintake.setPower(1);

        } else if (rightbumper == true) {
            motorintake.setPower(-1);

        } else {
            motorintake.setPower(0);

        }
    }

}