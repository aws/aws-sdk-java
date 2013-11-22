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
 * Create Reserved Instances Listing Request Marshaller
 */
public class CreateReservedInstancesListingRequestMarshaller implements Marshaller<Request<CreateReservedInstancesListingRequest>, CreateReservedInstancesListingRequest> {

    public Request<CreateReservedInstancesListingRequest> marshall(CreateReservedInstancesListingRequest createReservedInstancesListingRequest) {

        if (createReservedInstancesListingRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateReservedInstancesListingRequest> request = new DefaultRequest<CreateReservedInstancesListingRequest>(createReservedInstancesListingRequest, "AmazonEC2");
        request.addParameter("Action", "CreateReservedInstancesListing");
        request.addParameter("Version", "2013-10-15");

        if (createReservedInstancesListingRequest.getReservedInstancesId() != null) {
            request.addParameter("ReservedInstancesId", StringUtils.fromString(createReservedInstancesListingRequest.getReservedInstancesId()));
        }
        if (createReservedInstancesListingRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(createReservedInstancesListingRequest.getInstanceCount()));
        }

        java.util.List<PriceScheduleSpecification> priceSchedulesList = createReservedInstancesListingRequest.getPriceSchedules();
        int priceSchedulesListIndex = 1;

        for (PriceScheduleSpecification priceSchedulesListValue : priceSchedulesList) {
            PriceScheduleSpecification priceScheduleSpecificationMember = priceSchedulesListValue;
            if (priceScheduleSpecificationMember != null) {
                if (priceScheduleSpecificationMember.getTerm() != null) {
                    request.addParameter("PriceSchedules." + priceSchedulesListIndex + ".Term", StringUtils.fromLong(priceScheduleSpecificationMember.getTerm()));
                }
                if (priceScheduleSpecificationMember.getPrice() != null) {
                    request.addParameter("PriceSchedules." + priceSchedulesListIndex + ".Price", StringUtils.fromDouble(priceScheduleSpecificationMember.getPrice()));
                }
                if (priceScheduleSpecificationMember.getCurrencyCode() != null) {
                    request.addParameter("PriceSchedules." + priceSchedulesListIndex + ".CurrencyCode", StringUtils.fromString(priceScheduleSpecificationMember.getCurrencyCode()));
                }
            }

            priceSchedulesListIndex++;
        }
        if (createReservedInstancesListingRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createReservedInstancesListingRequest.getClientToken()));
        }


        return request;
    }
}
