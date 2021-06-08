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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSlotTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSlotTypeRequestMarshaller {

    private static final MarshallingInfo<String> SLOTTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("slotTypeId").build();
    private static final MarshallingInfo<String> SLOTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotTypeName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> SLOTTYPEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotTypeValues").build();
    private static final MarshallingInfo<StructuredPojo> VALUESELECTIONSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("valueSelectionSetting").build();
    private static final MarshallingInfo<String> PARENTSLOTTYPESIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentSlotTypeSignature").build();
    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botVersion").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("localeId").build();

    private static final UpdateSlotTypeRequestMarshaller instance = new UpdateSlotTypeRequestMarshaller();

    public static UpdateSlotTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSlotTypeRequest updateSlotTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSlotTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSlotTypeRequest.getSlotTypeId(), SLOTTYPEID_BINDING);
            protocolMarshaller.marshall(updateSlotTypeRequest.getSlotTypeName(), SLOTTYPENAME_BINDING);
            protocolMarshaller.marshall(updateSlotTypeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateSlotTypeRequest.getSlotTypeValues(), SLOTTYPEVALUES_BINDING);
            protocolMarshaller.marshall(updateSlotTypeRequest.getValueSelectionSetting(), VALUESELECTIONSETTING_BINDING);
            protocolMarshaller.marshall(updateSlotTypeRequest.getParentSlotTypeSignature(), PARENTSLOTTYPESIGNATURE_BINDING);
            protocolMarshaller.marshall(updateSlotTypeRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(updateSlotTypeRequest.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(updateSlotTypeRequest.getLocaleId(), LOCALEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
