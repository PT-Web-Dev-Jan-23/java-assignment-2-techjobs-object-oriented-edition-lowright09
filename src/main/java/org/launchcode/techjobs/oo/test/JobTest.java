package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

@Test
    public void testSettingJobId(){
    Job job = new Job();
    Job job2 = new Job();
    assertNotEquals(job.getId() , job2.getId() );
    }

@Test
    public void testJobConstructorSetsAllFields(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(job.getId() > 0);
    assertEquals("Product tester", job.getName());
    assertTrue(job instanceof Job);
    assertEquals(new Employer("ACME").getValue(), job.getEmployer().getValue());
    assertTrue(job.getLocation() instanceof Location   );
    Location location = new Location();
    assertEquals(new Location("Desert").getValue(), job.getLocation().getValue());
    assertTrue(job.getPositionType() instanceof  PositionType);
    PositionType positionType = new PositionType();
    assertEquals(new PositionType("Quality control").getValue(), job.getPositionType().getValue());
    assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    CoreCompetency coreCompetency = new CoreCompetency();
    assertEquals(new CoreCompetency("Persistence").getValue(), job.getCoreCompetency().getValue());

 }

@Test
    public  void testJobsForEquality(){
    Job job1 = new Job();
    Job job2 = new Job();
    assertFalse(job1.equals(job2));
 }
@Test
    public void testToStringStartsAndEndsWithNewLine(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String jobString1 = job.toString();
    assertEquals(jobString1.charAt(0), '\n');
    assertEquals(jobString1.charAt(jobString1.length() - 1), '\n');
 }

@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String jobString1 = job.toString();
    String expectedString = "\nID: 4" +
            "\nName: Product tester" +
            "\nEmployer: ACME" +
            "\nLocation: Desert" +
            "\nPosition Type: Quality control" +
            "\nCore Competency: Persistence" +
            "\n";
    assertEquals(jobString1, expectedString);
 }

 @Test
    public void testToStringHandlesEmptyField(){
     Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     job.getEmployer().setValue("");
     String jobString = job.toString();
     String expectedString = "\nID: 3" +
             "\nName: Product tester" +
             "\nEmployer: Data not available" +
             "\nLocation: Desert" +
             "\nPosition Type: Quality control" +
             "\nCore Competency: Persistence" +
             "\n";
     assertEquals(expectedString, job.toString());

  }






}
