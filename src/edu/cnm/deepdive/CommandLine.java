package edu.cnm.deepdive;

public class CommandLine {

  public static void main(String[] args){
    //Enhanced for loops are less error prone
    for (String current : args) {
      System.out.println(current.toUpperCase());
    }
    System.out.println("Done");
  }

}
