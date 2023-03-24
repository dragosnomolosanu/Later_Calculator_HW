package com.dubla2.demo.Other;

import com.dubla2.demo.entity.Ecuation;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

@Service
public class Serialization extends Thread{
    public ArrayList<Ecuation> ecuations;
    public File file;

    public Serialization(){

    }

    public Serialization(ArrayList<Ecuation> ecuations, File file) {
        this.ecuations = ecuations;
        this.file=file;
    }

    @Override
    public void run() {
        try {
            for(int i=0;i<ecuations.size();i++) {
                FileOutputStream filein = new FileOutputStream(file);
                ObjectOutputStream outputStream = new ObjectOutputStream(filein);
                outputStream.writeObject(ecuations);
                Thread.sleep(1000);
                outputStream.close();
                filein.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
