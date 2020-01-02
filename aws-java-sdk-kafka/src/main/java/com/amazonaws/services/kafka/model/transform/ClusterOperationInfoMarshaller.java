/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ClusterOperationInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterOperationInfoMarshaller {

    private static final MarshallingInfo<String> CLIENTREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestId").build();
    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();
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
    private static final MarshallingInfo<StructuredPojo> SOURCECLUSTERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceClusterInfo").build();
    private static final MarshallingInfo<StructuredPojo> TARGETCLUSTERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetClusterInfo").build();

    private static final ClusterOperationInfoMarshaller instance = new ClusterOperationInfoMarshaller();

    public static ClusterOperationInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClusterOperationInfo clusterOperationInfo, ProtocolMarshaller protocolMarshaller) {

        if (clusterOperationInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clusterOperationInfo.getClientRequestId(), CLIENTREQUESTID_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getErrorInfo(), ERRORINFO_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getOperationArn(), OPERATIONARN_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getOperationState(), OPERATIONSTATE_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getOperationType(), OPERATIONTYPE_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getSourceClusterInfo(), SOURCECLUSTERINFO_BINDING);
            protocolMarshaller.marshall(clusterOperationInfo.getTargetClusterInfo(), TARGETCLUSTERINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
