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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FileSystemDataSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FileSystemDataSourceMarshaller {

    private static final MarshallingInfo<String> FILESYSTEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemId").build();
    private static final MarshallingInfo<String> FILESYSTEMACCESSMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemAccessMode").build();
    private static final MarshallingInfo<String> FILESYSTEMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemType").build();
    private static final MarshallingInfo<String> DIRECTORYPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryPath").build();

    private static final FileSystemDataSourceMarshaller instance = new FileSystemDataSourceMarshaller();

    public static FileSystemDataSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FileSystemDataSource fileSystemDataSource, ProtocolMarshaller protocolMarshaller) {

        if (fileSystemDataSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fileSystemDataSource.getFileSystemId(), FILESYSTEMID_BINDING);
            protocolMarshaller.marshall(fileSystemDataSource.getFileSystemAccessMode(), FILESYSTEMACCESSMODE_BINDING);
            protocolMarshaller.marshall(fileSystemDataSource.getFileSystemType(), FILESYSTEMTYPE_BINDING);
            protocolMarshaller.marshall(fileSystemDataSource.getDirectoryPath(), DIRECTORYPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
