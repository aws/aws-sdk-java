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
 * EstimateTemplateCostRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EstimateTemplateCostRequestMarshaller implements Marshaller<Request<EstimateTemplateCostRequest>, EstimateTemplateCostRequest> {

    public Request<EstimateTemplateCostRequest> marshall(EstimateTemplateCostRequest estimateTemplateCostRequest) {

        if (estimateTemplateCostRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<EstimateTemplateCostRequest> request = new DefaultRequest<EstimateTemplateCostRequest>(estimateTemplateCostRequest, "AmazonCloudFormation");
        request.addParameter("Action", "EstimateTemplateCost");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (estimateTemplateCostRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(estimateTemplateCostRequest.getTemplateBody()));
        }

        if (estimateTemplateCostRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(estimateTemplateCostRequest.getTemplateURL()));
        }

        if (estimateTemplateCostRequest.getParameters().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<Parameter>) estimateTemplateCostRequest.getParameters()).isAutoConstruct()) {
            request.addParameter("Parameters", "");
        }
        if (!estimateTemplateCostRequest.getParameters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Parameter>) estimateTemplateCostRequest.getParameters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Parameter> parametersList = (com.amazonaws.internal.SdkInternalList<Parameter>) estimateTemplateCostRequest
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

        return request;
    }

}
