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
package com.amazonaws.services.timestreaminfluxdb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreaminfluxdb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InfluxDBv2ParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InfluxDBv2ParametersMarshaller {

    private static final MarshallingInfo<Boolean> FLUXLOGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fluxLogEnabled").build();
    private static final MarshallingInfo<String> LOGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logLevel").build();
    private static final MarshallingInfo<Boolean> NOTASKS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("noTasks").build();
    private static final MarshallingInfo<Integer> QUERYCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryConcurrency").build();
    private static final MarshallingInfo<Integer> QUERYQUEUESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryQueueSize").build();
    private static final MarshallingInfo<String> TRACINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tracingType").build();
    private static final MarshallingInfo<Boolean> METRICSDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricsDisabled").build();

    private static final InfluxDBv2ParametersMarshaller instance = new InfluxDBv2ParametersMarshaller();

    public static InfluxDBv2ParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InfluxDBv2Parameters influxDBv2Parameters, ProtocolMarshaller protocolMarshaller) {

        if (influxDBv2Parameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(influxDBv2Parameters.getFluxLogEnabled(), FLUXLOGENABLED_BINDING);
            protocolMarshaller.marshall(influxDBv2Parameters.getLogLevel(), LOGLEVEL_BINDING);
            protocolMarshaller.marshall(influxDBv2Parameters.getNoTasks(), NOTASKS_BINDING);
            protocolMarshaller.marshall(influxDBv2Parameters.getQueryConcurrency(), QUERYCONCURRENCY_BINDING);
            protocolMarshaller.marshall(influxDBv2Parameters.getQueryQueueSize(), QUERYQUEUESIZE_BINDING);
            protocolMarshaller.marshall(influxDBv2Parameters.getTracingType(), TRACINGTYPE_BINDING);
            protocolMarshaller.marshall(influxDBv2Parameters.getMetricsDisabled(), METRICSDISABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
