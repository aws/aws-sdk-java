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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAgentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAgentRequestMarshaller {

    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> AGENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentName").build();
    private static final MarshallingInfo<String> AGENTRESOURCEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentResourceRoleArn").build();
    private static final MarshallingInfo<String> CUSTOMERENCRYPTIONKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerEncryptionKeyArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
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

    private static final UpdateAgentRequestMarshaller instance = new UpdateAgentRequestMarshaller();

    public static UpdateAgentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAgentRequest updateAgentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAgentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAgentRequest.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getAgentName(), AGENTNAME_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getAgentResourceRoleArn(), AGENTRESOURCEROLEARN_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getCustomerEncryptionKeyArn(), CUSTOMERENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getFoundationModel(), FOUNDATIONMODEL_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getGuardrailConfiguration(), GUARDRAILCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getIdleSessionTTLInSeconds(), IDLESESSIONTTLINSECONDS_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getInstruction(), INSTRUCTION_BINDING);
            protocolMarshaller.marshall(updateAgentRequest.getPromptOverrideConfiguration(), PROMPTOVERRIDECONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
