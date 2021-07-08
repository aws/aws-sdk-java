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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkFirewallMissingExpectedRoutesViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkFirewallMissingExpectedRoutesViolationMarshaller {

    private static final MarshallingInfo<String> VIOLATIONTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolationTarget").build();
    private static final MarshallingInfo<List> EXPECTEDROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedRoutes").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();

    private static final NetworkFirewallMissingExpectedRoutesViolationMarshaller instance = new NetworkFirewallMissingExpectedRoutesViolationMarshaller();

    public static NetworkFirewallMissingExpectedRoutesViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkFirewallMissingExpectedRoutesViolation networkFirewallMissingExpectedRoutesViolation, ProtocolMarshaller protocolMarshaller) {

        if (networkFirewallMissingExpectedRoutesViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkFirewallMissingExpectedRoutesViolation.getViolationTarget(), VIOLATIONTARGET_BINDING);
            protocolMarshaller.marshall(networkFirewallMissingExpectedRoutesViolation.getExpectedRoutes(), EXPECTEDROUTES_BINDING);
            protocolMarshaller.marshall(networkFirewallMissingExpectedRoutesViolation.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
