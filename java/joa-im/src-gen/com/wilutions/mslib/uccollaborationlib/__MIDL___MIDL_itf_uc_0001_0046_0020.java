/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0020.
 * Enumerates the media stream directions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0020 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0020 MediaStreamDirection_None = new __MIDL___MIDL_itf_uc_0001_0046_0020(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0020 MediaStreamDirection_Send = new __MIDL___MIDL_itf_uc_0001_0046_0020(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0020 MediaStreamDirection_Receive = new __MIDL___MIDL_itf_uc_0001_0046_0020(2);

  // Integer constants for bitsets and switch statements
  public final static int _MediaStreamDirection_None = 0;
  public final static int _MediaStreamDirection_Send = 1;
  public final static int _MediaStreamDirection_Receive = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0020(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0020 valueOf(int value) {
    switch(value) {
    case 0: return MediaStreamDirection_None;
    case 1: return MediaStreamDirection_Send;
    case 2: return MediaStreamDirection_Receive;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0020(value);
    }
  }
}
