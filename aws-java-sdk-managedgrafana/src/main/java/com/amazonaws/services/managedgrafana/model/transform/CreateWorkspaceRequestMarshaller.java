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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedgrafana.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateWorkspaceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateWorkspaceRequestMarshaller {

    private static final MarshallingInfo<String> ACCOUNTACCESSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountAccessType").build();
    private static final MarshallingInfo<List> AUTHENTICATIONPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authenticationProviders").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.JSON_VALUE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<String> ORGANIZATIONROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("organizationRoleName").build();
    private static final MarshallingInfo<String> PERMISSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permissionType").build();
    private static final MarshallingInfo<String> STACKSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stackSetName").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfiguration").build();
    private static final MarshallingInfo<List> WORKSPACEDATASOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceDataSources").build();
    private static final MarshallingInfo<String> WORKSPACEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceDescription").build();
    private static final MarshallingInfo<String> WORKSPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceName").build();
    private static final MarshallingInfo<List> WORKSPACENOTIFICATIONDESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceNotificationDestinations").build();
    private static final MarshallingInfo<List> WORKSPACEORGANIZATIONALUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceOrganizationalUnits").build();
    private static final MarshallingInfo<String> WORKSPACEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceRoleArn").build();

    private static final CreateWorkspaceRequestMarshaller instance = new CreateWorkspaceRequestMarshaller();

    public static CreateWorkspaceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateWorkspaceRequest createWorkspaceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createWorkspaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createWorkspaceRequest.getAccountAccessType(), ACCOUNTACCESSTYPE_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getAuthenticationProviders(), AUTHENTICATIONPROVIDERS_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getOrganizationRoleName(), ORGANIZATIONROLENAME_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getPermissionType(), PERMISSIONTYPE_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getStackSetName(), STACKSETNAME_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getWorkspaceDataSources(), WORKSPACEDATASOURCES_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getWorkspaceDescription(), WORKSPACEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getWorkspaceName(), WORKSPACENAME_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getWorkspaceNotificationDestinations(), WORKSPACENOTIFICATIONDESTINATIONS_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getWorkspaceOrganizationalUnits(), WORKSPACEORGANIZATIONALUNITS_BINDING);
            protocolMarshaller.marshall(createWorkspaceRequest.getWorkspaceRoleArn(), WORKSPACEROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
