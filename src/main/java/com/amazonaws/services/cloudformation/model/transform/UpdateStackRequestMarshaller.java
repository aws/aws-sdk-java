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
 * Update Stack Request Marshaller
 */
public class UpdateStackRequestMarshaller implements Marshaller<Request<UpdateStackRequest>, UpdateStackRequest> {

    public Request<UpdateStackRequest> marshall(UpdateStackRequest updateStackRequest) {

        if (updateStackRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<UpdateStackRequest> request = new DefaultRequest<UpdateStackRequest>(updateStackRequest, "AmazonCloudFormation");
        request.addParameter("Action", "UpdateStack");
        request.addParameter("Version", "2010-05-15");

        if (updateStackRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(updateStackRequest.getStackName()));
        }
        if (updateStackRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(updateStackRequest.getTemplateBody()));
        }
        if (updateStackRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(updateStackRequest.getTemplateURL()));
        }
        if (updateStackRequest.getStackPolicyDuringUpdateBody() != null) {
            request.addParameter("StackPolicyDuringUpdateBody", StringUtils.fromString(updateStackRequest.getStackPolicyDuringUpdateBody()));
        }
        if (updateStackRequest.getStackPolicyDuringUpdateURL() != null) {
            request.addParameter("StackPolicyDuringUpdateURL", StringUtils.fromString(updateStackRequest.getStackPolicyDuringUpdateURL()));
        }

        java.util.List<Parameter> parametersList = updateStackRequest.getParameters();
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

        java.util.List<String> capabilitiesList = updateStackRequest.getCapabilities();
        int capabilitiesListIndex = 1;

        for (String capabilitiesListValue : capabilitiesList) {
            if (capabilitiesListValue != null) {
                request.addParameter("Capabilities.member." + capabilitiesListIndex, StringUtils.fromString(capabilitiesListValue));
            }

            capabilitiesListIndex++;
        }
        if (updateStackRequest.getStackPolicyBody() != null) {
            request.addParameter("StackPolicyBody", StringUtils.fromString(updateStackRequest.getStackPolicyBody()));
        }
        if (updateStackRequest.getStackPolicyURL() != null) {
            request.addParameter("StackPolicyURL", StringUtils.fromString(updateStackRequest.getStackPolicyURL()));
        }


        return request;
    }
}
