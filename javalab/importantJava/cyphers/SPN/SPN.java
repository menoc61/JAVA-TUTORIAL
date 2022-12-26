package importantJava.cyphers.SPN;


import java.util.*;

/**
 * Year@2022.
 * Author@GilleMomeni.
 * Cryptography Cipher.
 * Class@B2A :: IAI-Cameroun.
 */
public class SPN {
    private static final String line = "--------------------------------------------------";
    final static int max =16;
    private String plaintext;
    private String key;
    SPN(){ // NULL constructor

    }
    /*
    *main method 
    */
    public static void main(String[] args) {
        SPN execute = new SPN();// object created...

            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Enter Plaintext: ");
                    String plaintext = in.nextLine(); //enter plaintext
                    for (int i = 0; i < plaintext.length(); i++) {
                        if (plaintext.charAt(i)!= 1 || plaintext.charAt(i)!= 0) {
                            System.out.println("#Plaintext input error#");
                        } 
                    }
                System.out.println("Enter Key: ");//enter key
                    String key = in.nextLine();
                    for (int j = 0; j < plaintext.length(); j++) {
                        if (plaintext.charAt(j)!= 1 || plaintext.charAt(j)!= 0) {
                            System.out.println("#Key input error#");
                        } 
                    }                    
                System.out.println("Enter the size of pattern: "); //enter m
                    int m = in.nextInt(); 

                System.out.println("Enter the element of pattern: "); //enter element of kpi
                    int[] patternTable = new int[m];
                        for (int i = 0; i < m; i++) {
                            System.out.print("elt ["+i+"]:\t");
                            int elt = in.nextInt();
                            patternTable[i] = elt;
                        }

                System.out.println("Enter the Substitution Table: "); //enter element of SubstitutionTable
                    int[] substiTable = new int[max];
                        for (int i = 0; i < substiTable.length; i++) {
                            System.out.print("elt ["+i+"]:\t");
                            int elt = in.nextInt(); 
                                substiTable[i] = elt;
                        }
                        /*                          
                        =============================
                        ===== PRINT FINAL TABLE ===== 
                        =============================
                        */
                        ArrayList<String> Substi;
                        ArrayList<String> Shift,XOR;;
                        for (int i = 0; i < patternTable.length; i++) {
                            System.out.println("==================================================");
                            System.out.println("Substitution permutation network java program v1.1");
                            System.out.println("==================================================");
                            System.out.println("\n"+line);
                            System.out.println("-----loops iterations-----|-----Execution steps---");
                            System.out.println(line+"\n");
                            System.out.println("Kp["+i+"]                     |       " +execute.shiftRight(key, patternTable[i]));  
                            Shift = execute.shiftRight(key, patternTable[i]);
                            System.out.println("U["+i+1+"]                     |       " +execute.xor(Shift, plaintext));    
                            XOR = execute.xor(Shift, plaintext);
                            System.out.println("V["+i+1+"]                     |       " +execute.substitition(XOR, substiTable));
                            Substi = execute.substitition(XOR,substiTable);
                            System.out.println("W["+i+1+"]                     |       " +execute.permutation(Substi, substiTable));
                            plaintext = execute.permutation(Substi, substiTable);
                            System.out.println("\n"+line+"\n");
                        }
            }        

    }
        /* FUNCTION FOR Convert string To ArrayList */
        public static ArrayList<String> stringToArrayList(String str) {
            ArrayList<String> CharList = new ArrayList<String>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)!= 1 || str.charAt(i) == 0) {
                    CharList.add(str.charAt(i), str);
                }else{
                    System.out.println("An Error occur ! #WRONG INPUT At stringToArrayList#");
                    break;
                }
            }
            return CharList;
        }
                /* FUNCTION FOR Convert ArrayList To String */
                public static String ArrayListToString(ArrayList<String> param) {
                    String str="";
                    for (int i = 0; i < param.size(); i++) {
                        if (str.charAt(i)== 1 || str.charAt(i) == 0) {
                            str=  param.get(i);
                        }else{
                            System.out.println("An Error occur ! #WRONG INPUT At ArrayListToString#");
                            break;
                        }
                    }
                    return str;
                }
	/*
	 * Convert decimal into binary string 0-15
	 */
	public static String decToBin(int num){
		String binStr="";
		if(num==0)
			binStr = "0000";
		else if(num==1)
			binStr = "0001";
		else if(num==2)
			binStr = "0010";
		else if(num==3)
			binStr = "0011";
		else if(num==4)
			binStr = "0100";
		else if(num==5)
			binStr = "0101";
		else if(num==6)
			binStr = "0110";
		else if(num==7)
			binStr = "0111";
		else if(num==8)
			binStr = "1000";
		else if(num==9)
			binStr = "1001";
		else if(num==10)
			binStr = "1010";
		else if(num==11)
			binStr = "1011";
		else if(num==12)
			binStr = "1100";
		else if(num==13)
			binStr = "1101";
		else if(num==14)
			binStr = "1110";
		else if(num==15)
			binStr = "1111";
		return binStr;
	}
    /*
    * Convert binary into decimal string 0-15
    */
   public static int BinToDec(String num){
       int binStr = 0;
       if(num=="0000")
           binStr = 0;
       else if(num=="0001")
           binStr = 1;
       else if(num=="0010")
           binStr = 2;
       else if(num=="0011")
           binStr = 3;
       else if(num=="0100")
           binStr = 4;
       else if(num=="0101")
           binStr = 5;
       else if(num=="0110")
           binStr = 6;
       else if(num=="0111")
           binStr = 7;
       else if(num=="1000")
           binStr = 8;
       else if(num=="1001")
           binStr = 9;
       else if(num=="1010")
           binStr = 10;
       else if(num=="1011")
           binStr = 11;
       else if(num=="1100")
           binStr = 12;
       else if(num=="1101")
           binStr = 13;
       else if(num=="1110")
           binStr = 14;
       else if(num=="1111")
           binStr = 15;
       return binStr;
   }
    /* Getters and Setters used in program */
    public String getPlaintext() {
        return plaintext;
    }
    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    /* FUNCTION FOR SHIFTING */
    public ArrayList<String> shiftRight(String myString, int shift){

        ArrayList<String> myList = new ArrayList<>();

        //Put every character inside the myList
        for(int i = 0; i < myString.length(); i++){
            myList.add(myString.charAt(i) + "");
        }

        ArrayList<String> temp = new ArrayList<>();

        //Add the rightmost characters into the temp
        //Delete those characters from the myList
        int count = shift;
        while(count != 0){
            temp.add(myList.get(myList.size() - shift));
            myList.remove(myList.get(myList.size() - shift));
            count--;
        }

        //Add the characters from the temp to the beginning of the myList
        for(int i = 0; i < temp.size(); i++){
            myList.add(i ,temp.get(i));
        }

        return myList;
    }
    /* FUNCTION FOR XORING */
    private ArrayList<String> xor(ArrayList<String> shift, String plaintext2) {
        ArrayList<String> arraylist2 = stringToArrayList(plaintext2);
        for (int i = 0; i < shift.size(); i++) {
            //xor principle
            if(shift.get(i) == arraylist2.get(i)){
                shift.remove(i);
                shift.add(i, "0");
            }else{
                shift.remove(i);
                shift.add(i, "1");
            }
        }
        return shift;
    }
    /* FUNCTION FOR SUBSTITUTION */
    private ArrayList<String> substitition(ArrayList<String> xOR, int[] substiTable) {
        String temp,temp_k=null;
        int k_temp=0;
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < xOR.size(); i+=4) {
           temp= ArrayListToString(xOR);
           for (int j = 0; j < 1; j++) {
            k_temp = substiTable[BinToDec(temp)];
            temp_k = decToBin(k_temp);
           } 
            result.add(i, temp_k);
        }
        return result;
    }
    /* FUNCTION FOR PERMUTATION */
    private String permutation(ArrayList<String> substi, int[] substiTable) {
        int temp;
        String[] result = new String[];

        int[] arr = new int[max];
        
        for (int i = 0; i < result[max]; i++) {
            arr[i] = result[temp];
        }
        return ;
    }
}
