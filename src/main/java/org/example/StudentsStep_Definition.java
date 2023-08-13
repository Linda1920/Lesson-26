package org.example;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Product;
import org.example.Students;
import java.util.*;

public class StudentsStep_Definition {
    private List<Students> studentsList = new ArrayList<>();

    @Given("we have a list of students")
    public void we_have_a_list_of_students(DataTable dataTable) {
   /*    List<List<String>> studentsList1=dataTable.asLists(String.class);
    for (List<String> e: studentsList1){
        System.out.println(e);}}*/
        List<Map<String, String>> studentsData = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> studentData : studentsData) {
            String name = studentData.get("name");
            int age = Integer.parseInt(studentData.get("age"));
            String course = studentData.get("course");

            Students student = new Students(name, age, course);
            studentsList.add(student);}}
    @When("sort students by age")
    public void sort_students_by_age() {

        Collections.sort(studentsList, Comparator.comparingInt(Students::getAge));


    }
    @Then("check that the youngest student is over {int}")
    public void check_that_the_youngest_student_is_over(int ageThreshold) {
        int youngestAge = studentsList.get(0).getAge();
        if (youngestAge >=  ageThreshold) {
            System.out.println("Student is over "+ ageThreshold);
        }
        else {
            System.out.println("Student is under "+ ageThreshold);

    }

    }}
