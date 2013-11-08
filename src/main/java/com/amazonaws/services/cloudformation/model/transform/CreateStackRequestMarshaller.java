/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Stack Request Marshaller
 */
public class CreateStackRequestMarshaller implements Marshaller<Request<CreateStackRequest>, CreateStackRequest> {

    public Request<CreateStackRequest> marshall(CreateStackRequest createStackRequest) {

        if (createStackRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateStackRequest> request = new DefaultRequest<CreateStackRequest>(createStackRequest, "AmazonCloudFormation");
        request.addParameter("Action", "CreateStack");
        request.addParameter("Version", "2010-05-15");

        if (createStackRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(createStackRequest.getStackName()));
        }
        if (createStackRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(createStackRequest.getTemplateBody()));
        }
        if (createStackRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(createStackRequest.getTemplateURL()));
        }

        java.util.List<Parameter> parametersList = createStackRequest.getParameters();
        int parametersListIndex = 1;

        for (Parameter parametersListValue : parametersList) {
            Parameter parameterMember = parametersListValue;
            if (parameterMember != null) {
                if (parameterMember.getParameterKey() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".ParameterKey", StringUtils.fromString(parameterMember.getParameterKey()));
                }
                if (parameterMember.getParameterValue() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".ParameterValue", StringUtils.fromString(parameterMember.getParameterValue()));
                }
            }

            parametersListIndex++;
        }
        if (createStackRequest.isDisableRollback() != null) {
            request.addParameter("DisableRollback", StringUtils.fromBoolean(createStackRequest.isDisableRollback()));
        }
        if (createStackRequest.getTimeoutInMinutes() != null) {
            request.addParameter("TimeoutInMinutes", StringUtils.fromInteger(createStackRequest.getTimeoutInMinutes()));
        }

        java.util.List<String> notificationARNsList = createStackRequest.getNotificationARNs();
        int notificationARNsListIndex = 1;

        for (String notificationARNsListValue : notificationARNsList) {
            if (notificationARNsListValue != null) {
                request.addParameter("NotificationARNs.member." + notificationARNsListIndex, StringUtils.fromString(notificationARNsListValue));
            }

            notificationARNsListIndex++;
        }

        java.util.List<String> capabilitiesList = createStackRequest.getCapabilities();
        int capabilitiesListIndex = 1;

        for (String capabilitiesListValue : capabilitiesList) {
            if (capabilitiesListValue != null) {
                request.addParameter("Capabilities.member." + capabilitiesListIndex, StringUtils.fromString(capabilitiesListValue));
            }

            capabilitiesListIndex++;
        }
        if (createStackRequest.getOnFailure() != null) {
            request.addParameter("OnFailure", StringUtils.fromString(createStackRequest.getOnFailure()));
        }
        if (createStackRequest.getStackPolicyBody() != null) {
            request.addParameter("StackPolicyBody", StringUtils.fromString(createStackRequest.getStackPolicyBody()));
        }
        if (createStackRequest.getStackPolicyURL() != null) {
            request.addParameter("StackPolicyURL", StringUtils.fromString(createStackRequest.getStackPolicyURL()));
        }

        java.util.List<Tag> tagsList = createStackRequest.getTags();
        int tagsListIndex = 1;

        for (Tag tagsListValue : tagsList) {
            Tag tagMember = tagsListValue;
            if (tagMember != null) {
                if (tagMember.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagMember.getKey()));
                }
                if (tagMember.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagMember.getValue()));
                }
            }

            tagsListIndex++;
        }


        return request;
    }
}
