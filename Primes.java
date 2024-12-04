public class Primes {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[input + 1];
        System.out.println("Prime numbers up to " + input + ":");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;
        int index = 0;
        while (index < arr.length) {
            while (index < arr.length && arr[index] == false) {
                index++;
            }
            int index2 = index + 1;
            while (index2 < arr.length) {
                if (index2 % index == 0) {
                    arr[index2] = false;
                }
                index2++;

            }
            index++;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                count++;

                System.out.println(i);
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + input +
                " (" + (int) (((double) count / input) * 100) + "% are primes)");
    }
}