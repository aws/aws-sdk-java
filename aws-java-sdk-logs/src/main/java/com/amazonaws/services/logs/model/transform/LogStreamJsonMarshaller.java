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
package com.amazonaws.services.logs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * LogStreamMarshaller
 */
public class LogStreamJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(LogStream logStream, StructuredJsonGenerator jsonGenerator) {

        if (logStream == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (logStream.getLogStreamName() != null) {
                jsonGenerator.writeFieldName("logStreamName").writeValue(logStream.getLogStreamName());
            }
            if (logStream.getCreationTime() != null) {
                jsonGenerator.writeFieldName("creationTime").writeValue(logStream.getCreationTime());
            }
            if (logStream.getFirstEventTimestamp() != null) {
                jsonGenerator.writeFieldName("firstEventTimestamp").writeValue(logStream.getFirstEventTimestamp());
            }
            if (logStream.getLastEventTimestamp() != null) {
                jsonGenerator.writeFieldName("lastEventTimestamp").writeValue(logStream.getLastEventTimestamp());
            }
            if (logStream.getLastIngestionTime() != null) {
                jsonGenerator.writeFieldName("lastIngestionTime").writeValue(logStream.getLastIngestionTime());
            }
            if (logStream.getUploadSequenceToken() != null) {
                jsonGenerator.writeFieldName("uploadSequenceToken").writeValue(logStream.getUploadSequenceToken());
            }
            if (logStream.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(logStream.getArn());
            }
            if (logStream.getStoredBytes() != null) {
                jsonGenerator.writeFieldName("storedBytes").writeValue(logStream.getStoredBytes());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LogStreamJsonMarshaller instance;

    public static LogStreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogStreamJsonMarshaller();
        return instance;
    }

}
