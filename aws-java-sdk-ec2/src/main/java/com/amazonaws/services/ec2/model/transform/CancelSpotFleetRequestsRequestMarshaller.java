/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CancelSpotFleetRequestsRequest Marshaller
 */

public class CancelSpotFleetRequestsRequestMarshaller
        implements
        Marshaller<Request<CancelSpotFleetRequestsRequest>, CancelSpotFleetRequestsRequest> {

    public Request<CancelSpotFleetRequestsRequest> marshall(
            CancelSpotFleetRequestsRequest cancelSpotFleetRequestsRequest) {

        if (cancelSpotFleetRequestsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CancelSpotFleetRequestsRequest> request = new DefaultRequest<CancelSpotFleetRequestsRequest>(
                cancelSpotFleetRequestsRequest, "AmazonEC2");
        request.addParameter("Action", "CancelSpotFleetRequests");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> spotFleetRequestIdsList = (com.amazonaws.internal.SdkInternalList<String>) cancelSpotFleetRequestsRequest
                .getSpotFleetRequestIds();
        if (!spotFleetRequestIdsList.isEmpty()
                || !spotFleetRequestIdsList.isAutoConstruct()) {
            int spotFleetRequestIdsListIndex = 1;

            for (String spotFleetRequestIdsListValue : spotFleetRequestIdsList) {
                if (spotFleetRequestIdsListValue != null) {
                    request.addParameter("SpotFleetRequestId."
                            + spotFleetRequestIdsListIndex, StringUtils
                            .fromString(spotFleetRequestIdsListValue));
                }
                spotFleetRequestIdsListIndex++;
            }
        }

        if (cancelSpotFleetRequestsRequest.getTerminateInstances() != null) {
            request.addParameter("TerminateInstances", StringUtils
                    .fromBoolean(cancelSpotFleetRequestsRequest
                            .getTerminateInstances()));
        }

        return request;
    }

}
