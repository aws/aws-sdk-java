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
 * WorkspaceDirectoryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkspaceDirectoryMarshaller {

    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Alias").build();
    private static final MarshallingInfo<String> DIRECTORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryName").build();
    private static final MarshallingInfo<String> REGISTRATIONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationCode").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetIds").build();
    private static final MarshallingInfo<List> DNSIPADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DnsIpAddresses").build();
    private static final MarshallingInfo<String> CUSTOMERUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerUserName").build();
    private static final MarshallingInfo<String> IAMROLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IamRoleId").build();
    private static final MarshallingInfo<String> DIRECTORYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryType").build();
    private static final MarshallingInfo<String> WORKSPACESECURITYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkspaceSecurityGroupId").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<StructuredPojo> WORKSPACECREATIONPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkspaceCreationProperties").build();
    private static final MarshallingInfo<List> IPGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipGroupIds").build();

    private static final WorkspaceDirectoryMarshaller instance = new WorkspaceDirectoryMarshaller();

    public static WorkspaceDirectoryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkspaceDirectory workspaceDirectory, ProtocolMarshaller protocolMarshaller) {

        if (workspaceDirectory == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workspaceDirectory.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getDirectoryName(), DIRECTORYNAME_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getRegistrationCode(), REGISTRATIONCODE_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getDnsIpAddresses(), DNSIPADDRESSES_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getCustomerUserName(), CUSTOMERUSERNAME_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getIamRoleId(), IAMROLEID_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getDirectoryType(), DIRECTORYTYPE_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getWorkspaceSecurityGroupId(), WORKSPACESECURITYGROUPID_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getState(), STATE_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getWorkspaceCreationProperties(), WORKSPACECREATIONPROPERTIES_BINDING);
            protocolMarshaller.marshall(workspaceDirectory.getIpGroupIds(), IPGROUPIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
