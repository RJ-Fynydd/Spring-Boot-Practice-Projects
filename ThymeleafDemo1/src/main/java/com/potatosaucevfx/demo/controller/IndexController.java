package com.potatosaucevfx.demo.controller;

import com.potatosaucevfx.demo.model.BottledWater;
import com.potatosaucevfx.demo.service.BottledWaterService;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author PotatoSauceVFX <rj@potatosaucevfx.com>
 */
@Controller
public class IndexController {

    @Autowired
    BottledWaterService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView indexPage(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("index");

        SimpleDateFormat date = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss aa");
        mav.addObject("name", "RJ");

        // Add object
        BottledWater bottledWater = new BottledWater("Aquafina", 16.9, true);
        mav.addObject("bottleOfWater", bottledWater);

        // Add Arraylist
        mav.addObject("bottleArray", service.getBottleOfWaterList());

        /*
        mav.addObject("date", date.format(new Date()));
        mav.addObject("time", time.format(new Date()));
        mav.addObject("locale", request.getLocale().toString());
         */
        return mav;
    }

}
