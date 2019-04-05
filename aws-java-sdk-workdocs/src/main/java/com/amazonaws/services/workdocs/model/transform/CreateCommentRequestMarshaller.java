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
 * CreateCommentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCommentRequestMarshaller {

    private static final MarshallingInfo<String> AUTHENTICATIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("Authentication").build();
    private static final MarshallingInfo<String> DOCUMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DocumentId").build();
    private static final MarshallingInfo<String> VERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("VersionId").build();
    private static final MarshallingInfo<String> PARENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ParentId").build();
    private static final MarshallingInfo<String> THREADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ThreadId").build();
    private static final MarshallingInfo<String> TEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Text").build();
    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Visibility").build();
    private static final MarshallingInfo<Boolean> NOTIFYCOLLABORATORS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotifyCollaborators").build();

    private static final CreateCommentRequestMarshaller instance = new CreateCommentRequestMarshaller();

    public static CreateCommentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCommentRequest createCommentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCommentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCommentRequest.getAuthenticationToken(), AUTHENTICATIONTOKEN_BINDING);
            protocolMarshaller.marshall(createCommentRequest.getDocumentId(), DOCUMENTID_BINDING);
            protocolMarshaller.marshall(createCommentRequest.getVersionId(), VERSIONID_BINDING);
            protocolMarshaller.marshall(createCommentRequest.getParentId(), PARENTID_BINDING);
            protocolMarshaller.marshall(createCommentRequest.getThreadId(), THREADID_BINDING);
            protocolMarshaller.marshall(createCommentRequest.getText(), TEXT_BINDING);
            protocolMarshaller.marshall(createCommentRequest.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(createCommentRequest.getNotifyCollaborators(), NOTIFYCOLLABORATORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
