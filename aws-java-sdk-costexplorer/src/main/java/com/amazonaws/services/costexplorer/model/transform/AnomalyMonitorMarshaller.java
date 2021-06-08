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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalyMonitorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyMonitorMarshaller {

    private static final MarshallingInfo<String> MONITORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorArn").build();
    private static final MarshallingInfo<String> MONITORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorName").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<String> LASTUPDATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedDate").build();
    private static final MarshallingInfo<String> LASTEVALUATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastEvaluatedDate").build();
    private static final MarshallingInfo<String> MONITORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorType").build();
    private static final MarshallingInfo<String> MONITORDIMENSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorDimension").build();
    private static final MarshallingInfo<StructuredPojo> MONITORSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorSpecification").build();
    private static final MarshallingInfo<Integer> DIMENSIONALVALUECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DimensionalValueCount").build();

    private static final AnomalyMonitorMarshaller instance = new AnomalyMonitorMarshaller();

    public static AnomalyMonitorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalyMonitor anomalyMonitor, ProtocolMarshaller protocolMarshaller) {

        if (anomalyMonitor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalyMonitor.getMonitorArn(), MONITORARN_BINDING);
            protocolMarshaller.marshall(anomalyMonitor.getMonitorName(), MONITORNAME_BINDING);
            protocolMarshaller.marshall(anomalyMonitor.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(anomalyMonitor.getLastUpdatedDate(), LASTUPDATEDDATE_BINDING);
            protocolMarshaller.marshall(anomalyMonitor.getLastEvaluatedDate(), LASTEVALUATEDDATE_BINDING);
            protocolMarshaller.marshall(anomalyMonitor.getMonitorType(), MONITORTYPE_BINDING);
            protocolMarshaller.marshall(anomalyMonitor.getMonitorDimension(), MONITORDIMENSION_BINDING);
            protocolMarshaller.marshall(anomalyMonitor.getMonitorSpecification(), MONITORSPECIFICATION_BINDING);
            protocolMarshaller.marshall(anomalyMonitor.getDimensionalValueCount(), DIMENSIONALVALUECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
