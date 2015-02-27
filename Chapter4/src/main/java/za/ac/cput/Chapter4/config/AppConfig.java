package za.ac.cput.Chapter4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Chapter4.DIP.ObeyingDIP.Equipment;
import za.ac.cput.Chapter4.DIP.ObeyingDIP.MotorBikes;
import za.ac.cput.Chapter4.DIP.ObeyingDIP.MotorCycleModels;
import za.ac.cput.Chapter4.DIP.ObeyingDIP.MotorCyclistEquipment;
import za.ac.cput.Chapter4.DIP.ViolatingDIP.vMotorCycleEquipment;
import za.ac.cput.Chapter4.DIP.ViolatingDIP.vMotorCycleModel;
import za.ac.cput.Chapter4.DIP.ViolatingDIP.vPurchase;
import za.ac.cput.Chapter4.Encapsulation.SoccerPlayerInformation;
import za.ac.cput.Chapter4.ISP.ObeyingISP.AStudent;
import za.ac.cput.Chapter4.ISP.ObeyingISP.BestExamResults;
import za.ac.cput.Chapter4.ISP.ViolatingISP.vAStudent;
import za.ac.cput.Chapter4.ISP.ViolatingISP.vResults;
import za.ac.cput.Chapter4.Inheritance.CentralMidFielder;
import za.ac.cput.Chapter4.Inheritance.SoccerPlayer;
import za.ac.cput.Chapter4.LSP.ObeyingLSP.CentralDefender;
import za.ac.cput.Chapter4.LSP.ObeyingLSP.FootballPlayer;
import za.ac.cput.Chapter4.LSP.ObeyingLSP.GoalKeeper;
import za.ac.cput.Chapter4.LSP.ViolatingLSP.vCentralDefender;
import za.ac.cput.Chapter4.LSP.ViolatingLSP.vFootballPlayer;
import za.ac.cput.Chapter4.LSP.ViolatingLSP.vGoalKeeper;
import za.ac.cput.Chapter4.OCP.ObeyingOCP.Footballer;
import za.ac.cput.Chapter4.OCP.ObeyingOCP.RugbyPlayer;
import za.ac.cput.Chapter4.OCP.ObeyingOCP.StudentInfo;
import za.ac.cput.Chapter4.OCP.ViolatingOCP.vFootballer;
import za.ac.cput.Chapter4.OCP.ViolatingOCP.vRubyPlayer;
import za.ac.cput.Chapter4.OCP.ViolatingOCP.vSport;
import za.ac.cput.Chapter4.OCP.ViolatingOCP.vStudent;
import za.ac.cput.Chapter4.Polymorphism.Student;
import za.ac.cput.Chapter4.Polymorphism.StudentJob;

/**
 * Created by student on 2015/02/26.
 */
@Configuration
public class AppConfig {

  @Bean (name ="inherit")
    public SoccerPlayer getSoccerPlayer()
  {
      return new CentralMidFielder();
  }

    @Bean (name ="Encap")
    public SoccerPlayerInformation getPlayerInfo()
    {
        return new SoccerPlayerInformation();
    }

    @Bean(name="poly")
    public Student getPolyService()
    {
        return new StudentJob();
    }

    @Bean(name="OCPObey")
    public StudentInfo getfootball()
    {
        return new Footballer();
    }

    @Bean(name="OCPObey2")
    public StudentInfo getRugbyPlayer()
    {
        return new RugbyPlayer();
    }

    @Bean(name="OCPVio")
    public vStudent getvioFootballer()
    {
        return new vStudent();
    }

    @Bean(name="DIPObey")
    public MotorCycleModels getModel()
    {
        return new MotorBikes();
    }

    @Bean(name="DIPObey2")
    public MotorCyclistEquipment getEquipment()
    {
        return new Equipment();
    }

    @Bean(name="DIPVio")
    public vPurchase getEquipVio()
    {
        return new vMotorCycleEquipment();
    }

    @Bean(name="DIPVio2")
    public vPurchase getModelVio()
    {
        return new vMotorCycleModel();
    }

    @Bean(name="LSPObey")
    public FootballPlayer getDefender()
    {
        return new CentralDefender();
    }

    @Bean(name="LSPObey2")
    public FootballPlayer getKeeper()
    {
        return new GoalKeeper();
    }

    @Bean(name="LSPVio")
    public vFootballPlayer getCDefender()
    {
        return new vCentralDefender();
    }

    @Bean(name="LSPVio2")
    public vFootballPlayer getGKeeper()
    {
        return new vGoalKeeper();
    }

    @Bean(name="ISPObey")
    public BestExamResults getAStudent()
    {
        return new AStudent();
    }

    @Bean(name="ISPVio")
    public vResults getVioAStudent()
    {
        return new vAStudent();
    }














}
