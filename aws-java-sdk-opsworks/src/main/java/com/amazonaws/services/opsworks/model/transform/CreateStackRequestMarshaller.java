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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateStackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateStackRequestMarshaller {

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
    private static final MarshallingInfo<String> DEFAULTROOTDEVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRootDeviceType").build();
    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentVersion").build();

    private static final CreateStackRequestMarshaller instance = new CreateStackRequestMarshaller();

    public static CreateStackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateStackRequest createStackRequest, ProtocolMarshaller protocolMarshaller) {

        if (createStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createStackRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createStackRequest.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(createStackRequest.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(createStackRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(createStackRequest.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(createStackRequest.getDefaultInstanceProfileArn(), DEFAULTINSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(createStackRequest.getDefaultOs(), DEFAULTOS_BINDING);
            protocolMarshaller.marshall(createStackRequest.getHostnameTheme(), HOSTNAMETHEME_BINDING);
            protocolMarshaller.marshall(createStackRequest.getDefaultAvailabilityZone(), DEFAULTAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(createStackRequest.getDefaultSubnetId(), DEFAULTSUBNETID_BINDING);
            protocolMarshaller.marshall(createStackRequest.getCustomJson(), CUSTOMJSON_BINDING);
            protocolMarshaller.marshall(createStackRequest.getConfigurationManager(), CONFIGURATIONMANAGER_BINDING);
            protocolMarshaller.marshall(createStackRequest.getChefConfiguration(), CHEFCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createStackRequest.getUseCustomCookbooks(), USECUSTOMCOOKBOOKS_BINDING);
            protocolMarshaller.marshall(createStackRequest.getUseOpsworksSecurityGroups(), USEOPSWORKSSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(createStackRequest.getCustomCookbooksSource(), CUSTOMCOOKBOOKSSOURCE_BINDING);
            protocolMarshaller.marshall(createStackRequest.getDefaultSshKeyName(), DEFAULTSSHKEYNAME_BINDING);
            protocolMarshaller.marshall(createStackRequest.getDefaultRootDeviceType(), DEFAULTROOTDEVICETYPE_BINDING);
            protocolMarshaller.marshall(createStackRequest.getAgentVersion(), AGENTVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
