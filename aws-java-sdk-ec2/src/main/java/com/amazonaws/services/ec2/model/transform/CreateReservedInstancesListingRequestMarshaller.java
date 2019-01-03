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
 * CreateReservedInstancesListingRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReservedInstancesListingRequestMarshaller implements
        Marshaller<Request<CreateReservedInstancesListingRequest>, CreateReservedInstancesListingRequest> {

    public Request<CreateReservedInstancesListingRequest> marshall(CreateReservedInstancesListingRequest createReservedInstancesListingRequest) {

        if (createReservedInstancesListingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReservedInstancesListingRequest> request = new DefaultRequest<CreateReservedInstancesListingRequest>(
                createReservedInstancesListingRequest, "AmazonEC2");
        request.addParameter("Action", "CreateReservedInstancesListing");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createReservedInstancesListingRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createReservedInstancesListingRequest.getClientToken()));
        }

        if (createReservedInstancesListingRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(createReservedInstancesListingRequest.getInstanceCount()));
        }

        com.amazonaws.internal.SdkInternalList<PriceScheduleSpecification> createReservedInstancesListingRequestPriceSchedulesList = (com.amazonaws.internal.SdkInternalList<PriceScheduleSpecification>) createReservedInstancesListingRequest
                .getPriceSchedules();
        if (!createReservedInstancesListingRequestPriceSchedulesList.isEmpty() || !createReservedInstancesListingRequestPriceSchedulesList.isAutoConstruct()) {
            int priceSchedulesListIndex = 1;

            for (PriceScheduleSpecification createReservedInstancesListingRequestPriceSchedulesListValue : createReservedInstancesListingRequestPriceSchedulesList) {

                if (createReservedInstancesListingRequestPriceSchedulesListValue.getCurrencyCode() != null) {
                    request.addParameter("PriceSchedules." + priceSchedulesListIndex + ".CurrencyCode",
                            StringUtils.fromString(createReservedInstancesListingRequestPriceSchedulesListValue.getCurrencyCode()));
                }

                if (createReservedInstancesListingRequestPriceSchedulesListValue.getPrice() != null) {
                    request.addParameter("PriceSchedules." + priceSchedulesListIndex + ".Price",
                            StringUtils.fromDouble(createReservedInstancesListingRequestPriceSchedulesListValue.getPrice()));
                }

                if (createReservedInstancesListingRequestPriceSchedulesListValue.getTerm() != null) {
                    request.addParameter("PriceSchedules." + priceSchedulesListIndex + ".Term",
                            StringUtils.fromLong(createReservedInstancesListingRequestPriceSchedulesListValue.getTerm()));
                }
                priceSchedulesListIndex++;
            }
        }

        if (createReservedInstancesListingRequest.getReservedInstancesId() != null) {
            request.addParameter("ReservedInstancesId", StringUtils.fromString(createReservedInstancesListingRequest.getReservedInstancesId()));
        }

        return request;
    }

}
