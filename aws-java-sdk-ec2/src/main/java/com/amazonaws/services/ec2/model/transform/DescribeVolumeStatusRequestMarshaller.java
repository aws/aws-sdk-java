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
 * DescribeVolumeStatusRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumeStatusRequestMarshaller implements Marshaller<Request<DescribeVolumeStatusRequest>, DescribeVolumeStatusRequest> {

    public Request<DescribeVolumeStatusRequest> marshall(DescribeVolumeStatusRequest describeVolumeStatusRequest) {

        if (describeVolumeStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVolumeStatusRequest> request = new DefaultRequest<DescribeVolumeStatusRequest>(describeVolumeStatusRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVolumeStatus");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeVolumeStatusRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVolumeStatusRequest
                .getFilters();
        if (!describeVolumeStatusRequestFiltersList.isEmpty() || !describeVolumeStatusRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVolumeStatusRequestFiltersListValue : describeVolumeStatusRequestFiltersList) {

                if (describeVolumeStatusRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeVolumeStatusRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVolumeStatusRequestFiltersListValue
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

        if (describeVolumeStatusRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVolumeStatusRequest.getMaxResults()));
        }

        if (describeVolumeStatusRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVolumeStatusRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeVolumeStatusRequestVolumeIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVolumeStatusRequest
                .getVolumeIds();
        if (!describeVolumeStatusRequestVolumeIdsList.isEmpty() || !describeVolumeStatusRequestVolumeIdsList.isAutoConstruct()) {
            int volumeIdsListIndex = 1;

            for (String describeVolumeStatusRequestVolumeIdsListValue : describeVolumeStatusRequestVolumeIdsList) {
                if (describeVolumeStatusRequestVolumeIdsListValue != null) {
                    request.addParameter("VolumeId." + volumeIdsListIndex, StringUtils.fromString(describeVolumeStatusRequestVolumeIdsListValue));
                }
                volumeIdsListIndex++;
            }
        }

        return request;
    }

}
