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
package com.amazonaws.services.workdocs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workdocs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResponseItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResponseItemMarshaller {

    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> WEBURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WebUrl").build();
    private static final MarshallingInfo<StructuredPojo> DOCUMENTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentMetadata").build();
    private static final MarshallingInfo<StructuredPojo> FOLDERMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FolderMetadata").build();
    private static final MarshallingInfo<StructuredPojo> COMMENTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CommentMetadata").build();
    private static final MarshallingInfo<StructuredPojo> DOCUMENTVERSIONMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersionMetadata").build();

    private static final ResponseItemMarshaller instance = new ResponseItemMarshaller();

    public static ResponseItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResponseItem responseItem, ProtocolMarshaller protocolMarshaller) {

        if (responseItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(responseItem.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(responseItem.getWebUrl(), WEBURL_BINDING);
            protocolMarshaller.marshall(responseItem.getDocumentMetadata(), DOCUMENTMETADATA_BINDING);
            protocolMarshaller.marshall(responseItem.getFolderMetadata(), FOLDERMETADATA_BINDING);
            protocolMarshaller.marshall(responseItem.getCommentMetadata(), COMMENTMETADATA_BINDING);
            protocolMarshaller.marshall(responseItem.getDocumentVersionMetadata(), DOCUMENTVERSIONMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
