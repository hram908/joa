/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OutlookBarShortcutsEvents.
 * 
 */
@CoInterface(guid="{0006307C-0000-0000-C000-000000000046}")
public interface OutlookBarShortcutsEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61441)  public void onShortcutAdd(final OutlookBarShortcut NewShortcut) throws ComException;
  @DeclDISPID(61442)  public void onBeforeShortcutAdd(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61443)  public void onBeforeShortcutRemove(final OutlookBarShortcut Shortcut, final ByRef<Boolean> Cancel) throws ComException;
}
