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
package com.amazonaws.services.connectwisdom.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectwisdom.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateQuickResponseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateQuickResponseRequestMarshaller {

    private static final MarshallingInfo<List> CHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("channels").build();
    private static final MarshallingInfo<StructuredPojo> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("content").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentType").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> GROUPINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("groupingConfiguration").build();
    private static final MarshallingInfo<Boolean> ISACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isActive").build();
    private static final MarshallingInfo<String> KNOWLEDGEBASEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("knowledgeBaseId").build();
    private static final MarshallingInfo<String> LANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("language").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> QUICKRESPONSEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("quickResponseId").build();
    private static final MarshallingInfo<Boolean> REMOVEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeDescription").build();
    private static final MarshallingInfo<Boolean> REMOVEGROUPINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeGroupingConfiguration").build();
    private static final MarshallingInfo<Boolean> REMOVESHORTCUTKEY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeShortcutKey").build();
    private static final MarshallingInfo<String> SHORTCUTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shortcutKey").build();

    private static final UpdateQuickResponseRequestMarshaller instance = new UpdateQuickResponseRequestMarshaller();

    public static UpdateQuickResponseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateQuickResponseRequest updateQuickResponseRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateQuickResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateQuickResponseRequest.getChannels(), CHANNELS_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getGroupingConfiguration(), GROUPINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getIsActive(), ISACTIVE_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getKnowledgeBaseId(), KNOWLEDGEBASEID_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getLanguage(), LANGUAGE_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getQuickResponseId(), QUICKRESPONSEID_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getRemoveDescription(), REMOVEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getRemoveGroupingConfiguration(), REMOVEGROUPINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getRemoveShortcutKey(), REMOVESHORTCUTKEY_BINDING);
            protocolMarshaller.marshall(updateQuickResponseRequest.getShortcutKey(), SHORTCUTKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
