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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeInstanceHealthRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceHealthRequestMarshaller implements Marshaller<Request<DescribeInstanceHealthRequest>, DescribeInstanceHealthRequest> {

    public Request<DescribeInstanceHealthRequest> marshall(DescribeInstanceHealthRequest describeInstanceHealthRequest) {

        if (describeInstanceHealthRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceHealthRequest> request = new DefaultRequest<DescribeInstanceHealthRequest>(describeInstanceHealthRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeInstanceHealth");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeInstanceHealthRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(describeInstanceHealthRequest.getLoadBalancerName()));
        }

        if (!describeInstanceHealthRequest.getInstances().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Instance>) describeInstanceHealthRequest.getInstances()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Instance> instancesList = (com.amazonaws.internal.SdkInternalList<Instance>) describeInstanceHealthRequest
                    .getInstances();
            int instancesListIndex = 1;

            for (Instance instancesListValue : instancesList) {

                if (instancesListValue.getInstanceId() != null) {
                    request.addParameter("Instances.member." + instancesListIndex + ".InstanceId", StringUtils.fromString(instancesListValue.getInstanceId()));
                }
                instancesListIndex++;
            }
        }

        return request;
    }

}
