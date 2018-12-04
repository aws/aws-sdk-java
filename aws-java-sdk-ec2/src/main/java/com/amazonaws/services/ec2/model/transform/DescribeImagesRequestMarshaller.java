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
 * DescribeImagesRequest Marshaller
 */

public class DescribeImagesRequestMarshaller implements
        Marshaller<Request<DescribeImagesRequest>, DescribeImagesRequest> {

    public Request<DescribeImagesRequest> marshall(
            DescribeImagesRequest describeImagesRequest) {

        if (describeImagesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeImagesRequest> request = new DefaultRequest<DescribeImagesRequest>(
                describeImagesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeImages");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> imageIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeImagesRequest
                .getImageIds();
        if (!imageIdsList.isEmpty() || !imageIdsList.isAutoConstruct()) {
            int imageIdsListIndex = 1;

            for (String imageIdsListValue : imageIdsList) {
                if (imageIdsListValue != null) {
                    request.addParameter("ImageId." + imageIdsListIndex,
                            StringUtils.fromString(imageIdsListValue));
                }
                imageIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> ownersList = (com.amazonaws.internal.SdkInternalList<String>) describeImagesRequest
                .getOwners();
        if (!ownersList.isEmpty() || !ownersList.isAutoConstruct()) {
            int ownersListIndex = 1;

            for (String ownersListValue : ownersList) {
                if (ownersListValue != null) {
                    request.addParameter("Owner." + ownersListIndex,
                            StringUtils.fromString(ownersListValue));
                }
                ownersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> executableUsersList = (com.amazonaws.internal.SdkInternalList<String>) describeImagesRequest
                .getExecutableUsers();
        if (!executableUsersList.isEmpty()
                || !executableUsersList.isAutoConstruct()) {
            int executableUsersListIndex = 1;

            for (String executableUsersListValue : executableUsersList) {
                if (executableUsersListValue != null) {
                    request.addParameter("ExecutableBy."
                            + executableUsersListIndex,
                            StringUtils.fromString(executableUsersListValue));
                }
                executableUsersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeImagesRequest
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

        return request;
    }

}
