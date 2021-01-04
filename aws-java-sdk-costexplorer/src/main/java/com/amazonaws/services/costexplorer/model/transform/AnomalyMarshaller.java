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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyMarshaller {

    private static final MarshallingInfo<String> ANOMALYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AnomalyId").build();
    private static final MarshallingInfo<String> ANOMALYSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyStartDate").build();
    private static final MarshallingInfo<String> ANOMALYENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyEndDate").build();
    private static final MarshallingInfo<String> DIMENSIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DimensionValue").build();
    private static final MarshallingInfo<List> ROOTCAUSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RootCauses").build();
    private static final MarshallingInfo<StructuredPojo> ANOMALYSCORE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyScore").build();
    private static final MarshallingInfo<StructuredPojo> IMPACT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Impact").build();
    private static final MarshallingInfo<String> MONITORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorArn").build();
    private static final MarshallingInfo<String> FEEDBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Feedback").build();

    private static final AnomalyMarshaller instance = new AnomalyMarshaller();

    public static AnomalyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Anomaly anomaly, ProtocolMarshaller protocolMarshaller) {

        if (anomaly == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomaly.getAnomalyId(), ANOMALYID_BINDING);
            protocolMarshaller.marshall(anomaly.getAnomalyStartDate(), ANOMALYSTARTDATE_BINDING);
            protocolMarshaller.marshall(anomaly.getAnomalyEndDate(), ANOMALYENDDATE_BINDING);
            protocolMarshaller.marshall(anomaly.getDimensionValue(), DIMENSIONVALUE_BINDING);
            protocolMarshaller.marshall(anomaly.getRootCauses(), ROOTCAUSES_BINDING);
            protocolMarshaller.marshall(anomaly.getAnomalyScore(), ANOMALYSCORE_BINDING);
            protocolMarshaller.marshall(anomaly.getImpact(), IMPACT_BINDING);
            protocolMarshaller.marshall(anomaly.getMonitorArn(), MONITORARN_BINDING);
            protocolMarshaller.marshall(anomaly.getFeedback(), FEEDBACK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
