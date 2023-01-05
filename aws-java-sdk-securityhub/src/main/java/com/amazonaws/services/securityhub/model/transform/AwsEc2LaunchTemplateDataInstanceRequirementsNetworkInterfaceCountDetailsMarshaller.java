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
 * AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetailsMarshaller {

    private static final MarshallingInfo<Integer> MAX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Max").build();
    private static final MarshallingInfo<Integer> MIN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Min").build();

    private static final AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetailsMarshaller instance = new AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(
            AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails awsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails.getMax(), MAX_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails.getMin(), MIN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
