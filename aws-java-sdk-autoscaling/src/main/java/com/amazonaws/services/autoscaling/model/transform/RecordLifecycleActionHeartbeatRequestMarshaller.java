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
 * RecordLifecycleActionHeartbeatRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordLifecycleActionHeartbeatRequestMarshaller implements
        Marshaller<Request<RecordLifecycleActionHeartbeatRequest>, RecordLifecycleActionHeartbeatRequest> {

    public Request<RecordLifecycleActionHeartbeatRequest> marshall(RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest) {

        if (recordLifecycleActionHeartbeatRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RecordLifecycleActionHeartbeatRequest> request = new DefaultRequest<RecordLifecycleActionHeartbeatRequest>(
                recordLifecycleActionHeartbeatRequest, "AmazonAutoScaling");
        request.addParameter("Action", "RecordLifecycleActionHeartbeat");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (recordLifecycleActionHeartbeatRequest.getLifecycleHookName() != null) {
            request.addParameter("LifecycleHookName", StringUtils.fromString(recordLifecycleActionHeartbeatRequest.getLifecycleHookName()));
        }

        if (recordLifecycleActionHeartbeatRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(recordLifecycleActionHeartbeatRequest.getAutoScalingGroupName()));
        }

        if (recordLifecycleActionHeartbeatRequest.getLifecycleActionToken() != null) {
            request.addParameter("LifecycleActionToken", StringUtils.fromString(recordLifecycleActionHeartbeatRequest.getLifecycleActionToken()));
        }

        if (recordLifecycleActionHeartbeatRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(recordLifecycleActionHeartbeatRequest.getInstanceId()));
        }

        return request;
    }

}
