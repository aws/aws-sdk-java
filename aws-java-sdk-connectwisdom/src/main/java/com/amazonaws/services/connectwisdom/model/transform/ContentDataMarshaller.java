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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContentDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContentDataMarshaller {

    private static final MarshallingInfo<String> CONTENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentArn").build();
    private static final MarshallingInfo<String> CONTENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("contentId").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentType").build();
    private static final MarshallingInfo<String> KNOWLEDGEBASEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("knowledgeBaseArn").build();
    private static final MarshallingInfo<String> KNOWLEDGEBASEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("knowledgeBaseId").build();
    private static final MarshallingInfo<String> LINKOUTURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("linkOutUri").build();
    private static final MarshallingInfo<Map> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metadata").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revisionId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("title").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("url").build();
    private static final MarshallingInfo<java.util.Date> URLEXPIRY_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("urlExpiry").timestampFormat("unixTimestamp").build();

    private static final ContentDataMarshaller instance = new ContentDataMarshaller();

    public static ContentDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContentData contentData, ProtocolMarshaller protocolMarshaller) {

        if (contentData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(contentData.getContentArn(), CONTENTARN_BINDING);
            protocolMarshaller.marshall(contentData.getContentId(), CONTENTID_BINDING);
            protocolMarshaller.marshall(contentData.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(contentData.getKnowledgeBaseArn(), KNOWLEDGEBASEARN_BINDING);
            protocolMarshaller.marshall(contentData.getKnowledgeBaseId(), KNOWLEDGEBASEID_BINDING);
            protocolMarshaller.marshall(contentData.getLinkOutUri(), LINKOUTURI_BINDING);
            protocolMarshaller.marshall(contentData.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(contentData.getName(), NAME_BINDING);
            protocolMarshaller.marshall(contentData.getRevisionId(), REVISIONID_BINDING);
            protocolMarshaller.marshall(contentData.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(contentData.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(contentData.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(contentData.getUrl(), URL_BINDING);
            protocolMarshaller.marshall(contentData.getUrlExpiry(), URLEXPIRY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
