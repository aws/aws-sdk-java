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
 * ChunkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChunkMarshaller {

    private static final MarshallingInfo<Long> INDEX_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Index").build();
    private static final MarshallingInfo<Long> LENGTH_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Length").build();
    private static final MarshallingInfo<String> CHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Checksum").build();
    private static final MarshallingInfo<String> CHECKSUMALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChecksumAlgorithm").build();
    private static final MarshallingInfo<String> CHUNKTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChunkToken").build();

    private static final ChunkMarshaller instance = new ChunkMarshaller();

    public static ChunkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Chunk chunk, ProtocolMarshaller protocolMarshaller) {

        if (chunk == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(chunk.getIndex(), INDEX_BINDING);
            protocolMarshaller.marshall(chunk.getLength(), LENGTH_BINDING);
            protocolMarshaller.marshall(chunk.getChecksum(), CHECKSUM_BINDING);
            protocolMarshaller.marshall(chunk.getChecksumAlgorithm(), CHECKSUMALGORITHM_BINDING);
            protocolMarshaller.marshall(chunk.getChunkToken(), CHUNKTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
