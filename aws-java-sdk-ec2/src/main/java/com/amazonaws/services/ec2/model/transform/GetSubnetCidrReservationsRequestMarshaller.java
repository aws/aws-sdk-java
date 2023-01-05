/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetSubnetCidrReservationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSubnetCidrReservationsRequestMarshaller implements Marshaller<Request<GetSubnetCidrReservationsRequest>, GetSubnetCidrReservationsRequest> {

    public Request<GetSubnetCidrReservationsRequest> marshall(GetSubnetCidrReservationsRequest getSubnetCidrReservationsRequest) {

        if (getSubnetCidrReservationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetSubnetCidrReservationsRequest> request = new DefaultRequest<GetSubnetCidrReservationsRequest>(getSubnetCidrReservationsRequest, "AmazonEC2");
        request.addParameter("Action", "GetSubnetCidrReservations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> getSubnetCidrReservationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) getSubnetCidrReservationsRequest
                .getFilters();
        if (!getSubnetCidrReservationsRequestFiltersList.isEmpty() || !getSubnetCidrReservationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter getSubnetCidrReservationsRequestFiltersListValue : getSubnetCidrReservationsRequestFiltersList) {

                if (getSubnetCidrReservationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(getSubnetCidrReservationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) getSubnetCidrReservationsRequestFiltersListValue
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

        if (getSubnetCidrReservationsRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(getSubnetCidrReservationsRequest.getSubnetId()));
        }

        if (getSubnetCidrReservationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getSubnetCidrReservationsRequest.getNextToken()));
        }

        if (getSubnetCidrReservationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getSubnetCidrReservationsRequest.getMaxResults()));
        }

        return request;
    }

}
