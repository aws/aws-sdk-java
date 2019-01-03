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
package com.amazonaws.services.servermigration.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServerLaunchConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServerLaunchConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SERVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("server").build();
    private static final MarshallingInfo<String> LOGICALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logicalId").build();
    private static final MarshallingInfo<String> VPC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vpc").build();
    private static final MarshallingInfo<String> SUBNET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnet").build();
    private static final MarshallingInfo<String> SECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroup").build();
    private static final MarshallingInfo<String> EC2KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2KeyName").build();
    private static final MarshallingInfo<StructuredPojo> USERDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userData").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<Boolean> ASSOCIATEPUBLICIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatePublicIpAddress").build();

    private static final ServerLaunchConfigurationMarshaller instance = new ServerLaunchConfigurationMarshaller();

    public static ServerLaunchConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServerLaunchConfiguration serverLaunchConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (serverLaunchConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serverLaunchConfiguration.getServer(), SERVER_BINDING);
            protocolMarshaller.marshall(serverLaunchConfiguration.getLogicalId(), LOGICALID_BINDING);
            protocolMarshaller.marshall(serverLaunchConfiguration.getVpc(), VPC_BINDING);
            protocolMarshaller.marshall(serverLaunchConfiguration.getSubnet(), SUBNET_BINDING);
            protocolMarshaller.marshall(serverLaunchConfiguration.getSecurityGroup(), SECURITYGROUP_BINDING);
            protocolMarshaller.marshall(serverLaunchConfiguration.getEc2KeyName(), EC2KEYNAME_BINDING);
            protocolMarshaller.marshall(serverLaunchConfiguration.getUserData(), USERDATA_BINDING);
            protocolMarshaller.marshall(serverLaunchConfiguration.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(serverLaunchConfiguration.getAssociatePublicIpAddress(), ASSOCIATEPUBLICIPADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
