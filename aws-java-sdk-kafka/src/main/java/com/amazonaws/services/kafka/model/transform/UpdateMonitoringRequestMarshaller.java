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
 * UpdateMonitoringRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMonitoringRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<String> CURRENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentVersion").build();
    private static final MarshallingInfo<String> ENHANCEDMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedMonitoring").build();
    private static final MarshallingInfo<StructuredPojo> OPENMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openMonitoring").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loggingInfo").build();

    private static final UpdateMonitoringRequestMarshaller instance = new UpdateMonitoringRequestMarshaller();

    public static UpdateMonitoringRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMonitoringRequest updateMonitoringRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMonitoringRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMonitoringRequest.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(updateMonitoringRequest.getCurrentVersion(), CURRENTVERSION_BINDING);
            protocolMarshaller.marshall(updateMonitoringRequest.getEnhancedMonitoring(), ENHANCEDMONITORING_BINDING);
            protocolMarshaller.marshall(updateMonitoringRequest.getOpenMonitoring(), OPENMONITORING_BINDING);
            protocolMarshaller.marshall(updateMonitoringRequest.getLoggingInfo(), LOGGINGINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
