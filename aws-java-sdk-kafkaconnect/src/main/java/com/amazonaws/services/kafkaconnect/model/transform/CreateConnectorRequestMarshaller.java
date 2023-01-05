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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafkaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateConnectorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateConnectorRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> CAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capacity").build();
    private static final MarshallingInfo<Map> CONNECTORCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorConfiguration").build();
    private static final MarshallingInfo<String> CONNECTORDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorDescription").build();
    private static final MarshallingInfo<String> CONNECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorName").build();
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

    private static final CreateConnectorRequestMarshaller instance = new CreateConnectorRequestMarshaller();

    public static CreateConnectorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateConnectorRequest createConnectorRequest, ProtocolMarshaller protocolMarshaller) {

        if (createConnectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createConnectorRequest.getCapacity(), CAPACITY_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getConnectorConfiguration(), CONNECTORCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getConnectorDescription(), CONNECTORDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getConnectorName(), CONNECTORNAME_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getKafkaCluster(), KAFKACLUSTER_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getKafkaClusterClientAuthentication(), KAFKACLUSTERCLIENTAUTHENTICATION_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getKafkaClusterEncryptionInTransit(), KAFKACLUSTERENCRYPTIONINTRANSIT_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getKafkaConnectVersion(), KAFKACONNECTVERSION_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getLogDelivery(), LOGDELIVERY_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getPlugins(), PLUGINS_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getServiceExecutionRoleArn(), SERVICEEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(createConnectorRequest.getWorkerConfiguration(), WORKERCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
