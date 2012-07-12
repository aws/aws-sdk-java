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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Configure Health Check Request Marshaller
 */
public class ConfigureHealthCheckRequestMarshaller implements Marshaller<Request<ConfigureHealthCheckRequest>, ConfigureHealthCheckRequest> {

    public Request<ConfigureHealthCheckRequest> marshall(ConfigureHealthCheckRequest configureHealthCheckRequest) {

        if (configureHealthCheckRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ConfigureHealthCheckRequest> request = new DefaultRequest<ConfigureHealthCheckRequest>(configureHealthCheckRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ConfigureHealthCheck");
        request.addParameter("Version", "2012-06-01");

        if (configureHealthCheckRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(configureHealthCheckRequest.getLoadBalancerName()));
        }
        HealthCheck healthCheckHealthCheck = configureHealthCheckRequest.getHealthCheck();
        if (healthCheckHealthCheck != null) {
            if (healthCheckHealthCheck.getTarget() != null) {
                request.addParameter("HealthCheck.Target", StringUtils.fromString(healthCheckHealthCheck.getTarget()));
            }
            if (healthCheckHealthCheck.getInterval() != null) {
                request.addParameter("HealthCheck.Interval", StringUtils.fromInteger(healthCheckHealthCheck.getInterval()));
            }
            if (healthCheckHealthCheck.getTimeout() != null) {
                request.addParameter("HealthCheck.Timeout", StringUtils.fromInteger(healthCheckHealthCheck.getTimeout()));
            }
            if (healthCheckHealthCheck.getUnhealthyThreshold() != null) {
                request.addParameter("HealthCheck.UnhealthyThreshold", StringUtils.fromInteger(healthCheckHealthCheck.getUnhealthyThreshold()));
            }
            if (healthCheckHealthCheck.getHealthyThreshold() != null) {
                request.addParameter("HealthCheck.HealthyThreshold", StringUtils.fromInteger(healthCheckHealthCheck.getHealthyThreshold()));
            }
        }


        return request;
    }
}
