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
 * AwsEc2VpcEndpointServiceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2VpcEndpointServiceDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ACCEPTANCEREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptanceRequired").build();
    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZones").build();
    private static final MarshallingInfo<List> BASEENDPOINTDNSNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaseEndpointDnsNames").build();
    private static final MarshallingInfo<Boolean> MANAGESVPCENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagesVpcEndpoints").build();
    private static final MarshallingInfo<List> GATEWAYLOADBALANCERARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayLoadBalancerArns").build();
    private static final MarshallingInfo<List> NETWORKLOADBALANCERARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkLoadBalancerArns").build();
    private static final MarshallingInfo<String> PRIVATEDNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateDnsName").build();
    private static final MarshallingInfo<String> SERVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ServiceId").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceName").build();
    private static final MarshallingInfo<String> SERVICESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceState").build();
    private static final MarshallingInfo<List> SERVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ServiceType").build();

    private static final AwsEc2VpcEndpointServiceDetailsMarshaller instance = new AwsEc2VpcEndpointServiceDetailsMarshaller();

    public static AwsEc2VpcEndpointServiceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2VpcEndpointServiceDetails awsEc2VpcEndpointServiceDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2VpcEndpointServiceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getAcceptanceRequired(), ACCEPTANCEREQUIRED_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getBaseEndpointDnsNames(), BASEENDPOINTDNSNAMES_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getManagesVpcEndpoints(), MANAGESVPCENDPOINTS_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getGatewayLoadBalancerArns(), GATEWAYLOADBALANCERARNS_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getNetworkLoadBalancerArns(), NETWORKLOADBALANCERARNS_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getPrivateDnsName(), PRIVATEDNSNAME_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getServiceId(), SERVICEID_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getServiceState(), SERVICESTATE_BINDING);
            protocolMarshaller.marshall(awsEc2VpcEndpointServiceDetails.getServiceType(), SERVICETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
