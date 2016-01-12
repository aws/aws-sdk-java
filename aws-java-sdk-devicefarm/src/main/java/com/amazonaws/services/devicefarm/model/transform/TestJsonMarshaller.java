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

package com.amazonaws.services.devicefarm.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TestMarshaller
 */
public class TestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Test test, JSONWriter jsonWriter) {
        if (test == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (test.getArn() != null) {
                jsonWriter.key("arn").value(test.getArn());
            }

            if (test.getName() != null) {
                jsonWriter.key("name").value(test.getName());
            }

            if (test.getType() != null) {
                jsonWriter.key("type").value(test.getType());
            }

            if (test.getCreated() != null) {
                jsonWriter.key("created").value(test.getCreated());
            }

            if (test.getStatus() != null) {
                jsonWriter.key("status").value(test.getStatus());
            }

            if (test.getResult() != null) {
                jsonWriter.key("result").value(test.getResult());
            }

            if (test.getStarted() != null) {
                jsonWriter.key("started").value(test.getStarted());
            }

            if (test.getStopped() != null) {
                jsonWriter.key("stopped").value(test.getStopped());
            }

            if (test.getCounters() != null) {
                jsonWriter.key("counters");
                CountersJsonMarshaller.getInstance().marshall(
                        test.getCounters(), jsonWriter);
            }

            if (test.getMessage() != null) {
                jsonWriter.key("message").value(test.getMessage());
            }

            if (test.getDeviceMinutes() != null) {
                jsonWriter.key("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(
                        test.getDeviceMinutes(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TestJsonMarshaller instance;

    public static TestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TestJsonMarshaller();
        return instance;
    }

}
