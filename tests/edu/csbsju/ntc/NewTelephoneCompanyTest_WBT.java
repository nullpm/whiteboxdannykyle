package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	 
	@Before
		public void setUp() throws Exception {
	    ntc = new NewTelephoneCompany();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime(){
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime2(){
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime3(){
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime4(){
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime5(){
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime6(){
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime7(){
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime8(){
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime9(){
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidDuration(){
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidDuration1(){
		ntc.setStartTime(1800);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	@Test
	public void testDiscountedStartTime()
	{
		ntc.setStartTime(500);
		ntc.setDuration(100);
		Assert.assertTrue(1768.0 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTime1()
	{
		ntc.setStartTime(759);
		ntc.setDuration(61);
		Assert.assertTrue(1078.48 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTime2()
	{
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		Assert.assertTrue(1078.48 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTime3()
	{
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		Assert.assertTrue(1149.20 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTimeOnly()
	{
		ntc.setStartTime(0);
		ntc.setDuration(60);
		Assert.assertTrue(1248.0 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTimeOnly1()
	{
		ntc.setStartTime(400);
		ntc.setDuration(59);
		Assert.assertTrue(1227.20 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTimeOnly2()
	{
		ntc.setStartTime(759);
		ntc.setDuration(1);
		Assert.assertTrue(20.80 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTimeOnly3()
	{
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		Assert.assertTrue(208.00 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTimeOnly4()
	{
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		Assert.assertTrue(208.00 == ntc.computeCharge());
	}
	@Test
	public void testDiscountedStartTimeOnly5()
	{
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		Assert.assertTrue(208.00 == ntc.computeCharge());
	}
	@Test
	public void testDiscounterDurationOnly()
	{
		ntc.setStartTime(800);
		ntc.setDuration(65);
		Assert.assertTrue(2298.40 == ntc.computeCharge());
	}
	@Test
	public void testDiscounterDurationOnly2()
	{
		ntc.setStartTime(900);
		ntc.setDuration(61);
		Assert.assertTrue(2156.96 == ntc.computeCharge());
	}
	@Test
	public void testNoDiscounts()
	{
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		Assert.assertTrue(1664.0 == ntc.computeCharge());
	}
	@Test
	public void testNoDiscounts2()
	{
		ntc.setStartTime(800);
		ntc.setDuration(1);
		Assert.assertTrue(41.60 == ntc.computeCharge());
	}
	@Test
	public void testNoDiscounts3()
	{
		ntc.setStartTime(801);
		ntc.setDuration(59);
		Assert.assertTrue(2454.40 == ntc.computeCharge());
	}
	@Test
	public void testNoDiscounts4()
	{
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		Assert.assertTrue(2496.0 == ntc.computeCharge());
	}
}
