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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloneStackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloneStackRequestMarshaller {

    private static final MarshallingInfo<String> SOURCESTACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceStackId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRoleArn").build();
    private static final MarshallingInfo<String> DEFAULTINSTANCEPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultInstanceProfileArn").build();
    private static final MarshallingInfo<String> DEFAULTOS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DefaultOs").build();
    private static final MarshallingInfo<String> HOSTNAMETHEME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HostnameTheme").build();
    private static final MarshallingInfo<String> DEFAULTAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultAvailabilityZone").build();
    private static final MarshallingInfo<String> DEFAULTSUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSubnetId").build();
    private static final MarshallingInfo<String> CUSTOMJSON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomJson").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATIONMANAGER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationManager").build();
    private static final MarshallingInfo<StructuredPojo> CHEFCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChefConfiguration").build();
    private static final MarshallingInfo<Boolean> USECUSTOMCOOKBOOKS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseCustomCookbooks").build();
    private static final MarshallingInfo<Boolean> USEOPSWORKSSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseOpsworksSecurityGroups").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMCOOKBOOKSSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomCookbooksSource").build();
    private static final MarshallingInfo<String> DEFAULTSSHKEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSshKeyName").build();
    private static final MarshallingInfo<Boolean> CLONEPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClonePermissions").build();
    private static final MarshallingInfo<List> CLONEAPPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CloneAppIds").build();
    private static final MarshallingInfo<String> DEFAULTROOTDEVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRootDeviceType").build();
    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentVersion").build();

    private static final CloneStackRequestMarshaller instance = new CloneStackRequestMarshaller();

    public static CloneStackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloneStackRequest cloneStackRequest, ProtocolMarshaller protocolMarshaller) {

        if (cloneStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloneStackRequest.getSourceStackId(), SOURCESTACKID_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getDefaultInstanceProfileArn(), DEFAULTINSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getDefaultOs(), DEFAULTOS_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getHostnameTheme(), HOSTNAMETHEME_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getDefaultAvailabilityZone(), DEFAULTAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getDefaultSubnetId(), DEFAULTSUBNETID_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getCustomJson(), CUSTOMJSON_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getConfigurationManager(), CONFIGURATIONMANAGER_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getChefConfiguration(), CHEFCONFIGURATION_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getUseCustomCookbooks(), USECUSTOMCOOKBOOKS_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getUseOpsworksSecurityGroups(), USEOPSWORKSSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getCustomCookbooksSource(), CUSTOMCOOKBOOKSSOURCE_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getDefaultSshKeyName(), DEFAULTSSHKEYNAME_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getClonePermissions(), CLONEPERMISSIONS_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getCloneAppIds(), CLONEAPPIDS_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getDefaultRootDeviceType(), DEFAULTROOTDEVICETYPE_BINDING);
            protocolMarshaller.marshall(cloneStackRequest.getAgentVersion(), AGENTVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
