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
package com.amazonaws.services.codeguruprofiler.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeguruprofiler.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchGetFrameMetricDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchGetFrameMetricDataRequestMarshaller {

    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("endTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<List> FRAMEMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("frameMetrics").build();
    private static final MarshallingInfo<String> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("period").build();
    private static final MarshallingInfo<String> PROFILINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("profilingGroupName").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("startTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> TARGETRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("targetResolution").build();

    private static final BatchGetFrameMetricDataRequestMarshaller instance = new BatchGetFrameMetricDataRequestMarshaller();

    public static BatchGetFrameMetricDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchGetFrameMetricDataRequest batchGetFrameMetricDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchGetFrameMetricDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchGetFrameMetricDataRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(batchGetFrameMetricDataRequest.getFrameMetrics(), FRAMEMETRICS_BINDING);
            protocolMarshaller.marshall(batchGetFrameMetricDataRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(batchGetFrameMetricDataRequest.getProfilingGroupName(), PROFILINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(batchGetFrameMetricDataRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(batchGetFrameMetricDataRequest.getTargetResolution(), TARGETRESOLUTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
