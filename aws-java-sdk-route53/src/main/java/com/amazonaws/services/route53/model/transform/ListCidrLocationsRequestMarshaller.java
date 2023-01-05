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
 * ListCidrLocationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCidrLocationsRequestMarshaller implements Marshaller<Request<ListCidrLocationsRequest>, ListCidrLocationsRequest> {

    public Request<ListCidrLocationsRequest> marshall(ListCidrLocationsRequest listCidrLocationsRequest) {

        if (listCidrLocationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListCidrLocationsRequest> request = new DefaultRequest<ListCidrLocationsRequest>(listCidrLocationsRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/cidrcollection/{CidrCollectionId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "CidrCollectionId",
                listCidrLocationsRequest.getCollectionId());
        request.setResourcePath(uriResourcePath);

        if (listCidrLocationsRequest.getNextToken() != null) {
            request.addParameter("nexttoken", StringUtils.fromString(listCidrLocationsRequest.getNextToken()));
        }

        if (listCidrLocationsRequest.getMaxResults() != null) {
            request.addParameter("maxresults", StringUtils.fromString(listCidrLocationsRequest.getMaxResults()));
        }

        return request;
    }

}
