
// Recursive approach to perform tower of Hanoi.

class TowerOfHanoi {
    
    public static void towerofHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("move disk from "+ src+ " to "+ dest );
            return;
        }
        towerofHanoi(n-1, src, dest ,helper);
        System.out.println("move disk from "+ src+ " to "+ dest);
        towerofHanoi(n-1, helper, src, dest);
    }
    
    public static void main(String[] args) {
        int no_of_disk = 3;
        towerofHanoi(no_of_disk,"source_tower","helper_tower","destination_tower"); 
    }
}
