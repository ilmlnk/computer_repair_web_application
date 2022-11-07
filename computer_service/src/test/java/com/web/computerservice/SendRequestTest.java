package com.web.computerservice;

import com.web.computerservice.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SendRequestTest {

    private HomeController homeController;

    public SendRequestTest(HomeController homeController) {
        this.homeController = homeController;
    }

    @Test
    void sendRequest() {

    }
}
