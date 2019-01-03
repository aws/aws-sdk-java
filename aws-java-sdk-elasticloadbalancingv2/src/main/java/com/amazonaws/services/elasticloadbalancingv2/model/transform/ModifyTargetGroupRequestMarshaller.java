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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyTargetGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTargetGroupRequestMarshaller implements Marshaller<Request<ModifyTargetGroupRequest>, ModifyTargetGroupRequest> {

    public Request<ModifyTargetGroupRequest> marshall(ModifyTargetGroupRequest modifyTargetGroupRequest) {

        if (modifyTargetGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTargetGroupRequest> request = new DefaultRequest<ModifyTargetGroupRequest>(modifyTargetGroupRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ModifyTargetGroup");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTargetGroupRequest.getTargetGroupArn() != null) {
            request.addParameter("TargetGroupArn", StringUtils.fromString(modifyTargetGroupRequest.getTargetGroupArn()));
        }

        if (modifyTargetGroupRequest.getHealthCheckProtocol() != null) {
            request.addParameter("HealthCheckProtocol", StringUtils.fromString(modifyTargetGroupRequest.getHealthCheckProtocol()));
        }

        if (modifyTargetGroupRequest.getHealthCheckPort() != null) {
            request.addParameter("HealthCheckPort", StringUtils.fromString(modifyTargetGroupRequest.getHealthCheckPort()));
        }

        if (modifyTargetGroupRequest.getHealthCheckPath() != null) {
            request.addParameter("HealthCheckPath", StringUtils.fromString(modifyTargetGroupRequest.getHealthCheckPath()));
        }

        if (modifyTargetGroupRequest.getHealthCheckEnabled() != null) {
            request.addParameter("HealthCheckEnabled", StringUtils.fromBoolean(modifyTargetGroupRequest.getHealthCheckEnabled()));
        }

        if (modifyTargetGroupRequest.getHealthCheckIntervalSeconds() != null) {
            request.addParameter("HealthCheckIntervalSeconds", StringUtils.fromInteger(modifyTargetGroupRequest.getHealthCheckIntervalSeconds()));
        }

        if (modifyTargetGroupRequest.getHealthCheckTimeoutSeconds() != null) {
            request.addParameter("HealthCheckTimeoutSeconds", StringUtils.fromInteger(modifyTargetGroupRequest.getHealthCheckTimeoutSeconds()));
        }

        if (modifyTargetGroupRequest.getHealthyThresholdCount() != null) {
            request.addParameter("HealthyThresholdCount", StringUtils.fromInteger(modifyTargetGroupRequest.getHealthyThresholdCount()));
        }

        if (modifyTargetGroupRequest.getUnhealthyThresholdCount() != null) {
            request.addParameter("UnhealthyThresholdCount", StringUtils.fromInteger(modifyTargetGroupRequest.getUnhealthyThresholdCount()));
        }

        {
            Matcher matcher = modifyTargetGroupRequest.getMatcher();
            if (matcher != null) {

                if (matcher.getHttpCode() != null) {
                    request.addParameter("Matcher.HttpCode", StringUtils.fromString(matcher.getHttpCode()));
                }
            }
        }

        return request;
    }

}
