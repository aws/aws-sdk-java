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
package com.amazonaws.services.ebs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ebs.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartSnapshotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartSnapshotRequestMarshaller {

    private static final MarshallingInfo<Long> VOLUMESIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VolumeSize").build();
    private static final MarshallingInfo<String> PARENTSNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentSnapshotId").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encrypted").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyArn").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();

    private static final StartSnapshotRequestMarshaller instance = new StartSnapshotRequestMarshaller();

    public static StartSnapshotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartSnapshotRequest startSnapshotRequest, ProtocolMarshaller protocolMarshaller) {

        if (startSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startSnapshotRequest.getVolumeSize(), VOLUMESIZE_BINDING);
            protocolMarshaller.marshall(startSnapshotRequest.getParentSnapshotId(), PARENTSNAPSHOTID_BINDING);
            protocolMarshaller.marshall(startSnapshotRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(startSnapshotRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(startSnapshotRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(startSnapshotRequest.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(startSnapshotRequest.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(startSnapshotRequest.getTimeout(), TIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
