public class BinarySearch
{
    public static void main(String[] args)
    {

        int[] data = {0, 1, 2, 4, 5, 6, 7, 8, 9, 10};

         int target = 3;

         int low = 0;
         int mid = 0;
         int high = data.length - 1;

        do {

            mid = (low + high) / 2;
            if (target == data[mid])
            {
                System.out.println("Target: " + target + " found at index: " + mid);
                break;
            }
            else if (target > data[mid]) // x is on the right side
                low = mid + 1;
            else                  // x is on the left side
                high = mid - 1;

        }while(low <= high);

        if(low > high)
            System.out.println("Value: " + target + " not found in the array");


    }
}
