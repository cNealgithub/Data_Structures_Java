package Mod1_Array;

public class Array1 {
    public static void main(String[] args) {
        //array can be declaed and initialized in two ways:
        //1) when elements are known
        int marks[] = {4, 5, 4, 6, 8, 5};
        //2) when size has taken as input from user or elements are not known
        int size = 5;
        int failMarks[] = new int[size];

        //traversal
        for(int value:marks){
            System.out.print(" " + value);
        }
        //peek : elements can be peeked through accessing their index
        System.out.println();
        System.out.print("peeking element at 3 index : " + marks[2]);

    }
}
