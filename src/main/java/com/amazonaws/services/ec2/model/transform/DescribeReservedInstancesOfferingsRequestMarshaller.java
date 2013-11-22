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
 * Describe Reserved Instances Offerings Request Marshaller
 */
public class DescribeReservedInstancesOfferingsRequestMarshaller implements Marshaller<Request<DescribeReservedInstancesOfferingsRequest>, DescribeReservedInstancesOfferingsRequest> {

    public Request<DescribeReservedInstancesOfferingsRequest> marshall(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) {

        if (describeReservedInstancesOfferingsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeReservedInstancesOfferingsRequest> request = new DefaultRequest<DescribeReservedInstancesOfferingsRequest>(describeReservedInstancesOfferingsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeReservedInstancesOfferings");
        request.addParameter("Version", "2013-10-15");


        java.util.List<String> reservedInstancesOfferingIdsList = describeReservedInstancesOfferingsRequest.getReservedInstancesOfferingIds();
        int reservedInstancesOfferingIdsListIndex = 1;

        for (String reservedInstancesOfferingIdsListValue : reservedInstancesOfferingIdsList) {
            if (reservedInstancesOfferingIdsListValue != null) {
                request.addParameter("ReservedInstancesOfferingId." + reservedInstancesOfferingIdsListIndex, StringUtils.fromString(reservedInstancesOfferingIdsListValue));
            }

            reservedInstancesOfferingIdsListIndex++;
        }
        if (describeReservedInstancesOfferingsRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getInstanceType()));
        }
        if (describeReservedInstancesOfferingsRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getAvailabilityZone()));
        }
        if (describeReservedInstancesOfferingsRequest.getProductDescription() != null) {
            request.addParameter("ProductDescription", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getProductDescription()));
        }

        java.util.List<Filter> filtersList = describeReservedInstancesOfferingsRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filterMember.getName()));
                }

                java.util.List<String> valuesList = filterMember.getValues();
                int valuesListIndex = 1;

                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                    }

                    valuesListIndex++;
                }
            }

            filtersListIndex++;
        }
        if (describeReservedInstancesOfferingsRequest.getInstanceTenancy() != null) {
            request.addParameter("InstanceTenancy", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getInstanceTenancy()));
        }
        if (describeReservedInstancesOfferingsRequest.getOfferingType() != null) {
            request.addParameter("OfferingType", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getOfferingType()));
        }
        if (describeReservedInstancesOfferingsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getNextToken()));
        }
        if (describeReservedInstancesOfferingsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeReservedInstancesOfferingsRequest.getMaxResults()));
        }
        if (describeReservedInstancesOfferingsRequest.isIncludeMarketplace() != null) {
            request.addParameter("IncludeMarketplace", StringUtils.fromBoolean(describeReservedInstancesOfferingsRequest.isIncludeMarketplace()));
        }
        if (describeReservedInstancesOfferingsRequest.getMinDuration() != null) {
            request.addParameter("MinDuration", StringUtils.fromLong(describeReservedInstancesOfferingsRequest.getMinDuration()));
        }
        if (describeReservedInstancesOfferingsRequest.getMaxDuration() != null) {
            request.addParameter("MaxDuration", StringUtils.fromLong(describeReservedInstancesOfferingsRequest.getMaxDuration()));
        }
        if (describeReservedInstancesOfferingsRequest.getMaxInstanceCount() != null) {
            request.addParameter("MaxInstanceCount", StringUtils.fromInteger(describeReservedInstancesOfferingsRequest.getMaxInstanceCount()));
        }


        return request;
    }
}
