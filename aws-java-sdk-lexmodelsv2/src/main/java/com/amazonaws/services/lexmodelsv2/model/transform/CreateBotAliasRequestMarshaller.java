/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBotAliasRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBotAliasRequestMarshaller {

    private static final MarshallingInfo<String> BOTALIASNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botAliasName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botVersion").build();
    private static final MarshallingInfo<Map> BOTALIASLOCALESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botAliasLocaleSettings").build();
    private static final MarshallingInfo<StructuredPojo> CONVERSATIONLOGSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationLogSettings").build();
    private static final MarshallingInfo<StructuredPojo> SENTIMENTANALYSISSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sentimentAnalysisSettings").build();
    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateBotAliasRequestMarshaller instance = new CreateBotAliasRequestMarshaller();

    public static CreateBotAliasRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBotAliasRequest createBotAliasRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBotAliasRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBotAliasRequest.getBotAliasName(), BOTALIASNAME_BINDING);
            protocolMarshaller.marshall(createBotAliasRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createBotAliasRequest.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(createBotAliasRequest.getBotAliasLocaleSettings(), BOTALIASLOCALESETTINGS_BINDING);
            protocolMarshaller.marshall(createBotAliasRequest.getConversationLogSettings(), CONVERSATIONLOGSETTINGS_BINDING);
            protocolMarshaller.marshall(createBotAliasRequest.getSentimentAnalysisSettings(), SENTIMENTANALYSISSETTINGS_BINDING);
            protocolMarshaller.marshall(createBotAliasRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(createBotAliasRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
