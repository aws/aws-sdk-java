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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LightsailDistributionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LightsailDistributionMarshaller {

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
    private static final MarshallingInfo<List> ALTERNATIVEDOMAINNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alternativeDomainNames").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Boolean> ISENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isEnabled").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<String> BUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bundleId").build();
    private static final MarshallingInfo<String> CERTIFICATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateName").build();
    private static final MarshallingInfo<StructuredPojo> ORIGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("origin").build();
    private static final MarshallingInfo<String> ORIGINPUBLICDNS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("originPublicDNS").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTCACHEBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultCacheBehavior").build();
    private static final MarshallingInfo<StructuredPojo> CACHEBEHAVIORSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheBehaviorSettings").build();
    private static final MarshallingInfo<List> CACHEBEHAVIORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheBehaviors").build();
    private static final MarshallingInfo<Boolean> ABLETOUPDATEBUNDLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ableToUpdateBundle").build();
    private static final MarshallingInfo<String> IPADDRESSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipAddressType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final LightsailDistributionMarshaller instance = new LightsailDistributionMarshaller();

    public static LightsailDistributionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LightsailDistribution lightsailDistribution, ProtocolMarshaller protocolMarshaller) {

        if (lightsailDistribution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lightsailDistribution.getName(), NAME_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getSupportCode(), SUPPORTCODE_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getAlternativeDomainNames(), ALTERNATIVEDOMAINNAMES_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getIsEnabled(), ISENABLED_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getBundleId(), BUNDLEID_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getCertificateName(), CERTIFICATENAME_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getOrigin(), ORIGIN_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getOriginPublicDNS(), ORIGINPUBLICDNS_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getDefaultCacheBehavior(), DEFAULTCACHEBEHAVIOR_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getCacheBehaviorSettings(), CACHEBEHAVIORSETTINGS_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getCacheBehaviors(), CACHEBEHAVIORS_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getAbleToUpdateBundle(), ABLETOUPDATEBUNDLE_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getIpAddressType(), IPADDRESSTYPE_BINDING);
            protocolMarshaller.marshall(lightsailDistribution.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
