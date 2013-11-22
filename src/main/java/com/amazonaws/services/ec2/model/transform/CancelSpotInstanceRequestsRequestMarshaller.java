/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Cancel Spot Instance Requests Request Marshaller
 */
public class CancelSpotInstanceRequestsRequestMarshaller implements Marshaller<Request<CancelSpotInstanceRequestsRequest>, CancelSpotInstanceRequestsRequest> {

    public Request<CancelSpotInstanceRequestsRequest> marshall(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest) {

        if (cancelSpotInstanceRequestsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CancelSpotInstanceRequestsRequest> request = new DefaultRequest<CancelSpotInstanceRequestsRequest>(cancelSpotInstanceRequestsRequest, "AmazonEC2");
        request.addParameter("Action", "CancelSpotInstanceRequests");
        request.addParameter("Version", "2013-10-15");


        java.util.List<String> spotInstanceRequestIdsList = cancelSpotInstanceRequestsRequest.getSpotInstanceRequestIds();
        int spotInstanceRequestIdsListIndex = 1;

        for (String spotInstanceRequestIdsListValue : spotInstanceRequestIdsList) {
            if (spotInstanceRequestIdsListValue != null) {
                request.addParameter("SpotInstanceRequestId." + spotInstanceRequestIdsListIndex, StringUtils.fromString(spotInstanceRequestIdsListValue));
            }

            spotInstanceRequestIdsListIndex++;
        }


        return request;
    }
}
