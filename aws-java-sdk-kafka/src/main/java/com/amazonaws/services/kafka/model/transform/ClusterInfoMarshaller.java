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
 * ClusterInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterInfoMarshaller {

    private static final MarshallingInfo<StructuredPojo> BROKERNODEGROUPINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brokerNodeGroupInfo").build();
    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTBROKERSOFTWAREINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentBrokerSoftwareInfo").build();
    private static final MarshallingInfo<String> CURRENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentVersion").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionInfo").build();
    private static final MarshallingInfo<String> ENHANCEDMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedMonitoring").build();
    private static final MarshallingInfo<Integer> NUMBEROFBROKERNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfBrokerNodes").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> ZOOKEEPERCONNECTSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zookeeperConnectString").build();

    private static final ClusterInfoMarshaller instance = new ClusterInfoMarshaller();

    public static ClusterInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClusterInfo clusterInfo, ProtocolMarshaller protocolMarshaller) {

        if (clusterInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clusterInfo.getBrokerNodeGroupInfo(), BROKERNODEGROUPINFO_BINDING);
            protocolMarshaller.marshall(clusterInfo.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(clusterInfo.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(clusterInfo.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(clusterInfo.getCurrentBrokerSoftwareInfo(), CURRENTBROKERSOFTWAREINFO_BINDING);
            protocolMarshaller.marshall(clusterInfo.getCurrentVersion(), CURRENTVERSION_BINDING);
            protocolMarshaller.marshall(clusterInfo.getEncryptionInfo(), ENCRYPTIONINFO_BINDING);
            protocolMarshaller.marshall(clusterInfo.getEnhancedMonitoring(), ENHANCEDMONITORING_BINDING);
            protocolMarshaller.marshall(clusterInfo.getNumberOfBrokerNodes(), NUMBEROFBROKERNODES_BINDING);
            protocolMarshaller.marshall(clusterInfo.getState(), STATE_BINDING);
            protocolMarshaller.marshall(clusterInfo.getZookeeperConnectString(), ZOOKEEPERCONNECTSTRING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
