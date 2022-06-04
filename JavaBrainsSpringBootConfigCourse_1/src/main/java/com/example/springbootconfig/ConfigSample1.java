package com.example.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ConfigSample1 {

    @Autowired
    private DbSettings dbSettings;

    @Autowired
    private Environment env;

    @Value("${my.greeting}")
    String greeting;

    @Value("${app.description}")
    String appDesc;

    @Value("This is dummy value")
    String dummy;

    @Value("${app.abcd: default value}")
    String defaultValue;
    @Value("${my.list.values}")
    List<String> listOfValues;

    @Value("#{${dbValues}}")
    Map<String, String>  dbValues;

    @GetMapping("/readallsettings")
    public String readAllSettings() {
        return "Connection: " + dbSettings.getConnection() + ", host: " + dbSettings.getHost() + ", port: " + dbSettings.getPort();
    }

    @GetMapping("/greeting")
    public String greeting() {
        System.out.println("dummy: " + dummy);
        System.out.println("defaultValue: " + defaultValue);
        System.out.println("listOfValues: " + listOfValues);
        System.out.println("dbValues" + dbValues);
        System.out.println("dbValues username" + dbValues.get("userName"));
        return greeting;
    }

    @GetMapping("/appdescription")
    public String appDesc() {
        return appDesc;
    }

    @GetMapping("/envdetails")
    public String envDetails() {
        System.out.println(env.getProperty("app.name"));
        System.out.println(env.getActiveProfiles().toString());
        return env.toString();
    }
}
