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
 * AgentPreviewMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgentPreviewMarshaller {

    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostname").build();
    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> AUTOSCALINGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingGroup").build();
    private static final MarshallingInfo<String> AGENTHEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentHealth").build();
    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentVersion").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operatingSystem").build();
    private static final MarshallingInfo<String> KERNELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kernelVersion").build();
    private static final MarshallingInfo<String> IPV4ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipv4Address").build();

    private static final AgentPreviewMarshaller instance = new AgentPreviewMarshaller();

    public static AgentPreviewMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgentPreview agentPreview, ProtocolMarshaller protocolMarshaller) {

        if (agentPreview == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agentPreview.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(agentPreview.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(agentPreview.getAutoScalingGroup(), AUTOSCALINGGROUP_BINDING);
            protocolMarshaller.marshall(agentPreview.getAgentHealth(), AGENTHEALTH_BINDING);
            protocolMarshaller.marshall(agentPreview.getAgentVersion(), AGENTVERSION_BINDING);
            protocolMarshaller.marshall(agentPreview.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(agentPreview.getKernelVersion(), KERNELVERSION_BINDING);
            protocolMarshaller.marshall(agentPreview.getIpv4Address(), IPV4ADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
