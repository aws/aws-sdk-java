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
 * DescribeLaunchTemplateVersionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLaunchTemplateVersionsRequestMarshaller implements
        Marshaller<Request<DescribeLaunchTemplateVersionsRequest>, DescribeLaunchTemplateVersionsRequest> {

    public Request<DescribeLaunchTemplateVersionsRequest> marshall(DescribeLaunchTemplateVersionsRequest describeLaunchTemplateVersionsRequest) {

        if (describeLaunchTemplateVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLaunchTemplateVersionsRequest> request = new DefaultRequest<DescribeLaunchTemplateVersionsRequest>(
                describeLaunchTemplateVersionsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeLaunchTemplateVersions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeLaunchTemplateVersionsRequest.getLaunchTemplateId() != null) {
            request.addParameter("LaunchTemplateId", StringUtils.fromString(describeLaunchTemplateVersionsRequest.getLaunchTemplateId()));
        }

        if (describeLaunchTemplateVersionsRequest.getLaunchTemplateName() != null) {
            request.addParameter("LaunchTemplateName", StringUtils.fromString(describeLaunchTemplateVersionsRequest.getLaunchTemplateName()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeLaunchTemplateVersionsRequestVersionsList = (com.amazonaws.internal.SdkInternalList<String>) describeLaunchTemplateVersionsRequest
                .getVersions();
        if (!describeLaunchTemplateVersionsRequestVersionsList.isEmpty() || !describeLaunchTemplateVersionsRequestVersionsList.isAutoConstruct()) {
            int versionsListIndex = 1;

            for (String describeLaunchTemplateVersionsRequestVersionsListValue : describeLaunchTemplateVersionsRequestVersionsList) {
                if (describeLaunchTemplateVersionsRequestVersionsListValue != null) {
                    request.addParameter("LaunchTemplateVersion." + versionsListIndex,
                            StringUtils.fromString(describeLaunchTemplateVersionsRequestVersionsListValue));
                }
                versionsListIndex++;
            }
        }

        if (describeLaunchTemplateVersionsRequest.getMinVersion() != null) {
            request.addParameter("MinVersion", StringUtils.fromString(describeLaunchTemplateVersionsRequest.getMinVersion()));
        }

        if (describeLaunchTemplateVersionsRequest.getMaxVersion() != null) {
            request.addParameter("MaxVersion", StringUtils.fromString(describeLaunchTemplateVersionsRequest.getMaxVersion()));
        }

        if (describeLaunchTemplateVersionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLaunchTemplateVersionsRequest.getNextToken()));
        }

        if (describeLaunchTemplateVersionsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeLaunchTemplateVersionsRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeLaunchTemplateVersionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeLaunchTemplateVersionsRequest
                .getFilters();
        if (!describeLaunchTemplateVersionsRequestFiltersList.isEmpty() || !describeLaunchTemplateVersionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeLaunchTemplateVersionsRequestFiltersListValue : describeLaunchTemplateVersionsRequestFiltersList) {

                if (describeLaunchTemplateVersionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeLaunchTemplateVersionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeLaunchTemplateVersionsRequestFiltersListValue
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
