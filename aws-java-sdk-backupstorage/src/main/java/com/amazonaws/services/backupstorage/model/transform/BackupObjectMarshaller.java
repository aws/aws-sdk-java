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
 * BackupObjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackupObjectMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Long> CHUNKSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ChunksCount").build();
    private static final MarshallingInfo<String> METADATASTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetadataString").build();
    private static final MarshallingInfo<String> OBJECTCHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectChecksum").build();
    private static final MarshallingInfo<String> OBJECTCHECKSUMALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectChecksumAlgorithm").build();
    private static final MarshallingInfo<String> OBJECTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectToken").build();

    private static final BackupObjectMarshaller instance = new BackupObjectMarshaller();

    public static BackupObjectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackupObject backupObject, ProtocolMarshaller protocolMarshaller) {

        if (backupObject == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backupObject.getName(), NAME_BINDING);
            protocolMarshaller.marshall(backupObject.getChunksCount(), CHUNKSCOUNT_BINDING);
            protocolMarshaller.marshall(backupObject.getMetadataString(), METADATASTRING_BINDING);
            protocolMarshaller.marshall(backupObject.getObjectChecksum(), OBJECTCHECKSUM_BINDING);
            protocolMarshaller.marshall(backupObject.getObjectChecksumAlgorithm(), OBJECTCHECKSUMALGORITHM_BINDING);
            protocolMarshaller.marshall(backupObject.getObjectToken(), OBJECTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
