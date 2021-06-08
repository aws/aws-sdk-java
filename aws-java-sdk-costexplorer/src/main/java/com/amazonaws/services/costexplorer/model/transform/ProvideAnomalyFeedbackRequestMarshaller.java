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
 * ProvideAnomalyFeedbackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvideAnomalyFeedbackRequestMarshaller {

    private static final MarshallingInfo<String> ANOMALYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AnomalyId").build();
    private static final MarshallingInfo<String> FEEDBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Feedback").build();

    private static final ProvideAnomalyFeedbackRequestMarshaller instance = new ProvideAnomalyFeedbackRequestMarshaller();

    public static ProvideAnomalyFeedbackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvideAnomalyFeedbackRequest provideAnomalyFeedbackRequest, ProtocolMarshaller protocolMarshaller) {

        if (provideAnomalyFeedbackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provideAnomalyFeedbackRequest.getAnomalyId(), ANOMALYID_BINDING);
            protocolMarshaller.marshall(provideAnomalyFeedbackRequest.getFeedback(), FEEDBACK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
