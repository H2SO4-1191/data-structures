import java.util.Scanner;
public class Main {
    ////////////////////Global variables////////////////////
    static Scanner sin = new Scanner(System.in);
    static int v, g, h;
    static String s;
    ////////////////////Main method//////////////////////
    public static void main(String[] args) {
       v = 0;
       while (v == 0) {
           System.out.println("Welcome to H2SO4-1191's Data Structures Guide: \n1- One-dimensional array.\n2- Two-dimensional array.\n\t2.2- Triangular array.\n\t2.3- Jagged Array.\n3- Three-dimensional array.\n4- Strings.\n5- Single Linked-list.\n6- Double Linked-list.\n7- Circle Linked-List. \n8- Stack. \n9- Queue. \n10- Algorithms. \n11- Binary Tree. \n12- Exit.");
           String c = sin.next();
           switch (c) {
               /////One-Dimensional array/////
               case "1": {
                   System.out.print("Enter the length of the array: ");
                   int n = sin.nextInt();
                   int[] D1 = new int[n];
                   readD1(D1);
                   g = 0;
                   while (g == 0) {
                       printD1(D1);
                       System.out.println("1- Sort ascendingly.\n2- Delete an element.\n3- Find average.\n4- Even elements.\n5- Prime elements.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               printD1(D1);
                               sortAscendingly(D1);
                               printD1(D1);
                               ask();
                               break;
                           }
                           case "2": {
                               printD1(D1);
                               deleteIndex(D1);
                               printD1(D1);
                               ask();
                               break;
                           }
                           case "3": {
                               printD1(D1);
                               System.out.println("Average: " + findAvg(D1));
                               ask();
                               break;
                           }
                           case "4": {
                               printD1(D1);
                               evenElements(D1);
                               ask();
                               break;
                           }
                           case "5": {
                               printD1(D1);
                               primeElements(D1);
                               ask();
                               break;
                           }
                           default: System.out.println("Invalid input");
                       }
                   }
                   break;
               }
               /////Two-Dimensional array/////
               case "2": {
                   System.out.print("Enter the number of rows: ");
                   int n = sin.nextInt();
                   System.out.print("Enter the number of columns: ");
                   int m = sin.nextInt();
                   int[][] D2 = new int[n][m];
                   readD2(D2);
                   g = 0;
                   while (g == 0) {
                       printD2(D2);
                       System.out.println("1- Sort descendingly.\n2- Maximum element.\n3- Find summation.\n4- Odd elements.\n5- Index of minimum element.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               printD2(D2);
                               sortDescendingly(D2);
                               printD2(D2);
                               ask();
                               break;
                           }
                           case "2": {
                               printD2(D2);
                               System.out.println("Maximum element: " + maximumElement(D2));
                               ask();
                               break;
                           }
                           case "3": {
                               printD2(D2);
                               System.out.println("Summation: " + findSummation(D2));
                               ask();
                               break;
                           }
                           case "4": {
                               printD2(D2);
                               oddElements(D2);
                               ask();
                               break;
                           }
                           case "5": {
                               printD2(D2);
                               minimumLocation(D2);
                               ask();
                               break;
                           }
                           default:
                               System.out.println("Invalid input");
                       }
                   }
                   break;
               }
               /////Triangular array/////
               case "2.2": {
                   System.out.print("Enter the size of the array: ");
                   int s = sin.nextInt();
                   int T[][] = new int[s][s];
                   readD2(T);
                   g = 0;
                   while (g == 0) {
                       printD2(T);
                       System.out.println("1- Primary diagonal.\n2- Primary upper triangle.\n3- Primary lower Triangle.\n4- Secondary diagonal.\n5- Secondary upper triangle.\n6- Secondary lower triangle.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               printD2(T);
                               primaryDiagonal(T);
                               ask();
                               break;
                           }
                           case "2": {
                               printD2(T);
                               upperPrimaryTriangle(T);
                               ask();
                               break;
                           }
                           case "3": {
                               printD2(T);
                               lowerPrimaryTriangle(T);
                               ask();
                               break;
                           }
                           case "4": {
                               printD2(T);
                               secondaryDiagonal(T);
                               ask();
                               break;
                           }
                           case "5": {
                               printD2(T);
                               upperSecondaryTriangle(T);
                               ask();
                               break;
                           }
                           case "6": {
                               printD2(T);
                               lowerSecondaryTriangle(T);
                               ask();
                               break;
                           }
                           default:
                               System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Jagged array/////
               case "2.3": {
                   System.out.print("Enter the number of rows: ");
                   int n = sin.nextInt();
                   int J[][] = new int[n][];
                   for (int i = 0; i < J.length; i++) {
                       System.out.print("Enter the length of row #" + i + ":");
                       int m = sin.nextInt();
                       J[i] = new int[m];
                   }
                   readD2(J);
                   g = 0;
                   while (g == 0) {
                       printD2(J);
                       System.out.println("1- Minimum element of each row.\n2- Multiplication of each row.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               printD2(J);
                               minimumOfEachRow(J);
                               ask();
                               break;
                           }
                           case "2": {
                               printD2(J);
                               multiplicationOfEachRow(J);
                               ask();
                               break;
                           }
                           default:
                               System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Three-Dimensional array/////
               case "3": {
                   System.out.print("Enter the number of layers: ");
                   int r = sin.nextInt();
                   System.out.print("Enter the number of rows: ");
                   int n = sin.nextInt();
                   System.out.print("Enter the number of columns: ");
                   int m = sin.nextInt();
                   int D3[][][] = new int[r][n][m];
                   readD3(D3);
                   printD3(D3);
                   g = 0;
                   while (g == 0) {
                       printD3(D3);
                       System.out.println("1- Maximum element of each layer.\n2- Minimum element in in the matrix.\n3- Sort each layer descendingly.\n4- Sort whole matrix ascendingly.\n5- Elements divisible by 3.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               printD3(D3);
                               maximumEachLayer(D3);
                               ask();
                               break;
                           }
                           case "2": {
                               printD3(D3);
                               System.out.println("Minimum element: " + minimumElement(D3));
                               ask();
                               break;
                           }
                           case "3": {
                               sortLayersDescendingly(D3);
                               printD3(D3);
                               ask();
                               break;
                           }
                           case "4": {
                               printD3(D3);
                               sortWholeAscendingly(D3);
                               printD3(D3);
                               ask();
                               break;
                           }
                           case "5": {
                               printD3(D3);
                               elementsDivisibleBy3(D3);
                               ask();
                               break;
                           }
                           default:
                               System.out.println("Invalid input");
                       }
                   }
                   break;
               }
               /////Strings/////
               case "4": {
                   System.out.print("Enter a string: ");
                   s = sin.next();
                   g = 0;
                   while (g == 0) {
                       System.out.println();
                       System.out.println("String: \"" + s + "\", Enter the task you wish to do:\n1- Find character at index.\n2- Find the length of the string.\n3- Find substring of begin index.\n4- Find substring of begin and end index.\n5- Find if it equals another string.\n6- Find if it is empty.\n7- Concatenate it with another string.\n8- Replace a character with another.\n9- Split the string to substrings on \",\" without a limit.\n10- Split the string to substrings on \",\" with a limit.\n11- Find the index of a character.\n12- Find the index of a character after a specific index.\n13- Find the index of a substring.\n14- Find the index of a substring after a specific index.\n15- Make all characters go lower case.\n16- Make all characters go upper case.\n17- Delete ending and beginning spaces.\n18- Convert data types to strings.\n19- Change string.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               checkIndex();
                               ask();
                               break;
                           }
                           case "2": {
                               stringLength();
                               ask();
                               break;
                           }
                           case "3": {
                               substringFromIndexToEnd();
                               ask();
                               break;
                           }
                           case "4": {
                               substringFromIndexToIndex();
                               ask();
                               break;
                           }
                           case "5": {
                               compareStrings();
                               ask();
                               break;
                           }
                           case "6": {
                               ifStringIsEmpty();
                               ask();
                               break;
                           }
                           case "7": {
                               concatinateStrings();
                               ask();
                               break;
                           }
                           case "8": {
                               replaceSpecificChar();
                               ask();
                               break;
                           }
                           case "9": {
                               splitString();
                               ask();
                               break;
                           }
                           case "10": {
                               splitStringWithLimit();
                               ask();
                               break;
                           }
                           case "11": {
                               checkChar();
                               ask();
                               break;
                           }
                           case "12": {
                               checkCharInSubstring();
                               ask();
                               break;
                           }
                           case "13": {
                               checkSubstring();
                               ask();
                               break;
                           }
                           case "14": {
                               checkSubstringWithIndex();
                               ask();
                               break;
                           }
                           case "15": {
                               lowerCase();
                               ask();
                               break;
                           }
                           case "16": {
                               upperCase();
                               ask();
                               break;
                           }
                           case "17": {
                               trim();
                               ask();
                               break;
                           }
                           case "18": {
                               intToString();
                               ask();
                               break;
                           }
                           case "19": {
                               enterString();
                               ask();
                               break;
                           }
                           default:
                               System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Single Linked-list/////
               case "5": {
                   SingleLinkedList list = new SingleLinkedList();
                   System.out.println("Enter the elements of the linked list: ");
                   int i = 0;
                   boolean go = true;
                   while (go) {
                       System.out.print("Element #" + i + " (*Enter a '.' to end*): ");
                       String element = sin.next();
                       if(element.equals(".")) go = !go;
                       else {
                           list.insertAtEnd(element);
                           i++;
                       }
                   }
                   g = 0;
                   while (g == 0) {
                       System.out.println();
                       list.display();
                       System.out.println("Enter the task you wish to do:\n1- Insert at the beginning.\n2- Insert before an element.\n3- Insert after an element.\n4- Insert at the end.\n5- Delete the first element.\n6- Delete a specific element.\n7- Delete the last element.\n8- Replace the data of a node.\n9- Length of the list.\n10- Find element.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               System.out.print("Enter the new element: ");
                               String newElement = sin.next();
                               list.insertAtBegining(newElement);
                               list.display();
                               ask();
                               break;
                           }
                           case "2": {
                               System.out.print("Enter the new element: ");
                               String newElement = sin.next();
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               list.insertBeforeElement(newElement, target);
                               list.display();
                               ask();
                               break;
                           }
                           case "3": {
                               System.out.print("Enter the new element: ");
                               String newElement = sin.next();
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               list.insertAfterElement(newElement, target);
                               list.display();
                               ask();
                               break;
                           }
                           case "4": {
                               System.out.print("Enter the new element: ");
                               String newElement = sin.next();
                               list.insertAtEnd(newElement);
                               list.display();
                               ask();
                               break;
                           }
                           case "5": {
                               list.deleteFirst();
                               list.display();
                               ask();
                               break;
                           }
                           case "6": {
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               list.deleteElement(target);
                               list.display();
                               ask();
                               break;
                           }
                           case "7": {
                               list.deleteLast();
                               list.display();
                               ask();
                               break;
                           }
                           case "8": {
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               System.out.print("Enter the new data: ");
                               String newData = sin.next();
                               list.replaceData(target, newData);
                               list.display();
                               ask();
                               break;
                           }
                           case "9": {
                               list.length();
                               list.display();
                               ask();
                               break;
                           }
                           case "10": {
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               list.find(target);
                               ask();
                               break;
                           }
                           default: System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Double Linked-list/////
               case "6": {
                   DoubleLinkedList list = new DoubleLinkedList();
                   System.out.println("Enter the elements of the linked list: ");
                   try {
                       int i = 0;
                       while (true) {
                           System.out.print("Element #" + i + " (*Enter a letter to end*): ");
                           int element = sin.nextInt();
                           list.insertAtEnd(element);
                           i++;
                       }
                   } catch (Exception e) { sin.next(); }
                   g = 0;
                   while (g == 0) {
                       System.out.println();
                       list.display();
                       System.out.println("Enter the task you wish to do:\n1- Insert at the beginning.\n2- Insert before an element.\n3- Insert after an element.\n4- Insert at the end.\n5- Delete the first element.\n6- Delete a specific element.\n7- Delete the last element.\n8- Replace the data of a node.\n9- Length of the list.\n10- Find element.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               System.out.print("Enter the new element: ");
                               int newElement = sin.nextInt();
                               list.insertAtBegining(newElement);
                               list.display();
                               ask();
                               break;
                           }
                           case "2": {
                               System.out.print("Enter the new element: ");
                               int newElement = sin.nextInt();
                               System.out.print("Enter the target element: ");
                               int target = sin.nextInt();
                               list.insertBeforeElement(newElement, target);
                               list.display();
                               ask();
                               break;
                           }
                           case "3": {
                               System.out.print("Enter the new element: ");
                               int newElement = sin.nextInt();
                               System.out.print("Enter the target element: ");
                               int target = sin.nextInt();
                               list.insertAfterElement(newElement, target);
                               list.display();
                               ask();
                               break;
                           }
                           case "4": {
                               System.out.print("Enter the new element: ");
                               int newElement = sin.nextInt();
                               list.insertAtEnd(newElement);
                               list.display();
                               ask();
                               break;
                           }
                           case "5": {
                               list.deleteFirst();
                               list.display();
                               ask();
                               break;
                           }
                           case "6": {
                               System.out.print("Enter the target element: ");
                               int target = sin.nextInt();
                               list.deleteElement(target);
                               list.display();
                               ask();
                               break;
                           }
                           case "7": {
                               list.deleteLast();
                               list.display();
                               ask();
                               break;
                           }
                           case "8": {
                               System.out.print("Enter the target element: ");
                               int target = sin.nextInt();
                               System.out.print("Enter the new data: ");
                               int newData = sin.nextInt();
                               list.replaceData(target, newData);
                               list.display();
                               ask();
                               break;
                           }
                           case "9": {
                               list.length();
                               list.display();
                               ask();
                               break;
                           }
                           case "10": {
                               System.out.print("Enter the target element: ");
                               int target = sin.nextInt();
                               list.find(target);
                               ask();
                               break;
                           }
                           default: System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Circle Linked-list/////
               case "7": {
                   CircleLinkedList list = new CircleLinkedList();
                   System.out.println("Enter the elements of the linked list: ");
                   int i = 0;
                   boolean go = true;
                   while (go) {
                       System.out.print("Element #" + i + " (*Enter a '.' to end*): ");
                       String element = sin.next();
                       if(element.equals(".")) go = !go;
                       else {
                           list.insertAtEnd(element);
                           i++;
                       }
                   }
                   g = 0;
                   while (g == 0) {
                       System.out.println();
                       list.display();
                       System.out.println("Enter the task you wish to do:\n1- Insert at the beginning.\n2- Insert before an element.\n3- Insert after an element.\n4- Insert at the end.\n5- Delete the first element.\n6- Delete a specific element.\n7- Delete the last element.\n8- Replace the data of a node.\n9- Length of the list.\n10- Find element.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               System.out.print("Enter the new element: ");
                               String newElement = sin.next();
                               list.insertAtBegining(newElement);
                               list.display();
                               ask();
                               break;
                           }
                           case "2": {
                               System.out.print("Enter the new element: ");
                               String newElement = sin.next();
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               list.insertBeforeElement(newElement, target);
                               list.display();
                               ask();
                               break;
                           }
                           case "3": {
                               System.out.print("Enter the new element: ");
                               String newElement = sin.next();
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               list.insertAfterElement(newElement, target);
                               list.display();
                               ask();
                               break;
                           }
                           case "4": {
                               System.out.print("Enter the new element: ");
                               String newElement = sin.next();
                               list.insertAtEnd(newElement);
                               list.display();
                               ask();
                               break;
                           }
                           case "5": {
                               list.deleteFirst();
                               list.display();
                               ask();
                               break;
                           }
                           case "6": {
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               list.deleteElement(target);
                               list.display();
                               ask();
                               break;
                           }
                           case "7": {
                               list.deleteLast();
                               list.display();
                               ask();
                               break;
                           }
                           case "8": {
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               System.out.print("Enter the new data: ");
                               String newData = sin.next();
                               list.replace(target, newData);
                               list.display();
                               ask();
                               break;
                           }
                           case "9": {
                               list.length();
                               list.display();
                               ask();
                               break;
                           }
                           case "10": {
                               System.out.print("Enter the target element: ");
                               String target = sin.next();
                               list.find(target);
                               ask();
                               break;
                           }
                           default: System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Stack/////
               case "8": {
                   Stack stack = null;
                   System.out.println("1- Array. \n2- Linked-list.");
                   c = sin.next();
                   switch(c) {
                       case "1": {
                           System.out.print("Enter the size of the stack: ");
                           int n = sin.nextInt();
                           System.out.println("1- Fill now. \n2- Fill later.");
                           c = sin.next();
                           switch(c) {
                               case "1": {
                                   String[] array = new String[n];
                                   readStringArray(array);
                                   stack = new Stack(array);
                                   break;
                               }
                               case "2": {
                                   stack = new Stack(n);
                                   break;
                               }
                               default: System.out.println("Invalid input.");
                           }
                           break;
                       }
                       case "2": {
                           System.out.println("1- Fill now. \n2- Fill later.");
                           c = sin.next();
                           switch(c) {
                               case "1": {
                                   SingleLinkedList list = new SingleLinkedList();
                                   int i = 0;
                                   boolean go = true;
                                   while (go) {
                                       System.out.print("Element #" + i + " (*Enter a '.' to end*): ");
                                       String element = sin.next();
                                       if(element.equals(".")) go = !go;
                                       else {
                                           list.insertAtBegining(element);
                                           i++;
                                       }
                                   }
                                   stack = new Stack(list);
                                   break;
                               }
                               case "2": {
                                   stack = new Stack();
                                   break;
                               }
                               default: System.out.println("Invalid input.");
                           }
                           break;
                       }
                       default: System.out.println("Invalid input.");
                   }
                   g = 0;
                   while(g == 0) {
                       System.out.println();
                       stack.peekAll();
                       System.out.println("1- Push. \n2- Pop. \n3- Peek. \n4- Print. \n5- Is Empty.");
                       c = sin.next();
                       switch(c) {
                           case "1": {
                               System.out.print("Enter an element: ");
                               String data = sin.next();
                               stack.push(data);
                               stack.peekAll();
                               ask();
                               break;
                           }
                           case "2": {
                               String element = stack.pop();
                               if(element != null) System.out.println(element + " was popped from the top of the stack.");
                               stack.peekAll();
                               ask();
                               break;
                           }
                           case "3": {
                               String element = stack.peek();
                               if(element != null) System.out.println(stack.peek() + " is at the top of the stack.");
                               stack.peekAll();
                               ask();
                               break;
                           }
                           case "4": {
                               stack.peekAll();
                               ask();
                               break;
                           }
                           case "5": {
                               if(stack.isEmpty()) System.out.println("Stack is underflow.");
                               else System.out.println("Stack is not underflow.");
                               ask();
                               break;
                           }
                           default: System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Queue/////
               case "9": {
                   Queue queue = null;
                   System.out.println("1- Array. \n2- Linked-list.");
                   c = sin.next();
                   switch(c) {
                       case "1": {
                           System.out.print("Enter the size of the queue: ");
                           int n = sin.nextInt();
                           System.out.println("1- Fill now. \n2- Fill later.");
                           c = sin.next();
                           switch(c) {
                               case "1": {
                                   String[] array = new String[n];
                                   readStringArray(array);
                                   queue = new Queue(array);
                                   break;
                               }
                               case "2": {
                                   queue = new Queue(n);
                                   break;
                               }
                               default: System.out.println("Invalid input.");
                           }
                           break;
                       }
                       case "2": {
                           System.out.println("1- Fill now. \n2- Fill later.");
                           c = sin.next();
                           switch(c) {
                               case "1": {
                                   SingleLinkedList list = new SingleLinkedList();
                                   int i = 0;
                                   boolean go = true;
                                   while (go) {
                                       System.out.print("Element #" + i + " (*Enter a '.' to end*): ");
                                       String element = sin.next();
                                       if(element.equals(".")) go = !go;
                                       else {
                                           list.insertAtEnd(element);
                                           i++;
                                       }
                                   }
                                   queue = new Queue(list);
                                   break;
                               }
                               case "2": {
                                   queue = new Queue();
                                   break;
                               }
                               default: System.out.println("Invalid input.");
                           }
                           break;
                       }
                       default: System.out.println("Invalid input.");
                   }
                   g = 0;
                   while(g == 0) {
                       System.out.println();
                       queue.peekAll();
                       System.out.println("1- Enqueue. \n2- Dequeue. \n3- Peek. \n4- Print. \n5- Is Empty.");
                       c = sin.next();
                       switch(c) {
                           case "1": {
                               System.out.print("Enter an element: ");
                               String data = sin.next();
                               queue.enqueue(data);
                               queue.peekAll();
                               ask();
                               break;
                           }
                           case "2": {
                               String element = queue.dequeue();
                               if(element != null) System.out.println(element + " was dequeued from the front of the queue.");
                               queue.peekAll();
                               ask();
                               break;
                           }
                           case "3": {
                               String element = queue.peek();
                               if(element != null) System.out.println(queue.peek() + " is at the front of the queue.");
                               queue.peekAll();
                               ask();
                               break;
                           }
                           case "4": {
                               queue.peekAll();
                               ask();
                               break;
                           }
                           case "5": {
                               if(queue.isEmpty()) System.out.println("Queue's empty.");
                               else System.out.println("Queue's not empty.");
                               ask();
                               break;
                           }
                           default: System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Algorithms/////
               case "10": {
                   System.out.print("Enter the length of the array: ");
                   int n = sin.nextInt();
                   int[] D1 = new int[n];
                   readD1(D1);
                   g = 0;
                   while (g == 0) {
                       System.out.println();
                       printD1(D1);
                       System.out.println("1- Bubble Sort.\n2- Linear Search.\n3- Merge Sort.\n4- Binary Search.\n5- Quick Sort.");
                       c = sin.next();
                       switch (c) {
                           case "1": {
                               System.out.print("Unsorted ");
                               printD1(D1);
                               bubbleSort(D1);
                               System.out.print("Sorted ");
                               printD1(D1);
                               ask();
                               break;
                           }
                           case "2": {
                               System.out.print("Enter the element that you wish to find: "); int target = sin.nextInt();
                               printD1(D1);
                               System.out.println("Target is found at index " + linearSearch(D1, target));
                               ask();
                               break;
                           }
                           case "3": {
                               System.out.print("Unsorted ");
                               printD1(D1);
                               mergeSort(D1);
                               System.out.print("Sorted ");
                               printD1(D1);
                               ask();
                               break;
                           }
                           case "4": {
                               System.out.print("Enter the element that you wish to find (After sorting): "); int target = sin.nextInt();
                               System.out.println("Target is found at index " + binarySearch(D1, target));
                               System.out.print("Sorted ");
                               printD1(D1);
                               ask();
                               break;
                           }
                           case "5": {
                               System.out.print("Unsorted ");
                               printD1(D1);
                               quickSort(D1);
                               System.out.print("Sorted ");
                               printD1(D1);
                               ask();
                               break;
                           }
                           default: System.out.println("Invalid input");
                       }
                   }
                   break;
               }
               /////Binary Tree/////
               case "11": {
                   BinaryTree tree = null;
                   g = 0;
                   while(g == 0) {
                       System.out.println("1- Empty Binary Tree. \n2- Binary Tree with root. \n3- Array to Binary Tree.");
                       c = sin.next();
                       switch(c) {
                           case "1": {
                               tree = new BinaryTree();
                               g++;
                               break;
                           }
                           case "2": {
                               System.out.print("Enter the root value: ");
                               String rootValue = sin.next();
                               tree = new BinaryTree(rootValue);
                               g++;
                               break;
                           }
                           case "3": {
                               System.out.print("Enter the length of the array: ");
                               int n = sin.nextInt();
                               String[] D1 = new String[n];
                               readStringArray(D1);
                               tree = new BinaryTree(D1);
                               g++;
                               break;
                           }
                           default: System.out.println("Invalid input.");
                       }
                   }
                   g = 0;
                   while(g == 0){
                       tree.levelOrder();
                       System.out.println();
                       System.out.println("1- Set Root. \n2- Set left of a node. \n3- Set right of a node. \n4- Print In-Order. \n5- Print Pre-Order. \n6- Print Post-Order. \n7- Print Level-Order. \n8- Tree to Array.");
                       c = sin.next();
                       switch(c) {
                           case "1": {
                               System.out.print("Enter the value: ");
                               String rootValue = sin.next();
                               tree.setRoot(rootValue);
                               tree.levelOrder();
                               ask();
                               break;
                           }
                           case "2": {
                               System.out.print("Enter the target node: ");
                               String target = sin.next();
                               System.out.print("Enter the value: ");
                               String value = sin.next();
                               tree.setLeft(target, value);
                               tree.levelOrder();
                               ask();
                               break;
                           }
                           case "3": {
                               System.out.print("Enter the target node: ");
                               String target = sin.next();
                               System.out.print("Enter the value: ");
                               String value = sin.next();
                               tree.setRight(target, value);
                               tree.levelOrder();
                               ask();
                               break;
                           }
                           case "4": {
                               System.out.print("In-Order ");
                               tree.inOrder();
                               System.out.println();
                               ask();
                               break;
                           }
                           case "5": {
                               System.out.print("Pre-Order ");
                               tree.preOrder();
                               System.out.println();
                               ask();
                               break;
                           }
                           case "6": {
                               System.out.print("Post-Order ");
                               tree.postOrder();
                               System.out.println();
                               ask();
                               break;
                           }
                           case "7": {
                               System.out.print("Level-Order ");
                               tree.levelOrder();
                               System.out.println();
                               ask();
                               break;
                           }
                           case "8": {
                               String[] array = tree.toArray();
                               tree.levelOrder();
                               System.out.println();
                               printStringArray(array);
                               ask();
                               break;
                           }
                           default: System.out.println("Invalid input.");
                       }
                   }
                   break;
               }
               /////Exit/////
               case "12": {
                   System.exit(0);
                   break;
               }
               default: System.out.println("Invalid input");
           }
       }
    }
    //////////////////////Data Structures I//////////////////////
    //////////////////////One-dimensional array//////////////////////
    private static void readD1(int[] X) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < X.length; i++) {
            System.out.print("Element [" + i + "]: ");
            X[i] = sin.nextInt();
        }
    }
    private static void printD1(int[] X) {
        System.out.print("Array: ");
        for (int i = 0; i < X.length; i++) System.out.print(X[i] + ", ");
        System.out.println();
    }
    private static void sortAscendingly(int[] X) {
        int t;
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X.length; j++) {
                if (X[i] < X[j]) {
                    t = X[i];
                    X[i] = X[j];
                    X[j] = t;
                }
            }
        }
    }
    private static void deleteIndex(int[] X) {
        System.out.print("Enter the index you wish to delete: ");
        int d = sin.nextInt();
        if (d < 0 || d > X.length - 1) System.out.println("Index is out of bounds.");
        else {
            for (int i = d; i < X.length - 1; i++) X[i] = X[i + 1];
            X[X.length - 1] = 0;
        }
    }
    private static double findAvg(int[] X) {
        double sum = 0.0;
        for (int i = 0; i < X.length; i++) sum += X[i];
        return sum / X.length;
    }
    private static void evenElements(int[] X) {
        System.out.print("Even elements: ");
        for (int i = 0; i < X.length; i++) if (X[i] % 2 == 0) System.out.print(X[i] + "\t");
        System.out.println();
    }
    private static void primeElements(int[] X) {
        System.out.print("Prime elements: ");
        for (int i = 0; i < X.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < X[i]; j++) if (X[i] % j == 0) isPrime = false;
            if (isPrime) System.out.print(X[i] + "\t");
        }
        System.out.println();
    }
    //////////////////////Two-dimensional array//////////////////////
    private static void readD2(int[][] X) {
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                X[i][j] = sin.nextInt();
            }
        }
    }
    private static void printD2(int[][] X) {
        System.out.println("Array:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) System.out.print(X[i][j] + ", ");
            System.out.println();
        }
    }
    private static void sortDescendingly(int[][] X) {
        int t;
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                for (int k = 0; k < X.length; k++) {
                    for (int l = 0; l < X[k].length; l++) {
                        if (X[i][j] > X[k][l]) {
                            t = X[i][j];
                            X[i][j] = X[k][l];
                            X[k][l] = t;
                        }
                    }
                }
            }
        }
    }
    private static int maximumElement(int[][] X) {
        int max = X[0][0];
        for (int i = 0; i < X.length; i++) for (int j = 0; j < X[i].length; j++) if (max < X[i][j]) max = X[i][j];
        return max;
    }
    private static int findSummation(int[][] X) {
        int sum = 0;
        for (int i = 0; i < X.length; i++) for (int j = 0; j < X[i].length; j++) sum += X[i][j];
        return sum;
    }
    private static void oddElements(int[][] X) {
        System.out.println("Odd elements:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) if (X[i][j] % 2 != 0) System.out.print(X[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
    }
    private static void minimumLocation(int[][] X) {
        int minI = 0, minJ = 0, min = X[0][0];
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (min > X[i][j]) {
                    min = X[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.println("Minimum element is found at location: [" + minI + "][" + minJ + "]");
    }
    ///////////////////////Triangular array////////////////////
    private static void primaryDiagonal(int X[][]) {
        System.out.println("Primary diagonal:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i == j) System.out.print(X[i][j] + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
    private static void upperPrimaryTriangle(int X[][]) {
        System.out.println("Primary upper triangle:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i <= j) System.out.print(X[i][j] + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
    private static void lowerPrimaryTriangle(int X[][]) {
        System.out.println("Primary lower triangle:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i >= j) System.out.print(X[i][j] + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
    private static void secondaryDiagonal(int X[][]) {
        System.out.println("Secondary diagonal:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if ((i + j) == X.length - 1) System.out.print(X[i][j] + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
    private static void upperSecondaryTriangle(int X[][]) {
        System.out.println("Secondary upper triangle:");
        for (int i = 0; i < X.length; i++) {
            for (int j = i; j < X[i].length; j++) System.out.print(X[i][j] + "\t");
            System.out.println();
        }
    }
    private static void lowerSecondaryTriangle(int X[][]) {
        System.out.println("Secondary lower triangle:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (j >= X[0].length - 1 - i) System.out.print(X[i][j] + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
    ///////////////////////Jagged array///////////////////////
    private static void minimumOfEachRow(int X[][]) {
        for (int i = 0; i < X.length; i++) {
            int min = X[i][0];
            for (int j = 0; j < X[i].length; j++) if (min > X[i][j]) min = X[i][j];
            System.out.println("Minimum element at row #" + i + " is " + min + ".");
        }
    }
    private static void multiplicationOfEachRow(int X[][]) {
        for (int i = 0; i < X.length; i++) {
            int mul = 1;
            for (int j = 0; j < X[i].length; j++) mul *= X[i][j];
            System.out.println("Multiplication of elements at row #" + i + " is " + mul + ".");
        }
    }
    //////////////////////Three-dimensional array//////////////////////
    private static void readD3(int X[][][]) {
        System.out.println("Enter the elements of the array:");
        for (int k = 0; k < X.length; k++) {
            for (int i = 0; i < X[k].length; i++) {
                for (int j = 0; j < X[k][i].length; j++) {
                    System.out.print("Element [" + k + "][" + i + "][" + j + "]: ");
                    X[k][i][j] = sin.nextInt();
                }
            }
        }
    }
    private static void printD3(int X[][][]) {
        System.out.println("Array:");
        for (int k = 0; k < X.length; k++) {
            for (int i = 0; i < X[k].length; i++) {
                for (int j = 0; j < X[k][i].length; j++) System.out.print(X[k][i][j] + ", ");
                System.out.println();
            }
            System.out.println("\n");
        }
    }
    private static void maximumEachLayer(int X[][][]) {
        for (int k = 0; k < X.length; k++)
            System.out.println("Maximum element of layer #" + k + ": " + maximumElement(X[k]));
    }
    private static int minimumElement(int X[][][]) {
        int min = X[0][0][0];
        for (int k = 0; k < X.length; k++) {
            for (int i = 0; i < X[k].length; i++) {
                for (int j = 0; j < X[k][i].length; j++) if (min > X[k][i][j]) min = X[k][i][j];
            }
        }
        return min;
    }
    private static void sortLayersDescendingly(int X[][][]) {
        for (int k = 0; k < X.length; k++) sortDescendingly(X[k]);
    }
    private static void sortWholeAscendingly(int X[][][]) {
        int t;
        for (int k = 0; k < X.length; k++) {
            for (int i = 0; i < X[k].length; i++) {
                for (int j = 0; j < X[k][i].length; j++) {
                    for (int h = 0; h < X.length; h++) {
                        for (int l = 0; l < X[h].length; l++) {
                            for (int q = 0; q < X[h][l].length; q++) {
                                if (X[k][i][j] < X[h][l][q]) {
                                    t = X[k][i][j];
                                    X[k][i][j] = X[h][l][q];
                                    X[h][l][q] = t;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private static void elementsDivisibleBy3(int X[][][]) {
        System.out.println("Elements divisible by 3:");
        for (int k = 0; k < X.length; k++) {
            for (int i = 0; i < X[k].length; i++) {
                for (int j = 0; j < X[k][i].length; j++) if (X[k][i][j] % 3 == 0) System.out.print(X[k][i][j] + "\t");
                System.out.println();
            }
            System.out.println("\n");
        }
    }
    //////////////////////Strings//////////////////////
    private static void checkIndex() {
        System.out.print("Enter the index you wish to check: ");
        int i = sin.nextInt();
        if (i >= 0 && i < s.length()) System.out.println("'" + s.charAt(i) + "' is found at index " + i + ".");
        else System.out.println("Index " + i + " is out of the strings' bounds.");
    }
    private static void stringLength() { System.out.println("The length of the string is: " + s.length() + "."); }
    private static void substringFromIndexToEnd() {
        System.out.print("Enter the index of the substring: ");
        int i = sin.nextInt();
        if (i >= 0 && i < s.length())
            System.out.println("The substring from index " + i + " is: \"" + s.substring(i) + "\".");
        else System.out.println("Index " + i + " is out of the strings' bounds.");
    }
    private static void substringFromIndexToIndex() {
        System.out.print("Enter the beginning index of the substring: ");
        int i = sin.nextInt();
        System.out.print("Enter the ending index of the substring: ");
        int j = sin.nextInt();
        if ((i >= 0 && i < s.length() && i < j) && (j < s.length()))
            System.out.println("The substring from index " + i + " to index " + j + "is: \"" + s.substring(i, j) + "\".");
        else System.out.println("Indexes are out of the strings' bounds.");
    }
    private static void compareStrings() {
        System.out.print("Enter the string you wish to compare it with: ");
        String x = sin.next();
        if (s.equals(x)) System.out.println("The strings are equals.");
        else System.out.println("The strings are not equals.");
    }
    private static void ifStringIsEmpty() {
        if (s.isEmpty()) System.out.println("The string is empty.");
        else System.out.println("The string is not empty.");
    }
    private static void concatinateStrings() {
        System.out.print("Enter the string you wish to concatenate it with: ");
        String x = sin.next();
        s = s.concat(x);
        System.out.println("String: \"" + s + "\".");
    }
    private static void replaceSpecificChar() {
        System.out.print("Enter the character you wish to replace: ");
        String x = sin.next();
        System.out.print("Enter the character you wish to replace it with: ");
        String y = sin.next();
        s = s.replace(x, y);
        System.out.println("String: \"" + s + "\".");
    }
    private static void splitString() {
        String ss[] = s.split("\\,");
        System.out.println("Substrings:");
        for (String x : ss) System.out.println(x);
    }
    private static void splitStringWithLimit() {
        System.out.print("Enter the limit for the substrings: ");
        int l = sin.nextInt();
        String ss[] = s.split("\\,", l);
        System.out.println("Substrings:");
        for (String x : ss) System.out.println(x);
    }
    private static void checkChar() {
        System.out.print("Enter the character you wish to check: ");
        char x = sin.next().charAt(0);
        if (s.indexOf(x) == -1) System.out.println("'" + x + "' is not found in the string.");
        else System.out.println("'" + x + "' is found at index " + s.indexOf(x) + ".");
    }
    private static void checkCharInSubstring() {
        System.out.print("Enter the character you wish to check: ");
        char x = sin.next().charAt(0);
        System.out.print("Enter the index you wish to start from: ");
        int i = sin.nextInt();
        if (i >= 0 && i < s.length()) {
            if (s.indexOf(x) == -1) System.out.println("'" + x + "' is not found in the string.");
            else System.out.println("'" + x + "' is found at index " + s.indexOf(x, i) + ".");
        } else System.out.println("Index " + i + " is out of the strings' bounds.");
    }
    private static void checkSubstring() {
        System.out.print("Enter the substring you wish to check: ");
        String x = sin.next();
        if (s.indexOf(x) == -1) System.out.println("\"" + x + "\" is not found in the string.");
        else System.out.println("\"" + x + "\" is found at index " + s.indexOf(x) + ".");
    }
    private static void checkSubstringWithIndex() {
        System.out.print("Enter the substring you wish to check: ");
        String x = sin.next();
        System.out.print("Enter the index you wish to start from: ");
        int i = sin.nextInt();
        if (i >= 0 && i < s.length()) {
            if (s.indexOf(x) == -1) System.out.println("\"" + x + "\" is not found in the string.");
            else System.out.println("\"" + x + "\" is found at index " + s.indexOf(x, i) + ".");
        } else System.out.println("Index " + i + " is out of the strings' bounds.");
    }
    private static void lowerCase() {
        s = s.toLowerCase();
        System.out.println("String: \"" + s + "\".");
    }
    private static void upperCase() {
        s = s.toUpperCase();
        System.out.println("String: \"" + s + "\".");
    }
    private static void trim() {
        s = s.trim();
        System.out.println("String: \"" + s + "\".");
    }
    private static void intToString() {
        System.out.print("Enter a number: ");
        int x = sin.nextInt();
        s = String.valueOf(x);
        System.out.println("String: \"" + s + "\".");
    }
    private static void enterString() {
        System.out.print("Enter a string: ");
        s = sin.next();
    }
    //////////////////////Single Linked-list//////////////////////
    private static class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    private static class SingleLinkedList {
        Node head;
        SingleLinkedList() { this.head = null; }
        private void insertAtBegining(String data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        private void insertBeforeElement(String data, String target) {
            Node newNode = new Node(data);
            if (head != null) {
                if(head.data.equals(target)) insertAtBegining(data);
                else {
                    boolean found = false;
                    Node previous = null;
                    Node current = head;
                    while (!found && current != null) {
                        if (!current.data.equals(target)) {
                            previous = current;
                            current = current.next;
                        } else {
                            newNode.next = current;
                            previous.next = newNode;
                            found = true;
                        }
                    }
                    if (current == null) System.out.println("Element '" + target + "' not found in the list.");
                }
            } else System.out.println("The list is empty.");
        }
        private void insertAfterElement(String data, String target) {
            Node newNode = new Node(data);
            if (head != null) {
                Node current = head;
                boolean found = false;
                while (!found && current != null) {
                    if (!current.data.equals(target)) current = current.next;
                    else {
                        newNode.next = current.next;
                        current.next = newNode;
                        found = true;
                    }
                }
                if (current == null) System.out.println("Element '" + target + "' not found in the list.");
            } else System.out.println("The list is empty.");
        }
        private void insertAtEnd(String data) {
            Node newNode = new Node(data);
            if (head == null) head = newNode;
            else {
                Node current = head;
                while (current.next != null) current = current.next;
                current.next = newNode;
            }
        }
        private void deleteFirst() { if (head != null) head = head.next; }
        private void deleteElement(String target) {
            if (head != null) {
                if (head.data.equals(target)) head = head.next;
                else {
                    Node previous = null;
                    Node current = head;
                    boolean found = false;
                    while (!found && current != null) {
                        if (!current.data.equals(target)) {
                            previous = current;
                            current = current.next;
                        } else {
                            previous.next = current.next;
                            found = true;
                        }
                    }
                    if (current == null) System.out.println("Element '" + target + "' not found in the list.");
                }
            } else System.out.println("The list is empty.");
        }
        private void deleteLast() {
            if (head != null) {
                Node previous = null;
                Node current = head;
                while (current.next != null) {
                    previous = current;
                    current = current.next;
                }
                previous.next = null;
            }
        }
        private void replaceData(String target, String newData) {
            if (head != null) {
                Node current = head;
                boolean found = false;
                while (!found && current != null) {
                    if (!current.data.equals(target)) current = current.next;
                    else {
                        current.data = newData;
                        found = true;
                    }
                }
                if (current == null) System.out.println("Element '" + target + "' not found in the list.");
            } else System.out.println("The list is empty.");
        }
        private void find(String target) {
            if (head != null) {
                int i = 0;
                boolean found = false;
                Node current = head;
                while (!found && current != null) {
                    if (!current.data.equals(target)) {
                        current = current.next;
                        i++;
                    } else found = true;
                }
                if (current == null) System.out.println("Element " + target + " not found in the list.");
                else System.out.println("Element '" + target + "' found at node index " + i + ".");
            } else System.out.println("The list is empty.");
        }
        private void length() {
            if (head != null) {
                int count = 0;
                Node current = head;
                while (current != null) {
                    current = current.next;
                    count++;
                }
                System.out.println("The list is " + count + " nodes long.");
            } else System.out.println("The list is empty.");
        }
        private void display() {
            System.out.print("Linked-list: ");
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println();
        }
//        private void add(Node newNode) {
//            if(head == null) head = newNode;
//            else {
//                Node current = head;
//                while(current.next != null) current = current.next;
//                current.next = newNode;
//            }
//        }
    }
    //////////////////////Circle Single Linked-list//////////////////////
    private static class CircleLinkedList {
        Node head;
        CircleLinkedList() { this.head = null; }
        private void insertAtBegining(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head;
            } else {
                Node current = head;
                do current = current.next; while (current.next != head);
                newNode.next = head;
                head = newNode;
                current.next = head;
            }
        }
        private void insertBeforeElement(String data, String target) {
            if (head == null) System.out.println("The list is empty.");
            else {
                if (head.data.equals(target)) insertAtBegining(data);
                else {
                    Node previous = null;
                    Node current = head;
                    while (current.next != head && !current.data.equals(target)) {
                        previous = current;
                        current = current.next;
                    }
                    if (current.data.equals(target)) {
                        Node newNode = new Node(data);
                        previous.next = newNode;
                        newNode.next = current;
                    } else System.out.println("Element '" + target + "' was not found in the list.");
                }
            }
        }
        private void insertAfterElement(String data, String target) {
            if (head == null) System.out.println("The list is empty.");
            else {
                Node current = head;
                while (current.next != head && !current.data.equals(target)) current = current.next;
                if (current.next == head && current.data.equals(target)) insertAtEnd(data);
                else if (current.data.equals(target)) {
                    Node newNode = new Node(data);
                    newNode.next = current.next;
                    current.next = newNode;
                } else System.out.println("Element '" + target + "' was not found in the list.");
            }
        }
        private void insertAtEnd(String data) {
            if (head == null) insertAtBegining(data);
            else {
                Node newNode = new Node(data);
                Node current = head;
                while (current.next != head) current = current.next;
                current.next = newNode;
                newNode.next = head;
            }
        }
        private void deleteFirst() {
            if (head == null) System.out.println("The list is empty.");
            else {
                head = head.next;
                Node current = head;
                while (current.next != head) current = current.next;
                current.next = head;
            }
        }
        private void deleteElement(String target) {
            if (head == null) System.out.println("The list is empty.");
            else {
                if (head.data.equals(target)) deleteFirst();
                else {
                    Node previous = null;
                    Node current = head;
                    while (current.next != head && !current.data.equals(target)) {
                        previous = current;
                        current = current.next;
                    }
                    if (current.data.equals(target)) {
                        previous.next = current.next;
                        current = null;
                    } else System.out.println("Element '" + target + "' was not found in the list.");
                }
            }
        }
        private void deleteLast() {
            if (head == null) System.out.println("The list is empty.");
            else {
                Node previous = null;
                Node current = head;
                while (current.next != head) {
                    previous = current;
                    current = current.next;
                }
                previous.next = head;
                current = null;
            }
        }
        private void replace(String target, String data) {
            if (head == null) System.out.println("The list is empty.");
            else {
                Node current = head;
                while (current.next != head && !current.data.equals(target)) current = current.next;
                if (current.data.equals(target)) current.data = data;
                else System.out.println("Element '" + target + "' was not found in the list.");
            }
        }
        private void find(String target) {
            if (head == null) System.out.println("The list is empty.");
            else {
                int i = 0;
                Node current = head;
                while (current.next != head && !current.data.equals(target)) {
                    i++;
                    current = current.next;
                }
                if (current.data.equals(target))
                    System.out.println("Element '" + target + "' is found at node index '" + i + "'");
                else System.out.println("Element '" + target + "' was not found in the list.");
            }
        }
        private void length() {
            if (head == null) System.out.println("The list is empty.");
            else {
                int i = 0;
                Node current = head;
                do {
                    i++;
                    current = current.next;
                } while (current != head);
                System.out.println("The list is '" + i + "' nodes long.");
            }
        }
        private void display() {
            if (head == null) System.out.println("The list is empty.");
            else {
                Node current = head;
                do {
                    System.out.print(current.data + " -> ");
                    current = current.next;
                } while (current != head);
                System.out.println("head");
            }
        }
    }
    //////////////////////Double Linked-list//////////////////////
    private static class DoubleLinkedList {
        private static class DoubleNode {
            int data;
            DoubleNode previous, next;
            DoubleNode(int data) {
                this.data = data;
                this.previous = null;
                this.next = null;
            }
        }
        DoubleNode head;
        DoubleNode tail;
        DoubleLinkedList() {
            this.head = null;
            this.tail = null;
        }
        private void insertAtBegining(int data) {
            DoubleNode newNode = new DoubleNode(data);
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        private void insertBeforeElement(int data, int target) {

            if (head != null) {
                if (head.data == target) insertAtBegining(data);
                else {
                    DoubleNode current = head;
                    while (current.data != target && current.next != null) {
                        current.previous = current;
                        current = current.next;
                    }
                    if (current.data == target) {
                        DoubleNode newNode = new DoubleNode(data);
                        newNode.next = current;
                        newNode.previous = current.previous;
                        newNode.previous.next = newNode;
                        current.previous = newNode;
                    } else System.out.println("Element '" + target + "' not found in the list.");
                }
            } else System.out.println("The list is empty.");
        }
        private void insertAfterElement(int data, int target) {
            if (head != null) {
                if (tail.data == target) insertAtEnd(data);
                else {
                    DoubleNode current = head;
                    while (current.data != target && current.next != null) {
                        current.previous = current;
                        current = current.next;
                    }
                    if (current.data == target) {
                        DoubleNode newNode = new DoubleNode(data);
                        newNode.next = current.next;
                        newNode.previous = current;
                        newNode.next.previous = newNode;
                        current.next = newNode;
                    } else System.out.println("Element '" + target + "' not found in the list.");
                }
            } else System.out.println("The list is empty.");
        }
        private void insertAtEnd(int data) {
            DoubleNode newNode = new DoubleNode(data);
            if (head != null) {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            } else {
                head = newNode;
                tail = newNode;
            }
        }
        private void deleteFirst() {
            if (head != null) {
                head = head.next;
                head.previous = null;
            } else System.out.println("The list is empty.");
        }
        private void deleteElement(int target) {
            if (head != null) {
                if (head.data == target) deleteFirst();
                else if (tail.data == target) deleteLast();
                else {
                    DoubleNode current = head;
                    while (current.data != target && current.next != null) {
                        current.previous = current;
                        current = current.next;
                    }
                    if (current.data == target) {
                        current.previous.next = current.next;
                        current.next.previous = current.previous;
                        current = null;
                    } else System.out.println("Element '" + target + "' not found in the list.");
                }
            } else System.out.println("The list is empty.");
        }
        private void deleteLast() {
            if (head != null) {
                tail = tail.previous;
                tail.next = null;
            } else System.out.println("The list is empty.");
        }
        private void replaceData(int target, int data) {
            if (head != null) {
                DoubleNode current = head;
                while (current.data != target && current.next != null) {
                    current.previous = current;
                    current = current.next;
                }
                if (current.data == target) current.data = data;
                else System.out.println("Element '" + target + "' not found in the list.");
            } else System.out.println("The list is empty.");
        }
        private void find(int target) {
            if (head != null) {
                int i = 0;
                DoubleNode current = head;
                while (current.data != target && current.next != null) {
                    current.previous = current;
                    current = current.next;
                    i++;
                }
                if (current.data == target)
                    System.out.println("Element '" + target + "' found at node index " + i + ".");
                else System.out.println("Element " + target + " not found in the list.");
            } else System.out.println("The list is empty.");
        }
        private void length() {
            if (head != null) {
                int count = 0;
                DoubleNode current = head;
                while (current != null) {
                    count++;
                    current.previous = current;
                    current = current.next;
                }
                System.out.println("The list is " + count + " nodes long.");
            } else System.out.println("The list is empty.");
        }
        private void display() {
            DoubleNode current = head;
            System.out.print("Double linked-list: ");
            while (current != null) {
                if (current == head) System.out.print("<- " + current.data + " <=> ");
                else if (current == tail) System.out.print(current.data + " ->");
                else System.out.print(current.data + " <=> ");
                current = current.next;
            }
            System.out.println();
        }
    }
    /////////////////////Stack/////////////////////
    private static class Stack {
        String[] array;
        SingleLinkedList list;
        int topIndex;
        Node topNode;
        public Stack() {
            list = new SingleLinkedList();
            topNode = list.head;
        }
        public Stack(int size) {
            array = new String[size];
            topIndex = -1;
        }
        public Stack(SingleLinkedList list) {
            this.list = list;
            topNode = this.list.head;
        }
        public Stack(String[] array) {
            this.array = array;
            topIndex = this.array.length-1;
        }
        public void push(String data) {
            if(array != null) {
                if(topIndex >= array.length-1) System.out.println("Stack Overflow.");
                else array[++topIndex] = data;
            } else {
                list.insertAtBegining(data);
                topNode = list.head;
            }
        }
        public String pop() {
            String value = null;
            if(array != null) {
                if(topIndex < 0) System.out.println("Stack Underflow.");
                else {
                    value = array[topIndex];
                    array[topIndex--] = "";
                }
            } else {
                if(list.head != null) {
                    value = list.head.data;
                    list.deleteFirst();
                    topNode = list.head;
                } else System.out.println("Stack Underflow.");
            }
            return value;
        }
        public String peek() {
            String value = null;
            if(array != null) {
                if(topIndex < 0) System.out.println("Stack Underflow.");
                else value = array[topIndex];
            } else {
                if(list.head != null) value = list.head.data;
                else System.out.println("Stack Underflow.");
            }
            return value;
        }
        public void peekAll() {
            if(array != null) {
                if(topIndex < 0) System.out.println("Stack Underflow.");
                else {
                    System.out.println("Stack (Bottom -> Top):");
                    printStringArray(array);
                }
            } else {
                if(list.head != null) {
                    System.out.println("Stack (Top -> Bottom):");
                    list.display();
                }
                else System.out.println("Stack Underflow.");
            }
        }
        public boolean isEmpty() {
            if(array != null) return topIndex < 0;
            else return topNode == null;
        }
    }
    ////////////////////Queue/////////////////////
    private static class Queue {
        String[] array;
        SingleLinkedList list;
        int rearIndex;
        Node rearNode;
        public Queue() {
            list = new SingleLinkedList();
            rearNode = list.head;
        }
        public Queue(int size) {
            array = new String[size];
            rearIndex = -1;
        }
        public Queue(SingleLinkedList list) {
            this.list = list;
            Node lastNode = this.list.head;
            while(lastNode.next != null) lastNode = lastNode.next;
            rearNode = lastNode;
        }
        public Queue(String[] array) {
            this.array = array;
            rearIndex = array.length-1;
        }
        public void enqueue(String data) {
            if(array != null) {
                if(rearIndex >= array.length-1) System.out.println("Queue's Full.");
                else array[++rearIndex] = data;
            } else {
                list.insertAtEnd(data);
                if(rearNode == null) rearNode = list.head;
                else rearNode = rearNode.next;
            }
        }
        public String dequeue() {
            String value = null;
            if(array != null) {
                if(rearIndex < 0) System.out.println("Queue's empty.");
                else {
                    value = array[0];
                    for(int i = 1; i < array.length; i++) array[i-1] = array[i];
                    array[rearIndex--] = "";
                }
            } else {
                if(list.head != null) {
                    value = list.head.data;
                    list.deleteFirst();
                }
//                else System.out.println("Queue's empty.");
            }
            return value;
        }
        public String peek() {
            String value = null;
            if(array != null) {
                if(rearIndex < 0) System.out.println("Queue's empty.");
                else value = array[0];
            } else {
                if(list.head != null) value = list.head.data;
                else System.out.println("Queue's empty.");
            }
            return value;
        }
        public void peekAll() {
            if(array != null) {
                if(rearIndex < 0) System.out.println("Queue's empty.");
                else {
                    System.out.println("Queue (Front -> Rear):");
                    printStringArray(array);
                }
            } else {
                if(list.head != null) {
                    System.out.println("Queue (Front -> Rear):");
                    list.display();
                }
                else System.out.println("Queue's empty.");
            }
        }
        public boolean isEmpty() {
            if(array != null) return rearIndex < 0;
            else return rearNode == null;
        }
    }
    //////////////////////Data Structures II//////////////////////
    //////////////////////Algorithms//////////////////////
    private static void bubbleSort(int array[]) {
        for(int i = 1; i < array.length; i++) {
            boolean finished = true;
            for(int j = 0; j < array.length-i; j++) {
                if(array[j] > array[j+1]) {
                    finished = false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(finished) break;
        }
    }
    private static int linearSearch(int array[], int target) {
        int location = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                location = i;
                break;
            }
        }
        return location;
    }
    private static int binarySearch(int array[], int target) {
        bubbleSort(array);
        int start = 0;
        int end = array.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(array[mid] == target) return mid;
            else if(array[mid] < target) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
    private static void mergeSort(int[] array) {
        if (array.length <= 1) return;
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(i < mid) leftArray[i] = array[i];
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int i = 0, l = 0, r = 0;
        while(l < leftArray.length && r < rightArray.length) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftArray.length) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightArray.length) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
    private static void quickSort(int[] array) { sort(array, 0, array.length-1); }
    private static void sort(int array[], int low, int high) {
        if(low < high) {
            int partitionIndex = partition(array, low, high);
            sort(array, low, partitionIndex-1);
            sort(array, partitionIndex+1, high);
        }
    }
    private static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = low-1;
        for(int j = low; j < high; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = array[j];
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return (i+1);
    }
    //////////////////////Binary Tree//////////////////////
    private static class BinaryTree  {
        private static class Node {
            String data;
            Node left;
            Node right;
            public Node(String data) {
                this.data = data;
                left = null;
                right = null;
            }
        }
        Node root;
        public BinaryTree() { root = null; }
        public BinaryTree(String rootData) { root = new Node(rootData); }
        public BinaryTree(String[] data) {
            String[] dataFromOne;
            if(data[0] == " ") dataFromOne = data;
            else {
                dataFromOne = new String[data.length+1];
                dataFromOne[0] = " ";
                for(int i = 0; i < data.length; i++) dataFromOne[i+1] = data[i];
            }
            root = treeBuilder(dataFromOne, 1);
        }
        public void inOrder() {
            System.out.print("Tree: ");
            inOrder(root);
        }
        public void preOrder() {
            System.out.print("Tree: ");
            preOrder(root);
        }
        public void postOrder() {
            System.out.print("Tree: ");
            postOrder(root);
        }
        public void levelOrder() {
            System.out.print("Tree: ");
            for(int i = 1; i <= getHeight(root); i++) levelOrder(root, i);
        }
        public void setRoot(String data) {
            if(root == null) root = new Node(data);
            else root.data = data;
        }
        public void setLeft(String parentValue, String childValue) {
            Node parentNode = search(root, parentValue);
            if (parentNode == null) {
                System.out.println("Target node not found.");
                return;
            }
            parentNode.left = new Node(childValue);
        }
        public void setRight(String parentValue, String childValue) {
            Node parentNode = search(root, parentValue);
            if (parentNode == null) {
                System.out.println("Target node not found.");
                return;
            }
            parentNode.right = new Node(childValue);
        }
        public String[] toArray() {
            String[] array = new String[size() * 2 + 1];
            array[0] = " ";
            fillArray(root, array, 1);
            return array;
        }
        public int size() { return getSize(root); }
        private Node treeBuilder(String[] dataArray, int index) {
            if (index >= dataArray.length) return null;
            Node node = new Node(dataArray[index]);
            node.left = treeBuilder(dataArray, 2 * index);
            node.right = treeBuilder(dataArray, 2 * index + 1);
            return node;
        }
        private static void inOrder(Node node) {
            if (node == null) return;
            inOrder(node.left);
            if(!node.data.isBlank()) System.out.print(node.data + ", ");
            inOrder(node.right);
        }
        private static void preOrder(Node node) {
            if (node == null) return;
            if(!node.data.isBlank()) System.out.print(node.data + ", ");
            preOrder(node.left);
            preOrder(node.right);
        }
        private static void postOrder(Node node) {
            if (node == null) return;
            postOrder(node.left);
            postOrder(node.right);
            if(!node.data.isBlank()) System.out.print(node.data + ", ");
        }
        private static void levelOrder(Node node, int level) {
            if (node == null) return;
            if (level == 1 && !node.data.isBlank()) System.out.print(node.data + ", ");
            else {
                levelOrder(node.left, level - 1);
                levelOrder(node.right, level - 1);
            }
        }
        private static int getHeight(Node node) {
            if (node == null) return 0;
            return 1 + Math.max(getHeight(node.left), getHeight(node.right));
        }
        private Node search(Node node, String value) {
            if (node == null || node.data.equals(value)) return node;
            Node foundNode = search(node.left, value);
            if (foundNode == null) foundNode = search(node.right, value);
            return foundNode;
        }
        private static void fillArray(Node node, String[] array, int index) {
            if (node == null) return;
            array[index] = node.data;
            fillArray(node.left, array, 2 * index);
            fillArray(node.right, array, 2 * index + 1);
        }
        private static int getSize(Node node) {
            if(node == null) return 0;
            return 1 + getSize(node.left) + getSize(node.right);
        }
    }
    private static void readStringArray(String[] X) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < X.length; i++) {
            System.out.print("Element [" + i + "]: ");
            X[i] = sin.next();
        }
    }
    private static void printStringArray(String[] X) {
        System.out.print("Array: ");
        for(int i = 0; i < X.length; i++) {
            if(X[i] != null) System.out.print(X[i] + ", ");
            else System.out.print(" , ");
        }
        System.out.println();
    }
    /////////////////////Graph/////////////////////
    private static class Graph {
        String[] vertices;
        int[][] edges;
        public Graph(String[] vertices) {
            this.vertices = vertices;
            edges = new int[vertices.length][vertices.length];
        }
        public void setEdge(String v1, String v2, boolean isDirect) {
            if (v1.equals(v2)) {
                System.out.println("Can't link a vertex with itself.");
                return;
            }
            int v1Index = -1, v2Index = -1;
            for (int i = 0; i < vertices.length; i++) {
                if (vertices[i].equals(v1)) v1Index = i;
                if (vertices[i].equals(v2)) v2Index = i;
                if (v1Index != -1 && v2Index != -1) break;
            }
            if (v1Index == -1 || v2Index == -1) {
                System.out.println("Vertex not found.");
                return;
            }
            edges[v1Index][v2Index] = 1;
            if (!isDirect) edges[v2Index][v1Index] = 1;
        }
        public int[] getEdges(String v) {
            int vIndex = -1;
            int[] adjs = new int[vertices.length];
            for (int i = 0; i < vertices.length; i++) {
                if (vertices[i].equals(v)) {
                    vIndex = i;
                    break;
                }
            }
            if (vIndex == -1) return adjs;
            for (int i = 0; i < adjs.length; i++) if (edges[vIndex][i] == 1) adjs[i] = 1;
            return adjs;
        }
        public void adjacentMatrix() {
            System.out.print("  ");
            for (String v : vertices) System.out.print(v + " ");
            System.out.println();
            for (int i = 0; i < edges.length; i++) {
                System.out.print(vertices[i] + " ");
                for (int edge : edges[i]) System.out.print(edge + " ");
                System.out.println();
            }
        }
        public void adjacentList() {

        }
        public void depthFirst() {
            Stack stack = new Stack();
            boolean[] visited = new boolean[vertices.length];
            stack.push(vertices[0]);
            System.out.print("Graph (DFS): ");
            while (!stack.isEmpty()) {
                String top = stack.pop();
                int topIndex = -1;
                for (int i = 0; i < vertices.length; i++) if (vertices[i].equals(top)) topIndex = i;
                if (!visited[topIndex]) {
                    System.out.print(top + ", ");
                    visited[topIndex] = true;
                    for(int i = 0; i < vertices.length; i++) if(edges[topIndex][i] == 1 && !visited[i]) stack.push(vertices[i]);
                }
            }
        }
        public void breadthFirst() {
            Queue queue = new Queue();
            boolean[] visited = new boolean[vertices.length];
            visited[0] = true;
            queue.enqueue(vertices[0]);
            System.out.print("Graph (BFS): ");
            while(!queue.isEmpty()) {
                String front = queue.dequeue();
                if(front == null) break;
                System.out.print(front + ", ");
                int frontIndex = -1;
                for (int i = 0; i < vertices.length; i++) if (vertices[i].equals(front)) frontIndex = i;
                for (int i = 0; i < vertices.length; i++) {
                    if (edges[frontIndex][i] == 1 && !visited[i]) {
                        visited[i] = true;
                        queue.enqueue(vertices[i]);
                    }
                }
            }
        }
    }
    //////////////////////Ask//////////////////////
    private static void ask() {
        h = 0;
        while (h == 0) {
            System.out.println("\nDo you wish to perform another task?\n1- Yes.\n2- No.");
            String c = sin.next();
            switch (c) {
                case "1": {
                    g = 0;
                    h++;
                    break;
                }
                case "2": {
                    g++;
                    h++;
                    break;
                }
                default: System.out.println("Invalid input");
            }
        }
    }
}