/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AgentAlreadyRunningAssessmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgentAlreadyRunningAssessmentMarshaller {

    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> ASSESSMENTRUNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentRunArn").build();

    private static final AgentAlreadyRunningAssessmentMarshaller instance = new AgentAlreadyRunningAssessmentMarshaller();

    public static AgentAlreadyRunningAssessmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgentAlreadyRunningAssessment agentAlreadyRunningAssessment, ProtocolMarshaller protocolMarshaller) {

        if (agentAlreadyRunningAssessment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agentAlreadyRunningAssessment.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(agentAlreadyRunningAssessment.getAssessmentRunArn(), ASSESSMENTRUNARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
