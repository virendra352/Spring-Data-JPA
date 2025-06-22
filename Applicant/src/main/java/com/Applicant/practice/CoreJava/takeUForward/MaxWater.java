package com.Applicant.practice.CoreJava.takeUForward;

public class MaxWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int left=0;
        int right= height.length-1;
        int maxWater=0;
        while(left<right){

            int minHeight=Math.min(height[left],height[right]);
           // int different=right-left;
            /*int currentWater=minHeight*different;
            if(currentWater>maxWater){
                maxWater=currentWater;
            }*/
            maxWater=Math.max(maxWater,minHeight*(right-left));
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        System.out.println(maxWater);
    }
}
