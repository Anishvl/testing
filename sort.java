package sort;
public class sort{
  public int sort(int num[]){
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<i;j++){
        if(nums[i]<num[i+1]){
          int temp=nums[i+1];
          nums[i+1]=nums[i];
          nums[i]=temp;
        }
      }
    }
  }
}