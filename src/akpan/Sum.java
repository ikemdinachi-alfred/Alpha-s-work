package akpan;

import java.util.Arrays;

public class Sum {
    public static int sum(int [] numbers){
       int total = 0;
        for (int count = 0; count < numbers.length; count++) {
            total += numbers[count];

        }
        return total;
    }

    public static String[] sum(String [] value){
        String [] newValue = new String[value.length];
        for (int index = 0; index < value.length ; index++) {
            newValue[index] = value[index];
        }
        return newValue;

    }

    public static void main(String[] args) {
        int [] number = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        String [] fine = {"you","ehy", "we", "put"};
        System.out.println(sum(number));;
    }


}
