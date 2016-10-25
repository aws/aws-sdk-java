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
package com.amazonaws.services.codedeploy.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UpdateDeploymentGroupRequest Marshaller
 */
public class UpdateDeploymentGroupRequestMarshaller implements Marshaller<Request<UpdateDeploymentGroupRequest>, UpdateDeploymentGroupRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateDeploymentGroupRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateDeploymentGroupRequest> marshall(UpdateDeploymentGroupRequest updateDeploymentGroupRequest) {

        if (updateDeploymentGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateDeploymentGroupRequest> request = new DefaultRequest<UpdateDeploymentGroupRequest>(updateDeploymentGroupRequest, "AmazonCodeDeploy");
        request.addHeader("X-Amz-Target", "CodeDeploy_20141006.UpdateDeploymentGroup");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateDeploymentGroupRequest.getApplicationName() != null) {
                jsonGenerator.writeFieldName("applicationName").writeValue(updateDeploymentGroupRequest.getApplicationName());
            }
            if (updateDeploymentGroupRequest.getCurrentDeploymentGroupName() != null) {
                jsonGenerator.writeFieldName("currentDeploymentGroupName").writeValue(updateDeploymentGroupRequest.getCurrentDeploymentGroupName());
            }
            if (updateDeploymentGroupRequest.getNewDeploymentGroupName() != null) {
                jsonGenerator.writeFieldName("newDeploymentGroupName").writeValue(updateDeploymentGroupRequest.getNewDeploymentGroupName());
            }
            if (updateDeploymentGroupRequest.getDeploymentConfigName() != null) {
                jsonGenerator.writeFieldName("deploymentConfigName").writeValue(updateDeploymentGroupRequest.getDeploymentConfigName());
            }

            com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFiltersList = (com.amazonaws.internal.SdkInternalList<EC2TagFilter>) updateDeploymentGroupRequest
                    .getEc2TagFilters();
            if (!ec2TagFiltersList.isEmpty() || !ec2TagFiltersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ec2TagFilters");
                jsonGenerator.writeStartArray();
                for (EC2TagFilter ec2TagFiltersListValue : ec2TagFiltersList) {
                    if (ec2TagFiltersListValue != null) {

                        EC2TagFilterJsonMarshaller.getInstance().marshall(ec2TagFiltersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<TagFilter> onPremisesInstanceTagFiltersList = (com.amazonaws.internal.SdkInternalList<TagFilter>) updateDeploymentGroupRequest
                    .getOnPremisesInstanceTagFilters();
            if (!onPremisesInstanceTagFiltersList.isEmpty() || !onPremisesInstanceTagFiltersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("onPremisesInstanceTagFilters");
                jsonGenerator.writeStartArray();
                for (TagFilter onPremisesInstanceTagFiltersListValue : onPremisesInstanceTagFiltersList) {
                    if (onPremisesInstanceTagFiltersListValue != null) {

                        TagFilterJsonMarshaller.getInstance().marshall(onPremisesInstanceTagFiltersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> autoScalingGroupsList = (com.amazonaws.internal.SdkInternalList<String>) updateDeploymentGroupRequest
                    .getAutoScalingGroups();
            if (!autoScalingGroupsList.isEmpty() || !autoScalingGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("autoScalingGroups");
                jsonGenerator.writeStartArray();
                for (String autoScalingGroupsListValue : autoScalingGroupsList) {
                    if (autoScalingGroupsListValue != null) {
                        jsonGenerator.writeValue(autoScalingGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (updateDeploymentGroupRequest.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("serviceRoleArn").writeValue(updateDeploymentGroupRequest.getServiceRoleArn());
            }

            com.amazonaws.internal.SdkInternalList<TriggerConfig> triggerConfigurationsList = (com.amazonaws.internal.SdkInternalList<TriggerConfig>) updateDeploymentGroupRequest
                    .getTriggerConfigurations();
            if (!triggerConfigurationsList.isEmpty() || !triggerConfigurationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("triggerConfigurations");
                jsonGenerator.writeStartArray();
                for (TriggerConfig triggerConfigurationsListValue : triggerConfigurationsList) {
                    if (triggerConfigurationsListValue != null) {

                        TriggerConfigJsonMarshaller.getInstance().marshall(triggerConfigurationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (updateDeploymentGroupRequest.getAlarmConfiguration() != null) {
                jsonGenerator.writeFieldName("alarmConfiguration");
                AlarmConfigurationJsonMarshaller.getInstance().marshall(updateDeploymentGroupRequest.getAlarmConfiguration(), jsonGenerator);
            }
            if (updateDeploymentGroupRequest.getAutoRollbackConfiguration() != null) {
                jsonGenerator.writeFieldName("autoRollbackConfiguration");
                AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(updateDeploymentGroupRequest.getAutoRollbackConfiguration(), jsonGenerator);
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
