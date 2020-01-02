/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeTrafficMirrorFiltersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficMirrorFiltersRequestMarshaller implements
        Marshaller<Request<DescribeTrafficMirrorFiltersRequest>, DescribeTrafficMirrorFiltersRequest> {

    public Request<DescribeTrafficMirrorFiltersRequest> marshall(DescribeTrafficMirrorFiltersRequest describeTrafficMirrorFiltersRequest) {

        if (describeTrafficMirrorFiltersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTrafficMirrorFiltersRequest> request = new DefaultRequest<DescribeTrafficMirrorFiltersRequest>(describeTrafficMirrorFiltersRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeTrafficMirrorFilters");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTrafficMirrorFiltersRequestTrafficMirrorFilterIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTrafficMirrorFiltersRequest
                .getTrafficMirrorFilterIds();
        if (!describeTrafficMirrorFiltersRequestTrafficMirrorFilterIdsList.isEmpty()
                || !describeTrafficMirrorFiltersRequestTrafficMirrorFilterIdsList.isAutoConstruct()) {
            int trafficMirrorFilterIdsListIndex = 1;

            for (String describeTrafficMirrorFiltersRequestTrafficMirrorFilterIdsListValue : describeTrafficMirrorFiltersRequestTrafficMirrorFilterIdsList) {
                if (describeTrafficMirrorFiltersRequestTrafficMirrorFilterIdsListValue != null) {
                    request.addParameter("TrafficMirrorFilterId." + trafficMirrorFilterIdsListIndex,
                            StringUtils.fromString(describeTrafficMirrorFiltersRequestTrafficMirrorFilterIdsListValue));
                }
                trafficMirrorFilterIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTrafficMirrorFiltersRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTrafficMirrorFiltersRequest
                .getFilters();
        if (!describeTrafficMirrorFiltersRequestFiltersList.isEmpty() || !describeTrafficMirrorFiltersRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTrafficMirrorFiltersRequestFiltersListValue : describeTrafficMirrorFiltersRequestFiltersList) {

                if (describeTrafficMirrorFiltersRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTrafficMirrorFiltersRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTrafficMirrorFiltersRequestFiltersListValue
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

        if (describeTrafficMirrorFiltersRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTrafficMirrorFiltersRequest.getMaxResults()));
        }

        if (describeTrafficMirrorFiltersRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTrafficMirrorFiltersRequest.getNextToken()));
        }

        return request;
    }

}
