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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * JobMarshaller
 */
public class JobJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Job job, StructuredJsonGenerator jsonGenerator) {

        if (job == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (job.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(job.getArn());
            }
            if (job.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(job.getName());
            }
            if (job.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(job.getType());
            }
            if (job.getCreated() != null) {
                jsonGenerator.writeFieldName("created").writeValue(job.getCreated());
            }
            if (job.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(job.getStatus());
            }
            if (job.getResult() != null) {
                jsonGenerator.writeFieldName("result").writeValue(job.getResult());
            }
            if (job.getStarted() != null) {
                jsonGenerator.writeFieldName("started").writeValue(job.getStarted());
            }
            if (job.getStopped() != null) {
                jsonGenerator.writeFieldName("stopped").writeValue(job.getStopped());
            }
            if (job.getCounters() != null) {
                jsonGenerator.writeFieldName("counters");
                CountersJsonMarshaller.getInstance().marshall(job.getCounters(), jsonGenerator);
            }
            if (job.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(job.getMessage());
            }
            if (job.getDevice() != null) {
                jsonGenerator.writeFieldName("device");
                DeviceJsonMarshaller.getInstance().marshall(job.getDevice(), jsonGenerator);
            }
            if (job.getDeviceMinutes() != null) {
                jsonGenerator.writeFieldName("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(job.getDeviceMinutes(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobJsonMarshaller instance;

    public static JobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonMarshaller();
        return instance;
    }

}
