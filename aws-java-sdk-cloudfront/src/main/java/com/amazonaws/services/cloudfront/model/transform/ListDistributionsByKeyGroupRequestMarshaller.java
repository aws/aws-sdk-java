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
 * ListDistributionsByKeyGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDistributionsByKeyGroupRequestMarshaller implements
        Marshaller<Request<ListDistributionsByKeyGroupRequest>, ListDistributionsByKeyGroupRequest> {

    public Request<ListDistributionsByKeyGroupRequest> marshall(ListDistributionsByKeyGroupRequest listDistributionsByKeyGroupRequest) {

        if (listDistributionsByKeyGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListDistributionsByKeyGroupRequest> request = new DefaultRequest<ListDistributionsByKeyGroupRequest>(listDistributionsByKeyGroupRequest,
                "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2020-05-31/distributionsByKeyGroupId/{KeyGroupId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "KeyGroupId",
                listDistributionsByKeyGroupRequest.getKeyGroupId());
        request.setResourcePath(uriResourcePath);

        if (listDistributionsByKeyGroupRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listDistributionsByKeyGroupRequest.getMarker()));
        }

        if (listDistributionsByKeyGroupRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromString(listDistributionsByKeyGroupRequest.getMaxItems()));
        }

        return request;
    }

}
