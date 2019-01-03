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
 * ListDistributionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDistributionsRequestMarshaller implements Marshaller<Request<ListDistributionsRequest>, ListDistributionsRequest> {

    public Request<ListDistributionsRequest> marshall(ListDistributionsRequest listDistributionsRequest) {

        if (listDistributionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListDistributionsRequest> request = new DefaultRequest<ListDistributionsRequest>(listDistributionsRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2018-11-05/distribution";

        request.setResourcePath(uriResourcePath);

        if (listDistributionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listDistributionsRequest.getMarker()));
        }

        if (listDistributionsRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromString(listDistributionsRequest.getMaxItems()));
        }

        return request;
    }

}
