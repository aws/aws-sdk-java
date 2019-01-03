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
package com.amazonaws.services.workspaces.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkspaceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkspaceRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserName").build();
    private static final MarshallingInfo<String> BUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BundleId").build();
    private static final MarshallingInfo<String> VOLUMEENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeEncryptionKey").build();
    private static final MarshallingInfo<Boolean> USERVOLUMEENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserVolumeEncryptionEnabled").build();
    private static final MarshallingInfo<Boolean> ROOTVOLUMEENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootVolumeEncryptionEnabled").build();
    private static final MarshallingInfo<StructuredPojo> WORKSPACEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkspaceProperties").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final WorkspaceRequestMarshaller instance = new WorkspaceRequestMarshaller();

    public static WorkspaceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkspaceRequest workspaceRequest, ProtocolMarshaller protocolMarshaller) {

        if (workspaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workspaceRequest.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(workspaceRequest.getUserName(), USERNAME_BINDING);
            protocolMarshaller.marshall(workspaceRequest.getBundleId(), BUNDLEID_BINDING);
            protocolMarshaller.marshall(workspaceRequest.getVolumeEncryptionKey(), VOLUMEENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(workspaceRequest.getUserVolumeEncryptionEnabled(), USERVOLUMEENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(workspaceRequest.getRootVolumeEncryptionEnabled(), ROOTVOLUMEENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(workspaceRequest.getWorkspaceProperties(), WORKSPACEPROPERTIES_BINDING);
            protocolMarshaller.marshall(workspaceRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
