/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoBorder.
 * 
 */
@CoInterface(guid="{000C1717-0000-0000-C000-000000000046}")
public interface IMsoBorder extends IDispatch {
  @DeclDISPID(1610743808)  public void setColor(Object value) throws ComException;
  @DeclDISPID(1610743808)  public Object getColor() throws ComException;
  @DeclDISPID(1610743810)  public void setColorIndex(Object value) throws ComException;
  @DeclDISPID(1610743810)  public Object getColorIndex() throws ComException;
  @DeclDISPID(1610743812)  public void setLineStyle(Object value) throws ComException;
  @DeclDISPID(1610743812)  public Object getLineStyle() throws ComException;
  @DeclDISPID(1610743814)  public void setWeight(Object value) throws ComException;
  @DeclDISPID(1610743814)  public Object getWeight() throws ComException;
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(150)  public Dispatch getParent() throws ComException;
}