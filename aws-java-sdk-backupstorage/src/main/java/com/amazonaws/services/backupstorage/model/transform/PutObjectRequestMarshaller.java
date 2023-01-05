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
 * PutObjectRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutObjectRequestMarshaller {

    private static final MarshallingInfo<String> BACKUPJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> OBJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("objectName").build();
    private static final MarshallingInfo<String> METADATASTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("metadata-string").build();
    private static final MarshallingInfo<java.io.InputStream> INLINECHUNK_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<Long> INLINECHUNKLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("length").build();
    private static final MarshallingInfo<String> INLINECHUNKCHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("checksum").build();
    private static final MarshallingInfo<String> INLINECHUNKCHECKSUMALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("checksum-algorithm").build();
    private static final MarshallingInfo<String> OBJECTCHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("object-checksum").build();
    private static final MarshallingInfo<String> OBJECTCHECKSUMALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("object-checksum-algorithm").build();
    private static final MarshallingInfo<Boolean> THROWONDUPLICATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("throwOnDuplicate").build();

    private static final PutObjectRequestMarshaller instance = new PutObjectRequestMarshaller();

    public static PutObjectRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutObjectRequest putObjectRequest, ProtocolMarshaller protocolMarshaller) {

        if (putObjectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putObjectRequest.getBackupJobId(), BACKUPJOBID_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getObjectName(), OBJECTNAME_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getMetadataString(), METADATASTRING_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getInlineChunk(), INLINECHUNK_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getInlineChunkLength(), INLINECHUNKLENGTH_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getInlineChunkChecksum(), INLINECHUNKCHECKSUM_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getInlineChunkChecksumAlgorithm(), INLINECHUNKCHECKSUMALGORITHM_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getObjectChecksum(), OBJECTCHECKSUM_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getObjectChecksumAlgorithm(), OBJECTCHECKSUMALGORITHM_BINDING);
            protocolMarshaller.marshall(putObjectRequest.getThrowOnDuplicate(), THROWONDUPLICATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
