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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * JobFlowDetailMarshaller
 */
public class JobFlowDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobFlowDetail jobFlowDetail, StructuredJsonGenerator jsonGenerator) {

        if (jobFlowDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobFlowDetail.getJobFlowId() != null) {
                jsonGenerator.writeFieldName("JobFlowId").writeValue(jobFlowDetail.getJobFlowId());
            }
            if (jobFlowDetail.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(jobFlowDetail.getName());
            }
            if (jobFlowDetail.getLogUri() != null) {
                jsonGenerator.writeFieldName("LogUri").writeValue(jobFlowDetail.getLogUri());
            }
            if (jobFlowDetail.getAmiVersion() != null) {
                jsonGenerator.writeFieldName("AmiVersion").writeValue(jobFlowDetail.getAmiVersion());
            }
            if (jobFlowDetail.getExecutionStatusDetail() != null) {
                jsonGenerator.writeFieldName("ExecutionStatusDetail");
                JobFlowExecutionStatusDetailJsonMarshaller.getInstance().marshall(jobFlowDetail.getExecutionStatusDetail(), jsonGenerator);
            }
            if (jobFlowDetail.getInstances() != null) {
                jsonGenerator.writeFieldName("Instances");
                JobFlowInstancesDetailJsonMarshaller.getInstance().marshall(jobFlowDetail.getInstances(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<StepDetail> stepsList = (com.amazonaws.internal.SdkInternalList<StepDetail>) jobFlowDetail.getSteps();
            if (!stepsList.isEmpty() || !stepsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Steps");
                jsonGenerator.writeStartArray();
                for (StepDetail stepsListValue : stepsList) {
                    if (stepsListValue != null) {

                        StepDetailJsonMarshaller.getInstance().marshall(stepsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<BootstrapActionDetail> bootstrapActionsList = (com.amazonaws.internal.SdkInternalList<BootstrapActionDetail>) jobFlowDetail
                    .getBootstrapActions();
            if (!bootstrapActionsList.isEmpty() || !bootstrapActionsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("BootstrapActions");
                jsonGenerator.writeStartArray();
                for (BootstrapActionDetail bootstrapActionsListValue : bootstrapActionsList) {
                    if (bootstrapActionsListValue != null) {

                        BootstrapActionDetailJsonMarshaller.getInstance().marshall(bootstrapActionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> supportedProductsList = (com.amazonaws.internal.SdkInternalList<String>) jobFlowDetail
                    .getSupportedProducts();
            if (!supportedProductsList.isEmpty() || !supportedProductsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SupportedProducts");
                jsonGenerator.writeStartArray();
                for (String supportedProductsListValue : supportedProductsList) {
                    if (supportedProductsListValue != null) {
                        jsonGenerator.writeValue(supportedProductsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (jobFlowDetail.getVisibleToAllUsers() != null) {
                jsonGenerator.writeFieldName("VisibleToAllUsers").writeValue(jobFlowDetail.getVisibleToAllUsers());
            }
            if (jobFlowDetail.getJobFlowRole() != null) {
                jsonGenerator.writeFieldName("JobFlowRole").writeValue(jobFlowDetail.getJobFlowRole());
            }
            if (jobFlowDetail.getServiceRole() != null) {
                jsonGenerator.writeFieldName("ServiceRole").writeValue(jobFlowDetail.getServiceRole());
            }
            if (jobFlowDetail.getAutoScalingRole() != null) {
                jsonGenerator.writeFieldName("AutoScalingRole").writeValue(jobFlowDetail.getAutoScalingRole());
            }
            if (jobFlowDetail.getScaleDownBehavior() != null) {
                jsonGenerator.writeFieldName("ScaleDownBehavior").writeValue(jobFlowDetail.getScaleDownBehavior());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobFlowDetailJsonMarshaller instance;

    public static JobFlowDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowDetailJsonMarshaller();
        return instance;
    }

}
