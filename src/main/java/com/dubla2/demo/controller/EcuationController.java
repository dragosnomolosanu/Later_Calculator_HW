package com.dubla2.demo.controller;


import com.dubla2.demo.Other.Serialization;
import com.dubla2.demo.entity.Ecuation;
import com.dubla2.demo.repository.EcuationRepository;
import com.dubla2.demo.service.EcuationService;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import java.util.ArrayList;


@RestController
public class EcuationController {
    public EcuationRepository ecuationRepository;

    ArrayList<Ecuation> ecuations;
    public EcuationService ecuationService;
    File file=new File("Ecuation3.ec");

    Serialization serializeThread;


    public EcuationController(EcuationRepository ecuationRepository) {
        this.ecuationRepository = ecuationRepository;
    }

    @PostMapping("/do-math")
    public File writeInAndGetTheFile() {
        serializeThread = new Serialization(ecuationRepository.populateFile(), file);
        serializeThread.start();
        return file;
    }

    @GetMapping("/results")
    public ModelAndView ReadAndPrintFromTheFile() {
        try {

                FileInputStream filein = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(filein);
                ecuations =(ArrayList<Ecuation>) objectInputStream.readObject();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                System.err.println(e.getMessage());
            }
        ModelAndView modelAndView=new ModelAndView("Ecuations");
        modelAndView.addObject("Ecuatia",ecuations);
        return modelAndView;
    }
    @GetMapping("/check-finished")
        public String isOver(){
            String message;
            if (serializeThread.isAlive()==true){
                message="Nu e gata!";
            }
            else{
                message="E gata!";
            }
            return message;
        }

}
