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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeCapacityBlockOfferingsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityBlockOfferingsRequestMarshaller implements
        Marshaller<Request<DescribeCapacityBlockOfferingsRequest>, DescribeCapacityBlockOfferingsRequest> {

    public Request<DescribeCapacityBlockOfferingsRequest> marshall(DescribeCapacityBlockOfferingsRequest describeCapacityBlockOfferingsRequest) {

        if (describeCapacityBlockOfferingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCapacityBlockOfferingsRequest> request = new DefaultRequest<DescribeCapacityBlockOfferingsRequest>(
                describeCapacityBlockOfferingsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeCapacityBlockOfferings");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeCapacityBlockOfferingsRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(describeCapacityBlockOfferingsRequest.getInstanceType()));
        }

        if (describeCapacityBlockOfferingsRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(describeCapacityBlockOfferingsRequest.getInstanceCount()));
        }

        if (describeCapacityBlockOfferingsRequest.getStartDateRange() != null) {
            request.addParameter("StartDateRange", StringUtils.fromDate(describeCapacityBlockOfferingsRequest.getStartDateRange()));
        }

        if (describeCapacityBlockOfferingsRequest.getEndDateRange() != null) {
            request.addParameter("EndDateRange", StringUtils.fromDate(describeCapacityBlockOfferingsRequest.getEndDateRange()));
        }

        if (describeCapacityBlockOfferingsRequest.getCapacityDurationHours() != null) {
            request.addParameter("CapacityDurationHours", StringUtils.fromInteger(describeCapacityBlockOfferingsRequest.getCapacityDurationHours()));
        }

        if (describeCapacityBlockOfferingsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeCapacityBlockOfferingsRequest.getNextToken()));
        }

        if (describeCapacityBlockOfferingsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeCapacityBlockOfferingsRequest.getMaxResults()));
        }

        return request;
    }

}
