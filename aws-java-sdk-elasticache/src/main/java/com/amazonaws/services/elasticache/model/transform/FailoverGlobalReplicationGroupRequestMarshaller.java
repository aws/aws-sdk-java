/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * FailoverGlobalReplicationGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverGlobalReplicationGroupRequestMarshaller implements
        Marshaller<Request<FailoverGlobalReplicationGroupRequest>, FailoverGlobalReplicationGroupRequest> {

    public Request<FailoverGlobalReplicationGroupRequest> marshall(FailoverGlobalReplicationGroupRequest failoverGlobalReplicationGroupRequest) {

        if (failoverGlobalReplicationGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<FailoverGlobalReplicationGroupRequest> request = new DefaultRequest<FailoverGlobalReplicationGroupRequest>(
                failoverGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "FailoverGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (failoverGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            request.addParameter("GlobalReplicationGroupId", StringUtils.fromString(failoverGlobalReplicationGroupRequest.getGlobalReplicationGroupId()));
        }

        if (failoverGlobalReplicationGroupRequest.getPrimaryRegion() != null) {
            request.addParameter("PrimaryRegion", StringUtils.fromString(failoverGlobalReplicationGroupRequest.getPrimaryRegion()));
        }

        if (failoverGlobalReplicationGroupRequest.getPrimaryReplicationGroupId() != null) {
            request.addParameter("PrimaryReplicationGroupId", StringUtils.fromString(failoverGlobalReplicationGroupRequest.getPrimaryReplicationGroupId()));
        }

        return request;
    }

}
