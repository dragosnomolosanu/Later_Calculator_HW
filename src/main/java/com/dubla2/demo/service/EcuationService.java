package com.dubla2.demo.service;

import com.dubla2.demo.Other.Serialization;
import com.dubla2.demo.entity.Ecuation;
import com.dubla2.demo.repository.EcuationRepository;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

@Service
public class EcuationService {
       File file;
       ArrayList<Ecuation> ecuations;

    public EcuationService() {
    }

    public EcuationService(File file, ArrayList<Ecuation> ecuations) {
        this.file = file;
        this.ecuations = ecuations;
    }
}
