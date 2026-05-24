public class linearsearch {
    public static void main(String[] args) {
        int nums[] = {10,20,30,40,50};
        int target = 30; // yeh hamara target ha humko yeh chahiye array mein basically linear search mein iska index chahi
        int ans = -1; // isko isiliye lete ha jab koi mann lo ki array mein no ha hi nhi to kuch to print kna chahiye nhi to user confuse ho jayega
        for(int i = 0 ; i<nums.length; i++){
           if(nums[i] == target){
            ans = i; // ans = i iska mtlb yeh ha ki ans i ha hamara
            break; // agar 1 st mein mil jayega to wahin ruk jayega loop aur mehnaat nhi karna padega 
           }
        }
        System.out.println("output: " + ans);
    }
}
