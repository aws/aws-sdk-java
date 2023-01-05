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
 * BatchDeleteRumMetricDefinitionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchDeleteRumMetricDefinitionsRequestMarshaller {

    private static final MarshallingInfo<String> APPMONITORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("AppMonitorName").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("destination").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("destinationArn").build();
    private static final MarshallingInfo<List> METRICDEFINITIONIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("metricDefinitionIds").build();

    private static final BatchDeleteRumMetricDefinitionsRequestMarshaller instance = new BatchDeleteRumMetricDefinitionsRequestMarshaller();

    public static BatchDeleteRumMetricDefinitionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchDeleteRumMetricDefinitionsRequest batchDeleteRumMetricDefinitionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchDeleteRumMetricDefinitionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchDeleteRumMetricDefinitionsRequest.getAppMonitorName(), APPMONITORNAME_BINDING);
            protocolMarshaller.marshall(batchDeleteRumMetricDefinitionsRequest.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(batchDeleteRumMetricDefinitionsRequest.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(batchDeleteRumMetricDefinitionsRequest.getMetricDefinitionIds(), METRICDEFINITIONIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
