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
package com.amazonaws.services.lakeformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PlanningStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PlanningStatisticsMarshaller {

    private static final MarshallingInfo<Long> ESTIMATEDDATATOSCANBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedDataToScanBytes").build();
    private static final MarshallingInfo<Long> PLANNINGTIMEMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlanningTimeMillis").build();
    private static final MarshallingInfo<Long> QUEUETIMEMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueueTimeMillis").build();
    private static final MarshallingInfo<Long> WORKUNITSGENERATEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkUnitsGeneratedCount").build();

    private static final PlanningStatisticsMarshaller instance = new PlanningStatisticsMarshaller();

    public static PlanningStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PlanningStatistics planningStatistics, ProtocolMarshaller protocolMarshaller) {

        if (planningStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(planningStatistics.getEstimatedDataToScanBytes(), ESTIMATEDDATATOSCANBYTES_BINDING);
            protocolMarshaller.marshall(planningStatistics.getPlanningTimeMillis(), PLANNINGTIMEMILLIS_BINDING);
            protocolMarshaller.marshall(planningStatistics.getQueueTimeMillis(), QUEUETIMEMILLIS_BINDING);
            protocolMarshaller.marshall(planningStatistics.getWorkUnitsGeneratedCount(), WORKUNITSGENERATEDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
