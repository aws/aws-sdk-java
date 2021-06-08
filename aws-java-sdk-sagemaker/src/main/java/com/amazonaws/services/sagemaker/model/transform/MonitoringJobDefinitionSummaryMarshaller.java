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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MonitoringJobDefinitionSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MonitoringJobDefinitionSummaryMarshaller {

    private static final MarshallingInfo<String> MONITORINGJOBDEFINITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringJobDefinitionName").build();
    private static final MarshallingInfo<String> MONITORINGJOBDEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringJobDefinitionArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();

    private static final MonitoringJobDefinitionSummaryMarshaller instance = new MonitoringJobDefinitionSummaryMarshaller();

    public static MonitoringJobDefinitionSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MonitoringJobDefinitionSummary monitoringJobDefinitionSummary, ProtocolMarshaller protocolMarshaller) {

        if (monitoringJobDefinitionSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(monitoringJobDefinitionSummary.getMonitoringJobDefinitionName(), MONITORINGJOBDEFINITIONNAME_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinitionSummary.getMonitoringJobDefinitionArn(), MONITORINGJOBDEFINITIONARN_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinitionSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(monitoringJobDefinitionSummary.getEndpointName(), ENDPOINTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
