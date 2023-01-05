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
package com.amazonaws.services.cloudwatchrum.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchrum.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateRumMetricDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRumMetricDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> APPMONITORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("AppMonitorName").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationArn").build();
    private static final MarshallingInfo<StructuredPojo> METRICDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDefinition").build();
    private static final MarshallingInfo<String> METRICDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDefinitionId").build();

    private static final UpdateRumMetricDefinitionRequestMarshaller instance = new UpdateRumMetricDefinitionRequestMarshaller();

    public static UpdateRumMetricDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRumMetricDefinitionRequest updateRumMetricDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRumMetricDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRumMetricDefinitionRequest.getAppMonitorName(), APPMONITORNAME_BINDING);
            protocolMarshaller.marshall(updateRumMetricDefinitionRequest.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(updateRumMetricDefinitionRequest.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(updateRumMetricDefinitionRequest.getMetricDefinition(), METRICDEFINITION_BINDING);
            protocolMarshaller.marshall(updateRumMetricDefinitionRequest.getMetricDefinitionId(), METRICDEFINITIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
