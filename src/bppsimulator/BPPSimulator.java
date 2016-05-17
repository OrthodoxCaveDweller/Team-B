package bppsimulator;

import java.util.ArrayList;

public class BPPSimulator {

    public static void main(String[] args) {
        ArrayList<Packet> in = new ArrayList<>();
        in.add(new Packet(10));
        in.add(new Packet(3));
        in.add(new Packet(2)); 
        in.add(new Packet(3));
        in.add(new Packet(10)); 
        in.add(new Packet(1)); 
        in.add(new Packet(6)); 
        in.add(new Packet(7));
        Screen screen = new Screen(in);
        //BinPackingBruteforce bf = new BinPackingBruteforce(in, 12);
        //testBinPacking(bf, "brute force");

        //BinPackingFirstFit ffd = new BinPackingFirstFit(in, 12);
        //testBinPacking(ffd, "first fit");
        
        
    }

    private static void testBinPacking(AbstractBinPacking algo, String algoName) {
        long startTime;
        long estimatedTime;

        startTime = System.currentTimeMillis();
        System.out.println("needed bins (" + algoName + "): " + algo.getResult());
        algo.printBestBins();
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("in " + estimatedTime + " ms");

        System.out.println("\n\n");
    }

}
