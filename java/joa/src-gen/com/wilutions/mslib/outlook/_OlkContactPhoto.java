/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkContactPhoto.
 * 
 */
@CoInterface(guid="{000672EB-0000-0000-C000-000000000046}")
public interface _OlkContactPhoto extends IDispatch {
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(OlMousePointer value) throws ComException;
}