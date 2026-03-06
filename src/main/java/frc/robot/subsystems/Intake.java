package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{
    private final TalonFX motor; // Placeholder name
    private final TalonFX motor2; // Placeholder name
    
    public Intake() {
        motor = new TalonFX(Constants.Intake.motorID);
        motor2 = new TalonFX(Constants.Intake.motor2ID);
    }

    public void run() {
        motor.setVoltage(Constants.Intake.motorVoltage);
        motor2.setVoltage(Constants.Intake.motor2Voltage);
    }

    public void stop() {
        motor.setVoltage(0);
        motor2.setVoltage(0);
    }
}
