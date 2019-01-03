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
 * CreateChangeSetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChangeSetRequestMarshaller implements Marshaller<Request<CreateChangeSetRequest>, CreateChangeSetRequest> {

    public Request<CreateChangeSetRequest> marshall(CreateChangeSetRequest createChangeSetRequest) {

        if (createChangeSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateChangeSetRequest> request = new DefaultRequest<CreateChangeSetRequest>(createChangeSetRequest, "AmazonCloudFormation");
        request.addParameter("Action", "CreateChangeSet");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createChangeSetRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(createChangeSetRequest.getStackName()));
        }

        if (createChangeSetRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(createChangeSetRequest.getTemplateBody()));
        }

        if (createChangeSetRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(createChangeSetRequest.getTemplateURL()));
        }

        if (createChangeSetRequest.getUsePreviousTemplate() != null) {
            request.addParameter("UsePreviousTemplate", StringUtils.fromBoolean(createChangeSetRequest.getUsePreviousTemplate()));
        }

        if (createChangeSetRequest.getParameters().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<Parameter>) createChangeSetRequest.getParameters()).isAutoConstruct()) {
            request.addParameter("Parameters", "");
        }
        if (!createChangeSetRequest.getParameters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Parameter>) createChangeSetRequest.getParameters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Parameter> parametersList = (com.amazonaws.internal.SdkInternalList<Parameter>) createChangeSetRequest
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

        if (createChangeSetRequest.getCapabilities().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest.getCapabilities()).isAutoConstruct()) {
            request.addParameter("Capabilities", "");
        }
        if (!createChangeSetRequest.getCapabilities().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest.getCapabilities()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> capabilitiesList = (com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest
                    .getCapabilities();
            int capabilitiesListIndex = 1;

            for (String capabilitiesListValue : capabilitiesList) {
                if (capabilitiesListValue != null) {
                    request.addParameter("Capabilities.member." + capabilitiesListIndex, StringUtils.fromString(capabilitiesListValue));
                }
                capabilitiesListIndex++;
            }
        }

        if (createChangeSetRequest.getResourceTypes().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest.getResourceTypes()).isAutoConstruct()) {
            request.addParameter("ResourceTypes", "");
        }
        if (!createChangeSetRequest.getResourceTypes().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest.getResourceTypes()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> resourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest
                    .getResourceTypes();
            int resourceTypesListIndex = 1;

            for (String resourceTypesListValue : resourceTypesList) {
                if (resourceTypesListValue != null) {
                    request.addParameter("ResourceTypes.member." + resourceTypesListIndex, StringUtils.fromString(resourceTypesListValue));
                }
                resourceTypesListIndex++;
            }
        }

        if (createChangeSetRequest.getRoleARN() != null) {
            request.addParameter("RoleARN", StringUtils.fromString(createChangeSetRequest.getRoleARN()));
        }

        {
            RollbackConfiguration rollbackConfiguration = createChangeSetRequest.getRollbackConfiguration();
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

        if (createChangeSetRequest.getNotificationARNs().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest.getNotificationARNs()).isAutoConstruct()) {
            request.addParameter("NotificationARNs", "");
        }
        if (!createChangeSetRequest.getNotificationARNs().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest.getNotificationARNs()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> notificationARNsList = (com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest
                    .getNotificationARNs();
            int notificationARNsListIndex = 1;

            for (String notificationARNsListValue : notificationARNsList) {
                if (notificationARNsListValue != null) {
                    request.addParameter("NotificationARNs.member." + notificationARNsListIndex, StringUtils.fromString(notificationARNsListValue));
                }
                notificationARNsListIndex++;
            }
        }

        if (createChangeSetRequest.getTags().isEmpty() && !((com.amazonaws.internal.SdkInternalList<Tag>) createChangeSetRequest.getTags()).isAutoConstruct()) {
            request.addParameter("Tags", "");
        }
        if (!createChangeSetRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) createChangeSetRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createChangeSetRequest.getTags();
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

        if (createChangeSetRequest.getChangeSetName() != null) {
            request.addParameter("ChangeSetName", StringUtils.fromString(createChangeSetRequest.getChangeSetName()));
        }

        if (createChangeSetRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createChangeSetRequest.getClientToken()));
        }

        if (createChangeSetRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createChangeSetRequest.getDescription()));
        }

        if (createChangeSetRequest.getChangeSetType() != null) {
            request.addParameter("ChangeSetType", StringUtils.fromString(createChangeSetRequest.getChangeSetType()));
        }

        return request;
    }

}
