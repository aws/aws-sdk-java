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
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RunJobFlowRequest Marshaller
 */
public class RunJobFlowRequestMarshaller implements
        Marshaller<Request<RunJobFlowRequest>, RunJobFlowRequest> {

    public Request<RunJobFlowRequest> marshall(
            RunJobFlowRequest runJobFlowRequest) {

        if (runJobFlowRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RunJobFlowRequest> request = new DefaultRequest<RunJobFlowRequest>(
                runJobFlowRequest, "AmazonElasticMapReduce");
        request.addHeader("X-Amz-Target", "ElasticMapReduce.RunJobFlow");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (runJobFlowRequest.getName() != null) {
                jsonWriter.key("Name").value(runJobFlowRequest.getName());
            }

            if (runJobFlowRequest.getLogUri() != null) {
                jsonWriter.key("LogUri").value(runJobFlowRequest.getLogUri());
            }

            if (runJobFlowRequest.getAdditionalInfo() != null) {
                jsonWriter.key("AdditionalInfo").value(
                        runJobFlowRequest.getAdditionalInfo());
            }

            if (runJobFlowRequest.getAmiVersion() != null) {
                jsonWriter.key("AmiVersion").value(
                        runJobFlowRequest.getAmiVersion());
            }

            if (runJobFlowRequest.getReleaseLabel() != null) {
                jsonWriter.key("ReleaseLabel").value(
                        runJobFlowRequest.getReleaseLabel());
            }

            if (runJobFlowRequest.getInstances() != null) {
                jsonWriter.key("Instances");
                JobFlowInstancesConfigJsonMarshaller.getInstance().marshall(
                        runJobFlowRequest.getInstances(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<StepConfig> stepsList = (com.amazonaws.internal.SdkInternalList<StepConfig>) runJobFlowRequest
                    .getSteps();
            if (!stepsList.isEmpty() || !stepsList.isAutoConstruct()) {
                jsonWriter.key("Steps");
                jsonWriter.array();
                for (StepConfig stepsListValue : stepsList) {
                    if (stepsListValue != null) {

                        StepConfigJsonMarshaller.getInstance().marshall(
                                stepsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<BootstrapActionConfig> bootstrapActionsList = (com.amazonaws.internal.SdkInternalList<BootstrapActionConfig>) runJobFlowRequest
                    .getBootstrapActions();
            if (!bootstrapActionsList.isEmpty()
                    || !bootstrapActionsList.isAutoConstruct()) {
                jsonWriter.key("BootstrapActions");
                jsonWriter.array();
                for (BootstrapActionConfig bootstrapActionsListValue : bootstrapActionsList) {
                    if (bootstrapActionsListValue != null) {

                        BootstrapActionConfigJsonMarshaller
                                .getInstance()
                                .marshall(bootstrapActionsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> supportedProductsList = (com.amazonaws.internal.SdkInternalList<String>) runJobFlowRequest
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

            com.amazonaws.internal.SdkInternalList<SupportedProductConfig> newSupportedProductsList = (com.amazonaws.internal.SdkInternalList<SupportedProductConfig>) runJobFlowRequest
                    .getNewSupportedProducts();
            if (!newSupportedProductsList.isEmpty()
                    || !newSupportedProductsList.isAutoConstruct()) {
                jsonWriter.key("NewSupportedProducts");
                jsonWriter.array();
                for (SupportedProductConfig newSupportedProductsListValue : newSupportedProductsList) {
                    if (newSupportedProductsListValue != null) {

                        SupportedProductConfigJsonMarshaller.getInstance()
                                .marshall(newSupportedProductsListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<Application> applicationsList = (com.amazonaws.internal.SdkInternalList<Application>) runJobFlowRequest
                    .getApplications();
            if (!applicationsList.isEmpty()
                    || !applicationsList.isAutoConstruct()) {
                jsonWriter.key("Applications");
                jsonWriter.array();
                for (Application applicationsListValue : applicationsList) {
                    if (applicationsListValue != null) {

                        ApplicationJsonMarshaller.getInstance().marshall(
                                applicationsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<Configuration> configurationsList = (com.amazonaws.internal.SdkInternalList<Configuration>) runJobFlowRequest
                    .getConfigurations();
            if (!configurationsList.isEmpty()
                    || !configurationsList.isAutoConstruct()) {
                jsonWriter.key("Configurations");
                jsonWriter.array();
                for (Configuration configurationsListValue : configurationsList) {
                    if (configurationsListValue != null) {

                        ConfigurationJsonMarshaller.getInstance().marshall(
                                configurationsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (runJobFlowRequest.getVisibleToAllUsers() != null) {
                jsonWriter.key("VisibleToAllUsers").value(
                        runJobFlowRequest.getVisibleToAllUsers());
            }

            if (runJobFlowRequest.getJobFlowRole() != null) {
                jsonWriter.key("JobFlowRole").value(
                        runJobFlowRequest.getJobFlowRole());
            }

            if (runJobFlowRequest.getServiceRole() != null) {
                jsonWriter.key("ServiceRole").value(
                        runJobFlowRequest.getServiceRole());
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) runJobFlowRequest
                    .getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonWriter.key("Tags");
                jsonWriter.array();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
