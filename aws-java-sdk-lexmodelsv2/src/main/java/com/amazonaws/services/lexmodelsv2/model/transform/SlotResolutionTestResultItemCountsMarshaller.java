/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SlotResolutionTestResultItemCountsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlotResolutionTestResultItemCountsMarshaller {

    private static final MarshallingInfo<Integer> TOTALRESULTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalResultCount").build();
    private static final MarshallingInfo<Map> SPEECHTRANSCRIPTIONRESULTCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("speechTranscriptionResultCounts").build();
    private static final MarshallingInfo<Map> SLOTMATCHRESULTCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotMatchResultCounts").build();

    private static final SlotResolutionTestResultItemCountsMarshaller instance = new SlotResolutionTestResultItemCountsMarshaller();

    public static SlotResolutionTestResultItemCountsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SlotResolutionTestResultItemCounts slotResolutionTestResultItemCounts, ProtocolMarshaller protocolMarshaller) {

        if (slotResolutionTestResultItemCounts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slotResolutionTestResultItemCounts.getTotalResultCount(), TOTALRESULTCOUNT_BINDING);
            protocolMarshaller.marshall(slotResolutionTestResultItemCounts.getSpeechTranscriptionResultCounts(), SPEECHTRANSCRIPTIONRESULTCOUNTS_BINDING);
            protocolMarshaller.marshall(slotResolutionTestResultItemCounts.getSlotMatchResultCounts(), SLOTMATCHRESULTCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
