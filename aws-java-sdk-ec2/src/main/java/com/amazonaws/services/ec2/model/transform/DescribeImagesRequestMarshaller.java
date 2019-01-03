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
 * DescribeImagesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImagesRequestMarshaller implements Marshaller<Request<DescribeImagesRequest>, DescribeImagesRequest> {

    public Request<DescribeImagesRequest> marshall(DescribeImagesRequest describeImagesRequest) {

        if (describeImagesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeImagesRequest> request = new DefaultRequest<DescribeImagesRequest>(describeImagesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeImages");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeImagesRequestExecutableUsersList = (com.amazonaws.internal.SdkInternalList<String>) describeImagesRequest
                .getExecutableUsers();
        if (!describeImagesRequestExecutableUsersList.isEmpty() || !describeImagesRequestExecutableUsersList.isAutoConstruct()) {
            int executableUsersListIndex = 1;

            for (String describeImagesRequestExecutableUsersListValue : describeImagesRequestExecutableUsersList) {
                if (describeImagesRequestExecutableUsersListValue != null) {
                    request.addParameter("ExecutableBy." + executableUsersListIndex, StringUtils.fromString(describeImagesRequestExecutableUsersListValue));
                }
                executableUsersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeImagesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeImagesRequest
                .getFilters();
        if (!describeImagesRequestFiltersList.isEmpty() || !describeImagesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeImagesRequestFiltersListValue : describeImagesRequestFiltersList) {

                if (describeImagesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeImagesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeImagesRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeImagesRequestImageIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeImagesRequest
                .getImageIds();
        if (!describeImagesRequestImageIdsList.isEmpty() || !describeImagesRequestImageIdsList.isAutoConstruct()) {
            int imageIdsListIndex = 1;

            for (String describeImagesRequestImageIdsListValue : describeImagesRequestImageIdsList) {
                if (describeImagesRequestImageIdsListValue != null) {
                    request.addParameter("ImageId." + imageIdsListIndex, StringUtils.fromString(describeImagesRequestImageIdsListValue));
                }
                imageIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeImagesRequestOwnersList = (com.amazonaws.internal.SdkInternalList<String>) describeImagesRequest
                .getOwners();
        if (!describeImagesRequestOwnersList.isEmpty() || !describeImagesRequestOwnersList.isAutoConstruct()) {
            int ownersListIndex = 1;

            for (String describeImagesRequestOwnersListValue : describeImagesRequestOwnersList) {
                if (describeImagesRequestOwnersListValue != null) {
                    request.addParameter("Owner." + ownersListIndex, StringUtils.fromString(describeImagesRequestOwnersListValue));
                }
                ownersListIndex++;
            }
        }

        return request;
    }

}
