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
 * DescribeStackSetOperationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackSetOperationRequestMarshaller implements Marshaller<Request<DescribeStackSetOperationRequest>, DescribeStackSetOperationRequest> {

    public Request<DescribeStackSetOperationRequest> marshall(DescribeStackSetOperationRequest describeStackSetOperationRequest) {

        if (describeStackSetOperationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeStackSetOperationRequest> request = new DefaultRequest<DescribeStackSetOperationRequest>(describeStackSetOperationRequest,
                "AmazonCloudFormation");
        request.addParameter("Action", "DescribeStackSetOperation");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeStackSetOperationRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(describeStackSetOperationRequest.getStackSetName()));
        }

        if (describeStackSetOperationRequest.getOperationId() != null) {
            request.addParameter("OperationId", StringUtils.fromString(describeStackSetOperationRequest.getOperationId()));
        }

        return request;
    }

}
