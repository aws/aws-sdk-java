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
 * ZookeeperNodeInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ZookeeperNodeInfoMarshaller {

    private static final MarshallingInfo<String> ATTACHEDENIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachedENIId").build();
    private static final MarshallingInfo<String> CLIENTVPCIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientVpcIpAddress").build();
    private static final MarshallingInfo<Double> ZOOKEEPERID_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zookeeperId").build();
    private static final MarshallingInfo<String> ZOOKEEPERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zookeeperVersion").build();

    private static final ZookeeperNodeInfoMarshaller instance = new ZookeeperNodeInfoMarshaller();

    public static ZookeeperNodeInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ZookeeperNodeInfo zookeeperNodeInfo, ProtocolMarshaller protocolMarshaller) {

        if (zookeeperNodeInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(zookeeperNodeInfo.getAttachedENIId(), ATTACHEDENIID_BINDING);
            protocolMarshaller.marshall(zookeeperNodeInfo.getClientVpcIpAddress(), CLIENTVPCIPADDRESS_BINDING);
            protocolMarshaller.marshall(zookeeperNodeInfo.getZookeeperId(), ZOOKEEPERID_BINDING);
            protocolMarshaller.marshall(zookeeperNodeInfo.getZookeeperVersion(), ZOOKEEPERVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
