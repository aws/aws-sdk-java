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
 * DescribeBundleTasksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBundleTasksRequestMarshaller implements Marshaller<Request<DescribeBundleTasksRequest>, DescribeBundleTasksRequest> {

    public Request<DescribeBundleTasksRequest> marshall(DescribeBundleTasksRequest describeBundleTasksRequest) {

        if (describeBundleTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeBundleTasksRequest> request = new DefaultRequest<DescribeBundleTasksRequest>(describeBundleTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeBundleTasks");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeBundleTasksRequestBundleIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeBundleTasksRequest
                .getBundleIds();
        if (!describeBundleTasksRequestBundleIdsList.isEmpty() || !describeBundleTasksRequestBundleIdsList.isAutoConstruct()) {
            int bundleIdsListIndex = 1;

            for (String describeBundleTasksRequestBundleIdsListValue : describeBundleTasksRequestBundleIdsList) {
                if (describeBundleTasksRequestBundleIdsListValue != null) {
                    request.addParameter("BundleId." + bundleIdsListIndex, StringUtils.fromString(describeBundleTasksRequestBundleIdsListValue));
                }
                bundleIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeBundleTasksRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeBundleTasksRequest
                .getFilters();
        if (!describeBundleTasksRequestFiltersList.isEmpty() || !describeBundleTasksRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeBundleTasksRequestFiltersListValue : describeBundleTasksRequestFiltersList) {

                if (describeBundleTasksRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeBundleTasksRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeBundleTasksRequestFiltersListValue
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

        return request;
    }

}
