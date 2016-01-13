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
 * JobMarshaller
 */
public class JobJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Job job, JSONWriter jsonWriter) {
        if (job == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (job.getArn() != null) {
                jsonWriter.key("arn").value(job.getArn());
            }

            if (job.getName() != null) {
                jsonWriter.key("name").value(job.getName());
            }

            if (job.getType() != null) {
                jsonWriter.key("type").value(job.getType());
            }

            if (job.getCreated() != null) {
                jsonWriter.key("created").value(job.getCreated());
            }

            if (job.getStatus() != null) {
                jsonWriter.key("status").value(job.getStatus());
            }

            if (job.getResult() != null) {
                jsonWriter.key("result").value(job.getResult());
            }

            if (job.getStarted() != null) {
                jsonWriter.key("started").value(job.getStarted());
            }

            if (job.getStopped() != null) {
                jsonWriter.key("stopped").value(job.getStopped());
            }

            if (job.getCounters() != null) {
                jsonWriter.key("counters");
                CountersJsonMarshaller.getInstance().marshall(
                        job.getCounters(), jsonWriter);
            }

            if (job.getMessage() != null) {
                jsonWriter.key("message").value(job.getMessage());
            }

            if (job.getDevice() != null) {
                jsonWriter.key("device");
                DeviceJsonMarshaller.getInstance().marshall(job.getDevice(),
                        jsonWriter);
            }

            if (job.getDeviceMinutes() != null) {
                jsonWriter.key("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(
                        job.getDeviceMinutes(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobJsonMarshaller instance;

    public static JobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonMarshaller();
        return instance;
    }

}
