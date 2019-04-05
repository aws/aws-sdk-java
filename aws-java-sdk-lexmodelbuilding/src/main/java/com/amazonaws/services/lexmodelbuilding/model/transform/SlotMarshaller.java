/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelbuilding.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SlotMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlotMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> SLOTCONSTRAINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotConstraint").build();
    private static final MarshallingInfo<String> SLOTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slotType").build();
    private static final MarshallingInfo<String> SLOTTYPEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotTypeVersion").build();
    private static final MarshallingInfo<StructuredPojo> VALUEELICITATIONPROMPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("valueElicitationPrompt").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("priority").build();
    private static final MarshallingInfo<List> SAMPLEUTTERANCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleUtterances").build();
    private static final MarshallingInfo<String> RESPONSECARD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseCard").build();

    private static final SlotMarshaller instance = new SlotMarshaller();

    public static SlotMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Slot slot, ProtocolMarshaller protocolMarshaller) {

        if (slot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slot.getName(), NAME_BINDING);
            protocolMarshaller.marshall(slot.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(slot.getSlotConstraint(), SLOTCONSTRAINT_BINDING);
            protocolMarshaller.marshall(slot.getSlotType(), SLOTTYPE_BINDING);
            protocolMarshaller.marshall(slot.getSlotTypeVersion(), SLOTTYPEVERSION_BINDING);
            protocolMarshaller.marshall(slot.getValueElicitationPrompt(), VALUEELICITATIONPROMPT_BINDING);
            protocolMarshaller.marshall(slot.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(slot.getSampleUtterances(), SAMPLEUTTERANCES_BINDING);
            protocolMarshaller.marshall(slot.getResponseCard(), RESPONSECARD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
