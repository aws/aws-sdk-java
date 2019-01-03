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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeLifecycleHooksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLifecycleHooksRequestMarshaller implements Marshaller<Request<DescribeLifecycleHooksRequest>, DescribeLifecycleHooksRequest> {

    public Request<DescribeLifecycleHooksRequest> marshall(DescribeLifecycleHooksRequest describeLifecycleHooksRequest) {

        if (describeLifecycleHooksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLifecycleHooksRequest> request = new DefaultRequest<DescribeLifecycleHooksRequest>(describeLifecycleHooksRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLifecycleHooks");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeLifecycleHooksRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(describeLifecycleHooksRequest.getAutoScalingGroupName()));
        }

        if (!describeLifecycleHooksRequest.getLifecycleHookNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeLifecycleHooksRequest.getLifecycleHookNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> lifecycleHookNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeLifecycleHooksRequest
                    .getLifecycleHookNames();
            int lifecycleHookNamesListIndex = 1;

            for (String lifecycleHookNamesListValue : lifecycleHookNamesList) {
                if (lifecycleHookNamesListValue != null) {
                    request.addParameter("LifecycleHookNames.member." + lifecycleHookNamesListIndex, StringUtils.fromString(lifecycleHookNamesListValue));
                }
                lifecycleHookNamesListIndex++;
            }
        }

        return request;
    }

}
