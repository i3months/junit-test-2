package com.luv2code.component;

import com.luv2code.component.models.CollegeStudent;
import com.luv2code.component.models.StudentGrades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest(classes = MvcTestingExampleApplication.class) // 경로 안 맞춰주면 지정해 줘야 함. 경로 맞춰주면 알아서 지정됨.
public class ApplicationExampleTest {

    private static int count = 0;

    @Value("${info.app.name}")
    private String appInfo;

    @Value("${info.app.description}")
    private String appDescription;

    @Value("${info.app.version}")
    private String appVersion;

    @Value("${info.school.name}")
    private String schoolName;

    @Autowired
    CollegeStudent student;

    @Autowired
    StudentGrades studentGrades;

    @BeforeEach
    public void beforeEach() {
        count++;
        System.out.println("Testing " + appInfo + " " + appDescription + " " + appVersion + " " + count);

        student.setFirstname("jmj");
        student.setLastname("jeong");
        student.setEmailAddress("jmj@naver.com");

        studentGrades.setMathGradeResults(new ArrayList<>(Arrays.asList(100.0, 15.0, 2.0, 3.0)));
    }

    @DisplayName("Add grade")
    @Test
    public void addGradeResultsForStudentGrades() {
    }

    @Test
    void basicTest() {

    }
}
