/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moasirh.controller;

import com.moasirh.model.DAOpantalones;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class Controllerpantalones {
    @RequestMapping(value="/pantalones",method = RequestMethod.GET)
    public @ResponseBody String pantalon()throws Exception{
        DAOpantalones daopantalones = new DAOpantalones();
        return daopantalones.buscar();
    }
          
   }
