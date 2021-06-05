package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here

         RangeIterator rangeIterator = new RangeIterator(23, 12);

        // print all the integer numbers between 23 and 12 (inclusive)
        for (Integer num : rangeIterator) {
            System.out.println(num);
        }


        RangeIterator rangeIterator2 = new RangeIterator(12, 23);

        // print all the integer numbers between 23 and 12 (inclusive)
        for (Integer num : rangeIterator2) {
            System.out.println(num);
        }


        RangeIterator rangeIterator3 = new RangeIterator(12, 12);

        // print all the integer numbers between 23 and 12 (inclusive)
        for (Integer num : rangeIterator3) {
            System.out.println(num);
        }
    }
}
