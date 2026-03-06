package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class TeleopIntake extends Command {
    private final Intake s_Intake;
    
    public TeleopIntake(Intake s_Intake) {
        this.s_Intake = s_Intake;
        addRequirements(s_Intake);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        s_Intake.run();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        s_Intake.stop();
    }
}
