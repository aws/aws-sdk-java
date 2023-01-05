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
 * AwsEcsServiceCapacityProviderStrategyDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsServiceCapacityProviderStrategyDetailsMarshaller {

    private static final MarshallingInfo<Integer> BASE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Base").build();
    private static final MarshallingInfo<String> CAPACITYPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityProvider").build();
    private static final MarshallingInfo<Integer> WEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Weight").build();

    private static final AwsEcsServiceCapacityProviderStrategyDetailsMarshaller instance = new AwsEcsServiceCapacityProviderStrategyDetailsMarshaller();

    public static AwsEcsServiceCapacityProviderStrategyDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsServiceCapacityProviderStrategyDetails awsEcsServiceCapacityProviderStrategyDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsServiceCapacityProviderStrategyDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsServiceCapacityProviderStrategyDetails.getBase(), BASE_BINDING);
            protocolMarshaller.marshall(awsEcsServiceCapacityProviderStrategyDetails.getCapacityProvider(), CAPACITYPROVIDER_BINDING);
            protocolMarshaller.marshall(awsEcsServiceCapacityProviderStrategyDetails.getWeight(), WEIGHT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
