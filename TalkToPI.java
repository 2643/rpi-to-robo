package org.usfirst.frc.team2643.robot;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class TalkToPI 
{
	public static NetworkTable table = NetworkTable.getTable("Test");
	
	public static double testMet()
	{
		return table.getNumber("Hello", 0.0);
	}
}
