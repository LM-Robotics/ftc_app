package org.firstinspires.ftc.teamcode.Devices;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * Created by Eamonn on 10/29/2016. Funtastic.
 */



public class TrapDoorMechanic
{
     double trapdoor_MIN_RANGE=0.20;
     double trapdoor_MAX_RANGE=0.90;
    double trapdoorPosition;
    double trapdoorDelta = 0.1;
    Servo trapdoor;

    public TrapDoorMechanic(HardwareMap hardwareMap)
    {
        trapdoor = hardwareMap.servo.get("servo_6");
        trapdoorPosition = 0.20;

    }


}
