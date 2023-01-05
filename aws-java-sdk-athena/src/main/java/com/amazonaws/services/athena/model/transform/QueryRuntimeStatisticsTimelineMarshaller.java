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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryRuntimeStatisticsTimelineMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryRuntimeStatisticsTimelineMarshaller {

    private static final MarshallingInfo<Long> QUERYQUEUETIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryQueueTimeInMillis").build();
    private static final MarshallingInfo<Long> QUERYPLANNINGTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryPlanningTimeInMillis").build();
    private static final MarshallingInfo<Long> ENGINEEXECUTIONTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineExecutionTimeInMillis").build();
    private static final MarshallingInfo<Long> SERVICEPROCESSINGTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceProcessingTimeInMillis").build();
    private static final MarshallingInfo<Long> TOTALEXECUTIONTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalExecutionTimeInMillis").build();

    private static final QueryRuntimeStatisticsTimelineMarshaller instance = new QueryRuntimeStatisticsTimelineMarshaller();

    public static QueryRuntimeStatisticsTimelineMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryRuntimeStatisticsTimeline queryRuntimeStatisticsTimeline, ProtocolMarshaller protocolMarshaller) {

        if (queryRuntimeStatisticsTimeline == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryRuntimeStatisticsTimeline.getQueryQueueTimeInMillis(), QUERYQUEUETIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(queryRuntimeStatisticsTimeline.getQueryPlanningTimeInMillis(), QUERYPLANNINGTIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(queryRuntimeStatisticsTimeline.getEngineExecutionTimeInMillis(), ENGINEEXECUTIONTIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(queryRuntimeStatisticsTimeline.getServiceProcessingTimeInMillis(), SERVICEPROCESSINGTIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(queryRuntimeStatisticsTimeline.getTotalExecutionTimeInMillis(), TOTALEXECUTIONTIMEINMILLIS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
