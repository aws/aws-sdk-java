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
package com.amazonaws.services.elasticfilesystem.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticfilesystem.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FileSystemDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FileSystemDescriptionMarshaller {

    private static final MarshallingInfo<String> OWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerId").build();
    private static final MarshallingInfo<String> CREATIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationToken").build();
    private static final MarshallingInfo<String> FILESYSTEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LIFECYCLESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifeCycleState").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Integer> NUMBEROFMOUNTTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfMountTargets").build();
    private static final MarshallingInfo<StructuredPojo> SIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeInBytes").build();
    private static final MarshallingInfo<String> PERFORMANCEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PerformanceMode").build();
    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encrypted").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> THROUGHPUTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputMode").build();
    private static final MarshallingInfo<Double> PROVISIONEDTHROUGHPUTINMIBPS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedThroughputInMibps").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final FileSystemDescriptionMarshaller instance = new FileSystemDescriptionMarshaller();

    public static FileSystemDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FileSystemDescription fileSystemDescription, ProtocolMarshaller protocolMarshaller) {

        if (fileSystemDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fileSystemDescription.getOwnerId(), OWNERID_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getCreationToken(), CREATIONTOKEN_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getFileSystemId(), FILESYSTEMID_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getLifeCycleState(), LIFECYCLESTATE_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getNumberOfMountTargets(), NUMBEROFMOUNTTARGETS_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getSizeInBytes(), SIZEINBYTES_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getPerformanceMode(), PERFORMANCEMODE_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getThroughputMode(), THROUGHPUTMODE_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getProvisionedThroughputInMibps(), PROVISIONEDTHROUGHPUTINMIBPS_BINDING);
            protocolMarshaller.marshall(fileSystemDescription.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
