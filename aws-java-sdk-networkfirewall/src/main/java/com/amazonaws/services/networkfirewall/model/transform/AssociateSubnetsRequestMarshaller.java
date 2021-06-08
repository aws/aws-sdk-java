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
package com.amazonaws.services.networkfirewall.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociateSubnetsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociateSubnetsRequestMarshaller {

    private static final MarshallingInfo<String> UPDATETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateToken").build();
    private static final MarshallingInfo<String> FIREWALLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallArn").build();
    private static final MarshallingInfo<String> FIREWALLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallName").build();
    private static final MarshallingInfo<List> SUBNETMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetMappings").build();

    private static final AssociateSubnetsRequestMarshaller instance = new AssociateSubnetsRequestMarshaller();

    public static AssociateSubnetsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociateSubnetsRequest associateSubnetsRequest, ProtocolMarshaller protocolMarshaller) {

        if (associateSubnetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associateSubnetsRequest.getUpdateToken(), UPDATETOKEN_BINDING);
            protocolMarshaller.marshall(associateSubnetsRequest.getFirewallArn(), FIREWALLARN_BINDING);
            protocolMarshaller.marshall(associateSubnetsRequest.getFirewallName(), FIREWALLNAME_BINDING);
            protocolMarshaller.marshall(associateSubnetsRequest.getSubnetMappings(), SUBNETMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
