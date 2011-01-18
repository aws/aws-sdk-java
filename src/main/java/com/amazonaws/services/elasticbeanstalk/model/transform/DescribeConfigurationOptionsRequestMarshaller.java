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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Configuration Options Request Marshaller
 */
public class DescribeConfigurationOptionsRequestMarshaller implements Marshaller<Request<DescribeConfigurationOptionsRequest>, DescribeConfigurationOptionsRequest> {

    public Request<DescribeConfigurationOptionsRequest> marshall(DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest) {
        Request<DescribeConfigurationOptionsRequest> request = new DefaultRequest<DescribeConfigurationOptionsRequest>(describeConfigurationOptionsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeConfigurationOptions");
        request.addParameter("Version", "2010-12-01");
        if (describeConfigurationOptionsRequest != null) {
            if (describeConfigurationOptionsRequest.getApplicationName() != null) {
                request.addParameter("ApplicationName", StringUtils.fromString(describeConfigurationOptionsRequest.getApplicationName()));
            }
        }
        if (describeConfigurationOptionsRequest != null) {
            if (describeConfigurationOptionsRequest.getTemplateName() != null) {
                request.addParameter("TemplateName", StringUtils.fromString(describeConfigurationOptionsRequest.getTemplateName()));
            }
        }
        if (describeConfigurationOptionsRequest != null) {
            if (describeConfigurationOptionsRequest.getEnvironmentName() != null) {
                request.addParameter("EnvironmentName", StringUtils.fromString(describeConfigurationOptionsRequest.getEnvironmentName()));
            }
        }
        if (describeConfigurationOptionsRequest != null) {
            if (describeConfigurationOptionsRequest.getSolutionStackName() != null) {
                request.addParameter("SolutionStackName", StringUtils.fromString(describeConfigurationOptionsRequest.getSolutionStackName()));
            }
        }

        if (describeConfigurationOptionsRequest != null) {
            java.util.List<OptionSpecification> optionsList = describeConfigurationOptionsRequest.getOptions();
            int optionsListIndex = 1;
            for (OptionSpecification optionsListValue : optionsList) {
                if (optionsListValue != null) {
                    if (optionsListValue.getNamespace() != null) {
                        request.addParameter("Options.member." + optionsListIndex + ".Namespace", StringUtils.fromString(optionsListValue.getNamespace()));
                    }
                }
                if (optionsListValue != null) {
                    if (optionsListValue.getOptionName() != null) {
                        request.addParameter("Options.member." + optionsListIndex + ".OptionName", StringUtils.fromString(optionsListValue.getOptionName()));
                    }
                }

                optionsListIndex++;
            }
        }


        return request;
    }
}
