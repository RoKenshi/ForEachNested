package com.Herbert.ForEachNested;

public class ForEachNested {
    public void forEachNested(int var1, int var2){
        int sum = 0;
        int nums[][] = new int[var1][var2];
        //assigning elements to an arrays
        for (int i = 0; i<var1; i++)
            for (int j = 0; j<var2;j++){
                nums[i][j] = (i+1)*(j*1);
            }
        //Cycle in style 'for each' for displaying and summing values

        for(int x[]: nums){
            for (int y: x){
                System.out.println(y);
                sum+=y;
            }
        }
        System.out.println("sum: " + sum);
    }
}
