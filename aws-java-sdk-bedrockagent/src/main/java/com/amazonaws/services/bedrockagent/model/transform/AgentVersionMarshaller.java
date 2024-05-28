/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrockagent.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AgentVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgentVersionMarshaller {

    private static final MarshallingInfo<String> AGENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentArn").build();
    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> AGENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentName").build();
    private static final MarshallingInfo<String> AGENTRESOURCEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentResourceRoleArn").build();
    private static final MarshallingInfo<String> AGENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CUSTOMERENCRYPTIONKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerEncryptionKeyArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> FAILUREREASONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureReasons").build();
    private static final MarshallingInfo<String> FOUNDATIONMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("foundationModel").build();
    private static final MarshallingInfo<StructuredPojo> GUARDRAILCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("guardrailConfiguration").build();
    private static final MarshallingInfo<Integer> IDLESESSIONTTLINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("idleSessionTTLInSeconds").build();
    private static final MarshallingInfo<String> INSTRUCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instruction").build();
    private static final MarshallingInfo<StructuredPojo> PROMPTOVERRIDECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("promptOverrideConfiguration").build();
    private static final MarshallingInfo<List> RECOMMENDEDACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendedActions").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();

    private static final AgentVersionMarshaller instance = new AgentVersionMarshaller();

    public static AgentVersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgentVersion agentVersion, ProtocolMarshaller protocolMarshaller) {

        if (agentVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agentVersion.getAgentArn(), AGENTARN_BINDING);
            protocolMarshaller.marshall(agentVersion.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(agentVersion.getAgentName(), AGENTNAME_BINDING);
            protocolMarshaller.marshall(agentVersion.getAgentResourceRoleArn(), AGENTRESOURCEROLEARN_BINDING);
            protocolMarshaller.marshall(agentVersion.getAgentStatus(), AGENTSTATUS_BINDING);
            protocolMarshaller.marshall(agentVersion.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(agentVersion.getCustomerEncryptionKeyArn(), CUSTOMERENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(agentVersion.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(agentVersion.getFailureReasons(), FAILUREREASONS_BINDING);
            protocolMarshaller.marshall(agentVersion.getFoundationModel(), FOUNDATIONMODEL_BINDING);
            protocolMarshaller.marshall(agentVersion.getGuardrailConfiguration(), GUARDRAILCONFIGURATION_BINDING);
            protocolMarshaller.marshall(agentVersion.getIdleSessionTTLInSeconds(), IDLESESSIONTTLINSECONDS_BINDING);
            protocolMarshaller.marshall(agentVersion.getInstruction(), INSTRUCTION_BINDING);
            protocolMarshaller.marshall(agentVersion.getPromptOverrideConfiguration(), PROMPTOVERRIDECONFIGURATION_BINDING);
            protocolMarshaller.marshall(agentVersion.getRecommendedActions(), RECOMMENDEDACTIONS_BINDING);
            protocolMarshaller.marshall(agentVersion.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(agentVersion.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
