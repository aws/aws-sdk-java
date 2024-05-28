/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ClusterOperationV2Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterOperationV2Marshaller {

    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<String> CLUSTERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterType").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> ERRORINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorInfo").build();
    private static final MarshallingInfo<String> OPERATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operationArn").build();
    private static final MarshallingInfo<String> OPERATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operationState").build();
    private static final MarshallingInfo<String> OPERATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operationType").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("provisioned").build();
    private static final MarshallingInfo<StructuredPojo> SERVERLESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverless").build();

    private static final ClusterOperationV2Marshaller instance = new ClusterOperationV2Marshaller();

    public static ClusterOperationV2Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClusterOperationV2 clusterOperationV2, ProtocolMarshaller protocolMarshaller) {

        if (clusterOperationV2 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clusterOperationV2.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getClusterType(), CLUSTERTYPE_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getErrorInfo(), ERRORINFO_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getOperationArn(), OPERATIONARN_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getOperationState(), OPERATIONSTATE_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getOperationType(), OPERATIONTYPE_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getProvisioned(), PROVISIONED_BINDING);
            protocolMarshaller.marshall(clusterOperationV2.getServerless(), SERVERLESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
