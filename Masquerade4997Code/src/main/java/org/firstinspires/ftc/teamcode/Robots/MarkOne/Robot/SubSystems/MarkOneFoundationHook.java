package org.firstinspires.ftc.teamcode.Robots.MarkOne.Robot.SubSystems;

import com.qualcomm.robotcore.hardware.HardwareMap;

import Library4997.MasqResources.MasqHelpers.MasqHardware;
import Library4997.MasqServos.MasqServo;
import Library4997.MasqServos.MasqServoSystem;
import Library4997.MasqSubSystem;
import Library4997.MasqWrappers.MasqController;

/**
 * Created by Archishmaan Peyyety on 2019-11-10.
 * Project: MasqLib
 */
public class MarkOneFoundationHook implements MasqSubSystem {
    private MasqServoSystem foundationHook;
    public MasqServo leftHook, rightHook;
    public MarkOneFoundationHook(HardwareMap hardwareMap) {
        foundationHook = new MasqServoSystem("rightHook", "leftHook", hardwareMap);
        rightHook = foundationHook.servo1;
        leftHook = foundationHook.servo2;
        rightHook.scaleRange(0,0.5);
        leftHook.scaleRange(0,0.7);
    }

    @Override
    public void DriverControl(MasqController controller) {
        if(controller.b()) lower();
        else raise();
    }

    public void lower() {
        rightHook.setPosition(0);
        leftHook.setPosition(1);
    }
    public void raise() {
        rightHook.setPosition(1);
        leftHook.setPosition(0);
    }


    @Override
    public String getName() {
        return "FoundatonHook";
    }
    @Override
    public MasqHardware[] getComponents() {
        return new MasqHardware[0];
    }
}