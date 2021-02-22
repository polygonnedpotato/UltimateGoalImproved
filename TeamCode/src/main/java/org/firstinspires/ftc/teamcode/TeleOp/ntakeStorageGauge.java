package org.firstinspires.ftc.teamcode.TeleOp;

import android.graphics.Color;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.concurrent.atomic.AtomicReference;

public class ntakeStorageGauge {
    public RevBlinkinLedDriver ledstrip;
    public Color colorstore1;

    protected AtomicReference<IntakeStorageGauge> initialValue() {
        return new AtomicReference<>();
    }

    public void set(IntakeStorageGauge intakeStorageGauge) {
    }

    public void storageledsensors(HardwareMap hardwareMap) {
    }

    public String isyellow1() {
        return null;
    }
}
