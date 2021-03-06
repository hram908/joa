/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlOfficeDocItemsType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlOfficeDocItemsType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlOfficeDocItemsType olExcelWorkSheetItem = new OlOfficeDocItemsType(8);
  public final static OlOfficeDocItemsType olWordDocumentItem = new OlOfficeDocItemsType(9);
  public final static OlOfficeDocItemsType olPowerPointShowItem = new OlOfficeDocItemsType(10);

  // Integer constants for bitsets and switch statements
  public final static int _olExcelWorkSheetItem = 8;
  public final static int _olWordDocumentItem = 9;
  public final static int _olPowerPointShowItem = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlOfficeDocItemsType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlOfficeDocItemsType valueOf(int value) {
    switch(value) {
    case 8: return olExcelWorkSheetItem;
    case 9: return olWordDocumentItem;
    case 10: return olPowerPointShowItem;
    default: return new OlOfficeDocItemsType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 10: return "olPowerPointShowItem";
    case 8: return "olExcelWorkSheetItem";
    case 9: return "olWordDocumentItem";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 10) != 0) sbuf.append("|olPowerPointShowItem");
      if ((value & 8) != 0) sbuf.append("|olExcelWorkSheetItem");
      if ((value & 9) != 0) sbuf.append("|olWordDocumentItem");
      return sbuf.toString();
      }
    }
  }
}
