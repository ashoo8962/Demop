public class Duplicate {
    public static void main(String[] args) {


        int[] arr = {4, 8, 3, 8,8,8}; //l=5
        int count = 0;

        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j<arr.length-1; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    System.out.println(arr[j]);

                }

            }


        }
        System.out.println("C"+count);


    }}
