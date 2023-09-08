package com.example.ci_exam.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ControllerTest {

    @Autowired
    private Controller controller;

    @Test
    void t1() {

        String message = controller.get();

        assertEquals(message,"ci test");

    }

    @Test
    void t2() {

        String message = controller.get();

        assertEquals(message,"실패 테스트");

    }


}