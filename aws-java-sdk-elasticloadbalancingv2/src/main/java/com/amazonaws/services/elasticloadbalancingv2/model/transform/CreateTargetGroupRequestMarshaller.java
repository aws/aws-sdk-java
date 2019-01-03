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
 * CreateTargetGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTargetGroupRequestMarshaller implements Marshaller<Request<CreateTargetGroupRequest>, CreateTargetGroupRequest> {

    public Request<CreateTargetGroupRequest> marshall(CreateTargetGroupRequest createTargetGroupRequest) {

        if (createTargetGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTargetGroupRequest> request = new DefaultRequest<CreateTargetGroupRequest>(createTargetGroupRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateTargetGroup");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTargetGroupRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createTargetGroupRequest.getName()));
        }

        if (createTargetGroupRequest.getProtocol() != null) {
            request.addParameter("Protocol", StringUtils.fromString(createTargetGroupRequest.getProtocol()));
        }

        if (createTargetGroupRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createTargetGroupRequest.getPort()));
        }

        if (createTargetGroupRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(createTargetGroupRequest.getVpcId()));
        }

        if (createTargetGroupRequest.getHealthCheckProtocol() != null) {
            request.addParameter("HealthCheckProtocol", StringUtils.fromString(createTargetGroupRequest.getHealthCheckProtocol()));
        }

        if (createTargetGroupRequest.getHealthCheckPort() != null) {
            request.addParameter("HealthCheckPort", StringUtils.fromString(createTargetGroupRequest.getHealthCheckPort()));
        }

        if (createTargetGroupRequest.getHealthCheckEnabled() != null) {
            request.addParameter("HealthCheckEnabled", StringUtils.fromBoolean(createTargetGroupRequest.getHealthCheckEnabled()));
        }

        if (createTargetGroupRequest.getHealthCheckPath() != null) {
            request.addParameter("HealthCheckPath", StringUtils.fromString(createTargetGroupRequest.getHealthCheckPath()));
        }

        if (createTargetGroupRequest.getHealthCheckIntervalSeconds() != null) {
            request.addParameter("HealthCheckIntervalSeconds", StringUtils.fromInteger(createTargetGroupRequest.getHealthCheckIntervalSeconds()));
        }

        if (createTargetGroupRequest.getHealthCheckTimeoutSeconds() != null) {
            request.addParameter("HealthCheckTimeoutSeconds", StringUtils.fromInteger(createTargetGroupRequest.getHealthCheckTimeoutSeconds()));
        }

        if (createTargetGroupRequest.getHealthyThresholdCount() != null) {
            request.addParameter("HealthyThresholdCount", StringUtils.fromInteger(createTargetGroupRequest.getHealthyThresholdCount()));
        }

        if (createTargetGroupRequest.getUnhealthyThresholdCount() != null) {
            request.addParameter("UnhealthyThresholdCount", StringUtils.fromInteger(createTargetGroupRequest.getUnhealthyThresholdCount()));
        }

        {
            Matcher matcher = createTargetGroupRequest.getMatcher();
            if (matcher != null) {

                if (matcher.getHttpCode() != null) {
                    request.addParameter("Matcher.HttpCode", StringUtils.fromString(matcher.getHttpCode()));
                }
            }
        }

        if (createTargetGroupRequest.getTargetType() != null) {
            request.addParameter("TargetType", StringUtils.fromString(createTargetGroupRequest.getTargetType()));
        }

        return request;
    }

}
