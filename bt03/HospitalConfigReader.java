package com.restaurant.session12.bt03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HospitalConfigReader implements CommandLineRunner {

    @Value("${hospital.name}")
    private String hospitalName;

    @Value("${hospital.hotline}")
    private String hotline;

    @Value("${hospital.db.ip}")
    private String dbIp;

    @Override
    public void run(String... args) {
        System.out.println("Chào mừng đến với " + hospitalName);
        System.out.println("Hotline: " + hotline);
        System.out.println("DB Server IP: " + dbIp);
    }
}