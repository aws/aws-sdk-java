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
package com.amazonaws.services.kafka.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafka.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BrokerNodeGroupInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BrokerNodeGroupInfoMarshaller {

    private static final MarshallingInfo<String> BROKERAZDISTRIBUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brokerAZDistribution").build();
    private static final MarshallingInfo<List> CLIENTSUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clientSubnets").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroups").build();
    private static final MarshallingInfo<StructuredPojo> STORAGEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageInfo").build();

    private static final BrokerNodeGroupInfoMarshaller instance = new BrokerNodeGroupInfoMarshaller();

    public static BrokerNodeGroupInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BrokerNodeGroupInfo brokerNodeGroupInfo, ProtocolMarshaller protocolMarshaller) {

        if (brokerNodeGroupInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(brokerNodeGroupInfo.getBrokerAZDistribution(), BROKERAZDISTRIBUTION_BINDING);
            protocolMarshaller.marshall(brokerNodeGroupInfo.getClientSubnets(), CLIENTSUBNETS_BINDING);
            protocolMarshaller.marshall(brokerNodeGroupInfo.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(brokerNodeGroupInfo.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(brokerNodeGroupInfo.getStorageInfo(), STORAGEINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
