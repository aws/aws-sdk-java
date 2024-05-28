/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetSecurityGroupsForVpcRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecurityGroupsForVpcRequestMarshaller implements Marshaller<Request<GetSecurityGroupsForVpcRequest>, GetSecurityGroupsForVpcRequest> {

    public Request<GetSecurityGroupsForVpcRequest> marshall(GetSecurityGroupsForVpcRequest getSecurityGroupsForVpcRequest) {

        if (getSecurityGroupsForVpcRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetSecurityGroupsForVpcRequest> request = new DefaultRequest<GetSecurityGroupsForVpcRequest>(getSecurityGroupsForVpcRequest, "AmazonEC2");
        request.addParameter("Action", "GetSecurityGroupsForVpc");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getSecurityGroupsForVpcRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(getSecurityGroupsForVpcRequest.getVpcId()));
        }

        if (getSecurityGroupsForVpcRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getSecurityGroupsForVpcRequest.getNextToken()));
        }

        if (getSecurityGroupsForVpcRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getSecurityGroupsForVpcRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> getSecurityGroupsForVpcRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) getSecurityGroupsForVpcRequest
                .getFilters();
        if (!getSecurityGroupsForVpcRequestFiltersList.isEmpty() || !getSecurityGroupsForVpcRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter getSecurityGroupsForVpcRequestFiltersListValue : getSecurityGroupsForVpcRequestFiltersList) {

                if (getSecurityGroupsForVpcRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(getSecurityGroupsForVpcRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) getSecurityGroupsForVpcRequestFiltersListValue
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
