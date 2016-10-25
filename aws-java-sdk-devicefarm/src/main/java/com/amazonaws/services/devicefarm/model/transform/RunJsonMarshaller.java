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
 * RunMarshaller
 */
public class RunJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Run run, StructuredJsonGenerator jsonGenerator) {

        if (run == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (run.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(run.getArn());
            }
            if (run.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(run.getName());
            }
            if (run.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(run.getType());
            }
            if (run.getPlatform() != null) {
                jsonGenerator.writeFieldName("platform").writeValue(run.getPlatform());
            }
            if (run.getCreated() != null) {
                jsonGenerator.writeFieldName("created").writeValue(run.getCreated());
            }
            if (run.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(run.getStatus());
            }
            if (run.getResult() != null) {
                jsonGenerator.writeFieldName("result").writeValue(run.getResult());
            }
            if (run.getStarted() != null) {
                jsonGenerator.writeFieldName("started").writeValue(run.getStarted());
            }
            if (run.getStopped() != null) {
                jsonGenerator.writeFieldName("stopped").writeValue(run.getStopped());
            }
            if (run.getCounters() != null) {
                jsonGenerator.writeFieldName("counters");
                CountersJsonMarshaller.getInstance().marshall(run.getCounters(), jsonGenerator);
            }
            if (run.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(run.getMessage());
            }
            if (run.getTotalJobs() != null) {
                jsonGenerator.writeFieldName("totalJobs").writeValue(run.getTotalJobs());
            }
            if (run.getCompletedJobs() != null) {
                jsonGenerator.writeFieldName("completedJobs").writeValue(run.getCompletedJobs());
            }
            if (run.getBillingMethod() != null) {
                jsonGenerator.writeFieldName("billingMethod").writeValue(run.getBillingMethod());
            }
            if (run.getDeviceMinutes() != null) {
                jsonGenerator.writeFieldName("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(run.getDeviceMinutes(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RunJsonMarshaller instance;

    public static RunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RunJsonMarshaller();
        return instance;
    }

}
