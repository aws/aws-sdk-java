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
package com.amazonaws.services.glacier.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InitiateMultipartUploadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InitiateMultipartUploadRequestMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("accountId").defaultValueSupplier(DefaultAccountIdSupplier.getInstance()).build();
    private static final MarshallingInfo<String> VAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("vaultName").build();
    private static final MarshallingInfo<String> ARCHIVEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-archive-description").build();
    private static final MarshallingInfo<String> PARTSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("x-amz-part-size").build();

    private static final InitiateMultipartUploadRequestMarshaller instance = new InitiateMultipartUploadRequestMarshaller();

    public static InitiateMultipartUploadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InitiateMultipartUploadRequest initiateMultipartUploadRequest, ProtocolMarshaller protocolMarshaller) {

        if (initiateMultipartUploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(initiateMultipartUploadRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(initiateMultipartUploadRequest.getVaultName(), VAULTNAME_BINDING);
            protocolMarshaller.marshall(initiateMultipartUploadRequest.getArchiveDescription(), ARCHIVEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(initiateMultipartUploadRequest.getPartSize(), PARTSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
