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

package com.amazonaws.services.elasticmapreduce.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * JobFlowDetailMarshaller
 */
public class JobFlowDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(JobFlowDetail jobFlowDetail, JSONWriter jsonWriter) {
        if (jobFlowDetail == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (jobFlowDetail.getJobFlowId() != null) {
                jsonWriter.key("JobFlowId").value(jobFlowDetail.getJobFlowId());
            }

            if (jobFlowDetail.getName() != null) {
                jsonWriter.key("Name").value(jobFlowDetail.getName());
            }

            if (jobFlowDetail.getLogUri() != null) {
                jsonWriter.key("LogUri").value(jobFlowDetail.getLogUri());
            }

            if (jobFlowDetail.getAmiVersion() != null) {
                jsonWriter.key("AmiVersion").value(
                        jobFlowDetail.getAmiVersion());
            }

            if (jobFlowDetail.getExecutionStatusDetail() != null) {
                jsonWriter.key("ExecutionStatusDetail");
                JobFlowExecutionStatusDetailJsonMarshaller.getInstance()
                        .marshall(jobFlowDetail.getExecutionStatusDetail(),
                                jsonWriter);
            }

            if (jobFlowDetail.getInstances() != null) {
                jsonWriter.key("Instances");
                JobFlowInstancesDetailJsonMarshaller.getInstance().marshall(
                        jobFlowDetail.getInstances(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<StepDetail> stepsList = (com.amazonaws.internal.SdkInternalList<StepDetail>) jobFlowDetail
                    .getSteps();
            if (!stepsList.isEmpty() || !stepsList.isAutoConstruct()) {
                jsonWriter.key("Steps");
                jsonWriter.array();
                for (StepDetail stepsListValue : stepsList) {
                    if (stepsListValue != null) {

                        StepDetailJsonMarshaller.getInstance().marshall(
                                stepsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<BootstrapActionDetail> bootstrapActionsList = (com.amazonaws.internal.SdkInternalList<BootstrapActionDetail>) jobFlowDetail
                    .getBootstrapActions();
            if (!bootstrapActionsList.isEmpty()
                    || !bootstrapActionsList.isAutoConstruct()) {
                jsonWriter.key("BootstrapActions");
                jsonWriter.array();
                for (BootstrapActionDetail bootstrapActionsListValue : bootstrapActionsList) {
                    if (bootstrapActionsListValue != null) {

                        BootstrapActionDetailJsonMarshaller
                                .getInstance()
                                .marshall(bootstrapActionsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> supportedProductsList = (com.amazonaws.internal.SdkInternalList<String>) jobFlowDetail
                    .getSupportedProducts();
            if (!supportedProductsList.isEmpty()
                    || !supportedProductsList.isAutoConstruct()) {
                jsonWriter.key("SupportedProducts");
                jsonWriter.array();
                for (String supportedProductsListValue : supportedProductsList) {
                    if (supportedProductsListValue != null) {
                        jsonWriter.value(supportedProductsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (jobFlowDetail.getVisibleToAllUsers() != null) {
                jsonWriter.key("VisibleToAllUsers").value(
                        jobFlowDetail.getVisibleToAllUsers());
            }

            if (jobFlowDetail.getJobFlowRole() != null) {
                jsonWriter.key("JobFlowRole").value(
                        jobFlowDetail.getJobFlowRole());
            }

            if (jobFlowDetail.getServiceRole() != null) {
                jsonWriter.key("ServiceRole").value(
                        jobFlowDetail.getServiceRole());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobFlowDetailJsonMarshaller instance;

    public static JobFlowDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowDetailJsonMarshaller();
        return instance;
    }

}
