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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StudioMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StudioMarshaller {

    private static final MarshallingInfo<String> STUDIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StudioId").build();
    private static final MarshallingInfo<String> STUDIOARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StudioArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> AUTHMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthMode").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetIds").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<String> USERROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserRole").build();
    private static final MarshallingInfo<String> WORKSPACESECURITYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkspaceSecurityGroupId").build();
    private static final MarshallingInfo<String> ENGINESECURITYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineSecurityGroupId").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Url").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DEFAULTS3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultS3Location").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final StudioMarshaller instance = new StudioMarshaller();

    public static StudioMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Studio studio, ProtocolMarshaller protocolMarshaller) {

        if (studio == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(studio.getStudioId(), STUDIOID_BINDING);
            protocolMarshaller.marshall(studio.getStudioArn(), STUDIOARN_BINDING);
            protocolMarshaller.marshall(studio.getName(), NAME_BINDING);
            protocolMarshaller.marshall(studio.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(studio.getAuthMode(), AUTHMODE_BINDING);
            protocolMarshaller.marshall(studio.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(studio.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(studio.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(studio.getUserRole(), USERROLE_BINDING);
            protocolMarshaller.marshall(studio.getWorkspaceSecurityGroupId(), WORKSPACESECURITYGROUPID_BINDING);
            protocolMarshaller.marshall(studio.getEngineSecurityGroupId(), ENGINESECURITYGROUPID_BINDING);
            protocolMarshaller.marshall(studio.getUrl(), URL_BINDING);
            protocolMarshaller.marshall(studio.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(studio.getDefaultS3Location(), DEFAULTS3LOCATION_BINDING);
            protocolMarshaller.marshall(studio.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
