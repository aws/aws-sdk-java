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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2InstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2InstanceDetailsMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageId").build();
    private static final MarshallingInfo<List> IPV4ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpV4Addresses").build();
    private static final MarshallingInfo<List> IPV6ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpV6Addresses").build();
    private static final MarshallingInfo<String> KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyName").build();
    private static final MarshallingInfo<String> IAMINSTANCEPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamInstanceProfileArn").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> LAUNCHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchedAt").build();

    private static final AwsEc2InstanceDetailsMarshaller instance = new AwsEc2InstanceDetailsMarshaller();

    public static AwsEc2InstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2InstanceDetails awsEc2InstanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2InstanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2InstanceDetails.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getIpV4Addresses(), IPV4ADDRESSES_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getIpV6Addresses(), IPV6ADDRESSES_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getKeyName(), KEYNAME_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getIamInstanceProfileArn(), IAMINSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getLaunchedAt(), LAUNCHEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
