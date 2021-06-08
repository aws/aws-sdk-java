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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2SubnetDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2SubnetDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ASSIGNIPV6ADDRESSONCREATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignIpv6AddressOnCreation").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<String> AVAILABILITYZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZoneId").build();
    private static final MarshallingInfo<Integer> AVAILABLEIPADDRESSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailableIpAddressCount").build();
    private static final MarshallingInfo<String> CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CidrBlock").build();
    private static final MarshallingInfo<Boolean> DEFAULTFORAZ_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultForAz").build();
    private static final MarshallingInfo<Boolean> MAPPUBLICIPONLAUNCH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MapPublicIpOnLaunch").build();
    private static final MarshallingInfo<String> OWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerId").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> SUBNETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetArn").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<List> IPV6CIDRBLOCKASSOCIATIONSET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ipv6CidrBlockAssociationSet").build();

    private static final AwsEc2SubnetDetailsMarshaller instance = new AwsEc2SubnetDetailsMarshaller();

    public static AwsEc2SubnetDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2SubnetDetails awsEc2SubnetDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2SubnetDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2SubnetDetails.getAssignIpv6AddressOnCreation(), ASSIGNIPV6ADDRESSONCREATION_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getAvailabilityZoneId(), AVAILABILITYZONEID_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getAvailableIpAddressCount(), AVAILABLEIPADDRESSCOUNT_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getCidrBlock(), CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getDefaultForAz(), DEFAULTFORAZ_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getMapPublicIpOnLaunch(), MAPPUBLICIPONLAUNCH_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getOwnerId(), OWNERID_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getState(), STATE_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getSubnetArn(), SUBNETARN_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsEc2SubnetDetails.getIpv6CidrBlockAssociationSet(), IPV6CIDRBLOCKASSOCIATIONSET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
