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
package com.amazonaws.services.backupstorage.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backupstorage.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutChunkRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutChunkRequestMarshaller {

    private static final MarshallingInfo<String> BACKUPJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> UPLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("uploadId").build();
    private static final MarshallingInfo<Long> CHUNKINDEX_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("chunkIndex").build();
    private static final MarshallingInfo<java.io.InputStream> DATA_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<Long> LENGTH_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("length").build();
    private static final MarshallingInfo<String> CHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("checksum").build();
    private static final MarshallingInfo<String> CHECKSUMALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("checksum-algorithm").build();

    private static final PutChunkRequestMarshaller instance = new PutChunkRequestMarshaller();

    public static PutChunkRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutChunkRequest putChunkRequest, ProtocolMarshaller protocolMarshaller) {

        if (putChunkRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putChunkRequest.getBackupJobId(), BACKUPJOBID_BINDING);
            protocolMarshaller.marshall(putChunkRequest.getUploadId(), UPLOADID_BINDING);
            protocolMarshaller.marshall(putChunkRequest.getChunkIndex(), CHUNKINDEX_BINDING);
            protocolMarshaller.marshall(putChunkRequest.getData(), DATA_BINDING);
            protocolMarshaller.marshall(putChunkRequest.getLength(), LENGTH_BINDING);
            protocolMarshaller.marshall(putChunkRequest.getChecksum(), CHECKSUM_BINDING);
            protocolMarshaller.marshall(putChunkRequest.getChecksumAlgorithm(), CHECKSUMALGORITHM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
