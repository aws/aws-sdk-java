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

package com.amazonaws.services.cloudwatchevents.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * PutEventsRequestEntryMarshaller
 */
public class PutEventsRequestEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(PutEventsRequestEntry putEventsRequestEntry,
            JSONWriter jsonWriter) {
        if (putEventsRequestEntry == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (putEventsRequestEntry.getTime() != null) {
                jsonWriter.key("Time").value(putEventsRequestEntry.getTime());
            }
            if (putEventsRequestEntry.getSource() != null) {
                jsonWriter.key("Source").value(
                        putEventsRequestEntry.getSource());
            }

            java.util.List<String> resourcesList = putEventsRequestEntry
                    .getResources();
            if (resourcesList != null) {
                jsonWriter.key("Resources");
                jsonWriter.array();
                for (String resourcesListValue : resourcesList) {
                    if (resourcesListValue != null) {
                        jsonWriter.value(resourcesListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (putEventsRequestEntry.getDetailType() != null) {
                jsonWriter.key("DetailType").value(
                        putEventsRequestEntry.getDetailType());
            }
            if (putEventsRequestEntry.getDetail() != null) {
                jsonWriter.key("Detail").value(
                        putEventsRequestEntry.getDetail());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PutEventsRequestEntryJsonMarshaller instance;

    public static PutEventsRequestEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutEventsRequestEntryJsonMarshaller();
        return instance;
    }

}
