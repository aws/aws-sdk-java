/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListResourceScanResourcesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceScanResourcesRequestMarshaller implements Marshaller<Request<ListResourceScanResourcesRequest>, ListResourceScanResourcesRequest> {

    public Request<ListResourceScanResourcesRequest> marshall(ListResourceScanResourcesRequest listResourceScanResourcesRequest) {

        if (listResourceScanResourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListResourceScanResourcesRequest> request = new DefaultRequest<ListResourceScanResourcesRequest>(listResourceScanResourcesRequest,
                "AmazonCloudFormation");
        request.addParameter("Action", "ListResourceScanResources");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listResourceScanResourcesRequest.getResourceScanId() != null) {
            request.addParameter("ResourceScanId", StringUtils.fromString(listResourceScanResourcesRequest.getResourceScanId()));
        }

        if (listResourceScanResourcesRequest.getResourceIdentifier() != null) {
            request.addParameter("ResourceIdentifier", StringUtils.fromString(listResourceScanResourcesRequest.getResourceIdentifier()));
        }

        if (listResourceScanResourcesRequest.getResourceTypePrefix() != null) {
            request.addParameter("ResourceTypePrefix", StringUtils.fromString(listResourceScanResourcesRequest.getResourceTypePrefix()));
        }

        if (listResourceScanResourcesRequest.getTagKey() != null) {
            request.addParameter("TagKey", StringUtils.fromString(listResourceScanResourcesRequest.getTagKey()));
        }

        if (listResourceScanResourcesRequest.getTagValue() != null) {
            request.addParameter("TagValue", StringUtils.fromString(listResourceScanResourcesRequest.getTagValue()));
        }

        if (listResourceScanResourcesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listResourceScanResourcesRequest.getNextToken()));
        }

        if (listResourceScanResourcesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listResourceScanResourcesRequest.getMaxResults()));
        }

        return request;
    }

}
