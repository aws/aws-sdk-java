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
package com.amazonaws.services.fms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ThirdPartyFirewallMissingSubnetViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ThirdPartyFirewallMissingSubnetViolationMarshaller {

    private static final MarshallingInfo<String> VIOLATIONTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolationTarget").build();
    private static final MarshallingInfo<String> VPC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VPC").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<String> TARGETVIOLATIONREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetViolationReason").build();

    private static final ThirdPartyFirewallMissingSubnetViolationMarshaller instance = new ThirdPartyFirewallMissingSubnetViolationMarshaller();

    public static ThirdPartyFirewallMissingSubnetViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ThirdPartyFirewallMissingSubnetViolation thirdPartyFirewallMissingSubnetViolation, ProtocolMarshaller protocolMarshaller) {

        if (thirdPartyFirewallMissingSubnetViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(thirdPartyFirewallMissingSubnetViolation.getViolationTarget(), VIOLATIONTARGET_BINDING);
            protocolMarshaller.marshall(thirdPartyFirewallMissingSubnetViolation.getVPC(), VPC_BINDING);
            protocolMarshaller.marshall(thirdPartyFirewallMissingSubnetViolation.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(thirdPartyFirewallMissingSubnetViolation.getTargetViolationReason(), TARGETVIOLATIONREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
