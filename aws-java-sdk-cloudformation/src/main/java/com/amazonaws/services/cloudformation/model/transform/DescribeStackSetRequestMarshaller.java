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
 * DescribeStackSetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackSetRequestMarshaller implements Marshaller<Request<DescribeStackSetRequest>, DescribeStackSetRequest> {

    public Request<DescribeStackSetRequest> marshall(DescribeStackSetRequest describeStackSetRequest) {

        if (describeStackSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeStackSetRequest> request = new DefaultRequest<DescribeStackSetRequest>(describeStackSetRequest, "AmazonCloudFormation");
        request.addParameter("Action", "DescribeStackSet");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeStackSetRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(describeStackSetRequest.getStackSetName()));
        }

        return request;
    }

}
