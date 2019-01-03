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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeConfigurationOptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationOptionsRequestMarshaller implements
        Marshaller<Request<DescribeConfigurationOptionsRequest>, DescribeConfigurationOptionsRequest> {

    public Request<DescribeConfigurationOptionsRequest> marshall(DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest) {

        if (describeConfigurationOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeConfigurationOptionsRequest> request = new DefaultRequest<DescribeConfigurationOptionsRequest>(describeConfigurationOptionsRequest,
                "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeConfigurationOptions");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeConfigurationOptionsRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(describeConfigurationOptionsRequest.getApplicationName()));
        }

        if (describeConfigurationOptionsRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils.fromString(describeConfigurationOptionsRequest.getTemplateName()));
        }

        if (describeConfigurationOptionsRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(describeConfigurationOptionsRequest.getEnvironmentName()));
        }

        if (describeConfigurationOptionsRequest.getSolutionStackName() != null) {
            request.addParameter("SolutionStackName", StringUtils.fromString(describeConfigurationOptionsRequest.getSolutionStackName()));
        }

        if (describeConfigurationOptionsRequest.getPlatformArn() != null) {
            request.addParameter("PlatformArn", StringUtils.fromString(describeConfigurationOptionsRequest.getPlatformArn()));
        }

        if (!describeConfigurationOptionsRequest.getOptions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<OptionSpecification>) describeConfigurationOptionsRequest.getOptions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<OptionSpecification> optionsList = (com.amazonaws.internal.SdkInternalList<OptionSpecification>) describeConfigurationOptionsRequest
                    .getOptions();
            int optionsListIndex = 1;

            for (OptionSpecification optionsListValue : optionsList) {

                if (optionsListValue.getResourceName() != null) {
                    request.addParameter("Options.member." + optionsListIndex + ".ResourceName", StringUtils.fromString(optionsListValue.getResourceName()));
                }

                if (optionsListValue.getNamespace() != null) {
                    request.addParameter("Options.member." + optionsListIndex + ".Namespace", StringUtils.fromString(optionsListValue.getNamespace()));
                }

                if (optionsListValue.getOptionName() != null) {
                    request.addParameter("Options.member." + optionsListIndex + ".OptionName", StringUtils.fromString(optionsListValue.getOptionName()));
                }
                optionsListIndex++;
            }
        }

        return request;
    }

}
