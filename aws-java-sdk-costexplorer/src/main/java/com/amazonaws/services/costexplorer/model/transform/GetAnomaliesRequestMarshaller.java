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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetAnomaliesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetAnomaliesRequestMarshaller {

    private static final MarshallingInfo<String> MONITORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorArn").build();
    private static final MarshallingInfo<StructuredPojo> DATEINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateInterval").build();
    private static final MarshallingInfo<String> FEEDBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Feedback").build();
    private static final MarshallingInfo<StructuredPojo> TOTALIMPACT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalImpact").build();
    private static final MarshallingInfo<String> NEXTPAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextPageToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final GetAnomaliesRequestMarshaller instance = new GetAnomaliesRequestMarshaller();

    public static GetAnomaliesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetAnomaliesRequest getAnomaliesRequest, ProtocolMarshaller protocolMarshaller) {

        if (getAnomaliesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getAnomaliesRequest.getMonitorArn(), MONITORARN_BINDING);
            protocolMarshaller.marshall(getAnomaliesRequest.getDateInterval(), DATEINTERVAL_BINDING);
            protocolMarshaller.marshall(getAnomaliesRequest.getFeedback(), FEEDBACK_BINDING);
            protocolMarshaller.marshall(getAnomaliesRequest.getTotalImpact(), TOTALIMPACT_BINDING);
            protocolMarshaller.marshall(getAnomaliesRequest.getNextPageToken(), NEXTPAGETOKEN_BINDING);
            protocolMarshaller.marshall(getAnomaliesRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
