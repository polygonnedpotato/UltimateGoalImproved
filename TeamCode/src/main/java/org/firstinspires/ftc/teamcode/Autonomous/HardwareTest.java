/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

/**
 * This is NOT an opmode.
 *
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a Pushbot.
 * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
 *
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 *
 * Motor channel:  Left  drive motor:        "left_drive"
 * Motor channel:  Right drive motor:        "right_drive"
 * Motor channel:  Manipulator drive motor:  "left_arm"
 * Servo channel:  Servo to open left claw:  "left_hand"
 * Servo channel:  Servo to open right claw: "right_hand"
 */
public class HardwareTest extends HardwareNames
{
    public HardwareTest(HardwareMap hwm) {
        super.driveMotors(hwm, true);
    }
    public void autoDriveInit() {
        drivefr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivefl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivebr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivebl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public static int converstion(double baddist) {
        /* this is for the conversion between ticks and like cm or something**/
        return (int) baddist / 2;
    }
    //basic movement
    public void autoDriveStraight(double dist, double power) {
        int ticks = converstion(dist);
        drivefr.setTargetPosition(ticks);
        drivefl.setTargetPosition(ticks);
        drivebr.setTargetPosition(ticks);
        drivebl.setTargetPosition(ticks);

        drivefl.setPower(ticks);
        drivebr.setPower(ticks);
        drivebl.setPower(ticks);
    }
    //turning
    public void autoPivotTurn(double dist) {
        int ticks = converstion(dist);
        drivefl.setPower(ticks);
        drivebl.setPower(ticks);
        drivefr.setPower(-ticks);
        drivebr.setPower(-ticks);
    }
    //Strafe movement
    public void autoStrafe(double dist) {
        int ticks = converstion(dist);
        drivefl.setPower(ticks);
        drivefr.setPower(-ticks);
        drivebl.setPower(-ticks);
        drivebr.setPower(ticks);
    }
    //Basic Diagonal Movement
    public void autoDiagonalPosSlope (double dist) {
        int ticks = converstion(dist);
        drivefl.setPower(ticks);
        drivebr.setPower(ticks);
    }
    //Left Diagonal Movement
    public void autoDiagonalNegSlope (double dist) {
        int ticks = converstion(dist);
        drivefr.setPower(-ticks);
        drivebl.setPower(-ticks);
    }

    public void init(HardwareMap hardwareMap) {
    }

    public void grabberMotors(HardwareMap hwm) {
        super.grabberMotors(hwm);
    }
    public void grab(int open) {
        servopinch.setPosition(1);
        //      if (we sense that that we get 3 rings then or if the color is i think red?? or whatever that tells us its 3 rights  )
        servopinch.setPosition(0);

    }
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

