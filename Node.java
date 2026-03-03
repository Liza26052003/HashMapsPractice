public class Node{
long key;
String data;
Node next;

public Node(long k, String d){
   key = k; 
   data = d; 
   next = null; }

public Node(){
   key = 0; 
   data = ""; 
   next = null; }

public String toString() {
   return "<" + key + ", " + data + 
                      ", " + next + ">" } }

public class linkedList{

protected static int length;
protected Node head;

public linkedList(){
   head = new Node (0, "head Node");
   length=0; }

public void insert(Node n){
   n.next = head.next;
   head.next = n;
   length++; }

public int length(){
   return length; }

public boolean isEmpty(){
   return length==0; }

public void clear(){
   head.next = null;
   length = 0; }

public void display(){
Node here = head.next;   
   while (here != null) {
      System.out.println(
         "Key = " + here.key + 
         " Data = " + here.data);
      here = here.next; }
      System.out.println("length=" + length); } }

import java.lang.Math.*;   
import java.io.*;   

public class tryList {
public int n = 2;
public static void main(String args[]) {
linkedList L = new linkedList();
  System.out.println(
    "L.Head.Key = " + L.head.key + 
    " L.Head.Data = " + L.head.data + 
    " L.Length= " + L.length +
    " L.Head.Next = " + L.head.next);
Node item;
long id; 
String studentName;
 L.display();
 L.head.next = null; // L.clear(); is better 


 String theFileName = args[0];
 if (args.length == 1) {
  try {
   FileInputStream inFileName 
     = new FileInputStream (theFileName);
   DataInputStream inFile 
     = new DataInputStream (inFileName);
   System.out.println(
      "File: " + theFileName 
               + " successfully opened");
   // proceed with processing

   int lineNumber = 0; 
   // Process first line
   //---the header---differently
   System.out.println(inFile.readLine());
   //         // readLine()  deprecated
   //  Process rest of file
   while (inFile.available() != 0){
    String inString = inFile.readLine();
    String outString;// readLine() deprecated
    int commaPos = inString.indexOf(",");
// One space: handle Da Costa, Van Wyk, Le Roux, ... 
// Not treated: van der Merwe, de la Querra, etc.
// Before processing 
//2410832 VAN ZITTERS, ST   ...   000000  
// Final output for this record:
// Key = 2410832 Data = Van Zitters, ST
    int spacePos = inString.substring 
        (10, commaPos).indexOf(" ") + 10;
    int minusPos = inString.substring 
        (10, commaPos).indexOf("-") + 10; }

if (spacePos > 10) 
 outString = inString.substring(0, 10)
   + inString.substring(10, spacePos).toLowerCase()
   + inString.substring(spacePos, spacePos+2)
   + inString.substring(spacePos+2, commaPos).toLowerCase()
   + inString.substring(commaPos, inString.length());
else if (minusPos > 10) {
 System.out.println(minusPos);
 outString = inString.substring(0, 10)
   + inString.substring(10, minusPos+1).toLowerCase()
   + inString.substring(minusPos+1, minusPos+2)
   + inString.substring(minusPos+2, commaPos).toLowerCase()
   + inString.substring(commaPos, inString.length()); }
else outString = inString.substring(0, 10)
   + inString.substring(10,commaPos).toLowerCase()
   + inString.substring(commaPos,inString.length());
studentName = outString.substring(9,71).trim();
System.out.println(outString + " " + outString.length());

    // Build the linked list:
    id = (long)Integer.parseInt(
                   outString.substring(1,8));
    // first 7 characters: the student number
    item = new Node (id, studentName);
    L.insert (item);
    }
   inFile.close();
   L.display(); }
  catch (Exception e) {
   System.err.println("File: "+ theFileName 
                            + " error occurred"); } }
 else {
  System.err.println("There are " + args.length 
              + "parameters, there should be 1"); } } }
