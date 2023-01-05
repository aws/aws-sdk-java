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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsElasticsearchDomainElasticsearchClusterConfigDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElasticsearchDomainElasticsearchClusterConfigDetailsMarshaller {

    private static final MarshallingInfo<Integer> DEDICATEDMASTERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DedicatedMasterCount").build();
    private static final MarshallingInfo<Boolean> DEDICATEDMASTERENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DedicatedMasterEnabled").build();
    private static final MarshallingInfo<String> DEDICATEDMASTERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DedicatedMasterType").build();
    private static final MarshallingInfo<Integer> INSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCount").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<StructuredPojo> ZONEAWARENESSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ZoneAwarenessConfig").build();
    private static final MarshallingInfo<Boolean> ZONEAWARENESSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ZoneAwarenessEnabled").build();

    private static final AwsElasticsearchDomainElasticsearchClusterConfigDetailsMarshaller instance = new AwsElasticsearchDomainElasticsearchClusterConfigDetailsMarshaller();

    public static AwsElasticsearchDomainElasticsearchClusterConfigDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElasticsearchDomainElasticsearchClusterConfigDetails awsElasticsearchDomainElasticsearchClusterConfigDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsElasticsearchDomainElasticsearchClusterConfigDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElasticsearchDomainElasticsearchClusterConfigDetails.getDedicatedMasterCount(), DEDICATEDMASTERCOUNT_BINDING);
            protocolMarshaller.marshall(awsElasticsearchDomainElasticsearchClusterConfigDetails.getDedicatedMasterEnabled(), DEDICATEDMASTERENABLED_BINDING);
            protocolMarshaller.marshall(awsElasticsearchDomainElasticsearchClusterConfigDetails.getDedicatedMasterType(), DEDICATEDMASTERTYPE_BINDING);
            protocolMarshaller.marshall(awsElasticsearchDomainElasticsearchClusterConfigDetails.getInstanceCount(), INSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(awsElasticsearchDomainElasticsearchClusterConfigDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(awsElasticsearchDomainElasticsearchClusterConfigDetails.getZoneAwarenessConfig(), ZONEAWARENESSCONFIG_BINDING);
            protocolMarshaller.marshall(awsElasticsearchDomainElasticsearchClusterConfigDetails.getZoneAwarenessEnabled(), ZONEAWARENESSENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
