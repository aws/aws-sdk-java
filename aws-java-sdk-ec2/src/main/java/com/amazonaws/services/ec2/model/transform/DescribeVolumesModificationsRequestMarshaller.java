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
 * DescribeVolumesModificationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumesModificationsRequestMarshaller implements
        Marshaller<Request<DescribeVolumesModificationsRequest>, DescribeVolumesModificationsRequest> {

    public Request<DescribeVolumesModificationsRequest> marshall(DescribeVolumesModificationsRequest describeVolumesModificationsRequest) {

        if (describeVolumesModificationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVolumesModificationsRequest> request = new DefaultRequest<DescribeVolumesModificationsRequest>(describeVolumesModificationsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeVolumesModifications");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVolumesModificationsRequestVolumeIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVolumesModificationsRequest
                .getVolumeIds();
        if (!describeVolumesModificationsRequestVolumeIdsList.isEmpty() || !describeVolumesModificationsRequestVolumeIdsList.isAutoConstruct()) {
            int volumeIdsListIndex = 1;

            for (String describeVolumesModificationsRequestVolumeIdsListValue : describeVolumesModificationsRequestVolumeIdsList) {
                if (describeVolumesModificationsRequestVolumeIdsListValue != null) {
                    request.addParameter("VolumeId." + volumeIdsListIndex, StringUtils.fromString(describeVolumesModificationsRequestVolumeIdsListValue));
                }
                volumeIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVolumesModificationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVolumesModificationsRequest
                .getFilters();
        if (!describeVolumesModificationsRequestFiltersList.isEmpty() || !describeVolumesModificationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVolumesModificationsRequestFiltersListValue : describeVolumesModificationsRequestFiltersList) {

                if (describeVolumesModificationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVolumesModificationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVolumesModificationsRequestFiltersListValue
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

        if (describeVolumesModificationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVolumesModificationsRequest.getNextToken()));
        }

        if (describeVolumesModificationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVolumesModificationsRequest.getMaxResults()));
        }

        return request;
    }

}
