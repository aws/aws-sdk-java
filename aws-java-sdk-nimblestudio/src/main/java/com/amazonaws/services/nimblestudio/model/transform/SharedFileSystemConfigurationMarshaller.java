/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SharedFileSystemConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SharedFileSystemConfigurationMarshaller {

    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endpoint").build();
    private static final MarshallingInfo<String> FILESYSTEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSystemId").build();
    private static final MarshallingInfo<String> LINUXMOUNTPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("linuxMountPoint").build();
    private static final MarshallingInfo<String> SHARENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("shareName").build();
    private static final MarshallingInfo<String> WINDOWSMOUNTDRIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("windowsMountDrive").build();

    private static final SharedFileSystemConfigurationMarshaller instance = new SharedFileSystemConfigurationMarshaller();

    public static SharedFileSystemConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SharedFileSystemConfiguration sharedFileSystemConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sharedFileSystemConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sharedFileSystemConfiguration.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(sharedFileSystemConfiguration.getFileSystemId(), FILESYSTEMID_BINDING);
            protocolMarshaller.marshall(sharedFileSystemConfiguration.getLinuxMountPoint(), LINUXMOUNTPOINT_BINDING);
            protocolMarshaller.marshall(sharedFileSystemConfiguration.getShareName(), SHARENAME_BINDING);
            protocolMarshaller.marshall(sharedFileSystemConfiguration.getWindowsMountDrive(), WINDOWSMOUNTDRIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
