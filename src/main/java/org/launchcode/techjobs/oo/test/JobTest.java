package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
    assertEquals("Product tester", job.getName());
    assertEquals(new Employer("ACME").getValue(), job.getEmployer().getValue());
    Location location = new Location();
    assertEquals(new Location("Desert").getValue(), job.getLocation().getValue());
    PositionType positionType = new PositionType();
    assertEquals(new PositionType("Quality control").getValue(), job.getPositionType().getValue());
    CoreCompetency coreCompetency = new CoreCompetency();
    assertEquals(new CoreCompetency("Persistence").getValue(), job.getCoreCompetency().getValue());

 }

@Test
    public  void testJobsForEquality(){
    Job job = new Job();
    Job job1 = new Job();
    assertNotEquals(job.getId() , job1.getId());
 }
@Test
    public void testToStringStartsAndEndsWithNewLine(){

 }

@Test
    public void testToStringContainsCorrectLabelsAndData(){

 }

 @Test
    public void testToStringHandlesEmptyField(){

  }






}
