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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateChangeSetRequest Marshaller
 */

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

        com.amazonaws.internal.SdkInternalList<Parameter> parametersList = (com.amazonaws.internal.SdkInternalList<Parameter>) createChangeSetRequest
                .getParameters();
        if (parametersList.isEmpty() && !parametersList.isAutoConstruct()) {
            request.addParameter("Parameters", "");
        }
        if (!parametersList.isEmpty() || !parametersList.isAutoConstruct()) {
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
                parametersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> capabilitiesList = (com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest
                .getCapabilities();
        if (capabilitiesList.isEmpty() && !capabilitiesList.isAutoConstruct()) {
            request.addParameter("Capabilities", "");
        }
        if (!capabilitiesList.isEmpty() || !capabilitiesList.isAutoConstruct()) {
            int capabilitiesListIndex = 1;

            for (String capabilitiesListValue : capabilitiesList) {
                if (capabilitiesListValue != null) {
                    request.addParameter("Capabilities.member." + capabilitiesListIndex, StringUtils.fromString(capabilitiesListValue));
                }
                capabilitiesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> resourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest
                .getResourceTypes();
        if (resourceTypesList.isEmpty() && !resourceTypesList.isAutoConstruct()) {
            request.addParameter("ResourceTypes", "");
        }
        if (!resourceTypesList.isEmpty() || !resourceTypesList.isAutoConstruct()) {
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

        com.amazonaws.internal.SdkInternalList<String> notificationARNsList = (com.amazonaws.internal.SdkInternalList<String>) createChangeSetRequest
                .getNotificationARNs();
        if (notificationARNsList.isEmpty() && !notificationARNsList.isAutoConstruct()) {
            request.addParameter("NotificationARNs", "");
        }
        if (!notificationARNsList.isEmpty() || !notificationARNsList.isAutoConstruct()) {
            int notificationARNsListIndex = 1;

            for (String notificationARNsListValue : notificationARNsList) {
                if (notificationARNsListValue != null) {
                    request.addParameter("NotificationARNs.member." + notificationARNsListIndex, StringUtils.fromString(notificationARNsListValue));
                }
                notificationARNsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createChangeSetRequest.getTags();
        if (tagsList.isEmpty() && !tagsList.isAutoConstruct()) {
            request.addParameter("Tags", "");
        }
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
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
