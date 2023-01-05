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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectwisdom.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateKnowledgeBaseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateKnowledgeBaseRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> KNOWLEDGEBASETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("knowledgeBaseType").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> RENDERINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renderingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SERVERSIDEENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverSideEncryptionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SOURCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceConfiguration").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateKnowledgeBaseRequestMarshaller instance = new CreateKnowledgeBaseRequestMarshaller();

    public static CreateKnowledgeBaseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateKnowledgeBaseRequest createKnowledgeBaseRequest, ProtocolMarshaller protocolMarshaller) {

        if (createKnowledgeBaseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createKnowledgeBaseRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createKnowledgeBaseRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createKnowledgeBaseRequest.getKnowledgeBaseType(), KNOWLEDGEBASETYPE_BINDING);
            protocolMarshaller.marshall(createKnowledgeBaseRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createKnowledgeBaseRequest.getRenderingConfiguration(), RENDERINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createKnowledgeBaseRequest.getServerSideEncryptionConfiguration(), SERVERSIDEENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createKnowledgeBaseRequest.getSourceConfiguration(), SOURCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createKnowledgeBaseRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
