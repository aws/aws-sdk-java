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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssessmentRunAgentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentRunAgentMarshaller {

    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> ASSESSMENTRUNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentRunArn").build();
    private static final MarshallingInfo<String> AGENTHEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentHealth").build();
    private static final MarshallingInfo<String> AGENTHEALTHCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentHealthCode").build();
    private static final MarshallingInfo<String> AGENTHEALTHDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentHealthDetails").build();
    private static final MarshallingInfo<String> AUTOSCALINGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingGroup").build();
    private static final MarshallingInfo<List> TELEMETRYMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("telemetryMetadata").build();

    private static final AssessmentRunAgentMarshaller instance = new AssessmentRunAgentMarshaller();

    public static AssessmentRunAgentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentRunAgent assessmentRunAgent, ProtocolMarshaller protocolMarshaller) {

        if (assessmentRunAgent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentRunAgent.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(assessmentRunAgent.getAssessmentRunArn(), ASSESSMENTRUNARN_BINDING);
            protocolMarshaller.marshall(assessmentRunAgent.getAgentHealth(), AGENTHEALTH_BINDING);
            protocolMarshaller.marshall(assessmentRunAgent.getAgentHealthCode(), AGENTHEALTHCODE_BINDING);
            protocolMarshaller.marshall(assessmentRunAgent.getAgentHealthDetails(), AGENTHEALTHDETAILS_BINDING);
            protocolMarshaller.marshall(assessmentRunAgent.getAutoScalingGroup(), AUTOSCALINGGROUP_BINDING);
            protocolMarshaller.marshall(assessmentRunAgent.getTelemetryMetadata(), TELEMETRYMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
