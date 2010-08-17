/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Reserved Instances Offerings Request Marshaller
 */
public class DescribeReservedInstancesOfferingsRequestMarshaller implements Marshaller<Request<DescribeReservedInstancesOfferingsRequest>, DescribeReservedInstancesOfferingsRequest> {

    public Request<DescribeReservedInstancesOfferingsRequest> marshall(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) {
        Request<DescribeReservedInstancesOfferingsRequest> request = new DefaultRequest<DescribeReservedInstancesOfferingsRequest>(describeReservedInstancesOfferingsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeReservedInstancesOfferings");
        request.addParameter("Version", "2010-06-15");
        if (describeReservedInstancesOfferingsRequest != null) {
            java.util.List<String> reservedInstancesOfferingIdsList = describeReservedInstancesOfferingsRequest.getReservedInstancesOfferingIds();
            int reservedInstancesOfferingIdsListIndex = 1;
            for (String reservedInstancesOfferingIdsListValue : reservedInstancesOfferingIdsList) {
                if (reservedInstancesOfferingIdsListValue != null) {
                    request.addParameter("ReservedInstancesOfferingId." + reservedInstancesOfferingIdsListIndex, StringUtils.fromString(reservedInstancesOfferingIdsListValue));
                }
                reservedInstancesOfferingIdsListIndex++;
            }
        }
        if (describeReservedInstancesOfferingsRequest != null) {
            if (describeReservedInstancesOfferingsRequest.getInstanceType() != null) {
                request.addParameter("InstanceType", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getInstanceType()));
            }
        }
        if (describeReservedInstancesOfferingsRequest != null) {
            if (describeReservedInstancesOfferingsRequest.getAvailabilityZone() != null) {
                request.addParameter("AvailabilityZone", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getAvailabilityZone()));
            }
        }
        if (describeReservedInstancesOfferingsRequest != null) {
            if (describeReservedInstancesOfferingsRequest.getProductDescription() != null) {
                request.addParameter("ProductDescription", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getProductDescription()));
            }
        }


        return request;
    }
}
