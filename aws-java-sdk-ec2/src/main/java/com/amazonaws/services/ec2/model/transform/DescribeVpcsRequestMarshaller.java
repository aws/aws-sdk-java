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
 * DescribeVpcsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcsRequestMarshaller implements Marshaller<Request<DescribeVpcsRequest>, DescribeVpcsRequest> {

    public Request<DescribeVpcsRequest> marshall(DescribeVpcsRequest describeVpcsRequest) {

        if (describeVpcsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcsRequest> request = new DefaultRequest<DescribeVpcsRequest>(describeVpcsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpcs");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeVpcsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpcsRequest
                .getFilters();
        if (!describeVpcsRequestFiltersList.isEmpty() || !describeVpcsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpcsRequestFiltersListValue : describeVpcsRequestFiltersList) {

                if (describeVpcsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeVpcsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeVpcsRequestVpcIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcsRequest
                .getVpcIds();
        if (!describeVpcsRequestVpcIdsList.isEmpty() || !describeVpcsRequestVpcIdsList.isAutoConstruct()) {
            int vpcIdsListIndex = 1;

            for (String describeVpcsRequestVpcIdsListValue : describeVpcsRequestVpcIdsList) {
                if (describeVpcsRequestVpcIdsListValue != null) {
                    request.addParameter("VpcId." + vpcIdsListIndex, StringUtils.fromString(describeVpcsRequestVpcIdsListValue));
                }
                vpcIdsListIndex++;
            }
        }

        if (describeVpcsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVpcsRequest.getNextToken()));
        }

        if (describeVpcsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVpcsRequest.getMaxResults()));
        }

        return request;
    }

}
