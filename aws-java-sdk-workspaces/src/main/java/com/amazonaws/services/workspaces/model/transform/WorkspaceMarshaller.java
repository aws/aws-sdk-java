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
 * WorkspaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkspaceMarshaller {

    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkspaceId").build();
    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserName").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpAddress").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> BUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BundleId").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCode").build();
    private static final MarshallingInfo<String> COMPUTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputerName").build();
    private static final MarshallingInfo<String> VOLUMEENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeEncryptionKey").build();
    private static final MarshallingInfo<Boolean> USERVOLUMEENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserVolumeEncryptionEnabled").build();
    private static final MarshallingInfo<Boolean> ROOTVOLUMEENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootVolumeEncryptionEnabled").build();
    private static final MarshallingInfo<StructuredPojo> WORKSPACEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkspaceProperties").build();
    private static final MarshallingInfo<List> MODIFICATIONSTATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModificationStates").build();

    private static final WorkspaceMarshaller instance = new WorkspaceMarshaller();

    public static WorkspaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Workspace workspace, ProtocolMarshaller protocolMarshaller) {

        if (workspace == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workspace.getWorkspaceId(), WORKSPACEID_BINDING);
            protocolMarshaller.marshall(workspace.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(workspace.getUserName(), USERNAME_BINDING);
            protocolMarshaller.marshall(workspace.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(workspace.getState(), STATE_BINDING);
            protocolMarshaller.marshall(workspace.getBundleId(), BUNDLEID_BINDING);
            protocolMarshaller.marshall(workspace.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(workspace.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(workspace.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(workspace.getComputerName(), COMPUTERNAME_BINDING);
            protocolMarshaller.marshall(workspace.getVolumeEncryptionKey(), VOLUMEENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(workspace.getUserVolumeEncryptionEnabled(), USERVOLUMEENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(workspace.getRootVolumeEncryptionEnabled(), ROOTVOLUMEENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(workspace.getWorkspaceProperties(), WORKSPACEPROPERTIES_BINDING);
            protocolMarshaller.marshall(workspace.getModificationStates(), MODIFICATIONSTATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
