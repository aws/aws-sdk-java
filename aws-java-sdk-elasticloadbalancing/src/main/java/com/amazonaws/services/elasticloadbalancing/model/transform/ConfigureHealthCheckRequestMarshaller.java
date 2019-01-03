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
 * ConfigureHealthCheckRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureHealthCheckRequestMarshaller implements Marshaller<Request<ConfigureHealthCheckRequest>, ConfigureHealthCheckRequest> {

    public Request<ConfigureHealthCheckRequest> marshall(ConfigureHealthCheckRequest configureHealthCheckRequest) {

        if (configureHealthCheckRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ConfigureHealthCheckRequest> request = new DefaultRequest<ConfigureHealthCheckRequest>(configureHealthCheckRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ConfigureHealthCheck");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (configureHealthCheckRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(configureHealthCheckRequest.getLoadBalancerName()));
        }

        {
            HealthCheck healthCheck = configureHealthCheckRequest.getHealthCheck();
            if (healthCheck != null) {

                if (healthCheck.getTarget() != null) {
                    request.addParameter("HealthCheck.Target", StringUtils.fromString(healthCheck.getTarget()));
                }

                if (healthCheck.getInterval() != null) {
                    request.addParameter("HealthCheck.Interval", StringUtils.fromInteger(healthCheck.getInterval()));
                }

                if (healthCheck.getTimeout() != null) {
                    request.addParameter("HealthCheck.Timeout", StringUtils.fromInteger(healthCheck.getTimeout()));
                }

                if (healthCheck.getUnhealthyThreshold() != null) {
                    request.addParameter("HealthCheck.UnhealthyThreshold", StringUtils.fromInteger(healthCheck.getUnhealthyThreshold()));
                }

                if (healthCheck.getHealthyThreshold() != null) {
                    request.addParameter("HealthCheck.HealthyThreshold", StringUtils.fromInteger(healthCheck.getHealthyThreshold()));
                }
            }
        }

        return request;
    }

}
