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
 * LogStreamMarshaller
 */
public class LogStreamJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(LogStream logStream, JSONWriter jsonWriter) {
        if (logStream == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (logStream.getLogStreamName() != null) {
                jsonWriter.key("logStreamName").value(
                        logStream.getLogStreamName());
            }

            if (logStream.getCreationTime() != null) {
                jsonWriter.key("creationTime").value(
                        logStream.getCreationTime());
            }

            if (logStream.getFirstEventTimestamp() != null) {
                jsonWriter.key("firstEventTimestamp").value(
                        logStream.getFirstEventTimestamp());
            }

            if (logStream.getLastEventTimestamp() != null) {
                jsonWriter.key("lastEventTimestamp").value(
                        logStream.getLastEventTimestamp());
            }

            if (logStream.getLastIngestionTime() != null) {
                jsonWriter.key("lastIngestionTime").value(
                        logStream.getLastIngestionTime());
            }

            if (logStream.getUploadSequenceToken() != null) {
                jsonWriter.key("uploadSequenceToken").value(
                        logStream.getUploadSequenceToken());
            }

            if (logStream.getArn() != null) {
                jsonWriter.key("arn").value(logStream.getArn());
            }

            if (logStream.getStoredBytes() != null) {
                jsonWriter.key("storedBytes").value(logStream.getStoredBytes());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LogStreamJsonMarshaller instance;

    public static LogStreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogStreamJsonMarshaller();
        return instance;
    }

}
