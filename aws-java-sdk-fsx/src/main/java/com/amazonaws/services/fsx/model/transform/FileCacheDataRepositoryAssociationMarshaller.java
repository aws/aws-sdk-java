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
package com.amazonaws.services.fsx.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FileCacheDataRepositoryAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FileCacheDataRepositoryAssociationMarshaller {

    private static final MarshallingInfo<String> FILECACHEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileCachePath").build();
    private static final MarshallingInfo<String> DATAREPOSITORYPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRepositoryPath").build();
    private static final MarshallingInfo<List> DATAREPOSITORYSUBDIRECTORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRepositorySubdirectories").build();
    private static final MarshallingInfo<StructuredPojo> NFS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NFS").build();

    private static final FileCacheDataRepositoryAssociationMarshaller instance = new FileCacheDataRepositoryAssociationMarshaller();

    public static FileCacheDataRepositoryAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FileCacheDataRepositoryAssociation fileCacheDataRepositoryAssociation, ProtocolMarshaller protocolMarshaller) {

        if (fileCacheDataRepositoryAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fileCacheDataRepositoryAssociation.getFileCachePath(), FILECACHEPATH_BINDING);
            protocolMarshaller.marshall(fileCacheDataRepositoryAssociation.getDataRepositoryPath(), DATAREPOSITORYPATH_BINDING);
            protocolMarshaller.marshall(fileCacheDataRepositoryAssociation.getDataRepositorySubdirectories(), DATAREPOSITORYSUBDIRECTORIES_BINDING);
            protocolMarshaller.marshall(fileCacheDataRepositoryAssociation.getNFS(), NFS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
