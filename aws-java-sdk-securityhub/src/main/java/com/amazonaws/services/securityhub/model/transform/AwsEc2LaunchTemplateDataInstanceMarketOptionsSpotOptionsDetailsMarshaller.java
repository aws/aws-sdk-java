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
 * AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetailsMarshaller {

    private static final MarshallingInfo<Integer> BLOCKDURATIONMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockDurationMinutes").build();
    private static final MarshallingInfo<String> INSTANCEINTERRUPTIONBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceInterruptionBehavior").build();
    private static final MarshallingInfo<String> MAXPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxPrice").build();
    private static final MarshallingInfo<String> SPOTINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpotInstanceType").build();
    private static final MarshallingInfo<String> VALIDUNTIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidUntil").build();

    private static final AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetailsMarshaller instance = new AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails awsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller
                    .marshall(awsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails.getBlockDurationMinutes(), BLOCKDURATIONMINUTES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails.getInstanceInterruptionBehavior(),
                    INSTANCEINTERRUPTIONBEHAVIOR_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails.getMaxPrice(), MAXPRICE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails.getSpotInstanceType(), SPOTINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails.getValidUntil(), VALIDUNTIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
