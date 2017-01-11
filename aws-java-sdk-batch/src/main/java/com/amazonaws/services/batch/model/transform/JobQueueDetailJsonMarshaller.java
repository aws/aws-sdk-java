/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.protocol.json.*;

/**
 * JobQueueDetailMarshaller
 */
public class JobQueueDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobQueueDetail jobQueueDetail, StructuredJsonGenerator jsonGenerator) {

        if (jobQueueDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobQueueDetail.getJobQueueName() != null) {
                jsonGenerator.writeFieldName("jobQueueName").writeValue(jobQueueDetail.getJobQueueName());
            }
            if (jobQueueDetail.getJobQueueArn() != null) {
                jsonGenerator.writeFieldName("jobQueueArn").writeValue(jobQueueDetail.getJobQueueArn());
            }
            if (jobQueueDetail.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(jobQueueDetail.getState());
            }
            if (jobQueueDetail.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(jobQueueDetail.getStatus());
            }
            if (jobQueueDetail.getStatusReason() != null) {
                jsonGenerator.writeFieldName("statusReason").writeValue(jobQueueDetail.getStatusReason());
            }
            if (jobQueueDetail.getPriority() != null) {
                jsonGenerator.writeFieldName("priority").writeValue(jobQueueDetail.getPriority());
            }

            java.util.List<ComputeEnvironmentOrder> computeEnvironmentOrderList = jobQueueDetail.getComputeEnvironmentOrder();
            if (computeEnvironmentOrderList != null) {
                jsonGenerator.writeFieldName("computeEnvironmentOrder");
                jsonGenerator.writeStartArray();
                for (ComputeEnvironmentOrder computeEnvironmentOrderListValue : computeEnvironmentOrderList) {
                    if (computeEnvironmentOrderListValue != null) {

                        ComputeEnvironmentOrderJsonMarshaller.getInstance().marshall(computeEnvironmentOrderListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobQueueDetailJsonMarshaller instance;

    public static JobQueueDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobQueueDetailJsonMarshaller();
        return instance;
    }

}
