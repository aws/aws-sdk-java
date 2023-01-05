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
 * NotifyObjectCompleteRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NotifyObjectCompleteRequestMarshaller {

    private static final MarshallingInfo<String> BACKUPJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> UPLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("uploadId").build();
    private static final MarshallingInfo<String> OBJECTCHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("checksum").build();
    private static final MarshallingInfo<String> OBJECTCHECKSUMALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("checksum-algorithm").build();
    private static final MarshallingInfo<String> METADATASTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("metadata-string").build();
    private static final MarshallingInfo<java.io.InputStream> METADATABLOB_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<Long> METADATABLOBLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("metadata-blob-length").build();
    private static final MarshallingInfo<String> METADATABLOBCHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("metadata-checksum").build();
    private static final MarshallingInfo<String> METADATABLOBCHECKSUMALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("metadata-checksum-algorithm").build();

    private static final NotifyObjectCompleteRequestMarshaller instance = new NotifyObjectCompleteRequestMarshaller();

    public static NotifyObjectCompleteRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NotifyObjectCompleteRequest notifyObjectCompleteRequest, ProtocolMarshaller protocolMarshaller) {

        if (notifyObjectCompleteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getBackupJobId(), BACKUPJOBID_BINDING);
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getUploadId(), UPLOADID_BINDING);
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getObjectChecksum(), OBJECTCHECKSUM_BINDING);
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getObjectChecksumAlgorithm(), OBJECTCHECKSUMALGORITHM_BINDING);
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getMetadataString(), METADATASTRING_BINDING);
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getMetadataBlob(), METADATABLOB_BINDING);
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getMetadataBlobLength(), METADATABLOBLENGTH_BINDING);
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getMetadataBlobChecksum(), METADATABLOBCHECKSUM_BINDING);
            protocolMarshaller.marshall(notifyObjectCompleteRequest.getMetadataBlobChecksumAlgorithm(), METADATABLOBCHECKSUMALGORITHM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
