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
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Cache Parameter Group Request Marshaller
 */
public class CreateCacheParameterGroupRequestMarshaller implements Marshaller<Request<CreateCacheParameterGroupRequest>, CreateCacheParameterGroupRequest> {

    public Request<CreateCacheParameterGroupRequest> marshall(CreateCacheParameterGroupRequest createCacheParameterGroupRequest) {

        if (createCacheParameterGroupRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateCacheParameterGroupRequest> request = new DefaultRequest<CreateCacheParameterGroupRequest>(createCacheParameterGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateCacheParameterGroup");
        request.addParameter("Version", "2012-03-09");

        if (createCacheParameterGroupRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(createCacheParameterGroupRequest.getCacheParameterGroupName()));
        }
        if (createCacheParameterGroupRequest.getCacheParameterGroupFamily() != null) {
            request.addParameter("CacheParameterGroupFamily", StringUtils.fromString(createCacheParameterGroupRequest.getCacheParameterGroupFamily()));
        }
        if (createCacheParameterGroupRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createCacheParameterGroupRequest.getDescription()));
        }


        return request;
    }
}
