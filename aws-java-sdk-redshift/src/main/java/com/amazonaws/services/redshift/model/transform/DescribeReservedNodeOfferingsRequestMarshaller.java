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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeReservedNodeOfferingsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedNodeOfferingsRequestMarshaller implements
        Marshaller<Request<DescribeReservedNodeOfferingsRequest>, DescribeReservedNodeOfferingsRequest> {

    public Request<DescribeReservedNodeOfferingsRequest> marshall(DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest) {

        if (describeReservedNodeOfferingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeReservedNodeOfferingsRequest> request = new DefaultRequest<DescribeReservedNodeOfferingsRequest>(describeReservedNodeOfferingsRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeReservedNodeOfferings");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeReservedNodeOfferingsRequest.getReservedNodeOfferingId() != null) {
            request.addParameter("ReservedNodeOfferingId", StringUtils.fromString(describeReservedNodeOfferingsRequest.getReservedNodeOfferingId()));
        }

        if (describeReservedNodeOfferingsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeReservedNodeOfferingsRequest.getMaxRecords()));
        }

        if (describeReservedNodeOfferingsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeReservedNodeOfferingsRequest.getMarker()));
        }

        return request;
    }

}
