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
package com.amazonaws.services.devopsguru.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReactiveAnomalyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReactiveAnomalyMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Severity").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> ANOMALYTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> ANOMALYREPORTEDTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyReportedTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceDetails").build();
    private static final MarshallingInfo<String> ASSOCIATEDINSIGHTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatedInsightId").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCollection").build();

    private static final ReactiveAnomalyMarshaller instance = new ReactiveAnomalyMarshaller();

    public static ReactiveAnomalyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReactiveAnomaly reactiveAnomaly, ProtocolMarshaller protocolMarshaller) {

        if (reactiveAnomaly == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reactiveAnomaly.getId(), ID_BINDING);
            protocolMarshaller.marshall(reactiveAnomaly.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(reactiveAnomaly.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(reactiveAnomaly.getAnomalyTimeRange(), ANOMALYTIMERANGE_BINDING);
            protocolMarshaller.marshall(reactiveAnomaly.getAnomalyReportedTimeRange(), ANOMALYREPORTEDTIMERANGE_BINDING);
            protocolMarshaller.marshall(reactiveAnomaly.getSourceDetails(), SOURCEDETAILS_BINDING);
            protocolMarshaller.marshall(reactiveAnomaly.getAssociatedInsightId(), ASSOCIATEDINSIGHTID_BINDING);
            protocolMarshaller.marshall(reactiveAnomaly.getResourceCollection(), RESOURCECOLLECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
