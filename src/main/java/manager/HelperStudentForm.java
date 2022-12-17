package manager;

import models.Student;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperStudentForm extends HelperBase{

    public HelperStudentForm(WebDriver wd) {
        super(wd);
    }

    public void selectItemForms() {
        click(By.xpath("//div[@class='category-cards']/div[2]"));
    }

    public void selectPracticeForm() {
        click(By.xpath("//span[text()='Practice Form']"));
    }

    public void fillStudentForm(Student student) {
        type(By.cssSelector("input[placeholder='First Name']"), student.getFirstName());
        type(By.cssSelector("input[placeholder='Last Name']"), student.getLastName());
        type(By.cssSelector("#userEmail"), student.getEmail());
        //type(By.cssSelector("label[for='gender-radio-1']"), student.getGender());
        click(By.cssSelector("label[for='gender-radio-1']"));
        type(By.cssSelector("input[placeholder='Mobile Number']"), student.getPhone());
        click(By.cssSelector("#dateOfBirthInput"));
        click(By.cssSelector("div[aria-label='Choose Sunday, November 27th, 2022']"));
        pause(3000);
        type(By.cssSelector("#subjectsContainer div.subjects-auto-complete__indicators css-1wy0on6"), student.getSubject());
        pause(3000);
        clickEnter(By.cssSelector("#subjectsContainer div.subjects-auto-complete__indicators css-1wy0on6"));
        //click(By.cssSelector(".subjects-auto-complete__menu css-26l3qy-menu"));

    }
}
