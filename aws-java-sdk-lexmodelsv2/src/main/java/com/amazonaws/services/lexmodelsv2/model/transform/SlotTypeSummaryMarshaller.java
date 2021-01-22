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
 * SlotTypeSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlotTypeSummaryMarshaller {

    private static final MarshallingInfo<String> SLOTTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotTypeId").build();
    private static final MarshallingInfo<String> SLOTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotTypeName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> PARENTSLOTTYPESIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentSlotTypeSignature").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final SlotTypeSummaryMarshaller instance = new SlotTypeSummaryMarshaller();

    public static SlotTypeSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SlotTypeSummary slotTypeSummary, ProtocolMarshaller protocolMarshaller) {

        if (slotTypeSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slotTypeSummary.getSlotTypeId(), SLOTTYPEID_BINDING);
            protocolMarshaller.marshall(slotTypeSummary.getSlotTypeName(), SLOTTYPENAME_BINDING);
            protocolMarshaller.marshall(slotTypeSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(slotTypeSummary.getParentSlotTypeSignature(), PARENTSLOTTYPESIGNATURE_BINDING);
            protocolMarshaller.marshall(slotTypeSummary.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
