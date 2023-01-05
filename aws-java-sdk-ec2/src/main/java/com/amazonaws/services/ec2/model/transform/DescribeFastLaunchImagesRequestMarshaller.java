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
 * DescribeFastLaunchImagesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFastLaunchImagesRequestMarshaller implements Marshaller<Request<DescribeFastLaunchImagesRequest>, DescribeFastLaunchImagesRequest> {

    public Request<DescribeFastLaunchImagesRequest> marshall(DescribeFastLaunchImagesRequest describeFastLaunchImagesRequest) {

        if (describeFastLaunchImagesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeFastLaunchImagesRequest> request = new DefaultRequest<DescribeFastLaunchImagesRequest>(describeFastLaunchImagesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeFastLaunchImages");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeFastLaunchImagesRequestImageIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeFastLaunchImagesRequest
                .getImageIds();
        if (!describeFastLaunchImagesRequestImageIdsList.isEmpty() || !describeFastLaunchImagesRequestImageIdsList.isAutoConstruct()) {
            int imageIdsListIndex = 1;

            for (String describeFastLaunchImagesRequestImageIdsListValue : describeFastLaunchImagesRequestImageIdsList) {
                if (describeFastLaunchImagesRequestImageIdsListValue != null) {
                    request.addParameter("ImageId." + imageIdsListIndex, StringUtils.fromString(describeFastLaunchImagesRequestImageIdsListValue));
                }
                imageIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeFastLaunchImagesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeFastLaunchImagesRequest
                .getFilters();
        if (!describeFastLaunchImagesRequestFiltersList.isEmpty() || !describeFastLaunchImagesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeFastLaunchImagesRequestFiltersListValue : describeFastLaunchImagesRequestFiltersList) {

                if (describeFastLaunchImagesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeFastLaunchImagesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeFastLaunchImagesRequestFiltersListValue
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

        if (describeFastLaunchImagesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeFastLaunchImagesRequest.getMaxResults()));
        }

        if (describeFastLaunchImagesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeFastLaunchImagesRequest.getNextToken()));
        }

        return request;
    }

}
