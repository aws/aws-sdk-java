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
package com.amazonaws.services.managedgrafana.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedgrafana.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateWorkspaceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWorkspaceRequestMarshaller {

    private static final MarshallingInfo<String> ACCOUNTACCESSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountAccessType").build();
    private static final MarshallingInfo<String> ORGANIZATIONROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("organizationRoleName").build();
    private static final MarshallingInfo<String> PERMISSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permissionType").build();
    private static final MarshallingInfo<Boolean> REMOVEVPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeVpcConfiguration").build();
    private static final MarshallingInfo<String> STACKSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stackSetName").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfiguration").build();
    private static final MarshallingInfo<List> WORKSPACEDATASOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceDataSources").build();
    private static final MarshallingInfo<String> WORKSPACEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceDescription").build();
    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workspaceId").build();
    private static final MarshallingInfo<String> WORKSPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceName").build();
    private static final MarshallingInfo<List> WORKSPACENOTIFICATIONDESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceNotificationDestinations").build();
    private static final MarshallingInfo<List> WORKSPACEORGANIZATIONALUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceOrganizationalUnits").build();
    private static final MarshallingInfo<String> WORKSPACEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceRoleArn").build();

    private static final UpdateWorkspaceRequestMarshaller instance = new UpdateWorkspaceRequestMarshaller();

    public static UpdateWorkspaceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWorkspaceRequest updateWorkspaceRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateWorkspaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWorkspaceRequest.getAccountAccessType(), ACCOUNTACCESSTYPE_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getOrganizationRoleName(), ORGANIZATIONROLENAME_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getPermissionType(), PERMISSIONTYPE_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getRemoveVpcConfiguration(), REMOVEVPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getStackSetName(), STACKSETNAME_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getWorkspaceDataSources(), WORKSPACEDATASOURCES_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getWorkspaceDescription(), WORKSPACEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getWorkspaceId(), WORKSPACEID_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getWorkspaceName(), WORKSPACENAME_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getWorkspaceNotificationDestinations(), WORKSPACENOTIFICATIONDESTINATIONS_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getWorkspaceOrganizationalUnits(), WORKSPACEORGANIZATIONALUNITS_BINDING);
            protocolMarshaller.marshall(updateWorkspaceRequest.getWorkspaceRoleArn(), WORKSPACEROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
