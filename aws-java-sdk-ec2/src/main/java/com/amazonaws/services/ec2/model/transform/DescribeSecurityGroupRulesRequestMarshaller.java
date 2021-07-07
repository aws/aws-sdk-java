/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeSecurityGroupRulesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecurityGroupRulesRequestMarshaller implements Marshaller<Request<DescribeSecurityGroupRulesRequest>, DescribeSecurityGroupRulesRequest> {

    public Request<DescribeSecurityGroupRulesRequest> marshall(DescribeSecurityGroupRulesRequest describeSecurityGroupRulesRequest) {

        if (describeSecurityGroupRulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSecurityGroupRulesRequest> request = new DefaultRequest<DescribeSecurityGroupRulesRequest>(describeSecurityGroupRulesRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeSecurityGroupRules");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeSecurityGroupRulesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeSecurityGroupRulesRequest
                .getFilters();
        if (!describeSecurityGroupRulesRequestFiltersList.isEmpty() || !describeSecurityGroupRulesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeSecurityGroupRulesRequestFiltersListValue : describeSecurityGroupRulesRequestFiltersList) {

                if (describeSecurityGroupRulesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeSecurityGroupRulesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeSecurityGroupRulesRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeSecurityGroupRulesRequestSecurityGroupRuleIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSecurityGroupRulesRequest
                .getSecurityGroupRuleIds();
        if (!describeSecurityGroupRulesRequestSecurityGroupRuleIdsList.isEmpty()
                || !describeSecurityGroupRulesRequestSecurityGroupRuleIdsList.isAutoConstruct()) {
            int securityGroupRuleIdsListIndex = 1;

            for (String describeSecurityGroupRulesRequestSecurityGroupRuleIdsListValue : describeSecurityGroupRulesRequestSecurityGroupRuleIdsList) {
                if (describeSecurityGroupRulesRequestSecurityGroupRuleIdsListValue != null) {
                    request.addParameter("SecurityGroupRuleId." + securityGroupRuleIdsListIndex,
                            StringUtils.fromString(describeSecurityGroupRulesRequestSecurityGroupRuleIdsListValue));
                }
                securityGroupRuleIdsListIndex++;
            }
        }

        if (describeSecurityGroupRulesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeSecurityGroupRulesRequest.getNextToken()));
        }

        if (describeSecurityGroupRulesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeSecurityGroupRulesRequest.getMaxResults()));
        }

        return request;
    }

}
