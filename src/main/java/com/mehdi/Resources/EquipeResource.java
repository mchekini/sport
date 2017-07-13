package com.mehdi.Resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mahdi on 14/07/2017.
 */

@RestController
public class EquipeResource {


    @RequestMapping("/team")
    public String team() {
        return "test";
    }


}
