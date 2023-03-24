package com.dubla2.demo.repository;

import com.dubla2.demo.entity.Ecuation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EcuationRepository {
    public ArrayList<Ecuation> ecuations;

    public EcuationRepository(ArrayList<Ecuation> ecuations) {
        this.ecuations = ecuations;
    }

    public ArrayList<Ecuation> populateFile() {
        ecuations.add(new Ecuation(25.2, 34.2, "sum"));
        ecuations.add(new Ecuation(24.3, 27.5, "diff"));
        ecuations.add(new Ecuation(25.2, 34.2, "mult"));
        ecuations.add(new Ecuation(24.3, 27.5, "div"));
        return ecuations;
    }

    public ArrayList<Ecuation> getEcuations() {
        return ecuations;
    }
}
