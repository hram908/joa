/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AVModality.
 * AVModality class defines the audio video modality.This class handles the events defined in 
 * the interface IAVModalityEvents. 
 */
@CoClass(guid="{BA2BD6F3-7676-42E3-89C6-10CEB3F7E106}")
public class AVModality extends Dispatch implements IAVModality {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ModalityTypes getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public ModalityState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ModalityState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743811)  public IParticipant getParticipant() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Participant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743812)  public IContactEndpoint getEndpoint() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Endpoint", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(1610743812)  public void setEndpoint(final IContactEndpoint value) throws ComException {
    this._dispatchCall(1610743812,"Endpoint", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public IModalityPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743815)  public IAsynchronousOperation SetProperty(final ModalityProperty _propertyType, final Object _propertyValue, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_propertyType != null);
    assert(_propertyValue != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"SetProperty", DISPATCH_METHOD,null,_propertyType.value,_propertyValue,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public IAsynchronousOperation Connect(final ModalityConnectOptions _options, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"Connect", DISPATCH_METHOD,null,_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743817)  public IAsynchronousOperation Disconnect(final ModalityDisconnectReason _reason, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_reason != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"Disconnect", DISPATCH_METHOD,null,_reason.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public void Reject(final ModalityDisconnectReason _reason) throws ComException {
    assert(_reason != null);
    this._dispatchCall(1610743818,"Reject", DISPATCH_METHOD,null,_reason.value);
  }
  @DeclDISPID(1610743819)  public void Accept() throws ComException {
    this._dispatchCall(1610743819,"Accept", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743820)  public IAsynchronousOperation Hold(final Object _modalityCallback, final Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743820,"Hold", DISPATCH_METHOD,null,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743821)  public IAsynchronousOperation Retrieve(final Object _modalityCallback, final Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743821,"Retrieve", DISPATCH_METHOD,null,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743822)  public IAsynchronousOperation Forward(final IDispatch _contactOrCollaborationEndpoint, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743822,"Forward", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL),_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743823)  public IAsynchronousOperation Transfer(final IDispatch _contactOrCollaborationEndpoint, final TransferOptions _options, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743823,"Transfer", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743824)  public IAsynchronousOperation ConsultativeTransfer(final IConversation _conversation, final TransferOptions _options, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743824,"ConsultativeTransfer", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743825)  public Boolean CanInvoke(final ModalityAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743825,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743826)  public Boolean CanSetProperty(final ModalityProperty _modalityProperty) throws ComException {
    assert(_modalityProperty != null);
    final Object obj = this._dispatchCall(1610743826,"CanSetProperty", DISPATCH_METHOD,null,_modalityProperty.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public IAudioChannel getAudioChannel() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"AudioChannel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAudioChannelImpl.class);
  }
  @DeclDISPID(1610809345)  public IVideoChannel getVideoChannel() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"VideoChannel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVideoChannelImpl.class);
  }
  public AVModality() throws ComException {
    super("{BA2BD6F3-7676-42E3-89C6-10CEB3F7E106}", "{E4E1D0AF-5B70-45AF-9A0E-F548D8FBD17C}");
  }
  protected AVModality(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AVModality" + super.toString() + "]";
  }
}
