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
package com.amazonaws.services.batch.model.transform;

import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.protocol.json.*;

/**
 * JobDetailMarshaller
 */
public class JobDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobDetail jobDetail, StructuredJsonGenerator jsonGenerator) {

        if (jobDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobDetail.getJobName() != null) {
                jsonGenerator.writeFieldName("jobName").writeValue(jobDetail.getJobName());
            }
            if (jobDetail.getJobId() != null) {
                jsonGenerator.writeFieldName("jobId").writeValue(jobDetail.getJobId());
            }
            if (jobDetail.getJobQueue() != null) {
                jsonGenerator.writeFieldName("jobQueue").writeValue(jobDetail.getJobQueue());
            }
            if (jobDetail.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(jobDetail.getStatus());
            }
            if (jobDetail.getStatusReason() != null) {
                jsonGenerator.writeFieldName("statusReason").writeValue(jobDetail.getStatusReason());
            }
            if (jobDetail.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(jobDetail.getCreatedAt());
            }
            if (jobDetail.getStartedAt() != null) {
                jsonGenerator.writeFieldName("startedAt").writeValue(jobDetail.getStartedAt());
            }
            if (jobDetail.getStoppedAt() != null) {
                jsonGenerator.writeFieldName("stoppedAt").writeValue(jobDetail.getStoppedAt());
            }

            java.util.List<JobDependency> dependsOnList = jobDetail.getDependsOn();
            if (dependsOnList != null) {
                jsonGenerator.writeFieldName("dependsOn");
                jsonGenerator.writeStartArray();
                for (JobDependency dependsOnListValue : dependsOnList) {
                    if (dependsOnListValue != null) {

                        JobDependencyJsonMarshaller.getInstance().marshall(dependsOnListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (jobDetail.getJobDefinition() != null) {
                jsonGenerator.writeFieldName("jobDefinition").writeValue(jobDetail.getJobDefinition());
            }

            java.util.Map<String, String> parametersMap = jobDetail.getParameters();
            if (parametersMap != null) {
                jsonGenerator.writeFieldName("parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeValue(parametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (jobDetail.getContainer() != null) {
                jsonGenerator.writeFieldName("container");
                ContainerDetailJsonMarshaller.getInstance().marshall(jobDetail.getContainer(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobDetailJsonMarshaller instance;

    public static JobDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobDetailJsonMarshaller();
        return instance;
    }

}
