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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportHubContentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportHubContentRequestMarshaller {

    private static final MarshallingInfo<String> HUBCONTENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentName").build();
    private static final MarshallingInfo<String> HUBCONTENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentVersion").build();
    private static final MarshallingInfo<String> HUBCONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentType").build();
    private static final MarshallingInfo<String> DOCUMENTSCHEMAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentSchemaVersion").build();
    private static final MarshallingInfo<String> HUBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HubName").build();
    private static final MarshallingInfo<String> HUBCONTENTDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentDisplayName").build();
    private static final MarshallingInfo<String> HUBCONTENTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentDescription").build();
    private static final MarshallingInfo<String> HUBCONTENTMARKDOWN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentMarkdown").build();
    private static final MarshallingInfo<String> HUBCONTENTDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentDocument").build();
    private static final MarshallingInfo<List> HUBCONTENTSEARCHKEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentSearchKeywords").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final ImportHubContentRequestMarshaller instance = new ImportHubContentRequestMarshaller();

    public static ImportHubContentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportHubContentRequest importHubContentRequest, ProtocolMarshaller protocolMarshaller) {

        if (importHubContentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importHubContentRequest.getHubContentName(), HUBCONTENTNAME_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getHubContentVersion(), HUBCONTENTVERSION_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getHubContentType(), HUBCONTENTTYPE_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getDocumentSchemaVersion(), DOCUMENTSCHEMAVERSION_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getHubName(), HUBNAME_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getHubContentDisplayName(), HUBCONTENTDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getHubContentDescription(), HUBCONTENTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getHubContentMarkdown(), HUBCONTENTMARKDOWN_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getHubContentDocument(), HUBCONTENTDOCUMENT_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getHubContentSearchKeywords(), HUBCONTENTSEARCHKEYWORDS_BINDING);
            protocolMarshaller.marshall(importHubContentRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
