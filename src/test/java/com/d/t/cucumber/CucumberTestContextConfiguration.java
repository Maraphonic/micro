package com.d.t.cucumber;

import com.d.t.MicroApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = MicroApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
