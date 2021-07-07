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
package com.amazonaws.services.cloudfront.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * ListConflictingAliasesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConflictingAliasesRequestMarshaller implements Marshaller<Request<ListConflictingAliasesRequest>, ListConflictingAliasesRequest> {

    public Request<ListConflictingAliasesRequest> marshall(ListConflictingAliasesRequest listConflictingAliasesRequest) {

        if (listConflictingAliasesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListConflictingAliasesRequest> request = new DefaultRequest<ListConflictingAliasesRequest>(listConflictingAliasesRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2020-05-31/conflicting-alias";

        request.setResourcePath(uriResourcePath);

        if (listConflictingAliasesRequest.getDistributionId() != null) {
            request.addParameter("DistributionId", StringUtils.fromString(listConflictingAliasesRequest.getDistributionId()));
        }

        if (listConflictingAliasesRequest.getAlias() != null) {
            request.addParameter("Alias", StringUtils.fromString(listConflictingAliasesRequest.getAlias()));
        }

        if (listConflictingAliasesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listConflictingAliasesRequest.getMarker()));
        }

        if (listConflictingAliasesRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listConflictingAliasesRequest.getMaxItems()));
        }

        return request;
    }

}
