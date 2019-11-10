package cc.buoy.hostname.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    private static Long i = 0L;

    @GetMapping("/")
    public String getHostName() {

        String hostname = System.getenv("HOSTNAME");
        String x = "hostname: " + hostname + ", count: " + i++;
//        System.out.println(x);
        log.info(x);
        return x;
    }
}
