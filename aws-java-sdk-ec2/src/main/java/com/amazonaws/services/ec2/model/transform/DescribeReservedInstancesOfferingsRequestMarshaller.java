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
 * DescribeReservedInstancesOfferingsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesOfferingsRequestMarshaller implements
        Marshaller<Request<DescribeReservedInstancesOfferingsRequest>, DescribeReservedInstancesOfferingsRequest> {

    public Request<DescribeReservedInstancesOfferingsRequest> marshall(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) {

        if (describeReservedInstancesOfferingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeReservedInstancesOfferingsRequest> request = new DefaultRequest<DescribeReservedInstancesOfferingsRequest>(
                describeReservedInstancesOfferingsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeReservedInstancesOfferings");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeReservedInstancesOfferingsRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getAvailabilityZone()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeReservedInstancesOfferingsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeReservedInstancesOfferingsRequest
                .getFilters();
        if (!describeReservedInstancesOfferingsRequestFiltersList.isEmpty() || !describeReservedInstancesOfferingsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeReservedInstancesOfferingsRequestFiltersListValue : describeReservedInstancesOfferingsRequestFiltersList) {

                if (describeReservedInstancesOfferingsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeReservedInstancesOfferingsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeReservedInstancesOfferingsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeReservedInstancesOfferingsRequest.getIncludeMarketplace() != null) {
            request.addParameter("IncludeMarketplace", StringUtils.fromBoolean(describeReservedInstancesOfferingsRequest.getIncludeMarketplace()));
        }

        if (describeReservedInstancesOfferingsRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getInstanceType()));
        }

        if (describeReservedInstancesOfferingsRequest.getMaxDuration() != null) {
            request.addParameter("MaxDuration", StringUtils.fromLong(describeReservedInstancesOfferingsRequest.getMaxDuration()));
        }

        if (describeReservedInstancesOfferingsRequest.getMaxInstanceCount() != null) {
            request.addParameter("MaxInstanceCount", StringUtils.fromInteger(describeReservedInstancesOfferingsRequest.getMaxInstanceCount()));
        }

        if (describeReservedInstancesOfferingsRequest.getMinDuration() != null) {
            request.addParameter("MinDuration", StringUtils.fromLong(describeReservedInstancesOfferingsRequest.getMinDuration()));
        }

        if (describeReservedInstancesOfferingsRequest.getOfferingClass() != null) {
            request.addParameter("OfferingClass", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getOfferingClass()));
        }

        if (describeReservedInstancesOfferingsRequest.getProductDescription() != null) {
            request.addParameter("ProductDescription", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getProductDescription()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeReservedInstancesOfferingsRequestReservedInstancesOfferingIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeReservedInstancesOfferingsRequest
                .getReservedInstancesOfferingIds();
        if (!describeReservedInstancesOfferingsRequestReservedInstancesOfferingIdsList.isEmpty()
                || !describeReservedInstancesOfferingsRequestReservedInstancesOfferingIdsList.isAutoConstruct()) {
            int reservedInstancesOfferingIdsListIndex = 1;

            for (String describeReservedInstancesOfferingsRequestReservedInstancesOfferingIdsListValue : describeReservedInstancesOfferingsRequestReservedInstancesOfferingIdsList) {
                if (describeReservedInstancesOfferingsRequestReservedInstancesOfferingIdsListValue != null) {
                    request.addParameter("ReservedInstancesOfferingId." + reservedInstancesOfferingIdsListIndex,
                            StringUtils.fromString(describeReservedInstancesOfferingsRequestReservedInstancesOfferingIdsListValue));
                }
                reservedInstancesOfferingIdsListIndex++;
            }
        }

        if (describeReservedInstancesOfferingsRequest.getInstanceTenancy() != null) {
            request.addParameter("InstanceTenancy", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getInstanceTenancy()));
        }

        if (describeReservedInstancesOfferingsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeReservedInstancesOfferingsRequest.getMaxResults()));
        }

        if (describeReservedInstancesOfferingsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getNextToken()));
        }

        if (describeReservedInstancesOfferingsRequest.getOfferingType() != null) {
            request.addParameter("OfferingType", StringUtils.fromString(describeReservedInstancesOfferingsRequest.getOfferingType()));
        }

        return request;
    }

}
