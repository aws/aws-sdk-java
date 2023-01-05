/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AggregatedUtterancesSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AggregatedUtterancesSummaryMarshaller {

    private static final MarshallingInfo<String> UTTERANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("utterance").build();
    private static final MarshallingInfo<Integer> HITCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hitCount").build();
    private static final MarshallingInfo<Integer> MISSEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("missedCount").build();
    private static final MarshallingInfo<java.util.Date> UTTERANCEFIRSTRECORDEDINAGGREGATIONDURATION_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utteranceFirstRecordedInAggregationDuration").timestampFormat("unixTimestamp")
            .build();
    private static final MarshallingInfo<java.util.Date> UTTERANCELASTRECORDEDINAGGREGATIONDURATION_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utteranceLastRecordedInAggregationDuration").timestampFormat("unixTimestamp")
            .build();
    private static final MarshallingInfo<Boolean> CONTAINSDATAFROMDELETEDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containsDataFromDeletedResources").build();

    private static final AggregatedUtterancesSummaryMarshaller instance = new AggregatedUtterancesSummaryMarshaller();

    public static AggregatedUtterancesSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AggregatedUtterancesSummary aggregatedUtterancesSummary, ProtocolMarshaller protocolMarshaller) {

        if (aggregatedUtterancesSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aggregatedUtterancesSummary.getUtterance(), UTTERANCE_BINDING);
            protocolMarshaller.marshall(aggregatedUtterancesSummary.getHitCount(), HITCOUNT_BINDING);
            protocolMarshaller.marshall(aggregatedUtterancesSummary.getMissedCount(), MISSEDCOUNT_BINDING);
            protocolMarshaller.marshall(aggregatedUtterancesSummary.getUtteranceFirstRecordedInAggregationDuration(),
                    UTTERANCEFIRSTRECORDEDINAGGREGATIONDURATION_BINDING);
            protocolMarshaller.marshall(aggregatedUtterancesSummary.getUtteranceLastRecordedInAggregationDuration(),
                    UTTERANCELASTRECORDEDINAGGREGATIONDURATION_BINDING);
            protocolMarshaller.marshall(aggregatedUtterancesSummary.getContainsDataFromDeletedResources(), CONTAINSDATAFROMDELETEDRESOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
