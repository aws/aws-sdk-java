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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeConfigurationSetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationSetRequestMarshaller implements Marshaller<Request<DescribeConfigurationSetRequest>, DescribeConfigurationSetRequest> {

    public Request<DescribeConfigurationSetRequest> marshall(DescribeConfigurationSetRequest describeConfigurationSetRequest) {

        if (describeConfigurationSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeConfigurationSetRequest> request = new DefaultRequest<DescribeConfigurationSetRequest>(describeConfigurationSetRequest,
                "AmazonSimpleEmailService");
        request.addParameter("Action", "DescribeConfigurationSet");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeConfigurationSetRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName", StringUtils.fromString(describeConfigurationSetRequest.getConfigurationSetName()));
        }

        if (!describeConfigurationSetRequest.getConfigurationSetAttributeNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeConfigurationSetRequest.getConfigurationSetAttributeNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> configurationSetAttributeNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeConfigurationSetRequest
                    .getConfigurationSetAttributeNames();
            int configurationSetAttributeNamesListIndex = 1;

            for (String configurationSetAttributeNamesListValue : configurationSetAttributeNamesList) {
                if (configurationSetAttributeNamesListValue != null) {
                    request.addParameter("ConfigurationSetAttributeNames.member." + configurationSetAttributeNamesListIndex,
                            StringUtils.fromString(configurationSetAttributeNamesListValue));
                }
                configurationSetAttributeNamesListIndex++;
            }
        }

        return request;
    }

}
