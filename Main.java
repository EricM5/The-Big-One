import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (true) {
      int[] array = new int [5];
      int a = 4;
      int counter, d, e, f, g, b, temporary;
      d = 0; e = 0; f = 0; g = 0;
      int biggest, secondbiggest, thirdbiggest, fourthbiggest, fifthbiggest = 0;
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      System.out.print("And now for the big one: ");
      for (int i = 0; i < 5; i++) {
        temporary = number % 10;
        number /= 10;
        array[a] = temporary;
        a--;
        if (a == -1) 
          break;
      }
      for (a = 0; a < array.length; a++) {
        if (a == 0) {
          d = 1; e = 2; f = 3; g = 4;
        } else if (a == 1) {
          d = 0; e = 2; f = 3; g = 4;
        } else if (a == 2) {
          d = 0; e = 1; f = 3; g = 4;
        } else if (a == 3) {
          d = 0; e = 1; f = 2; g = 4;
        } else if (a == 4) {
          d = 0; e = 1; f = 2; g = 3; 
        }
        if (array[a] >= array[d] && array[a] >= array[e] && array[a] >= array[f] && array[a] >= array[g]) {
          biggest = array[a];
          array[a] = 0;
          System.out.print(biggest);
          break;
        }  
      }
      for (a = 0; a < array.length; a++) {
        if (a == 0) {
          d = 1; e = 2; f = 3; g = 4;
        } else if (a == 1) {
          d = 0; e = 2; f = 3; g = 4;
        } else if (a == 2) {
          d = 0; e = 1; f = 3; g = 4;
        } else if (a == 3) {
          d = 0; e = 1; f = 2; g = 4;
        } else if (a == 4) {
          d = 0; e = 1; f = 2; g = 3; }
        if (array[a] >= array[d] && array[a] >= array[e] && array[a] >= array[f] && array[a] >= array[g]) {
          secondbiggest = array[a];
          array[a] = 0;
          System.out.print(secondbiggest);
          break;
        } 
      }
      for (a = 0; a < array.length; a++) {
        if (a == 0) {
          d = 1; e = 2; f = 3; g = 4;
        } else if (a == 1) {
          d = 0; e = 2; f = 3; g = 4;
        } else if (a == 2) {
          d = 0; e = 1; f = 3; g = 4;
        } else if (a == 3) {
          d = 0; e = 1; f = 2; g = 4;
        } else if (a == 4) {
          d = 0; e = 1; f = 2; g = 3; 
        }
        if (array[a] >= array[d] && array[a] >= array[e] && array[a] >= array[f] && array[a] >= array[g]) {
          thirdbiggest = array[a];
          array[a] = 0;
          System.out.print(thirdbiggest);
          break;
        } 
      }
      for (a = 0; a < array.length; a++) {
        if (a == 0) {
          d = 1; e = 2; f = 3; g = 4;
        } else if (a == 1) {
          d = 0; e = 2; f = 3; g = 4;
        } else if (a == 2) {
          d = 0; e = 1; f = 3; g = 4;
        } else if (a == 3) {
          d = 0; e = 1; f = 2; g = 4;
        } else if (a == 4) {
          d = 0; e = 1; f = 2; g = 3;
        }
        if (array[a] >= array[d] && array[a] >= array[e] && array[a] >= array[f] && array[a] >= array[g]) {
          fourthbiggest = array[a];
          array[a] = 0;
          System.out.print(fourthbiggest);
          break;
        } 
      }
      for (a = 0; a < array.length; a++) {
        if (a == 0) {
          d = 1; e = 2; f = 3; g = 4;
        } else if (a == 1) {
          d = 0; e = 2; f = 3; g = 4;
        } else if (a == 2) {
          d = 0; e = 1; f = 3; g = 4;
        } else if (a == 3) {
          d = 0; e = 1; f = 2; g = 4;
        } else if (a == 4) {
          d = 0; e = 1; f = 2; g = 3; 
        }
        if (array[a] >= array[d] && array[a] >= array[e] && array[a] >= array[f] && array[a] >= array[g]) {
          fifthbiggest = array[a];
          array[a] = 0;
          System.out.print(fifthbiggest);
          break;
        } 
      }
      System.out.println();
      System.out.println();   
    }
  }
}
  

    