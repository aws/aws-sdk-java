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
 * AwsEc2LaunchTemplateDataPlacementDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataPlacementDetailsMarshaller {

    private static final MarshallingInfo<String> AFFINITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Affinity").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<String> GROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupName").build();
    private static final MarshallingInfo<String> HOSTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HostId").build();
    private static final MarshallingInfo<String> HOSTRESOURCEGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HostResourceGroupArn").build();
    private static final MarshallingInfo<Integer> PARTITIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartitionNumber").build();
    private static final MarshallingInfo<String> SPREADDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpreadDomain").build();
    private static final MarshallingInfo<String> TENANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tenancy").build();

    private static final AwsEc2LaunchTemplateDataPlacementDetailsMarshaller instance = new AwsEc2LaunchTemplateDataPlacementDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataPlacementDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataPlacementDetails awsEc2LaunchTemplateDataPlacementDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataPlacementDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataPlacementDetails.getAffinity(), AFFINITY_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataPlacementDetails.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataPlacementDetails.getGroupName(), GROUPNAME_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataPlacementDetails.getHostId(), HOSTID_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataPlacementDetails.getHostResourceGroupArn(), HOSTRESOURCEGROUPARN_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataPlacementDetails.getPartitionNumber(), PARTITIONNUMBER_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataPlacementDetails.getSpreadDomain(), SPREADDOMAIN_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataPlacementDetails.getTenancy(), TENANCY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
