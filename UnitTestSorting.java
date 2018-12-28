package algorithm;

import org.testng.Assert;

import java.util.concurrent.ExecutionException;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below
        sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }

        sort.bucketSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.mergeSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.heapSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.bucketSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch (Exception ex){
            ex.getMessage();
        }
        sort.getMax(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }
        sort.shellSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}

