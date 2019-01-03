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
 * DescribeAvailabilityZonesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAvailabilityZonesRequestMarshaller implements Marshaller<Request<DescribeAvailabilityZonesRequest>, DescribeAvailabilityZonesRequest> {

    public Request<DescribeAvailabilityZonesRequest> marshall(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) {

        if (describeAvailabilityZonesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAvailabilityZonesRequest> request = new DefaultRequest<DescribeAvailabilityZonesRequest>(describeAvailabilityZonesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeAvailabilityZones");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeAvailabilityZonesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeAvailabilityZonesRequest
                .getFilters();
        if (!describeAvailabilityZonesRequestFiltersList.isEmpty() || !describeAvailabilityZonesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeAvailabilityZonesRequestFiltersListValue : describeAvailabilityZonesRequestFiltersList) {

                if (describeAvailabilityZonesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeAvailabilityZonesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeAvailabilityZonesRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeAvailabilityZonesRequestZoneNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeAvailabilityZonesRequest
                .getZoneNames();
        if (!describeAvailabilityZonesRequestZoneNamesList.isEmpty() || !describeAvailabilityZonesRequestZoneNamesList.isAutoConstruct()) {
            int zoneNamesListIndex = 1;

            for (String describeAvailabilityZonesRequestZoneNamesListValue : describeAvailabilityZonesRequestZoneNamesList) {
                if (describeAvailabilityZonesRequestZoneNamesListValue != null) {
                    request.addParameter("ZoneName." + zoneNamesListIndex, StringUtils.fromString(describeAvailabilityZonesRequestZoneNamesListValue));
                }
                zoneNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeAvailabilityZonesRequestZoneIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeAvailabilityZonesRequest
                .getZoneIds();
        if (!describeAvailabilityZonesRequestZoneIdsList.isEmpty() || !describeAvailabilityZonesRequestZoneIdsList.isAutoConstruct()) {
            int zoneIdsListIndex = 1;

            for (String describeAvailabilityZonesRequestZoneIdsListValue : describeAvailabilityZonesRequestZoneIdsList) {
                if (describeAvailabilityZonesRequestZoneIdsListValue != null) {
                    request.addParameter("ZoneId." + zoneIdsListIndex, StringUtils.fromString(describeAvailabilityZonesRequestZoneIdsListValue));
                }
                zoneIdsListIndex++;
            }
        }

        return request;
    }

}
