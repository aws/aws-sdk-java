/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        Request<CreateStackRequest> request = new DefaultRequest<CreateStackRequest>(createStackRequest, "AmazonCloudFormation");
        request.addParameter("Action", "CreateStack");
        request.addParameter("Version", "2010-05-15");
        if (createStackRequest != null) {
            if (createStackRequest.getStackName() != null) {
                request.addParameter("StackName", StringUtils.fromString(createStackRequest.getStackName()));
            }
        }
        if (createStackRequest != null) {
            if (createStackRequest.getTemplateBody() != null) {
                request.addParameter("TemplateBody", StringUtils.fromString(createStackRequest.getTemplateBody()));
            }
        }
        if (createStackRequest != null) {
            if (createStackRequest.getTemplateURL() != null) {
                request.addParameter("TemplateURL", StringUtils.fromString(createStackRequest.getTemplateURL()));
            }
        }

        if (createStackRequest != null) {
            java.util.List<Parameter> parametersList = createStackRequest.getParameters();
            int parametersListIndex = 1;
            for (Parameter parametersListValue : parametersList) {
                if (parametersListValue != null) {
                    if (parametersListValue.getParameterKey() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ParameterKey", StringUtils.fromString(parametersListValue.getParameterKey()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getParameterValue() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ParameterValue", StringUtils.fromString(parametersListValue.getParameterValue()));
                    }
                }

                parametersListIndex++;
            }
        }
        if (createStackRequest != null) {
            if (createStackRequest.isDisableRollback() != null) {
                request.addParameter("DisableRollback", StringUtils.fromBoolean(createStackRequest.isDisableRollback()));
            }
        }
        if (createStackRequest != null) {
            if (createStackRequest.getTimeoutInMinutes() != null) {
                request.addParameter("TimeoutInMinutes", StringUtils.fromInteger(createStackRequest.getTimeoutInMinutes()));
            }
        }
        if (createStackRequest != null) {
            java.util.List<String> notificationARNsList = createStackRequest.getNotificationARNs();
            int notificationARNsListIndex = 1;

            for (String notificationARNsListValue : notificationARNsList) {
                if (notificationARNsListValue != null) {
                    request.addParameter("NotificationARNs.member." + notificationARNsListIndex, StringUtils.fromString(notificationARNsListValue));
                }
                notificationARNsListIndex++;
            }
        }


        return request;
    }
}
