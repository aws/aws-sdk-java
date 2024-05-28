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
package com.amazonaws.services.finspace.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransitGatewayConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransitGatewayConfigurationMarshaller {

    private static final MarshallingInfo<String> TRANSITGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transitGatewayID").build();
    private static final MarshallingInfo<String> ROUTABLECIDRSPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routableCIDRSpace").build();
    private static final MarshallingInfo<List> ATTACHMENTNETWORKACLCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachmentNetworkAclConfiguration").build();

    private static final TransitGatewayConfigurationMarshaller instance = new TransitGatewayConfigurationMarshaller();

    public static TransitGatewayConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransitGatewayConfiguration transitGatewayConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (transitGatewayConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transitGatewayConfiguration.getTransitGatewayID(), TRANSITGATEWAYID_BINDING);
            protocolMarshaller.marshall(transitGatewayConfiguration.getRoutableCIDRSpace(), ROUTABLECIDRSPACE_BINDING);
            protocolMarshaller.marshall(transitGatewayConfiguration.getAttachmentNetworkAclConfiguration(), ATTACHMENTNETWORKACLCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
