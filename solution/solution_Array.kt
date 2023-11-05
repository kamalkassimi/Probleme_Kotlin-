class Solution {
    fun getWinner(arr: IntArray, k: Int): Int {
        var maxElement:Int = arr.maxOrNull()?:0
        var  curr= arr[0] 
        var  winstreak:Int = 0  
       for(i in 0..arr.size){
           var   opponent= arr[i]
           if( curr > opponent){
                    winstreak += 1
           }        
            else{
                  curr = opponent
                  winstreak = 1
            }
               
            if( winstreak == k || curr == maxElement ){
                         return curr 
            }
                   
        }
        return -1 
    }
}