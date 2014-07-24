/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Load Balancer Attributes Request Marshaller
 */
public class ModifyLoadBalancerAttributesRequestMarshaller implements Marshaller<Request<ModifyLoadBalancerAttributesRequest>, ModifyLoadBalancerAttributesRequest> {

    public Request<ModifyLoadBalancerAttributesRequest> marshall(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) {

        if (modifyLoadBalancerAttributesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyLoadBalancerAttributesRequest> request = new DefaultRequest<ModifyLoadBalancerAttributesRequest>(modifyLoadBalancerAttributesRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ModifyLoadBalancerAttributes");
        request.addParameter("Version", "2012-06-01");

        if (modifyLoadBalancerAttributesRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(modifyLoadBalancerAttributesRequest.getLoadBalancerName()));
        }
        LoadBalancerAttributes loadBalancerAttributesLoadBalancerAttributes = modifyLoadBalancerAttributesRequest.getLoadBalancerAttributes();
        if (loadBalancerAttributesLoadBalancerAttributes != null) {
            CrossZoneLoadBalancing crossZoneLoadBalancingCrossZoneLoadBalancing = loadBalancerAttributesLoadBalancerAttributes.getCrossZoneLoadBalancing();
            if (crossZoneLoadBalancingCrossZoneLoadBalancing != null) {
                if (crossZoneLoadBalancingCrossZoneLoadBalancing.isEnabled() != null) {
                    request.addParameter("LoadBalancerAttributes.CrossZoneLoadBalancing.Enabled", StringUtils.fromBoolean(crossZoneLoadBalancingCrossZoneLoadBalancing.isEnabled()));
                }
            }
            AccessLog accessLogAccessLog = loadBalancerAttributesLoadBalancerAttributes.getAccessLog();
            if (accessLogAccessLog != null) {
                if (accessLogAccessLog.isEnabled() != null) {
                    request.addParameter("LoadBalancerAttributes.AccessLog.Enabled", StringUtils.fromBoolean(accessLogAccessLog.isEnabled()));
                }
                if (accessLogAccessLog.getS3BucketName() != null) {
                    request.addParameter("LoadBalancerAttributes.AccessLog.S3BucketName", StringUtils.fromString(accessLogAccessLog.getS3BucketName()));
                }
                if (accessLogAccessLog.getEmitInterval() != null) {
                    request.addParameter("LoadBalancerAttributes.AccessLog.EmitInterval", StringUtils.fromInteger(accessLogAccessLog.getEmitInterval()));
                }
                if (accessLogAccessLog.getS3BucketPrefix() != null) {
                    request.addParameter("LoadBalancerAttributes.AccessLog.S3BucketPrefix", StringUtils.fromString(accessLogAccessLog.getS3BucketPrefix()));
                }
            }
            ConnectionDraining connectionDrainingConnectionDraining = loadBalancerAttributesLoadBalancerAttributes.getConnectionDraining();
            if (connectionDrainingConnectionDraining != null) {
                if (connectionDrainingConnectionDraining.isEnabled() != null) {
                    request.addParameter("LoadBalancerAttributes.ConnectionDraining.Enabled", StringUtils.fromBoolean(connectionDrainingConnectionDraining.isEnabled()));
                }
                if (connectionDrainingConnectionDraining.getTimeout() != null) {
                    request.addParameter("LoadBalancerAttributes.ConnectionDraining.Timeout", StringUtils.fromInteger(connectionDrainingConnectionDraining.getTimeout()));
                }
            }
            ConnectionSettings connectionSettingsConnectionSettings = loadBalancerAttributesLoadBalancerAttributes.getConnectionSettings();
            if (connectionSettingsConnectionSettings != null) {
                if (connectionSettingsConnectionSettings.getIdleTimeout() != null) {
                    request.addParameter("LoadBalancerAttributes.ConnectionSettings.IdleTimeout", StringUtils.fromInteger(connectionSettingsConnectionSettings.getIdleTimeout()));
                }
            }
        }

        return request;
    }
}
