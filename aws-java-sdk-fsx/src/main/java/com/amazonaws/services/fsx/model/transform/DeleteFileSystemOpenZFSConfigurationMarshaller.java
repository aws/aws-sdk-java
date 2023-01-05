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
 * DeleteFileSystemOpenZFSConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteFileSystemOpenZFSConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> SKIPFINALBACKUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkipFinalBackup").build();
    private static final MarshallingInfo<List> FINALBACKUPTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinalBackupTags").build();
    private static final MarshallingInfo<List> OPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Options").build();

    private static final DeleteFileSystemOpenZFSConfigurationMarshaller instance = new DeleteFileSystemOpenZFSConfigurationMarshaller();

    public static DeleteFileSystemOpenZFSConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteFileSystemOpenZFSConfiguration deleteFileSystemOpenZFSConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (deleteFileSystemOpenZFSConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteFileSystemOpenZFSConfiguration.getSkipFinalBackup(), SKIPFINALBACKUP_BINDING);
            protocolMarshaller.marshall(deleteFileSystemOpenZFSConfiguration.getFinalBackupTags(), FINALBACKUPTAGS_BINDING);
            protocolMarshaller.marshall(deleteFileSystemOpenZFSConfiguration.getOptions(), OPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
