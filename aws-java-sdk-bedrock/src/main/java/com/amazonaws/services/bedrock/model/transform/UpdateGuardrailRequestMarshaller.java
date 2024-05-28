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
package com.amazonaws.services.bedrock.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateGuardrailRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateGuardrailRequestMarshaller {

    private static final MarshallingInfo<String> GUARDRAILIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("guardrailIdentifier").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> TOPICPOLICYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topicPolicyConfig").build();
    private static final MarshallingInfo<StructuredPojo> CONTENTPOLICYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentPolicyConfig").build();
    private static final MarshallingInfo<StructuredPojo> WORDPOLICYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("wordPolicyConfig").build();
    private static final MarshallingInfo<StructuredPojo> SENSITIVEINFORMATIONPOLICYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sensitiveInformationPolicyConfig").build();
    private static final MarshallingInfo<String> BLOCKEDINPUTMESSAGING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockedInputMessaging").build();
    private static final MarshallingInfo<String> BLOCKEDOUTPUTSMESSAGING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockedOutputsMessaging").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();

    private static final UpdateGuardrailRequestMarshaller instance = new UpdateGuardrailRequestMarshaller();

    public static UpdateGuardrailRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateGuardrailRequest updateGuardrailRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateGuardrailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateGuardrailRequest.getGuardrailIdentifier(), GUARDRAILIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getTopicPolicyConfig(), TOPICPOLICYCONFIG_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getContentPolicyConfig(), CONTENTPOLICYCONFIG_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getWordPolicyConfig(), WORDPOLICYCONFIG_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getSensitiveInformationPolicyConfig(), SENSITIVEINFORMATIONPOLICYCONFIG_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getBlockedInputMessaging(), BLOCKEDINPUTMESSAGING_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getBlockedOutputsMessaging(), BLOCKEDOUTPUTSMESSAGING_BINDING);
            protocolMarshaller.marshall(updateGuardrailRequest.getKmsKeyId(), KMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
