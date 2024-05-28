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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAgentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAgentRequestMarshaller {

    private static final MarshallingInfo<String> AGENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentName").build();
    private static final MarshallingInfo<String> AGENTRESOURCEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentResourceRoleArn").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
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
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateAgentRequestMarshaller instance = new CreateAgentRequestMarshaller();

    public static CreateAgentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAgentRequest createAgentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAgentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAgentRequest.getAgentName(), AGENTNAME_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getAgentResourceRoleArn(), AGENTRESOURCEROLEARN_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getCustomerEncryptionKeyArn(), CUSTOMERENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getFoundationModel(), FOUNDATIONMODEL_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getGuardrailConfiguration(), GUARDRAILCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getIdleSessionTTLInSeconds(), IDLESESSIONTTLINSECONDS_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getInstruction(), INSTRUCTION_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getPromptOverrideConfiguration(), PROMPTOVERRIDECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createAgentRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
