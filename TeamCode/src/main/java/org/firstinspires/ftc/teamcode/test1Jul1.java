package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class test1Jul1 extends LinearOpMode{

    public DcMotor TheDCMotor   = null;
    public Servo TheServo = null;


    @Override
    public void runOpMode() {

        TheDCMotor  = hardwareMap.get(DcMotor.class, "drive");
        TheServo = hardwareMap.get(Servo.class,"servo");
        TheDCMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        waitForStart();
        while (opModeIsActive()) {
            TheDCMotor.setPower(0.5);
        }

    }

}
