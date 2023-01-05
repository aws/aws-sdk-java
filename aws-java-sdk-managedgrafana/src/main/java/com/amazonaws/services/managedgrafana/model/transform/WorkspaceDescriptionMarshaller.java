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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkspaceDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkspaceDescriptionMarshaller {

    private static final MarshallingInfo<String> ACCOUNTACCESSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountAccessType").build();
    private static final MarshallingInfo<StructuredPojo> AUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authentication").build();
    private static final MarshallingInfo<java.util.Date> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("created").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> DATASOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataSources").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endpoint").build();
    private static final MarshallingInfo<Boolean> FREETRIALCONSUMED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("freeTrialConsumed").build();
    private static final MarshallingInfo<java.util.Date> FREETRIALEXPIRATION_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("freeTrialExpiration").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> GRAFANAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("grafanaVersion").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<java.util.Date> LICENSEEXPIRATION_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseExpiration").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LICENSETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseType").build();
    private static final MarshallingInfo<java.util.Date> MODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modified").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<List> NOTIFICATIONDESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notificationDestinations").build();
    private static final MarshallingInfo<String> ORGANIZATIONROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("organizationRoleName").build();
    private static final MarshallingInfo<List> ORGANIZATIONALUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("organizationalUnits").build();
    private static final MarshallingInfo<String> PERMISSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permissionType").build();
    private static final MarshallingInfo<String> STACKSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stackSetName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfiguration").build();
    private static final MarshallingInfo<String> WORKSPACEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceRoleArn").build();

    private static final WorkspaceDescriptionMarshaller instance = new WorkspaceDescriptionMarshaller();

    public static WorkspaceDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkspaceDescription workspaceDescription, ProtocolMarshaller protocolMarshaller) {

        if (workspaceDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workspaceDescription.getAccountAccessType(), ACCOUNTACCESSTYPE_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getAuthentication(), AUTHENTICATION_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getDataSources(), DATASOURCES_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getFreeTrialConsumed(), FREETRIALCONSUMED_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getFreeTrialExpiration(), FREETRIALEXPIRATION_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getGrafanaVersion(), GRAFANAVERSION_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getId(), ID_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getLicenseExpiration(), LICENSEEXPIRATION_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getLicenseType(), LICENSETYPE_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getModified(), MODIFIED_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getNotificationDestinations(), NOTIFICATIONDESTINATIONS_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getOrganizationRoleName(), ORGANIZATIONROLENAME_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getOrganizationalUnits(), ORGANIZATIONALUNITS_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getPermissionType(), PERMISSIONTYPE_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getStackSetName(), STACKSETNAME_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(workspaceDescription.getWorkspaceRoleArn(), WORKSPACEROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
