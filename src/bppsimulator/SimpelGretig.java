/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bppsimulator;

import java.util.ArrayList;

/**
 *
 * @author Beheerder
 */
public class SimpelGretig extends Algoritme {

    private int amountOfBins;
    
    public SimpelGretig(ArrayList<Bin> bins, ArrayList<Packet> packets){
        this.bins = bins;
        this.packets = packets;
    }
    
    @Override
    public void runSimulation(){
        
    }

    @Override
    int returnBins() {
        return 0;
    }
}
