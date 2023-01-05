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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevidently.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetExperimentResultsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetExperimentResultsRequestMarshaller {

    private static final MarshallingInfo<String> BASESTAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("baseStat").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EXPERIMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("experiment").build();
    private static final MarshallingInfo<List> METRICNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metricNames").build();
    private static final MarshallingInfo<Long> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<String> PROJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("project").build();
    private static final MarshallingInfo<List> REPORTNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reportNames").build();
    private static final MarshallingInfo<List> RESULTSTATS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resultStats").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> TREATMENTNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("treatmentNames").build();

    private static final GetExperimentResultsRequestMarshaller instance = new GetExperimentResultsRequestMarshaller();

    public static GetExperimentResultsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetExperimentResultsRequest getExperimentResultsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getExperimentResultsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getExperimentResultsRequest.getBaseStat(), BASESTAT_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getExperiment(), EXPERIMENT_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getMetricNames(), METRICNAMES_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getProject(), PROJECT_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getReportNames(), REPORTNAMES_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getResultStats(), RESULTSTATS_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getExperimentResultsRequest.getTreatmentNames(), TREATMENTNAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
