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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetailsMarshaller {

    private static final MarshallingInfo<Boolean> PRIMARY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Primary").build();
    private static final MarshallingInfo<String> PRIVATEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateIpAddress").build();

    private static final AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetailsMarshaller instance = new AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(
            AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails awsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails.getPrimary(), PRIMARY_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails.getPrivateIpAddress(), PRIVATEIPADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
