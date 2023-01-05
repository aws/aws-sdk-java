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
package com.amazonaws.services.connectwisdom.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectwisdom.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NotifyRecommendationsReceivedRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NotifyRecommendationsReceivedRequestMarshaller {

    private static final MarshallingInfo<String> ASSISTANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("assistantId").build();
    private static final MarshallingInfo<List> RECOMMENDATIONIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationIds").build();
    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("sessionId").build();

    private static final NotifyRecommendationsReceivedRequestMarshaller instance = new NotifyRecommendationsReceivedRequestMarshaller();

    public static NotifyRecommendationsReceivedRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NotifyRecommendationsReceivedRequest notifyRecommendationsReceivedRequest, ProtocolMarshaller protocolMarshaller) {

        if (notifyRecommendationsReceivedRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(notifyRecommendationsReceivedRequest.getAssistantId(), ASSISTANTID_BINDING);
            protocolMarshaller.marshall(notifyRecommendationsReceivedRequest.getRecommendationIds(), RECOMMENDATIONIDS_BINDING);
            protocolMarshaller.marshall(notifyRecommendationsReceivedRequest.getSessionId(), SESSIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
