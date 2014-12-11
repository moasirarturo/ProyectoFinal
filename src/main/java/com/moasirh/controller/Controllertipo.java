/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package com.moasirh.controller;

import com.moasirh.model.DAOtipo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class Controllertipo {
    @RequestMapping(value="/tipo",method = RequestMethod.GET)
    public @ResponseBody String tipo()throws Exception{
        DAOtipo daotipo = new DAOtipo();
        return daotipo.tipo();
    }
          
   }
