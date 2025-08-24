
public int countArrayLessThan (int[][] arr, int num) {
    if (arr==null)return 0;
    int count = 0;
    for (int i=0; i<arr.length; i++) {
        for (int j=0; j<arr[i].length; j++){
            if (arr[i][j]<num) count++;
        }
    }
    return count;
}
