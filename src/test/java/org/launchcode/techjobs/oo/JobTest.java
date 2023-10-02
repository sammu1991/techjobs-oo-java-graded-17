package org.launchcode.techjobs.oo;

import org.junit.Test;

import org.junit.Assert;

import static org.junit.Assert.*;

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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedval = job1.toString();
        String newline = System.lineSeparator();

        assertTrue(expectedval.startsWith(newline));
        assertTrue(expectedval.startsWith(newline));


    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedval = job1.toString();
        System.out.println(expectedval);


        assertTrue(expectedval.contains("Name: Product tester"));
        assertTrue(expectedval.contains("Employer: ACME"));
        assertTrue(expectedval.contains("Location: Desert"));
        assertTrue(expectedval.contains("Position Type: Quality control"));
        assertTrue(expectedval.contains("Core Competency: Persistence"));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job=new Job("dfdf", new Employer("hjgjhh"), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expectedval = job.toString();
System.out.println(job);
        assertTrue(expectedval.contains("Name: "));
        assertTrue(expectedval.contains("Employer: "));
        assertTrue(expectedval.contains("Location: "));
        assertTrue(expectedval.contains("Position Type: "));
        assertTrue(expectedval.contains("Core Competency: "));



                          //String newline = System.lineSeparator();
        // String actual = newline + "ID: " + job.getId()+
//                        newline + "Name: "+job.getName()  +
//                newline + "Employer: Data not available" +
//                newline + "Location: Data not available" +
//                newline + "Position Type: Data not available" +
//                newline + "Core Competency: Data not available" +
//                newline;


////        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
////        String expectedval = job1.toString();
////
////        assertTrue(expectedval.contains("Data not available"));
//
//
    }
}
