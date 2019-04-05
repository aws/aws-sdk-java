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
 * DescribeVolumesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumesRequestMarshaller implements Marshaller<Request<DescribeVolumesRequest>, DescribeVolumesRequest> {

    public Request<DescribeVolumesRequest> marshall(DescribeVolumesRequest describeVolumesRequest) {

        if (describeVolumesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVolumesRequest> request = new DefaultRequest<DescribeVolumesRequest>(describeVolumesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVolumes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeVolumesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVolumesRequest
                .getFilters();
        if (!describeVolumesRequestFiltersList.isEmpty() || !describeVolumesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVolumesRequestFiltersListValue : describeVolumesRequestFiltersList) {

                if (describeVolumesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeVolumesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVolumesRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeVolumesRequestVolumeIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVolumesRequest
                .getVolumeIds();
        if (!describeVolumesRequestVolumeIdsList.isEmpty() || !describeVolumesRequestVolumeIdsList.isAutoConstruct()) {
            int volumeIdsListIndex = 1;

            for (String describeVolumesRequestVolumeIdsListValue : describeVolumesRequestVolumeIdsList) {
                if (describeVolumesRequestVolumeIdsListValue != null) {
                    request.addParameter("VolumeId." + volumeIdsListIndex, StringUtils.fromString(describeVolumesRequestVolumeIdsListValue));
                }
                volumeIdsListIndex++;
            }
        }

        if (describeVolumesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVolumesRequest.getMaxResults()));
        }

        if (describeVolumesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVolumesRequest.getNextToken()));
        }

        return request;
    }

}
