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
package com.amazonaws.services.xray.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InsightEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InsightEventMarshaller {

    private static final MarshallingInfo<String> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Summary").build();
    private static final MarshallingInfo<java.util.Date> EVENTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> CLIENTREQUESTIMPACTSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestImpactStatistics").build();
    private static final MarshallingInfo<StructuredPojo> ROOTCAUSESERVICEREQUESTIMPACTSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootCauseServiceRequestImpactStatistics").build();
    private static final MarshallingInfo<List> TOPANOMALOUSSERVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TopAnomalousServices").build();

    private static final InsightEventMarshaller instance = new InsightEventMarshaller();

    public static InsightEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InsightEvent insightEvent, ProtocolMarshaller protocolMarshaller) {

        if (insightEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(insightEvent.getSummary(), SUMMARY_BINDING);
            protocolMarshaller.marshall(insightEvent.getEventTime(), EVENTTIME_BINDING);
            protocolMarshaller.marshall(insightEvent.getClientRequestImpactStatistics(), CLIENTREQUESTIMPACTSTATISTICS_BINDING);
            protocolMarshaller.marshall(insightEvent.getRootCauseServiceRequestImpactStatistics(), ROOTCAUSESERVICEREQUESTIMPACTSTATISTICS_BINDING);
            protocolMarshaller.marshall(insightEvent.getTopAnomalousServices(), TOPANOMALOUSSERVICES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
