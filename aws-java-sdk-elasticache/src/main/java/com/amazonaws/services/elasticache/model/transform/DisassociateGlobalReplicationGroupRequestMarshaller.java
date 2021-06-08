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
 * DisassociateGlobalReplicationGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateGlobalReplicationGroupRequestMarshaller implements
        Marshaller<Request<DisassociateGlobalReplicationGroupRequest>, DisassociateGlobalReplicationGroupRequest> {

    public Request<DisassociateGlobalReplicationGroupRequest> marshall(DisassociateGlobalReplicationGroupRequest disassociateGlobalReplicationGroupRequest) {

        if (disassociateGlobalReplicationGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateGlobalReplicationGroupRequest> request = new DefaultRequest<DisassociateGlobalReplicationGroupRequest>(
                disassociateGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "DisassociateGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (disassociateGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            request.addParameter("GlobalReplicationGroupId", StringUtils.fromString(disassociateGlobalReplicationGroupRequest.getGlobalReplicationGroupId()));
        }

        if (disassociateGlobalReplicationGroupRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(disassociateGlobalReplicationGroupRequest.getReplicationGroupId()));
        }

        if (disassociateGlobalReplicationGroupRequest.getReplicationGroupRegion() != null) {
            request.addParameter("ReplicationGroupRegion", StringUtils.fromString(disassociateGlobalReplicationGroupRequest.getReplicationGroupRegion()));
        }

        return request;
    }

}
