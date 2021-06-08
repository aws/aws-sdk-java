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
package com.amazonaws.services.codeguruprofiler.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeguruprofiler.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubmitFeedbackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubmitFeedbackRequestMarshaller {

    private static final MarshallingInfo<String> ANOMALYINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("anomalyInstanceId").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comment").build();
    private static final MarshallingInfo<String> PROFILINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("profilingGroupName").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final SubmitFeedbackRequestMarshaller instance = new SubmitFeedbackRequestMarshaller();

    public static SubmitFeedbackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubmitFeedbackRequest submitFeedbackRequest, ProtocolMarshaller protocolMarshaller) {

        if (submitFeedbackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(submitFeedbackRequest.getAnomalyInstanceId(), ANOMALYINSTANCEID_BINDING);
            protocolMarshaller.marshall(submitFeedbackRequest.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(submitFeedbackRequest.getProfilingGroupName(), PROFILINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(submitFeedbackRequest.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
