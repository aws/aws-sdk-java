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
 * DescribeVpcClassicLinkRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcClassicLinkRequestMarshaller implements Marshaller<Request<DescribeVpcClassicLinkRequest>, DescribeVpcClassicLinkRequest> {

    public Request<DescribeVpcClassicLinkRequest> marshall(DescribeVpcClassicLinkRequest describeVpcClassicLinkRequest) {

        if (describeVpcClassicLinkRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcClassicLinkRequest> request = new DefaultRequest<DescribeVpcClassicLinkRequest>(describeVpcClassicLinkRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpcClassicLink");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeVpcClassicLinkRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpcClassicLinkRequest
                .getFilters();
        if (!describeVpcClassicLinkRequestFiltersList.isEmpty() || !describeVpcClassicLinkRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpcClassicLinkRequestFiltersListValue : describeVpcClassicLinkRequestFiltersList) {

                if (describeVpcClassicLinkRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVpcClassicLinkRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcClassicLinkRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeVpcClassicLinkRequestVpcIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcClassicLinkRequest
                .getVpcIds();
        if (!describeVpcClassicLinkRequestVpcIdsList.isEmpty() || !describeVpcClassicLinkRequestVpcIdsList.isAutoConstruct()) {
            int vpcIdsListIndex = 1;

            for (String describeVpcClassicLinkRequestVpcIdsListValue : describeVpcClassicLinkRequestVpcIdsList) {
                if (describeVpcClassicLinkRequestVpcIdsListValue != null) {
                    request.addParameter("VpcId." + vpcIdsListIndex, StringUtils.fromString(describeVpcClassicLinkRequestVpcIdsListValue));
                }
                vpcIdsListIndex++;
            }
        }

        return request;
    }

}
