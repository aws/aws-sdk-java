/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InvalidNetworkAclEntriesViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InvalidNetworkAclEntriesViolationMarshaller {

    private static final MarshallingInfo<String> VPC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Vpc").build();
    private static final MarshallingInfo<String> SUBNET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subnet").build();
    private static final MarshallingInfo<String> SUBNETAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetAvailabilityZone").build();
    private static final MarshallingInfo<String> CURRENTASSOCIATEDNETWORKACL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentAssociatedNetworkAcl").build();
    private static final MarshallingInfo<List> ENTRYVIOLATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntryViolations").build();

    private static final InvalidNetworkAclEntriesViolationMarshaller instance = new InvalidNetworkAclEntriesViolationMarshaller();

    public static InvalidNetworkAclEntriesViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InvalidNetworkAclEntriesViolation invalidNetworkAclEntriesViolation, ProtocolMarshaller protocolMarshaller) {

        if (invalidNetworkAclEntriesViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(invalidNetworkAclEntriesViolation.getVpc(), VPC_BINDING);
            protocolMarshaller.marshall(invalidNetworkAclEntriesViolation.getSubnet(), SUBNET_BINDING);
            protocolMarshaller.marshall(invalidNetworkAclEntriesViolation.getSubnetAvailabilityZone(), SUBNETAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(invalidNetworkAclEntriesViolation.getCurrentAssociatedNetworkAcl(), CURRENTASSOCIATEDNETWORKACL_BINDING);
            protocolMarshaller.marshall(invalidNetworkAclEntriesViolation.getEntryViolations(), ENTRYVIOLATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
