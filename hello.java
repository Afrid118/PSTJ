class hello
{
    public static void main(String[] args) {
   int nums[] = {2,3,5,7,10};
   int target = 7;
   for (int i = 0;i < nums.length ; i++){
    if(nums[i] == target){
        System.out.println("Element found at index "+i);
    }
    }
}
}