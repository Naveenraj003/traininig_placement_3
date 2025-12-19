class Main {
    public static boolean asc(String n){
        int[] arr = new int[26];//create a array
        int index ;
        int size = n.length();
        for(int i = 0 ; i < size ; i++){ 
            index = n.charAt(i) - 'a';  //count the string 
            arr[index]++;
        }
        for(int i = 0 ; i < size ; i++){
            index =n.charAt(i) - 'a';  //compare the count of string and ascii value
            if(arr[index]!=index+1){
                return false;
            }
           
        } return true;
    }
    public static void main(String[] args) {
       String n = "aab";
       System.out.println(n);
       if(asc(n)==true){
           System.out.print("yes");
       }
       else{
           System.out.print("no");
       }
    }}
//output
//aab
//yes
