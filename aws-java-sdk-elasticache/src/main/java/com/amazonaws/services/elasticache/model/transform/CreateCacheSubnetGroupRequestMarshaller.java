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
 * CreateCacheSubnetGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCacheSubnetGroupRequestMarshaller implements Marshaller<Request<CreateCacheSubnetGroupRequest>, CreateCacheSubnetGroupRequest> {

    public Request<CreateCacheSubnetGroupRequest> marshall(CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest) {

        if (createCacheSubnetGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateCacheSubnetGroupRequest> request = new DefaultRequest<CreateCacheSubnetGroupRequest>(createCacheSubnetGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateCacheSubnetGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (createCacheSubnetGroupRequest.getCacheSubnetGroupName() != null) {
            request.addParameter("CacheSubnetGroupName", StringUtils.fromString(createCacheSubnetGroupRequest.getCacheSubnetGroupName()));
        }

        if (createCacheSubnetGroupRequest.getCacheSubnetGroupDescription() != null) {
            request.addParameter("CacheSubnetGroupDescription", StringUtils.fromString(createCacheSubnetGroupRequest.getCacheSubnetGroupDescription()));
        }

        if (!createCacheSubnetGroupRequest.getSubnetIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createCacheSubnetGroupRequest.getSubnetIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) createCacheSubnetGroupRequest
                    .getSubnetIds();
            int subnetIdsListIndex = 1;

            for (String subnetIdsListValue : subnetIdsList) {
                if (subnetIdsListValue != null) {
                    request.addParameter("SubnetIds.SubnetIdentifier." + subnetIdsListIndex, StringUtils.fromString(subnetIdsListValue));
                }
                subnetIdsListIndex++;
            }
        }

        return request;
    }

}
