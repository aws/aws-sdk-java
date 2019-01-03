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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafka.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BrokerNodeInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BrokerNodeInfoMarshaller {

    private static final MarshallingInfo<String> ATTACHEDENIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachedENIId").build();
    private static final MarshallingInfo<Double> BROKERID_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("brokerId").build();
    private static final MarshallingInfo<String> CLIENTSUBNET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientSubnet").build();
    private static final MarshallingInfo<String> CLIENTVPCIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientVpcIpAddress").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTBROKERSOFTWAREINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentBrokerSoftwareInfo").build();

    private static final BrokerNodeInfoMarshaller instance = new BrokerNodeInfoMarshaller();

    public static BrokerNodeInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BrokerNodeInfo brokerNodeInfo, ProtocolMarshaller protocolMarshaller) {

        if (brokerNodeInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(brokerNodeInfo.getAttachedENIId(), ATTACHEDENIID_BINDING);
            protocolMarshaller.marshall(brokerNodeInfo.getBrokerId(), BROKERID_BINDING);
            protocolMarshaller.marshall(brokerNodeInfo.getClientSubnet(), CLIENTSUBNET_BINDING);
            protocolMarshaller.marshall(brokerNodeInfo.getClientVpcIpAddress(), CLIENTVPCIPADDRESS_BINDING);
            protocolMarshaller.marshall(brokerNodeInfo.getCurrentBrokerSoftwareInfo(), CURRENTBROKERSOFTWAREINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
