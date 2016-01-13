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
 * RunMarshaller
 */
public class RunJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Run run, JSONWriter jsonWriter) {
        if (run == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (run.getArn() != null) {
                jsonWriter.key("arn").value(run.getArn());
            }

            if (run.getName() != null) {
                jsonWriter.key("name").value(run.getName());
            }

            if (run.getType() != null) {
                jsonWriter.key("type").value(run.getType());
            }

            if (run.getPlatform() != null) {
                jsonWriter.key("platform").value(run.getPlatform());
            }

            if (run.getCreated() != null) {
                jsonWriter.key("created").value(run.getCreated());
            }

            if (run.getStatus() != null) {
                jsonWriter.key("status").value(run.getStatus());
            }

            if (run.getResult() != null) {
                jsonWriter.key("result").value(run.getResult());
            }

            if (run.getStarted() != null) {
                jsonWriter.key("started").value(run.getStarted());
            }

            if (run.getStopped() != null) {
                jsonWriter.key("stopped").value(run.getStopped());
            }

            if (run.getCounters() != null) {
                jsonWriter.key("counters");
                CountersJsonMarshaller.getInstance().marshall(
                        run.getCounters(), jsonWriter);
            }

            if (run.getMessage() != null) {
                jsonWriter.key("message").value(run.getMessage());
            }

            if (run.getTotalJobs() != null) {
                jsonWriter.key("totalJobs").value(run.getTotalJobs());
            }

            if (run.getCompletedJobs() != null) {
                jsonWriter.key("completedJobs").value(run.getCompletedJobs());
            }

            if (run.getBillingMethod() != null) {
                jsonWriter.key("billingMethod").value(run.getBillingMethod());
            }

            if (run.getDeviceMinutes() != null) {
                jsonWriter.key("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(
                        run.getDeviceMinutes(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RunJsonMarshaller instance;

    public static RunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RunJsonMarshaller();
        return instance;
    }

}
