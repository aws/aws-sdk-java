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
 * AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetailsMarshaller {

    private static final MarshallingInfo<String> IPV4PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ipv4Prefix").build();

    private static final AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetailsMarshaller instance = new AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails awsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails.getIpv4Prefix(), IPV4PREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
