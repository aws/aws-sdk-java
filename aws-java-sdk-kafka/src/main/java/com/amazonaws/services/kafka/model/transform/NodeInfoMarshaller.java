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
 * NodeInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NodeInfoMarshaller {

    private static final MarshallingInfo<String> ADDEDTOCLUSTERTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addedToClusterTime").build();
    private static final MarshallingInfo<StructuredPojo> BROKERNODEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brokerNodeInfo").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<String> NODEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodeARN").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodeType").build();
    private static final MarshallingInfo<StructuredPojo> ZOOKEEPERNODEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zookeeperNodeInfo").build();

    private static final NodeInfoMarshaller instance = new NodeInfoMarshaller();

    public static NodeInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NodeInfo nodeInfo, ProtocolMarshaller protocolMarshaller) {

        if (nodeInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nodeInfo.getAddedToClusterTime(), ADDEDTOCLUSTERTIME_BINDING);
            protocolMarshaller.marshall(nodeInfo.getBrokerNodeInfo(), BROKERNODEINFO_BINDING);
            protocolMarshaller.marshall(nodeInfo.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(nodeInfo.getNodeARN(), NODEARN_BINDING);
            protocolMarshaller.marshall(nodeInfo.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(nodeInfo.getZookeeperNodeInfo(), ZOOKEEPERNODEINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
