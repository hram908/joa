/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoOrientation {

  // Typed constants
  public final static MsoOrientation msoOrientationMixed = new MsoOrientation(-2);
  public final static MsoOrientation msoOrientationHorizontal = new MsoOrientation(1);
  public final static MsoOrientation msoOrientationVertical = new MsoOrientation(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoOrientationMixed = -2;
  public final static int _msoOrientationHorizontal = 1;
  public final static int _msoOrientationVertical = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoOrientation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoOrientation valueOf(int value) {
    switch(value) {
    case -2: return msoOrientationMixed;
    case 1: return msoOrientationHorizontal;
    case 2: return msoOrientationVertical;
    default: return new MsoOrientation(value);
    }
  }
}
