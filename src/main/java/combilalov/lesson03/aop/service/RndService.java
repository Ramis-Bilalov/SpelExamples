package combilalov.lesson03.aop.service;

import combilalov.lesson03.aop.aspect.MeasureMethod;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RndService {
    @MeasureMethod
    public String getString() {
        System.out.println("called RndService.getString");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        return UUID.randomUUID().toString();
    }
}