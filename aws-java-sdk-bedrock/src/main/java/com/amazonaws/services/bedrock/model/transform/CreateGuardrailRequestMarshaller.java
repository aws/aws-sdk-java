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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateGuardrailRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateGuardrailRequestMarshaller {

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
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateGuardrailRequestMarshaller instance = new CreateGuardrailRequestMarshaller();

    public static CreateGuardrailRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateGuardrailRequest createGuardrailRequest, ProtocolMarshaller protocolMarshaller) {

        if (createGuardrailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createGuardrailRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getTopicPolicyConfig(), TOPICPOLICYCONFIG_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getContentPolicyConfig(), CONTENTPOLICYCONFIG_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getWordPolicyConfig(), WORDPOLICYCONFIG_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getSensitiveInformationPolicyConfig(), SENSITIVEINFORMATIONPOLICYCONFIG_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getBlockedInputMessaging(), BLOCKEDINPUTMESSAGING_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getBlockedOutputsMessaging(), BLOCKEDOUTPUTSMESSAGING_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createGuardrailRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
