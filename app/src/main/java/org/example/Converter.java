package org.example;

public class Converter {
  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;
    return String.format("%.4f", pounds) + " lbs";
  }
  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int remainingOunces = ounces % 16;
    return pounds + " lbs " + remainingOunces + " oz";
  }
  // Write the code needed to make the tests in
  // TestConverter.java pass. I have provided the
  // tests for you in this lab to give you an example
  // of how they should look. In the future, you will
  // be responsible for writing your own tests.

  // After you have written the code to make the tests
  // pass, exercise your code in a driver function in
  // App.java. This shows that your business logic can
  // run in a console program.
}
