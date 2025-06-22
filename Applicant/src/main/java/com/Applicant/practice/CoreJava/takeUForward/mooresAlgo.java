package com.Applicant.practice.CoreJava.takeUForward;

public class mooresAlgo {
    public static int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int i=0;i<nums.length;i++){

            if(count==0){
                element=nums[i];
                count++;
            }else if(element==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int times=0;
        for(int i=0;i<nums.length;i++){
            if(element==nums[i]){
                times++;
            }
        }
        if(times>(nums.length/2)){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
     int[] nums ={3,3,4,4};
        System.out.println(majorityElement(nums));
    }
}
