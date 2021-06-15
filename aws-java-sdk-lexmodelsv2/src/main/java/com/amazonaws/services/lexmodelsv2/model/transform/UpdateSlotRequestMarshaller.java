/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSlotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSlotRequestMarshaller {

    private static final MarshallingInfo<String> SLOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("slotId").build();
    private static final MarshallingInfo<String> SLOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slotName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> SLOTTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotTypeId").build();
    private static final MarshallingInfo<StructuredPojo> VALUEELICITATIONSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("valueElicitationSetting").build();
    private static final MarshallingInfo<StructuredPojo> OBFUSCATIONSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("obfuscationSetting").build();
    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botVersion").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("localeId").build();
    private static final MarshallingInfo<String> INTENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("intentId").build();
    private static final MarshallingInfo<StructuredPojo> MULTIPLEVALUESSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("multipleValuesSetting").build();

    private static final UpdateSlotRequestMarshaller instance = new UpdateSlotRequestMarshaller();

    public static UpdateSlotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSlotRequest updateSlotRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSlotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSlotRequest.getSlotId(), SLOTID_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getSlotName(), SLOTNAME_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getSlotTypeId(), SLOTTYPEID_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getValueElicitationSetting(), VALUEELICITATIONSETTING_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getObfuscationSetting(), OBFUSCATIONSETTING_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getLocaleId(), LOCALEID_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getIntentId(), INTENTID_BINDING);
            protocolMarshaller.marshall(updateSlotRequest.getMultipleValuesSetting(), MULTIPLEVALUESSETTING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
