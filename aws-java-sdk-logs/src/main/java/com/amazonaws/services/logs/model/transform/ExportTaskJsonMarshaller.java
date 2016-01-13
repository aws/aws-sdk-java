/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.logs.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ExportTaskMarshaller
 */
public class ExportTaskJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ExportTask exportTask, JSONWriter jsonWriter) {
        if (exportTask == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (exportTask.getTaskId() != null) {
                jsonWriter.key("taskId").value(exportTask.getTaskId());
            }

            if (exportTask.getTaskName() != null) {
                jsonWriter.key("taskName").value(exportTask.getTaskName());
            }

            if (exportTask.getLogGroupName() != null) {
                jsonWriter.key("logGroupName").value(
                        exportTask.getLogGroupName());
            }

            if (exportTask.getFrom() != null) {
                jsonWriter.key("from").value(exportTask.getFrom());
            }

            if (exportTask.getTo() != null) {
                jsonWriter.key("to").value(exportTask.getTo());
            }

            if (exportTask.getDestination() != null) {
                jsonWriter.key("destination")
                        .value(exportTask.getDestination());
            }

            if (exportTask.getDestinationPrefix() != null) {
                jsonWriter.key("destinationPrefix").value(
                        exportTask.getDestinationPrefix());
            }

            if (exportTask.getStatus() != null) {
                jsonWriter.key("status");
                ExportTaskStatusJsonMarshaller.getInstance().marshall(
                        exportTask.getStatus(), jsonWriter);
            }

            if (exportTask.getExecutionInfo() != null) {
                jsonWriter.key("executionInfo");
                ExportTaskExecutionInfoJsonMarshaller.getInstance().marshall(
                        exportTask.getExecutionInfo(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ExportTaskJsonMarshaller instance;

    public static ExportTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskJsonMarshaller();
        return instance;
    }

}
