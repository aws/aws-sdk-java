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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KafkaSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KafkaSettingsMarshaller {

    private static final MarshallingInfo<String> BROKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Broker").build();
    private static final MarshallingInfo<String> TOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Topic").build();
    private static final MarshallingInfo<String> MESSAGEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageFormat").build();
    private static final MarshallingInfo<Boolean> INCLUDETRANSACTIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeTransactionDetails").build();
    private static final MarshallingInfo<Boolean> INCLUDEPARTITIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludePartitionValue").build();
    private static final MarshallingInfo<Boolean> PARTITIONINCLUDESCHEMATABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartitionIncludeSchemaTable").build();
    private static final MarshallingInfo<Boolean> INCLUDETABLEALTEROPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeTableAlterOperations").build();
    private static final MarshallingInfo<Boolean> INCLUDECONTROLDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeControlDetails").build();
    private static final MarshallingInfo<Integer> MESSAGEMAXBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageMaxBytes").build();
    private static final MarshallingInfo<Boolean> INCLUDENULLANDEMPTY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeNullAndEmpty").build();
    private static final MarshallingInfo<String> SECURITYPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityProtocol").build();
    private static final MarshallingInfo<String> SSLCLIENTCERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslClientCertificateArn").build();
    private static final MarshallingInfo<String> SSLCLIENTKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslClientKeyArn").build();
    private static final MarshallingInfo<String> SSLCLIENTKEYPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslClientKeyPassword").build();
    private static final MarshallingInfo<String> SSLCACERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslCaCertificateArn").build();
    private static final MarshallingInfo<String> SASLUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SaslUsername").build();
    private static final MarshallingInfo<String> SASLPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SaslPassword").build();
    private static final MarshallingInfo<Boolean> NOHEXPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NoHexPrefix").build();

    private static final KafkaSettingsMarshaller instance = new KafkaSettingsMarshaller();

    public static KafkaSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KafkaSettings kafkaSettings, ProtocolMarshaller protocolMarshaller) {

        if (kafkaSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kafkaSettings.getBroker(), BROKER_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getTopic(), TOPIC_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getMessageFormat(), MESSAGEFORMAT_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getIncludeTransactionDetails(), INCLUDETRANSACTIONDETAILS_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getIncludePartitionValue(), INCLUDEPARTITIONVALUE_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getPartitionIncludeSchemaTable(), PARTITIONINCLUDESCHEMATABLE_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getIncludeTableAlterOperations(), INCLUDETABLEALTEROPERATIONS_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getIncludeControlDetails(), INCLUDECONTROLDETAILS_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getMessageMaxBytes(), MESSAGEMAXBYTES_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getIncludeNullAndEmpty(), INCLUDENULLANDEMPTY_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getSecurityProtocol(), SECURITYPROTOCOL_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getSslClientCertificateArn(), SSLCLIENTCERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getSslClientKeyArn(), SSLCLIENTKEYARN_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getSslClientKeyPassword(), SSLCLIENTKEYPASSWORD_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getSslCaCertificateArn(), SSLCACERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getSaslUsername(), SASLUSERNAME_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getSaslPassword(), SASLPASSWORD_BINDING);
            protocolMarshaller.marshall(kafkaSettings.getNoHexPrefix(), NOHEXPREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
