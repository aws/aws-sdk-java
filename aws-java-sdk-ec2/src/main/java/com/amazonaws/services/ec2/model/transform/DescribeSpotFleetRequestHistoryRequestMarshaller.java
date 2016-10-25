/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeSpotFleetRequestHistoryRequest Marshaller
 */

public class DescribeSpotFleetRequestHistoryRequestMarshaller implements
        Marshaller<Request<DescribeSpotFleetRequestHistoryRequest>, DescribeSpotFleetRequestHistoryRequest> {

    public Request<DescribeSpotFleetRequestHistoryRequest> marshall(DescribeSpotFleetRequestHistoryRequest describeSpotFleetRequestHistoryRequest) {

        if (describeSpotFleetRequestHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSpotFleetRequestHistoryRequest> request = new DefaultRequest<DescribeSpotFleetRequestHistoryRequest>(
                describeSpotFleetRequestHistoryRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSpotFleetRequestHistory");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeSpotFleetRequestHistoryRequest.getSpotFleetRequestId() != null) {
            request.addParameter("SpotFleetRequestId", StringUtils.fromString(describeSpotFleetRequestHistoryRequest.getSpotFleetRequestId()));
        }

        if (describeSpotFleetRequestHistoryRequest.getEventType() != null) {
            request.addParameter("EventType", StringUtils.fromString(describeSpotFleetRequestHistoryRequest.getEventType()));
        }

        if (describeSpotFleetRequestHistoryRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeSpotFleetRequestHistoryRequest.getStartTime()));
        }

        if (describeSpotFleetRequestHistoryRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeSpotFleetRequestHistoryRequest.getNextToken()));
        }

        if (describeSpotFleetRequestHistoryRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeSpotFleetRequestHistoryRequest.getMaxResults()));
        }

        return request;
    }

}
