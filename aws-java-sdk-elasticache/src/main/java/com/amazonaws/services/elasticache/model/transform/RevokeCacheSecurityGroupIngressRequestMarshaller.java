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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * RevokeCacheSecurityGroupIngressRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeCacheSecurityGroupIngressRequestMarshaller implements
        Marshaller<Request<RevokeCacheSecurityGroupIngressRequest>, RevokeCacheSecurityGroupIngressRequest> {

    public Request<RevokeCacheSecurityGroupIngressRequest> marshall(RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest) {

        if (revokeCacheSecurityGroupIngressRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RevokeCacheSecurityGroupIngressRequest> request = new DefaultRequest<RevokeCacheSecurityGroupIngressRequest>(
                revokeCacheSecurityGroupIngressRequest, "AmazonElastiCache");
        request.addParameter("Action", "RevokeCacheSecurityGroupIngress");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (revokeCacheSecurityGroupIngressRequest.getCacheSecurityGroupName() != null) {
            request.addParameter("CacheSecurityGroupName", StringUtils.fromString(revokeCacheSecurityGroupIngressRequest.getCacheSecurityGroupName()));
        }

        if (revokeCacheSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            request.addParameter("EC2SecurityGroupName", StringUtils.fromString(revokeCacheSecurityGroupIngressRequest.getEC2SecurityGroupName()));
        }

        if (revokeCacheSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            request.addParameter("EC2SecurityGroupOwnerId", StringUtils.fromString(revokeCacheSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId()));
        }

        return request;
    }

}
