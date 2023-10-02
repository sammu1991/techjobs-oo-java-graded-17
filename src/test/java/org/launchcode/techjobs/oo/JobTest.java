package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

public class JobTest {
    //TODO: Create your unit tests here



    @Test
    public void testSettingJobId() {
        Job job1= new Job();
        Job job2= new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.getName() instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

        Assert.assertEquals("Product tester", job.getName());
        Assert.assertEquals("ACME", job.getEmployer().getValue());
        Assert.assertEquals("Desert", job.getLocation().getValue());
        Assert.assertEquals("Quality control", job.getPositionType().getValue());
        Assert.assertEquals("Persistence", job.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2=new Job("Product taster", new Employer("AICME"), new Location("Thar"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertFalse(job1.equals(job2));

    }
}
