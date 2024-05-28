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
package com.amazonaws.services.connect.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartAttachedFileUploadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartAttachedFileUploadRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> FILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FileName").build();
    private static final MarshallingInfo<Long> FILESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSizeInBytes").build();
    private static final MarshallingInfo<Integer> URLEXPIRYINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UrlExpiryInSeconds").build();
    private static final MarshallingInfo<String> FILEUSECASETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileUseCaseType").build();
    private static final MarshallingInfo<String> ASSOCIATEDRESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("associatedResourceArn").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final StartAttachedFileUploadRequestMarshaller instance = new StartAttachedFileUploadRequestMarshaller();

    public static StartAttachedFileUploadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartAttachedFileUploadRequest startAttachedFileUploadRequest, ProtocolMarshaller protocolMarshaller) {

        if (startAttachedFileUploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getFileName(), FILENAME_BINDING);
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getFileSizeInBytes(), FILESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getUrlExpiryInSeconds(), URLEXPIRYINSECONDS_BINDING);
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getFileUseCaseType(), FILEUSECASETYPE_BINDING);
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getAssociatedResourceArn(), ASSOCIATEDRESOURCEARN_BINDING);
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(startAttachedFileUploadRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
