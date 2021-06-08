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
package com.amazonaws.services.connectparticipant.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectparticipant.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartAttachmentUploadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartAttachmentUploadRequestMarshaller {

    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentType").build();
    private static final MarshallingInfo<Long> ATTACHMENTSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentSizeInBytes").build();
    private static final MarshallingInfo<String> ATTACHMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentName").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> CONNECTIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Bearer").build();

    private static final StartAttachmentUploadRequestMarshaller instance = new StartAttachmentUploadRequestMarshaller();

    public static StartAttachmentUploadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartAttachmentUploadRequest startAttachmentUploadRequest, ProtocolMarshaller protocolMarshaller) {

        if (startAttachmentUploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startAttachmentUploadRequest.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(startAttachmentUploadRequest.getAttachmentSizeInBytes(), ATTACHMENTSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(startAttachmentUploadRequest.getAttachmentName(), ATTACHMENTNAME_BINDING);
            protocolMarshaller.marshall(startAttachmentUploadRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(startAttachmentUploadRequest.getConnectionToken(), CONNECTIONTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
