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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TelemetryRecord JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TelemetryRecordJsonUnmarshaller implements Unmarshaller<TelemetryRecord, JsonUnmarshallerContext> {

    public TelemetryRecord unmarshall(JsonUnmarshallerContext context) throws Exception {
        TelemetryRecord telemetryRecord = new TelemetryRecord();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Timestamp", targetDepth)) {
                    context.nextToken();
                    telemetryRecord.setTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SegmentsReceivedCount", targetDepth)) {
                    context.nextToken();
                    telemetryRecord.setSegmentsReceivedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentsSentCount", targetDepth)) {
                    context.nextToken();
                    telemetryRecord.setSegmentsSentCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentsSpilloverCount", targetDepth)) {
                    context.nextToken();
                    telemetryRecord.setSegmentsSpilloverCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentsRejectedCount", targetDepth)) {
                    context.nextToken();
                    telemetryRecord.setSegmentsRejectedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BackendConnectionErrors", targetDepth)) {
                    context.nextToken();
                    telemetryRecord.setBackendConnectionErrors(BackendConnectionErrorsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return telemetryRecord;
    }

    private static TelemetryRecordJsonUnmarshaller instance;

    public static TelemetryRecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TelemetryRecordJsonUnmarshaller();
        return instance;
    }
}
