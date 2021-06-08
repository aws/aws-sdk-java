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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsElbLoadBalancerDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElbLoadBalancerDetailsMarshaller {

    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZones").build();
    private static final MarshallingInfo<List> BACKENDSERVERDESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackendServerDescriptions").build();
    private static final MarshallingInfo<String> CANONICALHOSTEDZONENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CanonicalHostedZoneName").build();
    private static final MarshallingInfo<String> CANONICALHOSTEDZONENAMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CanonicalHostedZoneNameID").build();
    private static final MarshallingInfo<String> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").build();
    private static final MarshallingInfo<String> DNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsName").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheck").build();
    private static final MarshallingInfo<List> INSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Instances").build();
    private static final MarshallingInfo<List> LISTENERDESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListenerDescriptions").build();
    private static final MarshallingInfo<StructuredPojo> LOADBALANCERATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoadBalancerAttributes").build();
    private static final MarshallingInfo<String> LOADBALANCERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoadBalancerName").build();
    private static final MarshallingInfo<StructuredPojo> POLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Policies").build();
    private static final MarshallingInfo<String> SCHEME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Scheme").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroups").build();
    private static final MarshallingInfo<StructuredPojo> SOURCESECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceSecurityGroup").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subnets").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();

    private static final AwsElbLoadBalancerDetailsMarshaller instance = new AwsElbLoadBalancerDetailsMarshaller();

    public static AwsElbLoadBalancerDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElbLoadBalancerDetails awsElbLoadBalancerDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsElbLoadBalancerDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getBackendServerDescriptions(), BACKENDSERVERDESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getCanonicalHostedZoneName(), CANONICALHOSTEDZONENAME_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getCanonicalHostedZoneNameID(), CANONICALHOSTEDZONENAMEID_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getDnsName(), DNSNAME_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getHealthCheck(), HEALTHCHECK_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getInstances(), INSTANCES_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getListenerDescriptions(), LISTENERDESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getLoadBalancerAttributes(), LOADBALANCERATTRIBUTES_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getLoadBalancerName(), LOADBALANCERNAME_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getPolicies(), POLICIES_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getScheme(), SCHEME_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getSourceSecurityGroup(), SOURCESECURITYGROUP_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerDetails.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
