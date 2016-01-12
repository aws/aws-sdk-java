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
 * SuiteMarshaller
 */
public class SuiteJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Suite suite, JSONWriter jsonWriter) {
        if (suite == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (suite.getArn() != null) {
                jsonWriter.key("arn").value(suite.getArn());
            }

            if (suite.getName() != null) {
                jsonWriter.key("name").value(suite.getName());
            }

            if (suite.getType() != null) {
                jsonWriter.key("type").value(suite.getType());
            }

            if (suite.getCreated() != null) {
                jsonWriter.key("created").value(suite.getCreated());
            }

            if (suite.getStatus() != null) {
                jsonWriter.key("status").value(suite.getStatus());
            }

            if (suite.getResult() != null) {
                jsonWriter.key("result").value(suite.getResult());
            }

            if (suite.getStarted() != null) {
                jsonWriter.key("started").value(suite.getStarted());
            }

            if (suite.getStopped() != null) {
                jsonWriter.key("stopped").value(suite.getStopped());
            }

            if (suite.getCounters() != null) {
                jsonWriter.key("counters");
                CountersJsonMarshaller.getInstance().marshall(
                        suite.getCounters(), jsonWriter);
            }

            if (suite.getMessage() != null) {
                jsonWriter.key("message").value(suite.getMessage());
            }

            if (suite.getDeviceMinutes() != null) {
                jsonWriter.key("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(
                        suite.getDeviceMinutes(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SuiteJsonMarshaller instance;

    public static SuiteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SuiteJsonMarshaller();
        return instance;
    }

}
