package com.llax.hello;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
// @EnableScheduling гарантирует, что фоновые задачи создадуться. Без неё ничего не получится

public class ScheduledTasks {
    
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Scheduled(fixedRate = 1000)
    // Используя @Scheduled, вы настраиваете, когда конкретный метод будет запущен. 
    // В этом примере используется fixedRate, который определяет интервал между вызовами метода, 
    // начиная с момента начала работы каждого из вызовов этого метода. Есть и другие параметры, например, fixedDelay, 
    // который определяет интервал между вызовами, начиная с момента окончания работы каждого из вызовов метода.
    
    public void reportCurrentTime () {
        System.out.println("Curreent time = " + dateFormat.format(new Date()));
    }
    
    // ЗАМЕТКА
    // Это приложение не использует @EnableAutoConfiguration, как во многих других учебных материалах, 
    // потому что Spring Boot ничего не сможет настроить автоматически, когда дело касается расписания. 
    // Но если совместить этот урок с каким-нибудь другим, то нужно его добавить.
}
