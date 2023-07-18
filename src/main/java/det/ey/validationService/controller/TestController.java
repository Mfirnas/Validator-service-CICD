package det.ey.validationService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/testservice")
public class TestController {

    @GetMapping("/test")
    public String testService(){

        return "Service is work successfully";
    }
}
