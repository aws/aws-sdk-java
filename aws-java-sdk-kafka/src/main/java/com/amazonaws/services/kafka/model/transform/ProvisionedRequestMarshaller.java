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
 * ProvisionedRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionedRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> BROKERNODEGROUPINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brokerNodeGroupInfo").build();
    private static final MarshallingInfo<StructuredPojo> CLIENTAUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientAuthentication").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationInfo").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionInfo").build();
    private static final MarshallingInfo<String> ENHANCEDMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedMonitoring").build();
    private static final MarshallingInfo<StructuredPojo> OPENMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openMonitoring").build();
    private static final MarshallingInfo<String> KAFKAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kafkaVersion").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loggingInfo").build();
    private static final MarshallingInfo<Integer> NUMBEROFBROKERNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfBrokerNodes").build();
    private static final MarshallingInfo<String> STORAGEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageMode").build();

    private static final ProvisionedRequestMarshaller instance = new ProvisionedRequestMarshaller();

    public static ProvisionedRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisionedRequest provisionedRequest, ProtocolMarshaller protocolMarshaller) {

        if (provisionedRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisionedRequest.getBrokerNodeGroupInfo(), BROKERNODEGROUPINFO_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getClientAuthentication(), CLIENTAUTHENTICATION_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getConfigurationInfo(), CONFIGURATIONINFO_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getEncryptionInfo(), ENCRYPTIONINFO_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getEnhancedMonitoring(), ENHANCEDMONITORING_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getOpenMonitoring(), OPENMONITORING_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getKafkaVersion(), KAFKAVERSION_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getLoggingInfo(), LOGGINGINFO_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getNumberOfBrokerNodes(), NUMBEROFBROKERNODES_BINDING);
            protocolMarshaller.marshall(provisionedRequest.getStorageMode(), STORAGEMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
