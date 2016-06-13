package com.algorithm.demo.java7;

/**
 * Created by Trang Truong(sgtt003) on 6/8/2016.
 */
public class Product {
    private int quantity;//?
    private int maxQuantity;
    private int reqMaterial;
    private static int materialQuantity = 3600;
    private int reqWorkers;
    private static int availWorkers = 960;
    private int profit;//?max

    public Product() {
    }

    private Product(int maxQuantity, int reqMaterial, int reqWorkers, int profit) {
        this.maxQuantity = maxQuantity;
        this.reqMaterial = reqMaterial;
        this.reqWorkers = reqWorkers;
        this.profit = profit;
    }

    public static void main(String[] args) {
        Product prod1 = new Product(500, 5, 1, 7);
        Product prod2 = new Product(500, 6, 2, 10);
        int maxProfit = 0;
        int prod1Quantity = 0;
        int prod2Quantity = 0;

        for(int i = 0; i < prod2.maxQuantity; i++) {
            prod1.quantity = Math.min((int)(materialQuantity-prod2.quantity*prod2.reqMaterial)/prod1.reqMaterial, (int)(availWorkers-prod2.quantity*prod2.reqWorkers)/prod1.reqWorkers);
            if(materialQuantity - (prod1.quantity*prod1.reqMaterial + prod2.quantity*prod2.reqMaterial) < 0 ||
                    availWorkers - (prod1.quantity*prod1.reqWorkers + prod2.quantity*prod2.reqWorkers) < 0) {
                continue;
            }
            int profit = prod1.quantity*prod1.profit + prod2.quantity*prod2.profit;
            if(profit >= maxProfit) {
                maxProfit = profit;
                prod1Quantity = prod1.quantity;
                prod2Quantity = i;
            }
            prod2.quantity = i;
        }

        System.out.println("maxProfit: " + maxProfit + " prod1Quantity: " + prod1Quantity + " prod2Quantity: " + prod2Quantity);
        System.out.println("Material used: " + (prod1Quantity*prod1.reqMaterial + prod2Quantity*prod2.reqMaterial) +
                " workers used: " + (prod1Quantity*prod1.reqWorkers + prod2Quantity*prod2.reqWorkers));

    }

}
