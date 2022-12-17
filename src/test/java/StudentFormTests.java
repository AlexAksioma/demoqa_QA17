import manager.ApplicationManager;
import models.Student;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class StudentFormTests extends TestBase{

    @BeforeMethod
    public void preCondition(){

        app.getStudentForm().selectItemForms();
        app.getStudentForm().selectPracticeForm();
    }

    @Test
    public void studentFormTest(){
        Student student = Student.builder()
                .firstName("John")
                .lastName("Qwerty")
                .email("qwerty@mail.com")
                .gender("Male")
                .phone("123456789")
                .birthday("30 june 2020")
                .subject("Math")
                .hobbies("Sport")
                .address("Tel Aviv")
                .state("NCR")
                .city("Gurdaon")
                .build();

        //app.getStudentForm().fillStudentForm(student);

    }
}
