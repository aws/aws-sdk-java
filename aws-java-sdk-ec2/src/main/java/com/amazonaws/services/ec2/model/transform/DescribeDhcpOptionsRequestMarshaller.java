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
 * DescribeDhcpOptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDhcpOptionsRequestMarshaller implements Marshaller<Request<DescribeDhcpOptionsRequest>, DescribeDhcpOptionsRequest> {

    public Request<DescribeDhcpOptionsRequest> marshall(DescribeDhcpOptionsRequest describeDhcpOptionsRequest) {

        if (describeDhcpOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDhcpOptionsRequest> request = new DefaultRequest<DescribeDhcpOptionsRequest>(describeDhcpOptionsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeDhcpOptions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeDhcpOptionsRequestDhcpOptionsIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeDhcpOptionsRequest
                .getDhcpOptionsIds();
        if (!describeDhcpOptionsRequestDhcpOptionsIdsList.isEmpty() || !describeDhcpOptionsRequestDhcpOptionsIdsList.isAutoConstruct()) {
            int dhcpOptionsIdsListIndex = 1;

            for (String describeDhcpOptionsRequestDhcpOptionsIdsListValue : describeDhcpOptionsRequestDhcpOptionsIdsList) {
                if (describeDhcpOptionsRequestDhcpOptionsIdsListValue != null) {
                    request.addParameter("DhcpOptionsId." + dhcpOptionsIdsListIndex, StringUtils.fromString(describeDhcpOptionsRequestDhcpOptionsIdsListValue));
                }
                dhcpOptionsIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeDhcpOptionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeDhcpOptionsRequest
                .getFilters();
        if (!describeDhcpOptionsRequestFiltersList.isEmpty() || !describeDhcpOptionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeDhcpOptionsRequestFiltersListValue : describeDhcpOptionsRequestFiltersList) {

                if (describeDhcpOptionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeDhcpOptionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeDhcpOptionsRequestFiltersListValue
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
