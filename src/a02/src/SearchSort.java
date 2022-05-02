package a02.src;

public class SearchSort extends SortingAlgorithm {

    public void sort(int[] inputArray) {
        int[] arr = new int[inputArray.length];
        int[] tmp = new int[1];
        tmp[0] = inputArray[0];
        for(int i = 0; i < inputArray.length - 1; i++){
            for (int j = i+1; j < inputArray.length - 2; j++){
                if((tmp[0] < inputArray[i]) == false){
                    break;
                }
                else arr[i] = tmp[0];
            tmp[0] =  inputArray[i];
        }
    }
}
}