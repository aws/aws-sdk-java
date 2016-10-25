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
 * ExportTaskMarshaller
 */
public class ExportTaskJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ExportTask exportTask, StructuredJsonGenerator jsonGenerator) {

        if (exportTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (exportTask.getTaskId() != null) {
                jsonGenerator.writeFieldName("taskId").writeValue(exportTask.getTaskId());
            }
            if (exportTask.getTaskName() != null) {
                jsonGenerator.writeFieldName("taskName").writeValue(exportTask.getTaskName());
            }
            if (exportTask.getLogGroupName() != null) {
                jsonGenerator.writeFieldName("logGroupName").writeValue(exportTask.getLogGroupName());
            }
            if (exportTask.getFrom() != null) {
                jsonGenerator.writeFieldName("from").writeValue(exportTask.getFrom());
            }
            if (exportTask.getTo() != null) {
                jsonGenerator.writeFieldName("to").writeValue(exportTask.getTo());
            }
            if (exportTask.getDestination() != null) {
                jsonGenerator.writeFieldName("destination").writeValue(exportTask.getDestination());
            }
            if (exportTask.getDestinationPrefix() != null) {
                jsonGenerator.writeFieldName("destinationPrefix").writeValue(exportTask.getDestinationPrefix());
            }
            if (exportTask.getStatus() != null) {
                jsonGenerator.writeFieldName("status");
                ExportTaskStatusJsonMarshaller.getInstance().marshall(exportTask.getStatus(), jsonGenerator);
            }
            if (exportTask.getExecutionInfo() != null) {
                jsonGenerator.writeFieldName("executionInfo");
                ExportTaskExecutionInfoJsonMarshaller.getInstance().marshall(exportTask.getExecutionInfo(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ExportTaskJsonMarshaller instance;

    public static ExportTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskJsonMarshaller();
        return instance;
    }

}
