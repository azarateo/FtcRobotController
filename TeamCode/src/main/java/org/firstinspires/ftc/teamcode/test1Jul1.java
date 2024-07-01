package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp
public class test1Jul1 extends LinearOpMode{



    public DcMotor TheDCMotor   = null;
    public Servo TheServo = null;


    @Override
    public void runOpMode() {
        TheDCMotor  = hardwareMap.get(DcMotor.class, "drive");
        TheServo = hardwareMap.get(Servo.class,"servo");
        TheDCMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        TheDCMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        TheDCMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();
        while (opModeIsActive()) {

//            using the power for continuos movement at a specific power
//            TheDCMotor.setPower(0.5);

//            using the encoder to define a position
            telemetry.addData("encoder position",TheDCMotor.getCurrentPosition());
            TheDCMotor.setTargetPosition(5000);
            TheDCMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            TheDCMotor.setPower(0.4);
            
                telemetry.addData("encoder position",TheDCMotor.getCurrentPosition());
                telemetry.update();

        }

    }

}
