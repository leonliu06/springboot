package net.mrliuli.web;

import net.mrliuli.domain.MyThing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by li.liu on 2018/1/3.
 */

@RestController
public class MyController {

    @RequestMapping("/thing")
    public MyThing thing(){
        return new MyThing();
    }
}
