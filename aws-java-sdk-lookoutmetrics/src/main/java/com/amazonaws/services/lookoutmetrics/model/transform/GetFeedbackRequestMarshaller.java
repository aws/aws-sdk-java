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
package com.amazonaws.services.lookoutmetrics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetFeedbackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetFeedbackRequestMarshaller {

    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyDetectorArn").build();
    private static final MarshallingInfo<StructuredPojo> ANOMALYGROUPTIMESERIESFEEDBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyGroupTimeSeriesFeedback").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final GetFeedbackRequestMarshaller instance = new GetFeedbackRequestMarshaller();

    public static GetFeedbackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetFeedbackRequest getFeedbackRequest, ProtocolMarshaller protocolMarshaller) {

        if (getFeedbackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getFeedbackRequest.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(getFeedbackRequest.getAnomalyGroupTimeSeriesFeedback(), ANOMALYGROUPTIMESERIESFEEDBACK_BINDING);
            protocolMarshaller.marshall(getFeedbackRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getFeedbackRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
