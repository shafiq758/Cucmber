@tag1
Feature: Google search functionality
 
   
  Scenario: Validate google search is working
    Given browser is open
    And User is on google search
    When user ennter text in goolge search box
    And hits enter
    Then User is navigated to search based result

  Scenario: Validate user successfully navigate to dashboard
    Given Click on Panel list
    When user clicks on dasboard filter
    And Click on datastore
    Then select datastore

  Scenario: Validate user apply filter to location
    Given User verify location tab is Present
    When count length for location filter
    Then User counts and select all the filters

  Scenario: Validate user apply filter to ownner
    Given User verify ownner tab is Present
    When count length for owner filter
    Then owner counts and select all the filters

  Scenario: Validate user apply filter to PDC
    Given User verify PDC tab is Present
    When count length for PDC filter
    Then PDC counts and select all the filters

  Scenario: Validate user apply filter to DET
    Given User verify DET tab is Present
    When count length for DET filter
    Then DET counts and select all the filters

  Scenario: Validate user apply filter to DTC
    Given User verify DTC tab is Present
    When count length for DTC filter
    Then DTC counts and select all the filters

  Scenario: Validate user apply filter to FolderPath
    Given User verify FolderPath tab is Present
    When count length for FolderPath filter
    Then FolderPath counts and select all the filters

  Scenario: Validate user apply filter to FileFormat
    Given User verify FileFormat tab is Present
    When count length for FileFormat filter
    Then FileFormat counts and select all the filters

  Scenario: Validate user apply filter to ContentProfile
    Given User verify ContentProfile tab is Present
    When count length for ContentProfile filter
    Then ContentProfile counts and select all the filters

  Scenario: Validate the index value
    Given check size of grid
    When Find the Index value
    Then Assert Index value

  Scenario: Validate the index1 value
    Given check size of grid1
    When Find thee Index1 value
    And Remove Index1 value
    Then Assert Index1 value

  Scenario: Validate the index2 value
    Given check size of grid2
    When Find thee Index2 value
    And Remove Index2 value
    Then Assert Index2 value

  Scenario: Validate docindexval value
    Given document index value
    When Set index val
    Then Assert index value

  Scenario: Validate docindexval1 value
    Given document index1 value
    And Remove docindex value
    When Set index1 val
    Then Assert index1 value

  Scenario: Validate docindexval2 value
    Given document index2 value
    And Remove docindex1 value
    When Set index2 val
    Then Assert index2 value

  Scenario: Validate docindexval3 value
    Given document index3 value
    And Remove docindex2 value
    When Set index3 val
    Then Assert index3 value
    
    Scenario: Validate fileindexval value
    Given document fileindex value
    And Remove fileindex value
    When Set fileindex val
    Then Assert fileindex value
    
    Scenario: Validate fileindexval1 value
    Given document fileindex1 value
    And Remove fileindex1 value
    When Set fileindex1 val
    Then Assert fileindex1 value
    
    Scenario: Validate fileindexval2 value
    Given document fileindex2 value
    And Remove fileindex2 value
    When Set fileindex2 val
    Then Assert fileindex2 value
    
    Scenario: Validate datastoreindexval value
    Given document datastoreindex value
    And Remove datastoreindex value
    When Set datastoreindex val
    Then Assert datastoreindex value
    
    Scenario: Validate dataelementindexval value
    Given document dataelementindex value
    And Remove dataelementindex value
    When Set dataelementindex val
    Then Assert dataelementindex value
    
    Scenario: Validate dataelementindexval1 value
    Given document dataelementindex1 value
    And Remove dataelementindex1 value
    When Set dataelementindex1 val
    Then Assert dataelementindex1 value
    
