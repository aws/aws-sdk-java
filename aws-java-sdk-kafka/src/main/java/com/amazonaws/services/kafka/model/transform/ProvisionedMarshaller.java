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
package com.amazonaws.services.kafka.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafka.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisionedMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionedMarshaller {

    private static final MarshallingInfo<StructuredPojo> BROKERNODEGROUPINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brokerNodeGroupInfo").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTBROKERSOFTWAREINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentBrokerSoftwareInfo").build();
    private static final MarshallingInfo<StructuredPojo> CLIENTAUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientAuthentication").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionInfo").build();
    private static final MarshallingInfo<String> ENHANCEDMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedMonitoring").build();
    private static final MarshallingInfo<StructuredPojo> OPENMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openMonitoring").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loggingInfo").build();
    private static final MarshallingInfo<Integer> NUMBEROFBROKERNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfBrokerNodes").build();
    private static final MarshallingInfo<String> ZOOKEEPERCONNECTSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zookeeperConnectString").build();
    private static final MarshallingInfo<String> ZOOKEEPERCONNECTSTRINGTLS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zookeeperConnectStringTls").build();
    private static final MarshallingInfo<String> STORAGEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageMode").build();

    private static final ProvisionedMarshaller instance = new ProvisionedMarshaller();

    public static ProvisionedMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Provisioned provisioned, ProtocolMarshaller protocolMarshaller) {

        if (provisioned == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisioned.getBrokerNodeGroupInfo(), BROKERNODEGROUPINFO_BINDING);
            protocolMarshaller.marshall(provisioned.getCurrentBrokerSoftwareInfo(), CURRENTBROKERSOFTWAREINFO_BINDING);
            protocolMarshaller.marshall(provisioned.getClientAuthentication(), CLIENTAUTHENTICATION_BINDING);
            protocolMarshaller.marshall(provisioned.getEncryptionInfo(), ENCRYPTIONINFO_BINDING);
            protocolMarshaller.marshall(provisioned.getEnhancedMonitoring(), ENHANCEDMONITORING_BINDING);
            protocolMarshaller.marshall(provisioned.getOpenMonitoring(), OPENMONITORING_BINDING);
            protocolMarshaller.marshall(provisioned.getLoggingInfo(), LOGGINGINFO_BINDING);
            protocolMarshaller.marshall(provisioned.getNumberOfBrokerNodes(), NUMBEROFBROKERNODES_BINDING);
            protocolMarshaller.marshall(provisioned.getZookeeperConnectString(), ZOOKEEPERCONNECTSTRING_BINDING);
            protocolMarshaller.marshall(provisioned.getZookeeperConnectStringTls(), ZOOKEEPERCONNECTSTRINGTLS_BINDING);
            protocolMarshaller.marshall(provisioned.getStorageMode(), STORAGEMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
