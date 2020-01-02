/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConflictMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConflictMetadataMarshaller {

    private static final MarshallingInfo<String> FILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filePath").build();
    private static final MarshallingInfo<StructuredPojo> FILESIZES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSizes").build();
    private static final MarshallingInfo<StructuredPojo> FILEMODES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileModes").build();
    private static final MarshallingInfo<StructuredPojo> OBJECTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("objectTypes").build();
    private static final MarshallingInfo<Integer> NUMBEROFCONFLICTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfConflicts").build();
    private static final MarshallingInfo<StructuredPojo> ISBINARYFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isBinaryFile").build();
    private static final MarshallingInfo<Boolean> CONTENTCONFLICT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentConflict").build();
    private static final MarshallingInfo<Boolean> FILEMODECONFLICT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileModeConflict").build();
    private static final MarshallingInfo<Boolean> OBJECTTYPECONFLICT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("objectTypeConflict").build();
    private static final MarshallingInfo<StructuredPojo> MERGEOPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergeOperations").build();

    private static final ConflictMetadataMarshaller instance = new ConflictMetadataMarshaller();

    public static ConflictMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConflictMetadata conflictMetadata, ProtocolMarshaller protocolMarshaller) {

        if (conflictMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conflictMetadata.getFilePath(), FILEPATH_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getFileSizes(), FILESIZES_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getFileModes(), FILEMODES_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getObjectTypes(), OBJECTTYPES_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getNumberOfConflicts(), NUMBEROFCONFLICTS_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getIsBinaryFile(), ISBINARYFILE_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getContentConflict(), CONTENTCONFLICT_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getFileModeConflict(), FILEMODECONFLICT_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getObjectTypeConflict(), OBJECTTYPECONFLICT_BINDING);
            protocolMarshaller.marshall(conflictMetadata.getMergeOperations(), MERGEOPERATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
