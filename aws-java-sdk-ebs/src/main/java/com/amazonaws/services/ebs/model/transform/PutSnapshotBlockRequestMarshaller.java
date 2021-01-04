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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ebs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutSnapshotBlockRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutSnapshotBlockRequestMarshaller {

    private static final MarshallingInfo<String> SNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("snapshotId").build();
    private static final MarshallingInfo<Integer> BLOCKINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("blockIndex").build();
    private static final MarshallingInfo<java.io.InputStream> BLOCKDATA_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<Integer> DATALENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-Data-Length").build();
    private static final MarshallingInfo<Integer> PROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("x-amz-Progress").build();
    private static final MarshallingInfo<String> CHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("x-amz-Checksum").build();
    private static final MarshallingInfo<String> CHECKSUMALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-Checksum-Algorithm").build();

    private static final PutSnapshotBlockRequestMarshaller instance = new PutSnapshotBlockRequestMarshaller();

    public static PutSnapshotBlockRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutSnapshotBlockRequest putSnapshotBlockRequest, ProtocolMarshaller protocolMarshaller) {

        if (putSnapshotBlockRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putSnapshotBlockRequest.getSnapshotId(), SNAPSHOTID_BINDING);
            protocolMarshaller.marshall(putSnapshotBlockRequest.getBlockIndex(), BLOCKINDEX_BINDING);
            protocolMarshaller.marshall(putSnapshotBlockRequest.getBlockData(), BLOCKDATA_BINDING);
            protocolMarshaller.marshall(putSnapshotBlockRequest.getDataLength(), DATALENGTH_BINDING);
            protocolMarshaller.marshall(putSnapshotBlockRequest.getProgress(), PROGRESS_BINDING);
            protocolMarshaller.marshall(putSnapshotBlockRequest.getChecksum(), CHECKSUM_BINDING);
            protocolMarshaller.marshall(putSnapshotBlockRequest.getChecksumAlgorithm(), CHECKSUMALGORITHM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
