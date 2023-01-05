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
package com.amazonaws.services.kafkaconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafkaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorSummaryMarshaller {

    private static final MarshallingInfo<StructuredPojo> CAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capacity").build();
    private static final MarshallingInfo<String> CONNECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorArn").build();
    private static final MarshallingInfo<String> CONNECTORDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorDescription").build();
    private static final MarshallingInfo<String> CONNECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorName").build();
    private static final MarshallingInfo<String> CONNECTORSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorState").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CURRENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentVersion").build();
    private static final MarshallingInfo<StructuredPojo> KAFKACLUSTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kafkaCluster").build();
    private static final MarshallingInfo<StructuredPojo> KAFKACLUSTERCLIENTAUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kafkaClusterClientAuthentication").build();
    private static final MarshallingInfo<StructuredPojo> KAFKACLUSTERENCRYPTIONINTRANSIT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kafkaClusterEncryptionInTransit").build();
    private static final MarshallingInfo<String> KAFKACONNECTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kafkaConnectVersion").build();
    private static final MarshallingInfo<StructuredPojo> LOGDELIVERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logDelivery").build();
    private static final MarshallingInfo<List> PLUGINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("plugins").build();
    private static final MarshallingInfo<String> SERVICEEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceExecutionRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> WORKERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workerConfiguration").build();

    private static final ConnectorSummaryMarshaller instance = new ConnectorSummaryMarshaller();

    public static ConnectorSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorSummary connectorSummary, ProtocolMarshaller protocolMarshaller) {

        if (connectorSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorSummary.getCapacity(), CAPACITY_BINDING);
            protocolMarshaller.marshall(connectorSummary.getConnectorArn(), CONNECTORARN_BINDING);
            protocolMarshaller.marshall(connectorSummary.getConnectorDescription(), CONNECTORDESCRIPTION_BINDING);
            protocolMarshaller.marshall(connectorSummary.getConnectorName(), CONNECTORNAME_BINDING);
            protocolMarshaller.marshall(connectorSummary.getConnectorState(), CONNECTORSTATE_BINDING);
            protocolMarshaller.marshall(connectorSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(connectorSummary.getCurrentVersion(), CURRENTVERSION_BINDING);
            protocolMarshaller.marshall(connectorSummary.getKafkaCluster(), KAFKACLUSTER_BINDING);
            protocolMarshaller.marshall(connectorSummary.getKafkaClusterClientAuthentication(), KAFKACLUSTERCLIENTAUTHENTICATION_BINDING);
            protocolMarshaller.marshall(connectorSummary.getKafkaClusterEncryptionInTransit(), KAFKACLUSTERENCRYPTIONINTRANSIT_BINDING);
            protocolMarshaller.marshall(connectorSummary.getKafkaConnectVersion(), KAFKACONNECTVERSION_BINDING);
            protocolMarshaller.marshall(connectorSummary.getLogDelivery(), LOGDELIVERY_BINDING);
            protocolMarshaller.marshall(connectorSummary.getPlugins(), PLUGINS_BINDING);
            protocolMarshaller.marshall(connectorSummary.getServiceExecutionRoleArn(), SERVICEEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(connectorSummary.getWorkerConfiguration(), WORKERCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
