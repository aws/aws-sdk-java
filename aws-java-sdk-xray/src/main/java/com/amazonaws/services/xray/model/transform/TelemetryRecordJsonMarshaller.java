/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TelemetryRecordMarshaller
 */
public class TelemetryRecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TelemetryRecord telemetryRecord, StructuredJsonGenerator jsonGenerator) {

        if (telemetryRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (telemetryRecord.getTimestamp() != null) {
                jsonGenerator.writeFieldName("Timestamp").writeValue(telemetryRecord.getTimestamp());
            }
            if (telemetryRecord.getSegmentsReceivedCount() != null) {
                jsonGenerator.writeFieldName("SegmentsReceivedCount").writeValue(telemetryRecord.getSegmentsReceivedCount());
            }
            if (telemetryRecord.getSegmentsSentCount() != null) {
                jsonGenerator.writeFieldName("SegmentsSentCount").writeValue(telemetryRecord.getSegmentsSentCount());
            }
            if (telemetryRecord.getSegmentsSpilloverCount() != null) {
                jsonGenerator.writeFieldName("SegmentsSpilloverCount").writeValue(telemetryRecord.getSegmentsSpilloverCount());
            }
            if (telemetryRecord.getSegmentsRejectedCount() != null) {
                jsonGenerator.writeFieldName("SegmentsRejectedCount").writeValue(telemetryRecord.getSegmentsRejectedCount());
            }
            if (telemetryRecord.getBackendConnectionErrors() != null) {
                jsonGenerator.writeFieldName("BackendConnectionErrors");
                BackendConnectionErrorsJsonMarshaller.getInstance().marshall(telemetryRecord.getBackendConnectionErrors(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TelemetryRecordJsonMarshaller instance;

    public static TelemetryRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TelemetryRecordJsonMarshaller();
        return instance;
    }

}
