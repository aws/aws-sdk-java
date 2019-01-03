/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TelemetryRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TelemetryRecordMarshaller {

    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> SEGMENTSRECEIVEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentsReceivedCount").build();
    private static final MarshallingInfo<Integer> SEGMENTSSENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentsSentCount").build();
    private static final MarshallingInfo<Integer> SEGMENTSSPILLOVERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentsSpilloverCount").build();
    private static final MarshallingInfo<Integer> SEGMENTSREJECTEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentsRejectedCount").build();
    private static final MarshallingInfo<StructuredPojo> BACKENDCONNECTIONERRORS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackendConnectionErrors").build();

    private static final TelemetryRecordMarshaller instance = new TelemetryRecordMarshaller();

    public static TelemetryRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TelemetryRecord telemetryRecord, ProtocolMarshaller protocolMarshaller) {

        if (telemetryRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(telemetryRecord.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(telemetryRecord.getSegmentsReceivedCount(), SEGMENTSRECEIVEDCOUNT_BINDING);
            protocolMarshaller.marshall(telemetryRecord.getSegmentsSentCount(), SEGMENTSSENTCOUNT_BINDING);
            protocolMarshaller.marshall(telemetryRecord.getSegmentsSpilloverCount(), SEGMENTSSPILLOVERCOUNT_BINDING);
            protocolMarshaller.marshall(telemetryRecord.getSegmentsRejectedCount(), SEGMENTSREJECTEDCOUNT_BINDING);
            protocolMarshaller.marshall(telemetryRecord.getBackendConnectionErrors(), BACKENDCONNECTIONERRORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
