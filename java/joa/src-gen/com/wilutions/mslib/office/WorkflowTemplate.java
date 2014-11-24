/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * WorkflowTemplate.
 * 
 */
@CoInterface(guid="{000CD902-0000-0000-C000-000000000046}")
public interface WorkflowTemplate extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public String getId() throws ComException;
  @DeclDISPID(2)  public String getName() throws ComException;
  @DeclDISPID(3)  public String getDescription() throws ComException;
  @DeclDISPID(4)  public String getDocumentLibraryName() throws ComException;
  @DeclDISPID(5)  public String getDocumentLibraryURL() throws ComException;
  @DeclDISPID(6)  public Integer Show() throws ComException;
}
