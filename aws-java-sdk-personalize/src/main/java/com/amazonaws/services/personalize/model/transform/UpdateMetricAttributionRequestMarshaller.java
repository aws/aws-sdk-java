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
package com.amazonaws.services.personalize.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMetricAttributionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMetricAttributionRequestMarshaller {

    private static final MarshallingInfo<List> ADDMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("addMetrics").build();
    private static final MarshallingInfo<List> REMOVEMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("removeMetrics").build();
    private static final MarshallingInfo<StructuredPojo> METRICSOUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricsOutputConfig").build();
    private static final MarshallingInfo<String> METRICATTRIBUTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricAttributionArn").build();

    private static final UpdateMetricAttributionRequestMarshaller instance = new UpdateMetricAttributionRequestMarshaller();

    public static UpdateMetricAttributionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMetricAttributionRequest updateMetricAttributionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMetricAttributionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMetricAttributionRequest.getAddMetrics(), ADDMETRICS_BINDING);
            protocolMarshaller.marshall(updateMetricAttributionRequest.getRemoveMetrics(), REMOVEMETRICS_BINDING);
            protocolMarshaller.marshall(updateMetricAttributionRequest.getMetricsOutputConfig(), METRICSOUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(updateMetricAttributionRequest.getMetricAttributionArn(), METRICATTRIBUTIONARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
