/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * ListCidrBlocksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCidrBlocksRequestMarshaller implements Marshaller<Request<ListCidrBlocksRequest>, ListCidrBlocksRequest> {

    public Request<ListCidrBlocksRequest> marshall(ListCidrBlocksRequest listCidrBlocksRequest) {

        if (listCidrBlocksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListCidrBlocksRequest> request = new DefaultRequest<ListCidrBlocksRequest>(listCidrBlocksRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/cidrcollection/{CidrCollectionId}/cidrblocks";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "CidrCollectionId",
                listCidrBlocksRequest.getCollectionId());
        request.setResourcePath(uriResourcePath);

        if (listCidrBlocksRequest.getLocationName() != null) {
            request.addParameter("location", StringUtils.fromString(listCidrBlocksRequest.getLocationName()));
        }

        if (listCidrBlocksRequest.getNextToken() != null) {
            request.addParameter("nexttoken", StringUtils.fromString(listCidrBlocksRequest.getNextToken()));
        }

        if (listCidrBlocksRequest.getMaxResults() != null) {
            request.addParameter("maxresults", StringUtils.fromString(listCidrBlocksRequest.getMaxResults()));
        }

        return request;
    }

}
