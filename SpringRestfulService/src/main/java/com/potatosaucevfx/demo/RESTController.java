package com.potatosaucevfx.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author PotatoSauceVFX <rj@potatosaucevfx.com>
 */
@RestController
public class RESTController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final static Logger logger = Logger.getLogger(RESTController.class);

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, HttpServletRequest request, HttpServletResponse response) {
        SimpleDateFormat date = new SimpleDateFormat("hh:mm aa MM-dd-yyyy");
        logger.info("REST greeting was requested by " + request.getRemoteAddr() + " at " + date.format(new Date()));

        // Return new Greeting Object, this will be converted to JSON.
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/date")
    public Date date(HttpServletRequest request, HttpServletResponse response) {
        SimpleDateFormat date = new SimpleDateFormat("hh:mm aa MM-dd-yyyy");
        logger.info("REST date was requested by " + request.getRemoteAddr() + " at " + date.format(new Date()));

        // Return new Greeting Object, this will be converted to JSON.
        return new Date();
    }
}
