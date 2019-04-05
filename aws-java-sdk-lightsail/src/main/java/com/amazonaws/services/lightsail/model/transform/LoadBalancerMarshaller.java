/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoadBalancerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoadBalancerMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> SUPPORTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportCode").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("location").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> DNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dnsName").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<List> PUBLICPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("publicPorts").build();
    private static final MarshallingInfo<String> HEALTHCHECKPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthCheckPath").build();
    private static final MarshallingInfo<Integer> INSTANCEPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instancePort").build();
    private static final MarshallingInfo<List> INSTANCEHEALTHSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceHealthSummary").build();
    private static final MarshallingInfo<List> TLSCERTIFICATESUMMARIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tlsCertificateSummaries").build();
    private static final MarshallingInfo<Map> CONFIGURATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationOptions").build();

    private static final LoadBalancerMarshaller instance = new LoadBalancerMarshaller();

    public static LoadBalancerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoadBalancer loadBalancer, ProtocolMarshaller protocolMarshaller) {

        if (loadBalancer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loadBalancer.getName(), NAME_BINDING);
            protocolMarshaller.marshall(loadBalancer.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(loadBalancer.getSupportCode(), SUPPORTCODE_BINDING);
            protocolMarshaller.marshall(loadBalancer.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(loadBalancer.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(loadBalancer.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(loadBalancer.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(loadBalancer.getDnsName(), DNSNAME_BINDING);
            protocolMarshaller.marshall(loadBalancer.getState(), STATE_BINDING);
            protocolMarshaller.marshall(loadBalancer.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(loadBalancer.getPublicPorts(), PUBLICPORTS_BINDING);
            protocolMarshaller.marshall(loadBalancer.getHealthCheckPath(), HEALTHCHECKPATH_BINDING);
            protocolMarshaller.marshall(loadBalancer.getInstancePort(), INSTANCEPORT_BINDING);
            protocolMarshaller.marshall(loadBalancer.getInstanceHealthSummary(), INSTANCEHEALTHSUMMARY_BINDING);
            protocolMarshaller.marshall(loadBalancer.getTlsCertificateSummaries(), TLSCERTIFICATESUMMARIES_BINDING);
            protocolMarshaller.marshall(loadBalancer.getConfigurationOptions(), CONFIGURATIONOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
