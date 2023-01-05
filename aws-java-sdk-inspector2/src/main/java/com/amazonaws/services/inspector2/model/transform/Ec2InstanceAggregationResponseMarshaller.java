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
package com.amazonaws.services.inspector2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Ec2InstanceAggregationResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Ec2InstanceAggregationResponseMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> AMI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ami").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceId").build();
    private static final MarshallingInfo<Map> INSTANCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instanceTags").build();
    private static final MarshallingInfo<Long> NETWORKFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkFindings").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operatingSystem").build();
    private static final MarshallingInfo<StructuredPojo> SEVERITYCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("severityCounts").build();

    private static final Ec2InstanceAggregationResponseMarshaller instance = new Ec2InstanceAggregationResponseMarshaller();

    public static Ec2InstanceAggregationResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Ec2InstanceAggregationResponse ec2InstanceAggregationResponse, ProtocolMarshaller protocolMarshaller) {

        if (ec2InstanceAggregationResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ec2InstanceAggregationResponse.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(ec2InstanceAggregationResponse.getAmi(), AMI_BINDING);
            protocolMarshaller.marshall(ec2InstanceAggregationResponse.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(ec2InstanceAggregationResponse.getInstanceTags(), INSTANCETAGS_BINDING);
            protocolMarshaller.marshall(ec2InstanceAggregationResponse.getNetworkFindings(), NETWORKFINDINGS_BINDING);
            protocolMarshaller.marshall(ec2InstanceAggregationResponse.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(ec2InstanceAggregationResponse.getSeverityCounts(), SEVERITYCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
