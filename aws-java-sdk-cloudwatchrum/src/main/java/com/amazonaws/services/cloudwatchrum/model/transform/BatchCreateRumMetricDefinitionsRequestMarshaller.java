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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchrum.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchCreateRumMetricDefinitionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchCreateRumMetricDefinitionsRequestMarshaller {

    private static final MarshallingInfo<String> APPMONITORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("AppMonitorName").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationArn").build();
    private static final MarshallingInfo<List> METRICDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDefinitions").build();

    private static final BatchCreateRumMetricDefinitionsRequestMarshaller instance = new BatchCreateRumMetricDefinitionsRequestMarshaller();

    public static BatchCreateRumMetricDefinitionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchCreateRumMetricDefinitionsRequest batchCreateRumMetricDefinitionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchCreateRumMetricDefinitionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchCreateRumMetricDefinitionsRequest.getAppMonitorName(), APPMONITORNAME_BINDING);
            protocolMarshaller.marshall(batchCreateRumMetricDefinitionsRequest.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(batchCreateRumMetricDefinitionsRequest.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(batchCreateRumMetricDefinitionsRequest.getMetricDefinitions(), METRICDEFINITIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
