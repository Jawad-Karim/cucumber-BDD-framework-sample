package stepDefinitions;

import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

/*********************************************************
Feature: Data Table Feature
  I want to use this template to test Data Table

  Scenario: Data Table Test
    Given open browser
    When I enter list of animals
      | cow   |
      | horse |
      | sheep |
    And I enter map of all pesonal datas
      | name    | jackson   |
      | age     |        46 |
      | city    | new port  |
      | country | Australia |
    And I enter list of map book datas
      | book_title     | author      |
      | the White City | Erik Larson |
      | the Lion       | C.S. Lewis  |
      | the Garden     | Erik Larson |
    And I enter list of list datas
      | the White City | Erik Larson |
      | the Lion       | C.S. Lewis  |
      | the Garden     | Erik Larson |
 ********************************************************/

public class DataTableSteps {

	@Given("open browser")
	public void open_browser() {
		System.out.println("Open Browser");
	}

	@When("I enter list of animals")
	public void i_enter_list_of_animals(DataTable dataTable) {
		System.out.println("********* list of values *****************");
		List<String> animalList = dataTable.asList();
		for (String animal : animalList) {
			System.out.println("animal:  "+ animal+".   ");
		}
	}

	@When("I enter map of all pesonal datas")
	public void i_enter_map_of_all_pesonal_datas(DataTable dataTable) {
		System.out.println("\n********* map of values *****************");
		Map<String, String> datas = dataTable.asMap();
		System.out.println("name: " + datas.get("name"));
		System.out.println("age: " + datas.get("age"));
		System.out.println("city: " + datas.get("city"));
		System.out.println("country: " + datas.get("country"));
	}

	@When("I enter list of map book datas")
	public void i_enter_list_of_map_book_datas(DataTable dataTable) {
		System.out.println("\n********* list of map values *****************");
		List<Map<String, String>> listOfMaps = dataTable.asMaps();

		for (Map<String, String> dataMap : listOfMaps) {
			System.out.println("bookTitle: " + dataMap.get("book_title") + " - " + "Author: " + dataMap.get("author"));
		}
	}

	@When("I enter list of list datas")
	public void i_enter_list_of_list_datas(DataTable dataTable) {
		
		System.out.println("\n*********print list of list values using for loop *****************");
		List<List<String>> listOfList = dataTable.asLists();
		
		for(int i=0; i<listOfList.size(); i++) {
			for(int j=0; j<listOfList.get(i).size(); j++){
				System.out.println(listOfList.get(i).get(j));
			}
		}
		
		System.out.println("\n*********print list of list values using for each loop *****************");
		for(List<String> listOfValues : listOfList) {
			for(String values : listOfValues){
				System.out.println(values);
			}
		}
		
		System.out.println(listOfList.get(0).get(0));
		System.out.println(listOfList.get(0).get(1));
	}

}
