/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateStackRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStackRequestMarshaller implements Marshaller<Request<UpdateStackRequest>, UpdateStackRequest> {

    public Request<UpdateStackRequest> marshall(UpdateStackRequest updateStackRequest) {

        if (updateStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateStackRequest> request = new DefaultRequest<UpdateStackRequest>(updateStackRequest, "AmazonCloudFormation");
        request.addParameter("Action", "UpdateStack");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateStackRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(updateStackRequest.getStackName()));
        }

        if (updateStackRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(updateStackRequest.getTemplateBody()));
        }

        if (updateStackRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(updateStackRequest.getTemplateURL()));
        }

        if (updateStackRequest.getUsePreviousTemplate() != null) {
            request.addParameter("UsePreviousTemplate", StringUtils.fromBoolean(updateStackRequest.getUsePreviousTemplate()));
        }

        if (updateStackRequest.getStackPolicyDuringUpdateBody() != null) {
            request.addParameter("StackPolicyDuringUpdateBody", StringUtils.fromString(updateStackRequest.getStackPolicyDuringUpdateBody()));
        }

        if (updateStackRequest.getStackPolicyDuringUpdateURL() != null) {
            request.addParameter("StackPolicyDuringUpdateURL", StringUtils.fromString(updateStackRequest.getStackPolicyDuringUpdateURL()));
        }

        if (updateStackRequest.getParameters().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<Parameter>) updateStackRequest.getParameters()).isAutoConstruct()) {
            request.addParameter("Parameters", "");
        }
        if (!updateStackRequest.getParameters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Parameter>) updateStackRequest.getParameters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Parameter> parametersList = (com.amazonaws.internal.SdkInternalList<Parameter>) updateStackRequest
                    .getParameters();
            int parametersListIndex = 1;

            for (Parameter parametersListValue : parametersList) {

                if (parametersListValue.getParameterKey() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".ParameterKey",
                            StringUtils.fromString(parametersListValue.getParameterKey()));
                }

                if (parametersListValue.getParameterValue() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".ParameterValue",
                            StringUtils.fromString(parametersListValue.getParameterValue()));
                }

                if (parametersListValue.getUsePreviousValue() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".UsePreviousValue",
                            StringUtils.fromBoolean(parametersListValue.getUsePreviousValue()));
                }

                if (parametersListValue.getResolvedValue() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".ResolvedValue",
                            StringUtils.fromString(parametersListValue.getResolvedValue()));
                }
                parametersListIndex++;
            }
        }

        if (updateStackRequest.getCapabilities().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) updateStackRequest.getCapabilities()).isAutoConstruct()) {
            request.addParameter("Capabilities", "");
        }
        if (!updateStackRequest.getCapabilities().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateStackRequest.getCapabilities()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> capabilitiesList = (com.amazonaws.internal.SdkInternalList<String>) updateStackRequest
                    .getCapabilities();
            int capabilitiesListIndex = 1;

            for (String capabilitiesListValue : capabilitiesList) {
                if (capabilitiesListValue != null) {
                    request.addParameter("Capabilities.member." + capabilitiesListIndex, StringUtils.fromString(capabilitiesListValue));
                }
                capabilitiesListIndex++;
            }
        }

        if (updateStackRequest.getResourceTypes().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) updateStackRequest.getResourceTypes()).isAutoConstruct()) {
            request.addParameter("ResourceTypes", "");
        }
        if (!updateStackRequest.getResourceTypes().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateStackRequest.getResourceTypes()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> resourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) updateStackRequest
                    .getResourceTypes();
            int resourceTypesListIndex = 1;

            for (String resourceTypesListValue : resourceTypesList) {
                if (resourceTypesListValue != null) {
                    request.addParameter("ResourceTypes.member." + resourceTypesListIndex, StringUtils.fromString(resourceTypesListValue));
                }
                resourceTypesListIndex++;
            }
        }

        if (updateStackRequest.getRoleARN() != null) {
            request.addParameter("RoleARN", StringUtils.fromString(updateStackRequest.getRoleARN()));
        }

        {
            RollbackConfiguration rollbackConfiguration = updateStackRequest.getRollbackConfiguration();
            if (rollbackConfiguration != null) {

                if (rollbackConfiguration.getRollbackTriggers().isEmpty()
                        && !((com.amazonaws.internal.SdkInternalList<RollbackTrigger>) rollbackConfiguration.getRollbackTriggers()).isAutoConstruct()) {
                    request.addParameter("RollbackConfiguration.RollbackTriggers", "");
                }
                if (!rollbackConfiguration.getRollbackTriggers().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<RollbackTrigger>) rollbackConfiguration.getRollbackTriggers()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<RollbackTrigger> rollbackTriggersList = (com.amazonaws.internal.SdkInternalList<RollbackTrigger>) rollbackConfiguration
                            .getRollbackTriggers();
                    int rollbackTriggersListIndex = 1;

                    for (RollbackTrigger rollbackTriggersListValue : rollbackTriggersList) {

                        if (rollbackTriggersListValue.getArn() != null) {
                            request.addParameter("RollbackConfiguration.RollbackTriggers.member." + rollbackTriggersListIndex + ".Arn",
                                    StringUtils.fromString(rollbackTriggersListValue.getArn()));
                        }

                        if (rollbackTriggersListValue.getType() != null) {
                            request.addParameter("RollbackConfiguration.RollbackTriggers.member." + rollbackTriggersListIndex + ".Type",
                                    StringUtils.fromString(rollbackTriggersListValue.getType()));
                        }
                        rollbackTriggersListIndex++;
                    }
                }

                if (rollbackConfiguration.getMonitoringTimeInMinutes() != null) {
                    request.addParameter("RollbackConfiguration.MonitoringTimeInMinutes",
                            StringUtils.fromInteger(rollbackConfiguration.getMonitoringTimeInMinutes()));
                }
            }
        }

        if (updateStackRequest.getStackPolicyBody() != null) {
            request.addParameter("StackPolicyBody", StringUtils.fromString(updateStackRequest.getStackPolicyBody()));
        }

        if (updateStackRequest.getStackPolicyURL() != null) {
            request.addParameter("StackPolicyURL", StringUtils.fromString(updateStackRequest.getStackPolicyURL()));
        }

        if (updateStackRequest.getNotificationARNs().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) updateStackRequest.getNotificationARNs()).isAutoConstruct()) {
            request.addParameter("NotificationARNs", "");
        }
        if (!updateStackRequest.getNotificationARNs().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateStackRequest.getNotificationARNs()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> notificationARNsList = (com.amazonaws.internal.SdkInternalList<String>) updateStackRequest
                    .getNotificationARNs();
            int notificationARNsListIndex = 1;

            for (String notificationARNsListValue : notificationARNsList) {
                if (notificationARNsListValue != null) {
                    request.addParameter("NotificationARNs.member." + notificationARNsListIndex, StringUtils.fromString(notificationARNsListValue));
                }
                notificationARNsListIndex++;
            }
        }

        if (updateStackRequest.getTags().isEmpty() && !((com.amazonaws.internal.SdkInternalList<Tag>) updateStackRequest.getTags()).isAutoConstruct()) {
            request.addParameter("Tags", "");
        }
        if (!updateStackRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) updateStackRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) updateStackRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        if (updateStackRequest.getClientRequestToken() != null) {
            request.addParameter("ClientRequestToken", StringUtils.fromString(updateStackRequest.getClientRequestToken()));
        }

        return request;
    }

}
