/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * SyncObjects.
 * 
 */
@CoInterface(guid="{00063086-0000-0000-C000-000000000046}")
public interface SyncObjects extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public SyncObject Item(Object Index) throws ComException;
  @DeclDISPID(64074)  public _SyncObject getAppFolders() throws ComException;
}