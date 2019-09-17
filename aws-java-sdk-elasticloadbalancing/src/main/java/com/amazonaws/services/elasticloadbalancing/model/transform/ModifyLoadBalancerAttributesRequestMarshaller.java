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
 * ModifyLoadBalancerAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyLoadBalancerAttributesRequestMarshaller implements
        Marshaller<Request<ModifyLoadBalancerAttributesRequest>, ModifyLoadBalancerAttributesRequest> {

    public Request<ModifyLoadBalancerAttributesRequest> marshall(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) {

        if (modifyLoadBalancerAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyLoadBalancerAttributesRequest> request = new DefaultRequest<ModifyLoadBalancerAttributesRequest>(modifyLoadBalancerAttributesRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ModifyLoadBalancerAttributes");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyLoadBalancerAttributesRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(modifyLoadBalancerAttributesRequest.getLoadBalancerName()));
        }

        {
            LoadBalancerAttributes loadBalancerAttributes = modifyLoadBalancerAttributesRequest.getLoadBalancerAttributes();
            if (loadBalancerAttributes != null) {

                {
                    CrossZoneLoadBalancing crossZoneLoadBalancing = loadBalancerAttributes.getCrossZoneLoadBalancing();
                    if (crossZoneLoadBalancing != null) {

                        if (crossZoneLoadBalancing.getEnabled() != null) {
                            request.addParameter("LoadBalancerAttributes.CrossZoneLoadBalancing.Enabled",
                                    StringUtils.fromBoolean(crossZoneLoadBalancing.getEnabled()));
                        }
                    }
                }

                {
                    AccessLog accessLog = loadBalancerAttributes.getAccessLog();
                    if (accessLog != null) {

                        if (accessLog.getEnabled() != null) {
                            request.addParameter("LoadBalancerAttributes.AccessLog.Enabled", StringUtils.fromBoolean(accessLog.getEnabled()));
                        }

                        if (accessLog.getS3BucketName() != null) {
                            request.addParameter("LoadBalancerAttributes.AccessLog.S3BucketName", StringUtils.fromString(accessLog.getS3BucketName()));
                        }

                        if (accessLog.getEmitInterval() != null) {
                            request.addParameter("LoadBalancerAttributes.AccessLog.EmitInterval", StringUtils.fromInteger(accessLog.getEmitInterval()));
                        }

                        if (accessLog.getS3BucketPrefix() != null) {
                            request.addParameter("LoadBalancerAttributes.AccessLog.S3BucketPrefix", StringUtils.fromString(accessLog.getS3BucketPrefix()));
                        }
                    }
                }

                {
                    ConnectionDraining connectionDraining = loadBalancerAttributes.getConnectionDraining();
                    if (connectionDraining != null) {

                        if (connectionDraining.getEnabled() != null) {
                            request.addParameter("LoadBalancerAttributes.ConnectionDraining.Enabled", StringUtils.fromBoolean(connectionDraining.getEnabled()));
                        }

                        if (connectionDraining.getTimeout() != null) {
                            request.addParameter("LoadBalancerAttributes.ConnectionDraining.Timeout", StringUtils.fromInteger(connectionDraining.getTimeout()));
                        }
                    }
                }

                {
                    ConnectionSettings connectionSettings = loadBalancerAttributes.getConnectionSettings();
                    if (connectionSettings != null) {

                        if (connectionSettings.getIdleTimeout() != null) {
                            request.addParameter("LoadBalancerAttributes.ConnectionSettings.IdleTimeout",
                                    StringUtils.fromInteger(connectionSettings.getIdleTimeout()));
                        }
                    }
                }

                if (!loadBalancerAttributes.getAdditionalAttributes().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<AdditionalAttribute>) loadBalancerAttributes.getAdditionalAttributes()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<AdditionalAttribute> additionalAttributesList = (com.amazonaws.internal.SdkInternalList<AdditionalAttribute>) loadBalancerAttributes
                            .getAdditionalAttributes();
                    int additionalAttributesListIndex = 1;

                    for (AdditionalAttribute additionalAttributesListValue : additionalAttributesList) {

                        if (additionalAttributesListValue.getKey() != null) {
                            request.addParameter("LoadBalancerAttributes.AdditionalAttributes.member." + additionalAttributesListIndex + ".Key",
                                    StringUtils.fromString(additionalAttributesListValue.getKey()));
                        }

                        if (additionalAttributesListValue.getValue() != null) {
                            request.addParameter("LoadBalancerAttributes.AdditionalAttributes.member." + additionalAttributesListIndex + ".Value",
                                    StringUtils.fromString(additionalAttributesListValue.getValue()));
                        }
                        additionalAttributesListIndex++;
                    }
                }
            }
        }

        return request;
    }

}
