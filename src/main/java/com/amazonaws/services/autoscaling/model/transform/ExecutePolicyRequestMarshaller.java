/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Execute Policy Request Marshaller
 */
public class ExecutePolicyRequestMarshaller implements Marshaller<Request<ExecutePolicyRequest>, ExecutePolicyRequest> {

    public Request<ExecutePolicyRequest> marshall(ExecutePolicyRequest executePolicyRequest) {

        if (executePolicyRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ExecutePolicyRequest> request = new DefaultRequest<ExecutePolicyRequest>(executePolicyRequest, "AmazonAutoScaling");
        request.addParameter("Action", "ExecutePolicy");
        request.addParameter("Version", "2011-01-01");

        if (executePolicyRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(executePolicyRequest.getAutoScalingGroupName()));
        }
        if (executePolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(executePolicyRequest.getPolicyName()));
        }
        if (executePolicyRequest.isHonorCooldown() != null) {
            request.addParameter("HonorCooldown", StringUtils.fromBoolean(executePolicyRequest.isHonorCooldown()));
        }


        return request;
    }
}
