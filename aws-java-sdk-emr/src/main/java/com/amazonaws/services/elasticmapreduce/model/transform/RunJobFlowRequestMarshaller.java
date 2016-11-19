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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RunJobFlowRequest Marshaller
 */
public class RunJobFlowRequestMarshaller implements Marshaller<Request<RunJobFlowRequest>, RunJobFlowRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RunJobFlowRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RunJobFlowRequest> marshall(RunJobFlowRequest runJobFlowRequest) {

        if (runJobFlowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RunJobFlowRequest> request = new DefaultRequest<RunJobFlowRequest>(runJobFlowRequest, "AmazonElasticMapReduce");
        request.addHeader("X-Amz-Target", "ElasticMapReduce.RunJobFlow");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (runJobFlowRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(runJobFlowRequest.getName());
            }
            if (runJobFlowRequest.getLogUri() != null) {
                jsonGenerator.writeFieldName("LogUri").writeValue(runJobFlowRequest.getLogUri());
            }
            if (runJobFlowRequest.getAdditionalInfo() != null) {
                jsonGenerator.writeFieldName("AdditionalInfo").writeValue(runJobFlowRequest.getAdditionalInfo());
            }
            if (runJobFlowRequest.getAmiVersion() != null) {
                jsonGenerator.writeFieldName("AmiVersion").writeValue(runJobFlowRequest.getAmiVersion());
            }
            if (runJobFlowRequest.getReleaseLabel() != null) {
                jsonGenerator.writeFieldName("ReleaseLabel").writeValue(runJobFlowRequest.getReleaseLabel());
            }
            if (runJobFlowRequest.getInstances() != null) {
                jsonGenerator.writeFieldName("Instances");
                JobFlowInstancesConfigJsonMarshaller.getInstance().marshall(runJobFlowRequest.getInstances(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<StepConfig> stepsList = (com.amazonaws.internal.SdkInternalList<StepConfig>) runJobFlowRequest.getSteps();
            if (!stepsList.isEmpty() || !stepsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Steps");
                jsonGenerator.writeStartArray();
                for (StepConfig stepsListValue : stepsList) {
                    if (stepsListValue != null) {

                        StepConfigJsonMarshaller.getInstance().marshall(stepsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<BootstrapActionConfig> bootstrapActionsList = (com.amazonaws.internal.SdkInternalList<BootstrapActionConfig>) runJobFlowRequest
                    .getBootstrapActions();
            if (!bootstrapActionsList.isEmpty() || !bootstrapActionsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("BootstrapActions");
                jsonGenerator.writeStartArray();
                for (BootstrapActionConfig bootstrapActionsListValue : bootstrapActionsList) {
                    if (bootstrapActionsListValue != null) {

                        BootstrapActionConfigJsonMarshaller.getInstance().marshall(bootstrapActionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> supportedProductsList = (com.amazonaws.internal.SdkInternalList<String>) runJobFlowRequest
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

            com.amazonaws.internal.SdkInternalList<SupportedProductConfig> newSupportedProductsList = (com.amazonaws.internal.SdkInternalList<SupportedProductConfig>) runJobFlowRequest
                    .getNewSupportedProducts();
            if (!newSupportedProductsList.isEmpty() || !newSupportedProductsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("NewSupportedProducts");
                jsonGenerator.writeStartArray();
                for (SupportedProductConfig newSupportedProductsListValue : newSupportedProductsList) {
                    if (newSupportedProductsListValue != null) {

                        SupportedProductConfigJsonMarshaller.getInstance().marshall(newSupportedProductsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<Application> applicationsList = (com.amazonaws.internal.SdkInternalList<Application>) runJobFlowRequest
                    .getApplications();
            if (!applicationsList.isEmpty() || !applicationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Applications");
                jsonGenerator.writeStartArray();
                for (Application applicationsListValue : applicationsList) {
                    if (applicationsListValue != null) {

                        ApplicationJsonMarshaller.getInstance().marshall(applicationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<Configuration> configurationsList = (com.amazonaws.internal.SdkInternalList<Configuration>) runJobFlowRequest
                    .getConfigurations();
            if (!configurationsList.isEmpty() || !configurationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Configurations");
                jsonGenerator.writeStartArray();
                for (Configuration configurationsListValue : configurationsList) {
                    if (configurationsListValue != null) {

                        ConfigurationJsonMarshaller.getInstance().marshall(configurationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (runJobFlowRequest.getVisibleToAllUsers() != null) {
                jsonGenerator.writeFieldName("VisibleToAllUsers").writeValue(runJobFlowRequest.getVisibleToAllUsers());
            }
            if (runJobFlowRequest.getJobFlowRole() != null) {
                jsonGenerator.writeFieldName("JobFlowRole").writeValue(runJobFlowRequest.getJobFlowRole());
            }
            if (runJobFlowRequest.getServiceRole() != null) {
                jsonGenerator.writeFieldName("ServiceRole").writeValue(runJobFlowRequest.getServiceRole());
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) runJobFlowRequest.getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (runJobFlowRequest.getSecurityConfiguration() != null) {
                jsonGenerator.writeFieldName("SecurityConfiguration").writeValue(runJobFlowRequest.getSecurityConfiguration());
            }
            if (runJobFlowRequest.getAutoScalingRole() != null) {
                jsonGenerator.writeFieldName("AutoScalingRole").writeValue(runJobFlowRequest.getAutoScalingRole());
            }
            if (runJobFlowRequest.getScaleDownBehavior() != null) {
                jsonGenerator.writeFieldName("ScaleDownBehavior").writeValue(runJobFlowRequest.getScaleDownBehavior());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
