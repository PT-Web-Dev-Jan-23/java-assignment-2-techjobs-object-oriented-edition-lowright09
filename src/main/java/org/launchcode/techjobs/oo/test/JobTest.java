package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
@Test
    public void testSettingJobId(){
    Job job1 = new Job();
    Job job2 = new Job();
    //assertNotEquals(unexpected , actual );
    }

@Test
    public void testJobConstructorSetsAllFields(){
Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
}

@Test
    public  void testJobsForEquality(){

}

}
