package com.browseengine.bobo.geosearch.score.impl;

/**
 * 
 * @author gcooney
 * @author shandets
 *
 */
public class CartesianComputeDistance {
    /*
    public static long computeDistanceSquared(int x1, int y1, int z1, 
            int x2, int y2, int z2) {
        
        return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) + (z1-z2)*(z1-z2);
        
    }
    */
    
    public static double computeDistanceSquared(int x1, int y1, int z1, 
            int x2, int y2, int z2) {
        double xsq = Math.pow((double)x1 - (double)x2, 2);
        double ysq = Math.pow((double)y1 - (double)y2, 2);
        double zsq = Math.pow((double)z1 - (double)z2, 2);
        return xsq + ysq + zsq;
    }
    
    public static double computeDistance(int x1, int y1, int z1, 
            int x2, int y2, int z2) {
        return Math.sqrt(computeDistanceSquared(x1, y1, z1, x2, y2, z2));
    }
    
}
