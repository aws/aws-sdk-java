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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociationSetDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociationSetDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ASSOCIATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationState").build();
    private static final MarshallingInfo<String> GATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GatewayId").build();
    private static final MarshallingInfo<Boolean> MAIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Main").build();
    private static final MarshallingInfo<String> ROUTETABLEASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableAssociationId").build();
    private static final MarshallingInfo<String> ROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableId").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();

    private static final AssociationSetDetailsMarshaller instance = new AssociationSetDetailsMarshaller();

    public static AssociationSetDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociationSetDetails associationSetDetails, ProtocolMarshaller protocolMarshaller) {

        if (associationSetDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associationSetDetails.getAssociationState(), ASSOCIATIONSTATE_BINDING);
            protocolMarshaller.marshall(associationSetDetails.getGatewayId(), GATEWAYID_BINDING);
            protocolMarshaller.marshall(associationSetDetails.getMain(), MAIN_BINDING);
            protocolMarshaller.marshall(associationSetDetails.getRouteTableAssociationId(), ROUTETABLEASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(associationSetDetails.getRouteTableId(), ROUTETABLEID_BINDING);
            protocolMarshaller.marshall(associationSetDetails.getSubnetId(), SUBNETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
