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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2EipDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2EipDetailsMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> PUBLICIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicIp").build();
    private static final MarshallingInfo<String> ALLOCATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocationId").build();
    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationId").build();
    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<String> PUBLICIPV4POOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublicIpv4Pool").build();
    private static final MarshallingInfo<String> NETWORKBORDERGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkBorderGroup").build();
    private static final MarshallingInfo<String> NETWORKINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceId").build();
    private static final MarshallingInfo<String> NETWORKINTERFACEOWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceOwnerId").build();
    private static final MarshallingInfo<String> PRIVATEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateIpAddress").build();

    private static final AwsEc2EipDetailsMarshaller instance = new AwsEc2EipDetailsMarshaller();

    public static AwsEc2EipDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2EipDetails awsEc2EipDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2EipDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2EipDetails.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getPublicIp(), PUBLICIP_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getAllocationId(), ALLOCATIONID_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getPublicIpv4Pool(), PUBLICIPV4POOL_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getNetworkBorderGroup(), NETWORKBORDERGROUP_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getNetworkInterfaceId(), NETWORKINTERFACEID_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getNetworkInterfaceOwnerId(), NETWORKINTERFACEOWNERID_BINDING);
            protocolMarshaller.marshall(awsEc2EipDetails.getPrivateIpAddress(), PRIVATEIPADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
