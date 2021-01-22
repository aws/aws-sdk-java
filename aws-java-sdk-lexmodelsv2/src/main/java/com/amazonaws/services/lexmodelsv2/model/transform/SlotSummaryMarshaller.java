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
 * SlotSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlotSummaryMarshaller {

    private static final MarshallingInfo<String> SLOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slotId").build();
    private static final MarshallingInfo<String> SLOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slotName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> SLOTCONSTRAINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotConstraint").build();
    private static final MarshallingInfo<String> SLOTTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotTypeId").build();
    private static final MarshallingInfo<StructuredPojo> VALUEELICITATIONPROMPTSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("valueElicitationPromptSpecification").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final SlotSummaryMarshaller instance = new SlotSummaryMarshaller();

    public static SlotSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SlotSummary slotSummary, ProtocolMarshaller protocolMarshaller) {

        if (slotSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slotSummary.getSlotId(), SLOTID_BINDING);
            protocolMarshaller.marshall(slotSummary.getSlotName(), SLOTNAME_BINDING);
            protocolMarshaller.marshall(slotSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(slotSummary.getSlotConstraint(), SLOTCONSTRAINT_BINDING);
            protocolMarshaller.marshall(slotSummary.getSlotTypeId(), SLOTTYPEID_BINDING);
            protocolMarshaller.marshall(slotSummary.getValueElicitationPromptSpecification(), VALUEELICITATIONPROMPTSPECIFICATION_BINDING);
            protocolMarshaller.marshall(slotSummary.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
