package StepDefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;


public class Hooks {
	
	public static int TEST_RUN_ID= 2;
	public static String TESTRAIL_USERNAME = "shafiq.rehman@securiti.ai";
	public static String TESTRAIL_PASSWORD = "Letsgoat6";
	public static String RAILS_ENGINE_URL = "https://shafiqrehman.testrail.io/";
	public static final int TEST_CASE_PASSED_STATUS = 1;
	public static final int TEST_CASE_FAILED_STATUS = 5;
	public static APIClient client = new APIClient(RAILS_ENGINE_URL);

	public static void addResultForTestCase(String testCaseId, int status, String error) throws IOException, APIException {

        int testRunId = TEST_RUN_ID;
        
        APIClient client = new APIClient(RAILS_ENGINE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        Map data = new HashMap();
        data.put("status_id", status);
        data.put("comment", "Test Executed - Status updated automatically from Selenium test automation.");
        client.sendPost("add_result_for_case/"+testRunId+"/"+testCaseId+"",data );

}


	
	@After
	  public void afterMethod(Scenario result) 
	    
		
		{
		  int i=1;
		  int max= 10;
		  String result1=result.getName();
		  System.out.println(result1);
		 
		  
		  if (result1.equals("Validate google search is working")) {
			  System.out.println("yes we did");
			   i=246;
			   max=256;
		  }
		  else if (result1.equals("Validate user successfully navigate to dashboard")) {
			  i=256;
			  max=266;
		  }
		  else if (result1.equals("Validate user apply filter to location")) {i=266;max=276;}
		  else if (result1.equals("Validate user apply filter to ownner")) {i=276;max=286;}
		  else if (result1.equals("Validate user apply filter to PDC")) {i=286;max=296;}
		  else if (result1.equals("Validate user apply filter to DET")) {i=296;max=306;}
		  else if (result1.equals("Validate user apply filter to DTC")) {i=306;max=316;}
		  else if (result1.equals("Validate user apply filter to FolderPath")) {i=316;max=326;}
		  else if (result1.equals("Validate user apply filter to FileFormat")) {i=326;max=336;}
		  else if (result1.equals("Validate user apply filter to ContentProfile")) {i=336;max=346;}
		  else if (result1.equals("Validate the index value")) {i=346;max=356;}
		  else if (result1.equals("Validate the index1 value")) {i=356;max=366;}
		  else if (result1.equals("Validate the index2 value")) {i=366;max=376;}
		  else if (result1.equals("Validate docindexval value")) {i=376;max=386;}
		  else if (result1.equals("Validate docindexval1 value")) {i=386;max=396;}
		  else if (result1.equals("getdocindexval3")) {i=396;max=406;}
		  else if (result1.equals("Validate docindexval2 value")) {i=406;max=416;}
		  else if (result1.equals("Validate docindexval3 value")) {i=416;max=426;}
		  else if (result1.equals("Validate fileindexval value")) {i=426;max=436;}
		  else if (result1.equals("Validate fileindexval1 value")) {i=436;max=446;}
		  else if (result1.equals("Validate fileindexval2 value")) {i=446;max=456;}
		  else if (result1.equals("Validate datastoreindexval value")) {i=456;max=466;}
		  else if (result1.equals("Validate dataelementindexval value")) {i=242;max=252;}
		  else if (result1.equals("Validate dataelementindexval1 value")) {i=242;max=252;}
		  
			for (;i<=max;i++) {
				String runid= String.valueOf(i);
		    try
		 {
		    if(!result.isFailed())
		    {
		    	Hooks.addResultForTestCase(runid, TEST_CASE_PASSED_STATUS, "");
		        //Do something here
		        System.out.println("passed **********");
		    }

		    else if(result.isFailed())
		    {
		    	Hooks.addResultForTestCase(runid, TEST_CASE_FAILED_STATUS, "");
		         //Do something here
		        System.out.println("Failed ***********");

		    }

		     
		}
		   catch(Exception e)
		   {
		     e.printStackTrace();
		   }

		}
			
		}}
	


