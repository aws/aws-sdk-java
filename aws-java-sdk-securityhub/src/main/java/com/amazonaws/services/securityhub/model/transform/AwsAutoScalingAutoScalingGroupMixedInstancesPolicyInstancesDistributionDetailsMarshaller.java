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
 * AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetailsMarshaller {

    private static final MarshallingInfo<String> ONDEMANDALLOCATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandAllocationStrategy").build();
    private static final MarshallingInfo<Integer> ONDEMANDBASECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandBaseCapacity").build();
    private static final MarshallingInfo<Integer> ONDEMANDPERCENTAGEABOVEBASECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandPercentageAboveBaseCapacity").build();
    private static final MarshallingInfo<String> SPOTALLOCATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpotAllocationStrategy").build();
    private static final MarshallingInfo<Integer> SPOTINSTANCEPOOLS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpotInstancePools").build();
    private static final MarshallingInfo<String> SPOTMAXPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpotMaxPrice").build();

    private static final AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetailsMarshaller instance = new AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetailsMarshaller();

    public static AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(
            AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails awsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails.getOnDemandAllocationStrategy(),
                    ONDEMANDALLOCATIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails.getOnDemandBaseCapacity(),
                    ONDEMANDBASECAPACITY_BINDING);
            protocolMarshaller.marshall(
                    awsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails.getOnDemandPercentageAboveBaseCapacity(),
                    ONDEMANDPERCENTAGEABOVEBASECAPACITY_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails.getSpotAllocationStrategy(),
                    SPOTALLOCATIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails.getSpotInstancePools(),
                    SPOTINSTANCEPOOLS_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails.getSpotMaxPrice(), SPOTMAXPRICE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
