/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _DistListItem.
 * 
 */
@CoInterface(guid="{00063081-0000-0000-C000-000000000046}")
public interface _DistListItem extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(63511)  public Actions getActions() throws ComException;
  @DeclDISPID(63509)  public Attachments getAttachments() throws ComException;
  @DeclDISPID(34101)  public String getBillingInformation() throws ComException;
  @DeclDISPID(34101)  public void setBillingInformation(String value) throws ComException;
  @DeclDISPID(37120)  public String getBody() throws ComException;
  @DeclDISPID(37120)  public void setBody(String value) throws ComException;
  @DeclDISPID(36865)  public String getCategories() throws ComException;
  @DeclDISPID(36865)  public void setCategories(String value) throws ComException;
  @DeclDISPID(34107)  public String getCompanies() throws ComException;
  @DeclDISPID(34107)  public void setCompanies(String value) throws ComException;
  @DeclDISPID(64192)  public String getConversationIndex() throws ComException;
  @DeclDISPID(112)  public String getConversationTopic() throws ComException;
  @DeclDISPID(12295)  public java.util.Date getCreationTime() throws ComException;
  @DeclDISPID(61470)  public String getEntryID() throws ComException;
  @DeclDISPID(61589)  public FormDescription getFormDescription() throws ComException;
  @DeclDISPID(61502)  public _Inspector getGetInspector() throws ComException;
  @DeclDISPID(23)  public OlImportance getImportance() throws ComException;
  @DeclDISPID(23)  public void setImportance(OlImportance value) throws ComException;
  @DeclDISPID(12296)  public java.util.Date getLastModificationTime() throws ComException;
  @DeclDISPID(26)  public String getMessageClass() throws ComException;
  @DeclDISPID(26)  public void setMessageClass(String value) throws ComException;
  @DeclDISPID(34100)  public String getMileage() throws ComException;
  @DeclDISPID(34100)  public void setMileage(String value) throws ComException;
  @DeclDISPID(34062)  public Boolean getNoAging() throws ComException;
  @DeclDISPID(34062)  public void setNoAging(Boolean value) throws ComException;
  @DeclDISPID(34130)  public Integer getOutlookInternalVersion() throws ComException;
  @DeclDISPID(34132)  public String getOutlookVersion() throws ComException;
  @DeclDISPID(61603)  public Boolean getSaved() throws ComException;
  @DeclDISPID(54)  public OlSensitivity getSensitivity() throws ComException;
  @DeclDISPID(54)  public void setSensitivity(OlSensitivity value) throws ComException;
  @DeclDISPID(3592)  public Integer getSize() throws ComException;
  @DeclDISPID(55)  public String getSubject() throws ComException;
  @DeclDISPID(55)  public void setSubject(String value) throws ComException;
  @DeclDISPID(61468)  public Boolean getUnRead() throws ComException;
  @DeclDISPID(61468)  public void setUnRead(Boolean value) throws ComException;
  @DeclDISPID(63510)  public UserProperties getUserProperties() throws ComException;
  @DeclDISPID(61475)  public void Close(OlInspectorClose SaveMode) throws ComException;
  @DeclDISPID(61490)  public IDispatch Copy() throws ComException;
  @DeclDISPID(61514)  public void Delete() throws ComException;
  @DeclDISPID(61606)  public void Display(Object Modal) throws ComException;
  @DeclDISPID(61492)  public IDispatch Move(MAPIFolder DestFldr) throws ComException;
  @DeclDISPID(61491)  public void PrintOut() throws ComException;
  @DeclDISPID(61512)  public void Save() throws ComException;
  @DeclDISPID(61521)  public void SaveAs(String Path, Object Type) throws ComException;
  @DeclDISPID(32851)  public String getDLName() throws ComException;
  @DeclDISPID(32851)  public void setDLName(String value) throws ComException;
  @DeclDISPID(32843)  public Integer getMemberCount() throws ComException;
  @DeclDISPID(63744)  public void AddMembers(Recipients Recipients) throws ComException;
  @DeclDISPID(63745)  public void RemoveMembers(Recipients Recipients) throws ComException;
  @DeclDISPID(63749)  public Recipient GetMember(Integer Index) throws ComException;
  @DeclDISPID(64077)  public OlDownloadState getDownloadState() throws ComException;
  @DeclDISPID(64011)  public void ShowCategoriesDialog() throws ComException;
  @DeclDISPID(64140)  public void AddMember(Recipient Recipient) throws ComException;
  @DeclDISPID(64141)  public void RemoveMember(Recipient Recipient) throws ComException;
  @DeclDISPID(64009)  public ItemProperties getItemProperties() throws ComException;
  @DeclDISPID(34161)  public OlRemoteStatus getMarkForDownload() throws ComException;
  @DeclDISPID(34161)  public void setMarkForDownload(OlRemoteStatus value) throws ComException;
  @DeclDISPID(64164)  public Boolean getIsConflict() throws ComException;
  @DeclDISPID(64186)  public Boolean getAutoResolvedWinner() throws ComException;
  @DeclDISPID(64187)  public Conflicts getConflicts() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(64543)  public String getTaskSubject() throws ComException;
  @DeclDISPID(64543)  public void setTaskSubject(String value) throws ComException;
  @DeclDISPID(33029)  public java.util.Date getTaskDueDate() throws ComException;
  @DeclDISPID(33029)  public void setTaskDueDate(java.util.Date value) throws ComException;
  @DeclDISPID(33028)  public java.util.Date getTaskStartDate() throws ComException;
  @DeclDISPID(33028)  public void setTaskStartDate(java.util.Date value) throws ComException;
  @DeclDISPID(33039)  public java.util.Date getTaskCompletedDate() throws ComException;
  @DeclDISPID(33039)  public void setTaskCompletedDate(java.util.Date value) throws ComException;
  @DeclDISPID(34208)  public java.util.Date getToDoTaskOrdinal() throws ComException;
  @DeclDISPID(34208)  public void setToDoTaskOrdinal(java.util.Date value) throws ComException;
  @DeclDISPID(34076)  public Boolean getReminderOverrideDefault() throws ComException;
  @DeclDISPID(34076)  public void setReminderOverrideDefault(Boolean value) throws ComException;
  @DeclDISPID(34078)  public Boolean getReminderPlaySound() throws ComException;
  @DeclDISPID(34078)  public void setReminderPlaySound(Boolean value) throws ComException;
  @DeclDISPID(34051)  public Boolean getReminderSet() throws ComException;
  @DeclDISPID(34051)  public void setReminderSet(Boolean value) throws ComException;
  @DeclDISPID(34079)  public String getReminderSoundFile() throws ComException;
  @DeclDISPID(34079)  public void setReminderSoundFile(String value) throws ComException;
  @DeclDISPID(34050)  public java.util.Date getReminderTime() throws ComException;
  @DeclDISPID(34050)  public void setReminderTime(java.util.Date value) throws ComException;
  @DeclDISPID(64510)  public void MarkAsTask(OlMarkInterval MarkInterval) throws ComException;
  @DeclDISPID(64521)  public void ClearTaskFlag() throws ComException;
  @DeclDISPID(64522)  public Boolean getIsMarkedAsTask() throws ComException;
  @DeclDISPID(64629)  public String getConversationID() throws ComException;
  @DeclDISPID(64596)  public _Conversation GetConversation() throws ComException;
  @DeclDISPID(64644)  public Object getRTFBody() throws ComException;
  @DeclDISPID(64644)  public void setRTFBody(Object value) throws ComException;
}
