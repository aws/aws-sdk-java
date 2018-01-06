/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.IdempotentUtils;

/**
 * UpdateStackSetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStackSetRequestMarshaller implements Marshaller<Request<UpdateStackSetRequest>, UpdateStackSetRequest> {

    public Request<UpdateStackSetRequest> marshall(UpdateStackSetRequest updateStackSetRequest) {

        if (updateStackSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateStackSetRequest> request = new DefaultRequest<UpdateStackSetRequest>(updateStackSetRequest, "AmazonCloudFormation");
        request.addParameter("Action", "UpdateStackSet");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateStackSetRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(updateStackSetRequest.getStackSetName()));
        }

        if (updateStackSetRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(updateStackSetRequest.getDescription()));
        }

        if (updateStackSetRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(updateStackSetRequest.getTemplateBody()));
        }

        if (updateStackSetRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(updateStackSetRequest.getTemplateURL()));
        }

        if (updateStackSetRequest.getUsePreviousTemplate() != null) {
            request.addParameter("UsePreviousTemplate", StringUtils.fromBoolean(updateStackSetRequest.getUsePreviousTemplate()));
        }

        com.amazonaws.internal.SdkInternalList<Parameter> parametersList = (com.amazonaws.internal.SdkInternalList<Parameter>) updateStackSetRequest
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

                if (parametersListValue.getResolvedValue() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".ResolvedValue",
                            StringUtils.fromString(parametersListValue.getResolvedValue()));
                }
                parametersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> capabilitiesList = (com.amazonaws.internal.SdkInternalList<String>) updateStackSetRequest
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

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) updateStackSetRequest.getTags();
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

        StackSetOperationPreferences operationPreferences = updateStackSetRequest.getOperationPreferences();
        if (operationPreferences != null) {

            com.amazonaws.internal.SdkInternalList<String> regionOrderList = (com.amazonaws.internal.SdkInternalList<String>) operationPreferences
                    .getRegionOrder();
            if (regionOrderList.isEmpty() && !regionOrderList.isAutoConstruct()) {
                request.addParameter("OperationPreferences.RegionOrder", "");
            }
            if (!regionOrderList.isEmpty() || !regionOrderList.isAutoConstruct()) {
                int regionOrderListIndex = 1;

                for (String regionOrderListValue : regionOrderList) {
                    if (regionOrderListValue != null) {
                        request.addParameter("OperationPreferences.RegionOrder.member." + regionOrderListIndex, StringUtils.fromString(regionOrderListValue));
                    }
                    regionOrderListIndex++;
                }
            }

            if (operationPreferences.getFailureToleranceCount() != null) {
                request.addParameter("OperationPreferences.FailureToleranceCount", StringUtils.fromInteger(operationPreferences.getFailureToleranceCount()));
            }

            if (operationPreferences.getFailureTolerancePercentage() != null) {
                request.addParameter("OperationPreferences.FailureTolerancePercentage",
                        StringUtils.fromInteger(operationPreferences.getFailureTolerancePercentage()));
            }

            if (operationPreferences.getMaxConcurrentCount() != null) {
                request.addParameter("OperationPreferences.MaxConcurrentCount", StringUtils.fromInteger(operationPreferences.getMaxConcurrentCount()));
            }

            if (operationPreferences.getMaxConcurrentPercentage() != null) {
                request.addParameter("OperationPreferences.MaxConcurrentPercentage", StringUtils.fromInteger(operationPreferences.getMaxConcurrentPercentage()));
            }
        }

        request.addParameter("OperationId", IdempotentUtils.resolveString(updateStackSetRequest.getOperationId()));

        return request;
    }

}
