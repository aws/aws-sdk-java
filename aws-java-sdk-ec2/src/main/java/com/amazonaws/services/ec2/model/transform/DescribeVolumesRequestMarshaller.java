/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeVolumesRequest Marshaller
 */

public class DescribeVolumesRequestMarshaller implements
        Marshaller<Request<DescribeVolumesRequest>, DescribeVolumesRequest> {

    public Request<DescribeVolumesRequest> marshall(
            DescribeVolumesRequest describeVolumesRequest) {

        if (describeVolumesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeVolumesRequest> request = new DefaultRequest<DescribeVolumesRequest>(
                describeVolumesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVolumes");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> volumeIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVolumesRequest
                .getVolumeIds();
        if (!volumeIdsList.isEmpty() || !volumeIdsList.isAutoConstruct()) {
            int volumeIdsListIndex = 1;

            for (String volumeIdsListValue : volumeIdsList) {
                if (volumeIdsListValue != null) {
                    request.addParameter("VolumeId." + volumeIdsListIndex,
                            StringUtils.fromString(volumeIdsListValue));
                }
                volumeIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVolumesRequest
                .getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter(
                            "Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeVolumesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeVolumesRequest.getNextToken()));
        }

        if (describeVolumesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeVolumesRequest.getMaxResults()));
        }

        return request;
    }

}
