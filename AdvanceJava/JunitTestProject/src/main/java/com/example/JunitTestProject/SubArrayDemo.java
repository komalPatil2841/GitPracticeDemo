package com.example.JunitTestProject;
import java.util.*;
public class SubArrayDemo {

public int[] subBtnArray() {

Scanner sc = new Scanner(System.in);

int[] a = new int[] {10,12,20,30,25,40,32,31,35,50,60};

int[] sub = Arrays.copyOfRange(a,3,9);

System.out.println("Array is : ");

for(int i = 0; i < a.length; i++){

System.out.print(a[i]+"\t");

}

System.out.println("SubArray is : ");

for(int i = 0; i < sub.length; i++){

System.out.print(sub[i]+"\t");

}
return sub;

}

} 
