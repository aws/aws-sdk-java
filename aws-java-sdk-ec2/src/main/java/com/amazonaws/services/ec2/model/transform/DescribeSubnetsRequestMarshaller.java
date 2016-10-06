/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeSubnetsRequest Marshaller
 */

public class DescribeSubnetsRequestMarshaller implements Marshaller<Request<DescribeSubnetsRequest>, DescribeSubnetsRequest> {

    public Request<DescribeSubnetsRequest> marshall(DescribeSubnetsRequest describeSubnetsRequest) {

        if (describeSubnetsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSubnetsRequest> request = new DefaultRequest<DescribeSubnetsRequest>(describeSubnetsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSubnets");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeSubnetsRequestSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSubnetsRequest
                .getSubnetIds();
        if (!describeSubnetsRequestSubnetIdsList.isEmpty() || !describeSubnetsRequestSubnetIdsList.isAutoConstruct()) {
            int subnetIdsListIndex = 1;

            for (String describeSubnetsRequestSubnetIdsListValue : describeSubnetsRequestSubnetIdsList) {
                if (describeSubnetsRequestSubnetIdsListValue != null) {
                    request.addParameter("SubnetId." + subnetIdsListIndex, StringUtils.fromString(describeSubnetsRequestSubnetIdsListValue));
                }
                subnetIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeSubnetsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeSubnetsRequest
                .getFilters();
        if (!describeSubnetsRequestFiltersList.isEmpty() || !describeSubnetsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeSubnetsRequestFiltersListValue : describeSubnetsRequestFiltersList) {

                if (describeSubnetsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeSubnetsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeSubnetsRequestFiltersListValue
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
