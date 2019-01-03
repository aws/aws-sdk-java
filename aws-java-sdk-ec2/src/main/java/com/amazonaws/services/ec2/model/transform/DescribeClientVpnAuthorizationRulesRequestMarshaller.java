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
 * DescribeClientVpnAuthorizationRulesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientVpnAuthorizationRulesRequestMarshaller implements
        Marshaller<Request<DescribeClientVpnAuthorizationRulesRequest>, DescribeClientVpnAuthorizationRulesRequest> {

    public Request<DescribeClientVpnAuthorizationRulesRequest> marshall(DescribeClientVpnAuthorizationRulesRequest describeClientVpnAuthorizationRulesRequest) {

        if (describeClientVpnAuthorizationRulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClientVpnAuthorizationRulesRequest> request = new DefaultRequest<DescribeClientVpnAuthorizationRulesRequest>(
                describeClientVpnAuthorizationRulesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeClientVpnAuthorizationRules");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeClientVpnAuthorizationRulesRequest.getClientVpnEndpointId() != null) {
            request.addParameter("ClientVpnEndpointId", StringUtils.fromString(describeClientVpnAuthorizationRulesRequest.getClientVpnEndpointId()));
        }

        if (describeClientVpnAuthorizationRulesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeClientVpnAuthorizationRulesRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeClientVpnAuthorizationRulesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeClientVpnAuthorizationRulesRequest
                .getFilters();
        if (!describeClientVpnAuthorizationRulesRequestFiltersList.isEmpty() || !describeClientVpnAuthorizationRulesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeClientVpnAuthorizationRulesRequestFiltersListValue : describeClientVpnAuthorizationRulesRequestFiltersList) {

                if (describeClientVpnAuthorizationRulesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeClientVpnAuthorizationRulesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeClientVpnAuthorizationRulesRequestFiltersListValue
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

        if (describeClientVpnAuthorizationRulesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeClientVpnAuthorizationRulesRequest.getMaxResults()));
        }

        return request;
    }

}
