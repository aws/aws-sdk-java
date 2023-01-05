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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2TransitGatewayDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2TransitGatewayDetailsMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> DEFAULTROUTETABLEPROPAGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRouteTablePropagation").build();
    private static final MarshallingInfo<String> AUTOACCEPTSHAREDATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoAcceptSharedAttachments").build();
    private static final MarshallingInfo<String> DEFAULTROUTETABLEASSOCIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRouteTableAssociation").build();
    private static final MarshallingInfo<List> TRANSITGATEWAYCIDRBLOCKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransitGatewayCidrBlocks").build();
    private static final MarshallingInfo<String> ASSOCIATIONDEFAULTROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationDefaultRouteTableId").build();
    private static final MarshallingInfo<String> PROPAGATIONDEFAULTROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PropagationDefaultRouteTableId").build();
    private static final MarshallingInfo<String> VPNECMPSUPPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpnEcmpSupport").build();
    private static final MarshallingInfo<String> DNSSUPPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DnsSupport").build();
    private static final MarshallingInfo<String> MULTICASTSUPPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MulticastSupport").build();
    private static final MarshallingInfo<Integer> AMAZONSIDEASN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmazonSideAsn").build();

    private static final AwsEc2TransitGatewayDetailsMarshaller instance = new AwsEc2TransitGatewayDetailsMarshaller();

    public static AwsEc2TransitGatewayDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2TransitGatewayDetails awsEc2TransitGatewayDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2TransitGatewayDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getDefaultRouteTablePropagation(), DEFAULTROUTETABLEPROPAGATION_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getAutoAcceptSharedAttachments(), AUTOACCEPTSHAREDATTACHMENTS_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getDefaultRouteTableAssociation(), DEFAULTROUTETABLEASSOCIATION_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getTransitGatewayCidrBlocks(), TRANSITGATEWAYCIDRBLOCKS_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getAssociationDefaultRouteTableId(), ASSOCIATIONDEFAULTROUTETABLEID_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getPropagationDefaultRouteTableId(), PROPAGATIONDEFAULTROUTETABLEID_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getVpnEcmpSupport(), VPNECMPSUPPORT_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getDnsSupport(), DNSSUPPORT_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getMulticastSupport(), MULTICASTSUPPORT_BINDING);
            protocolMarshaller.marshall(awsEc2TransitGatewayDetails.getAmazonSideAsn(), AMAZONSIDEASN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
