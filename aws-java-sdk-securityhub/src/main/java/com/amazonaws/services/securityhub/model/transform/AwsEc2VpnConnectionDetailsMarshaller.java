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
 * AwsEc2VpnConnectionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2VpnConnectionDetailsMarshaller {

    private static final MarshallingInfo<String> VPNCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpnConnectionId").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> CUSTOMERGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerGatewayId").build();
    private static final MarshallingInfo<String> CUSTOMERGATEWAYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerGatewayConfiguration").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> VPNGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpnGatewayId").build();
    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Category").build();
    private static final MarshallingInfo<List> VGWTELEMETRY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VgwTelemetry").build();
    private static final MarshallingInfo<StructuredPojo> OPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Options").build();
    private static final MarshallingInfo<List> ROUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Routes").build();
    private static final MarshallingInfo<String> TRANSITGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransitGatewayId").build();

    private static final AwsEc2VpnConnectionDetailsMarshaller instance = new AwsEc2VpnConnectionDetailsMarshaller();

    public static AwsEc2VpnConnectionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2VpnConnectionDetails awsEc2VpnConnectionDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2VpnConnectionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getVpnConnectionId(), VPNCONNECTIONID_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getState(), STATE_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getCustomerGatewayId(), CUSTOMERGATEWAYID_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getCustomerGatewayConfiguration(), CUSTOMERGATEWAYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getVpnGatewayId(), VPNGATEWAYID_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getVgwTelemetry(), VGWTELEMETRY_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getOptions(), OPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getRoutes(), ROUTES_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionDetails.getTransitGatewayId(), TRANSITGATEWAYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
