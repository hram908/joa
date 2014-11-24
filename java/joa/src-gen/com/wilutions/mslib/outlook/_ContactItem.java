/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _ContactItem.
 * 
 */
@CoInterface(guid="{00063021-0000-0000-C000-000000000046}")
public interface _ContactItem extends IDispatch {
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
  @DeclDISPID(14848)  public String getAccount() throws ComException;
  @DeclDISPID(14848)  public void setAccount(String value) throws ComException;
  @DeclDISPID(14913)  public java.util.Date getAnniversary() throws ComException;
  @DeclDISPID(14913)  public void setAnniversary(java.util.Date value) throws ComException;
  @DeclDISPID(14896)  public String getAssistantName() throws ComException;
  @DeclDISPID(14896)  public void setAssistantName(String value) throws ComException;
  @DeclDISPID(14894)  public String getAssistantTelephoneNumber() throws ComException;
  @DeclDISPID(14894)  public void setAssistantTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14914)  public java.util.Date getBirthday() throws ComException;
  @DeclDISPID(14914)  public void setBirthday(java.util.Date value) throws ComException;
  @DeclDISPID(14875)  public String getBusiness2TelephoneNumber() throws ComException;
  @DeclDISPID(14875)  public void setBusiness2TelephoneNumber(String value) throws ComException;
  @DeclDISPID(32795)  public String getBusinessAddress() throws ComException;
  @DeclDISPID(32795)  public void setBusinessAddress(String value) throws ComException;
  @DeclDISPID(32838)  public String getBusinessAddressCity() throws ComException;
  @DeclDISPID(32838)  public void setBusinessAddressCity(String value) throws ComException;
  @DeclDISPID(32841)  public String getBusinessAddressCountry() throws ComException;
  @DeclDISPID(32841)  public void setBusinessAddressCountry(String value) throws ComException;
  @DeclDISPID(32840)  public String getBusinessAddressPostalCode() throws ComException;
  @DeclDISPID(32840)  public void setBusinessAddressPostalCode(String value) throws ComException;
  @DeclDISPID(32842)  public String getBusinessAddressPostOfficeBox() throws ComException;
  @DeclDISPID(32842)  public void setBusinessAddressPostOfficeBox(String value) throws ComException;
  @DeclDISPID(32839)  public String getBusinessAddressState() throws ComException;
  @DeclDISPID(32839)  public void setBusinessAddressState(String value) throws ComException;
  @DeclDISPID(32837)  public String getBusinessAddressStreet() throws ComException;
  @DeclDISPID(32837)  public void setBusinessAddressStreet(String value) throws ComException;
  @DeclDISPID(14884)  public String getBusinessFaxNumber() throws ComException;
  @DeclDISPID(14884)  public void setBusinessFaxNumber(String value) throws ComException;
  @DeclDISPID(14929)  public String getBusinessHomePage() throws ComException;
  @DeclDISPID(14929)  public void setBusinessHomePage(String value) throws ComException;
  @DeclDISPID(14856)  public String getBusinessTelephoneNumber() throws ComException;
  @DeclDISPID(14856)  public void setBusinessTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14850)  public String getCallbackTelephoneNumber() throws ComException;
  @DeclDISPID(14850)  public void setCallbackTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14878)  public String getCarTelephoneNumber() throws ComException;
  @DeclDISPID(14878)  public void setCarTelephoneNumber(String value) throws ComException;
  @DeclDISPID(32780)  public String getChildren() throws ComException;
  @DeclDISPID(32780)  public void setChildren(String value) throws ComException;
  @DeclDISPID(32792)  public String getCompanyAndFullName() throws ComException;
  @DeclDISPID(32818)  public String getCompanyLastFirstNoSpace() throws ComException;
  @DeclDISPID(32819)  public String getCompanyLastFirstSpaceOnly() throws ComException;
  @DeclDISPID(14935)  public String getCompanyMainTelephoneNumber() throws ComException;
  @DeclDISPID(14935)  public void setCompanyMainTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14870)  public String getCompanyName() throws ComException;
  @DeclDISPID(14870)  public void setCompanyName(String value) throws ComException;
  @DeclDISPID(14921)  public String getComputerNetworkName() throws ComException;
  @DeclDISPID(14921)  public void setComputerNetworkName(String value) throws ComException;
  @DeclDISPID(14922)  public String getCustomerID() throws ComException;
  @DeclDISPID(14922)  public void setCustomerID(String value) throws ComException;
  @DeclDISPID(14872)  public String getDepartment() throws ComException;
  @DeclDISPID(14872)  public void setDepartment(String value) throws ComException;
  @DeclDISPID(32899)  public String getEmail1Address() throws ComException;
  @DeclDISPID(32899)  public void setEmail1Address(String value) throws ComException;
  @DeclDISPID(32898)  public String getEmail1AddressType() throws ComException;
  @DeclDISPID(32898)  public void setEmail1AddressType(String value) throws ComException;
  @DeclDISPID(32896)  public String getEmail1DisplayName() throws ComException;
  @DeclDISPID(32901)  public String getEmail1EntryID() throws ComException;
  @DeclDISPID(32915)  public String getEmail2Address() throws ComException;
  @DeclDISPID(32915)  public void setEmail2Address(String value) throws ComException;
  @DeclDISPID(32914)  public String getEmail2AddressType() throws ComException;
  @DeclDISPID(32914)  public void setEmail2AddressType(String value) throws ComException;
  @DeclDISPID(32912)  public String getEmail2DisplayName() throws ComException;
  @DeclDISPID(32917)  public String getEmail2EntryID() throws ComException;
  @DeclDISPID(32931)  public String getEmail3Address() throws ComException;
  @DeclDISPID(32931)  public void setEmail3Address(String value) throws ComException;
  @DeclDISPID(32930)  public String getEmail3AddressType() throws ComException;
  @DeclDISPID(32930)  public void setEmail3AddressType(String value) throws ComException;
  @DeclDISPID(32928)  public String getEmail3DisplayName() throws ComException;
  @DeclDISPID(32933)  public String getEmail3EntryID() throws ComException;
  @DeclDISPID(32773)  public String getFileAs() throws ComException;
  @DeclDISPID(32773)  public void setFileAs(String value) throws ComException;
  @DeclDISPID(14854)  public String getFirstName() throws ComException;
  @DeclDISPID(14854)  public void setFirstName(String value) throws ComException;
  @DeclDISPID(14924)  public String getFTPSite() throws ComException;
  @DeclDISPID(14924)  public void setFTPSite(String value) throws ComException;
  @DeclDISPID(12289)  public String getFullName() throws ComException;
  @DeclDISPID(12289)  public void setFullName(String value) throws ComException;
  @DeclDISPID(32793)  public String getFullNameAndCompany() throws ComException;
  @DeclDISPID(14925)  public OlGender getGender() throws ComException;
  @DeclDISPID(14925)  public void setGender(OlGender value) throws ComException;
  @DeclDISPID(14855)  public String getGovernmentIDNumber() throws ComException;
  @DeclDISPID(14855)  public void setGovernmentIDNumber(String value) throws ComException;
  @DeclDISPID(14915)  public String getHobby() throws ComException;
  @DeclDISPID(14915)  public void setHobby(String value) throws ComException;
  @DeclDISPID(14895)  public String getHome2TelephoneNumber() throws ComException;
  @DeclDISPID(14895)  public void setHome2TelephoneNumber(String value) throws ComException;
  @DeclDISPID(32794)  public String getHomeAddress() throws ComException;
  @DeclDISPID(32794)  public void setHomeAddress(String value) throws ComException;
  @DeclDISPID(14937)  public String getHomeAddressCity() throws ComException;
  @DeclDISPID(14937)  public void setHomeAddressCity(String value) throws ComException;
  @DeclDISPID(14938)  public String getHomeAddressCountry() throws ComException;
  @DeclDISPID(14938)  public void setHomeAddressCountry(String value) throws ComException;
  @DeclDISPID(14939)  public String getHomeAddressPostalCode() throws ComException;
  @DeclDISPID(14939)  public void setHomeAddressPostalCode(String value) throws ComException;
  @DeclDISPID(14942)  public String getHomeAddressPostOfficeBox() throws ComException;
  @DeclDISPID(14942)  public void setHomeAddressPostOfficeBox(String value) throws ComException;
  @DeclDISPID(14940)  public String getHomeAddressState() throws ComException;
  @DeclDISPID(14940)  public void setHomeAddressState(String value) throws ComException;
  @DeclDISPID(14941)  public String getHomeAddressStreet() throws ComException;
  @DeclDISPID(14941)  public void setHomeAddressStreet(String value) throws ComException;
  @DeclDISPID(14885)  public String getHomeFaxNumber() throws ComException;
  @DeclDISPID(14885)  public void setHomeFaxNumber(String value) throws ComException;
  @DeclDISPID(14857)  public String getHomeTelephoneNumber() throws ComException;
  @DeclDISPID(14857)  public void setHomeTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14858)  public String getInitials() throws ComException;
  @DeclDISPID(14858)  public void setInitials(String value) throws ComException;
  @DeclDISPID(32984)  public String getInternetFreeBusyAddress() throws ComException;
  @DeclDISPID(32984)  public void setInternetFreeBusyAddress(String value) throws ComException;
  @DeclDISPID(14893)  public String getISDNNumber() throws ComException;
  @DeclDISPID(14893)  public void setISDNNumber(String value) throws ComException;
  @DeclDISPID(14871)  public String getJobTitle() throws ComException;
  @DeclDISPID(14871)  public void setJobTitle(String value) throws ComException;
  @DeclDISPID(32805)  public Boolean getJournal() throws ComException;
  @DeclDISPID(32805)  public void setJournal(Boolean value) throws ComException;
  @DeclDISPID(14860)  public String getLanguage() throws ComException;
  @DeclDISPID(14860)  public void setLanguage(String value) throws ComException;
  @DeclDISPID(32822)  public String getLastFirstAndSuffix() throws ComException;
  @DeclDISPID(32816)  public String getLastFirstNoSpace() throws ComException;
  @DeclDISPID(32820)  public String getLastFirstNoSpaceCompany() throws ComException;
  @DeclDISPID(32817)  public String getLastFirstSpaceOnly() throws ComException;
  @DeclDISPID(32821)  public String getLastFirstSpaceOnlyCompany() throws ComException;
  @DeclDISPID(14865)  public String getLastName() throws ComException;
  @DeclDISPID(14865)  public void setLastName(String value) throws ComException;
  @DeclDISPID(32791)  public String getLastNameAndFirstName() throws ComException;
  @DeclDISPID(14869)  public String getMailingAddress() throws ComException;
  @DeclDISPID(14869)  public void setMailingAddress(String value) throws ComException;
  @DeclDISPID(14887)  public String getMailingAddressCity() throws ComException;
  @DeclDISPID(14887)  public void setMailingAddressCity(String value) throws ComException;
  @DeclDISPID(14886)  public String getMailingAddressCountry() throws ComException;
  @DeclDISPID(14886)  public void setMailingAddressCountry(String value) throws ComException;
  @DeclDISPID(14890)  public String getMailingAddressPostalCode() throws ComException;
  @DeclDISPID(14890)  public void setMailingAddressPostalCode(String value) throws ComException;
  @DeclDISPID(14891)  public String getMailingAddressPostOfficeBox() throws ComException;
  @DeclDISPID(14891)  public void setMailingAddressPostOfficeBox(String value) throws ComException;
  @DeclDISPID(14888)  public String getMailingAddressState() throws ComException;
  @DeclDISPID(14888)  public void setMailingAddressState(String value) throws ComException;
  @DeclDISPID(14889)  public String getMailingAddressStreet() throws ComException;
  @DeclDISPID(14889)  public void setMailingAddressStreet(String value) throws ComException;
  @DeclDISPID(14926)  public String getManagerName() throws ComException;
  @DeclDISPID(14926)  public void setManagerName(String value) throws ComException;
  @DeclDISPID(14916)  public String getMiddleName() throws ComException;
  @DeclDISPID(14916)  public void setMiddleName(String value) throws ComException;
  @DeclDISPID(14876)  public String getMobileTelephoneNumber() throws ComException;
  @DeclDISPID(14876)  public void setMobileTelephoneNumber(String value) throws ComException;
  @DeclDISPID(32863)  public String getNetMeetingAlias() throws ComException;
  @DeclDISPID(32863)  public void setNetMeetingAlias(String value) throws ComException;
  @DeclDISPID(32864)  public String getNetMeetingServer() throws ComException;
  @DeclDISPID(32864)  public void setNetMeetingServer(String value) throws ComException;
  @DeclDISPID(14927)  public String getNickName() throws ComException;
  @DeclDISPID(14927)  public void setNickName(String value) throws ComException;
  @DeclDISPID(14873)  public String getOfficeLocation() throws ComException;
  @DeclDISPID(14873)  public void setOfficeLocation(String value) throws ComException;
  @DeclDISPID(14864)  public String getOrganizationalIDNumber() throws ComException;
  @DeclDISPID(14864)  public void setOrganizationalIDNumber(String value) throws ComException;
  @DeclDISPID(32796)  public String getOtherAddress() throws ComException;
  @DeclDISPID(32796)  public void setOtherAddress(String value) throws ComException;
  @DeclDISPID(14943)  public String getOtherAddressCity() throws ComException;
  @DeclDISPID(14943)  public void setOtherAddressCity(String value) throws ComException;
  @DeclDISPID(14944)  public String getOtherAddressCountry() throws ComException;
  @DeclDISPID(14944)  public void setOtherAddressCountry(String value) throws ComException;
  @DeclDISPID(14945)  public String getOtherAddressPostalCode() throws ComException;
  @DeclDISPID(14945)  public void setOtherAddressPostalCode(String value) throws ComException;
  @DeclDISPID(14948)  public String getOtherAddressPostOfficeBox() throws ComException;
  @DeclDISPID(14948)  public void setOtherAddressPostOfficeBox(String value) throws ComException;
  @DeclDISPID(14946)  public String getOtherAddressState() throws ComException;
  @DeclDISPID(14946)  public void setOtherAddressState(String value) throws ComException;
  @DeclDISPID(14947)  public String getOtherAddressStreet() throws ComException;
  @DeclDISPID(14947)  public void setOtherAddressStreet(String value) throws ComException;
  @DeclDISPID(14883)  public String getOtherFaxNumber() throws ComException;
  @DeclDISPID(14883)  public void setOtherFaxNumber(String value) throws ComException;
  @DeclDISPID(14879)  public String getOtherTelephoneNumber() throws ComException;
  @DeclDISPID(14879)  public void setOtherTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14881)  public String getPagerNumber() throws ComException;
  @DeclDISPID(14881)  public void setPagerNumber(String value) throws ComException;
  @DeclDISPID(14928)  public String getPersonalHomePage() throws ComException;
  @DeclDISPID(14928)  public void setPersonalHomePage(String value) throws ComException;
  @DeclDISPID(14874)  public String getPrimaryTelephoneNumber() throws ComException;
  @DeclDISPID(14874)  public void setPrimaryTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14918)  public String getProfession() throws ComException;
  @DeclDISPID(14918)  public void setProfession(String value) throws ComException;
  @DeclDISPID(14877)  public String getRadioTelephoneNumber() throws ComException;
  @DeclDISPID(14877)  public void setRadioTelephoneNumber(String value) throws ComException;
  @DeclDISPID(14919)  public String getReferredBy() throws ComException;
  @DeclDISPID(14919)  public void setReferredBy(String value) throws ComException;
  @DeclDISPID(32802)  public OlMailingAddress getSelectedMailingAddress() throws ComException;
  @DeclDISPID(32802)  public void setSelectedMailingAddress(OlMailingAddress value) throws ComException;
  @DeclDISPID(14920)  public String getSpouse() throws ComException;
  @DeclDISPID(14920)  public void setSpouse(String value) throws ComException;
  @DeclDISPID(14853)  public String getSuffix() throws ComException;
  @DeclDISPID(14853)  public void setSuffix(String value) throws ComException;
  @DeclDISPID(14892)  public String getTelexNumber() throws ComException;
  @DeclDISPID(14892)  public void setTelexNumber(String value) throws ComException;
  @DeclDISPID(14917)  public String getTitle() throws ComException;
  @DeclDISPID(14917)  public void setTitle(String value) throws ComException;
  @DeclDISPID(14923)  public String getTTYTDDTelephoneNumber() throws ComException;
  @DeclDISPID(14923)  public void setTTYTDDTelephoneNumber(String value) throws ComException;
  @DeclDISPID(32847)  public String getUser1() throws ComException;
  @DeclDISPID(32847)  public void setUser1(String value) throws ComException;
  @DeclDISPID(32848)  public String getUser2() throws ComException;
  @DeclDISPID(32848)  public void setUser2(String value) throws ComException;
  @DeclDISPID(32849)  public String getUser3() throws ComException;
  @DeclDISPID(32849)  public void setUser3(String value) throws ComException;
  @DeclDISPID(32850)  public String getUser4() throws ComException;
  @DeclDISPID(32850)  public void setUser4(String value) throws ComException;
  @DeclDISPID(32811)  public String getWebPage() throws ComException;
  @DeclDISPID(32811)  public void setWebPage(String value) throws ComException;
  @DeclDISPID(32814)  public String getYomiCompanyName() throws ComException;
  @DeclDISPID(32814)  public void setYomiCompanyName(String value) throws ComException;
  @DeclDISPID(32812)  public String getYomiFirstName() throws ComException;
  @DeclDISPID(32812)  public void setYomiFirstName(String value) throws ComException;
  @DeclDISPID(32813)  public String getYomiLastName() throws ComException;
  @DeclDISPID(32813)  public void setYomiLastName(String value) throws ComException;
  @DeclDISPID(63649)  public MailItem ForwardAsVcard() throws ComException;
  @DeclDISPID(64009)  public ItemProperties getItemProperties() throws ComException;
  @DeclDISPID(32824)  public String getLastFirstNoSpaceAndSuffix() throws ComException;
  @DeclDISPID(64077)  public OlDownloadState getDownloadState() throws ComException;
  @DeclDISPID(64011)  public void ShowCategoriesDialog() throws ComException;
  @DeclDISPID(32866)  public String getIMAddress() throws ComException;
  @DeclDISPID(32866)  public void setIMAddress(String value) throws ComException;
  @DeclDISPID(34161)  public OlRemoteStatus getMarkForDownload() throws ComException;
  @DeclDISPID(34161)  public void setMarkForDownload(OlRemoteStatus value) throws ComException;
  @DeclDISPID(32896)  public void setEmail1DisplayName(String value) throws ComException;
  @DeclDISPID(32912)  public void setEmail2DisplayName(String value) throws ComException;
  @DeclDISPID(32928)  public void setEmail3DisplayName(String value) throws ComException;
  @DeclDISPID(64164)  public Boolean getIsConflict() throws ComException;
  @DeclDISPID(64186)  public Boolean getAutoResolvedWinner() throws ComException;
  @DeclDISPID(64187)  public Conflicts getConflicts() throws ComException;
  @DeclDISPID(64189)  public void AddPicture(String Path) throws ComException;
  @DeclDISPID(64190)  public void RemovePicture() throws ComException;
  @DeclDISPID(64191)  public Boolean getHasPicture() throws ComException;
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException;
  @DeclDISPID(64404)  public MailItem ForwardAsBusinessCard() throws ComException;
  @DeclDISPID(64405)  public void ShowBusinessCardEditor() throws ComException;
  @DeclDISPID(64407)  public void SaveBusinessCardImage(String Path) throws ComException;
  @DeclDISPID(64471)  public void ShowCheckPhoneDialog(OlContactPhoneNumber PhoneNumber) throws ComException;
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
  @DeclDISPID(64525)  public String getBusinessCardLayoutXml() throws ComException;
  @DeclDISPID(64525)  public void setBusinessCardLayoutXml(String value) throws ComException;
  @DeclDISPID(64526)  public void ResetBusinessCard() throws ComException;
  @DeclDISPID(64527)  public void AddBusinessCardLogoPicture(String Path) throws ComException;
  @DeclDISPID(64528)  public OlBusinessCardType getBusinessCardType() throws ComException;
  @DeclDISPID(64596)  public _Conversation GetConversation() throws ComException;
  @DeclDISPID(64629)  public String getConversationID() throws ComException;
  @DeclDISPID(64644)  public Object getRTFBody() throws ComException;
  @DeclDISPID(64644)  public void setRTFBody(Object value) throws ComException;
  @DeclDISPID(64657)  public void ShowCheckFullNameDialog() throws ComException;
  @DeclDISPID(64656)  public void ShowCheckAddressDialog(OlMailingAddress MailingAddress) throws ComException;
}
