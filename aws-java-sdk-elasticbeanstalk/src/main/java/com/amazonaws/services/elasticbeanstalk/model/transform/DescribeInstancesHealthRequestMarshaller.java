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
 * DescribeInstancesHealthRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancesHealthRequestMarshaller implements Marshaller<Request<DescribeInstancesHealthRequest>, DescribeInstancesHealthRequest> {

    public Request<DescribeInstancesHealthRequest> marshall(DescribeInstancesHealthRequest describeInstancesHealthRequest) {

        if (describeInstancesHealthRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstancesHealthRequest> request = new DefaultRequest<DescribeInstancesHealthRequest>(describeInstancesHealthRequest,
                "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeInstancesHealth");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeInstancesHealthRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(describeInstancesHealthRequest.getEnvironmentName()));
        }

        if (describeInstancesHealthRequest.getEnvironmentId() != null) {
            request.addParameter("EnvironmentId", StringUtils.fromString(describeInstancesHealthRequest.getEnvironmentId()));
        }

        if (!describeInstancesHealthRequest.getAttributeNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeInstancesHealthRequest.getAttributeNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> attributeNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstancesHealthRequest
                    .getAttributeNames();
            int attributeNamesListIndex = 1;

            for (String attributeNamesListValue : attributeNamesList) {
                if (attributeNamesListValue != null) {
                    request.addParameter("AttributeNames.member." + attributeNamesListIndex, StringUtils.fromString(attributeNamesListValue));
                }
                attributeNamesListIndex++;
            }
        }

        if (describeInstancesHealthRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInstancesHealthRequest.getNextToken()));
        }

        return request;
    }

}
