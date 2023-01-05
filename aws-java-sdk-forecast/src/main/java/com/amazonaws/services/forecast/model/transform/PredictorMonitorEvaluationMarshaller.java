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
package com.amazonaws.services.forecast.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PredictorMonitorEvaluationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PredictorMonitorEvaluationMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> MONITORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorArn").build();
    private static final MarshallingInfo<java.util.Date> EVALUATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EVALUATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationState").build();
    private static final MarshallingInfo<java.util.Date> WINDOWSTARTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WindowStartDatetime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> WINDOWENDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WindowEndDatetime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> PREDICTOREVENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictorEvent").build();
    private static final MarshallingInfo<StructuredPojo> MONITORDATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorDataSource").build();
    private static final MarshallingInfo<List> METRICRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetricResults").build();
    private static final MarshallingInfo<Long> NUMITEMSEVALUATED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumItemsEvaluated").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();

    private static final PredictorMonitorEvaluationMarshaller instance = new PredictorMonitorEvaluationMarshaller();

    public static PredictorMonitorEvaluationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PredictorMonitorEvaluation predictorMonitorEvaluation, ProtocolMarshaller protocolMarshaller) {

        if (predictorMonitorEvaluation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(predictorMonitorEvaluation.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getMonitorArn(), MONITORARN_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getEvaluationTime(), EVALUATIONTIME_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getEvaluationState(), EVALUATIONSTATE_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getWindowStartDatetime(), WINDOWSTARTDATETIME_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getWindowEndDatetime(), WINDOWENDDATETIME_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getPredictorEvent(), PREDICTOREVENT_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getMonitorDataSource(), MONITORDATASOURCE_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getMetricResults(), METRICRESULTS_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getNumItemsEvaluated(), NUMITEMSEVALUATED_BINDING);
            protocolMarshaller.marshall(predictorMonitorEvaluation.getMessage(), MESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
