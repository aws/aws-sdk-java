/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * InitiateDocumentVersionUploadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InitiateDocumentVersionUploadRequestMarshaller {

    private static final MarshallingInfo<String> AUTHENTICATIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("Authentication").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<java.util.Date> CONTENTCREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentCreatedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CONTENTMODIFIEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentModifiedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentType").build();
    private static final MarshallingInfo<Long> DOCUMENTSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentSizeInBytes").build();
    private static final MarshallingInfo<String> PARENTFOLDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentFolderId").build();

    private static final InitiateDocumentVersionUploadRequestMarshaller instance = new InitiateDocumentVersionUploadRequestMarshaller();

    public static InitiateDocumentVersionUploadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InitiateDocumentVersionUploadRequest initiateDocumentVersionUploadRequest, ProtocolMarshaller protocolMarshaller) {

        if (initiateDocumentVersionUploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(initiateDocumentVersionUploadRequest.getAuthenticationToken(), AUTHENTICATIONTOKEN_BINDING);
            protocolMarshaller.marshall(initiateDocumentVersionUploadRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(initiateDocumentVersionUploadRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(initiateDocumentVersionUploadRequest.getContentCreatedTimestamp(), CONTENTCREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(initiateDocumentVersionUploadRequest.getContentModifiedTimestamp(), CONTENTMODIFIEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(initiateDocumentVersionUploadRequest.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(initiateDocumentVersionUploadRequest.getDocumentSizeInBytes(), DOCUMENTSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(initiateDocumentVersionUploadRequest.getParentFolderId(), PARENTFOLDERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
