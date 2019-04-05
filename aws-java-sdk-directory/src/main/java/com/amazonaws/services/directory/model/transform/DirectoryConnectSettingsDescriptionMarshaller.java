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
package com.amazonaws.services.directory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DirectoryConnectSettingsDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DirectoryConnectSettingsDescriptionMarshaller {

    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetIds").build();
    private static final MarshallingInfo<String> CUSTOMERUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerUserName").build();
    private static final MarshallingInfo<String> SECURITYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupId").build();
    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZones").build();
    private static final MarshallingInfo<List> CONNECTIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ConnectIps").build();

    private static final DirectoryConnectSettingsDescriptionMarshaller instance = new DirectoryConnectSettingsDescriptionMarshaller();

    public static DirectoryConnectSettingsDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DirectoryConnectSettingsDescription directoryConnectSettingsDescription, ProtocolMarshaller protocolMarshaller) {

        if (directoryConnectSettingsDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(directoryConnectSettingsDescription.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(directoryConnectSettingsDescription.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(directoryConnectSettingsDescription.getCustomerUserName(), CUSTOMERUSERNAME_BINDING);
            protocolMarshaller.marshall(directoryConnectSettingsDescription.getSecurityGroupId(), SECURITYGROUPID_BINDING);
            protocolMarshaller.marshall(directoryConnectSettingsDescription.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(directoryConnectSettingsDescription.getConnectIps(), CONNECTIPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
