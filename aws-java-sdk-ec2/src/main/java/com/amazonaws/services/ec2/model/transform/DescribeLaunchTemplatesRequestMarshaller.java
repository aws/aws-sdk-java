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
 * DescribeLaunchTemplatesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLaunchTemplatesRequestMarshaller implements Marshaller<Request<DescribeLaunchTemplatesRequest>, DescribeLaunchTemplatesRequest> {

    public Request<DescribeLaunchTemplatesRequest> marshall(DescribeLaunchTemplatesRequest describeLaunchTemplatesRequest) {

        if (describeLaunchTemplatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLaunchTemplatesRequest> request = new DefaultRequest<DescribeLaunchTemplatesRequest>(describeLaunchTemplatesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeLaunchTemplates");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeLaunchTemplatesRequestLaunchTemplateIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeLaunchTemplatesRequest
                .getLaunchTemplateIds();
        if (!describeLaunchTemplatesRequestLaunchTemplateIdsList.isEmpty() || !describeLaunchTemplatesRequestLaunchTemplateIdsList.isAutoConstruct()) {
            int launchTemplateIdsListIndex = 1;

            for (String describeLaunchTemplatesRequestLaunchTemplateIdsListValue : describeLaunchTemplatesRequestLaunchTemplateIdsList) {
                if (describeLaunchTemplatesRequestLaunchTemplateIdsListValue != null) {
                    request.addParameter("LaunchTemplateId." + launchTemplateIdsListIndex,
                            StringUtils.fromString(describeLaunchTemplatesRequestLaunchTemplateIdsListValue));
                }
                launchTemplateIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeLaunchTemplatesRequestLaunchTemplateNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeLaunchTemplatesRequest
                .getLaunchTemplateNames();
        if (!describeLaunchTemplatesRequestLaunchTemplateNamesList.isEmpty() || !describeLaunchTemplatesRequestLaunchTemplateNamesList.isAutoConstruct()) {
            int launchTemplateNamesListIndex = 1;

            for (String describeLaunchTemplatesRequestLaunchTemplateNamesListValue : describeLaunchTemplatesRequestLaunchTemplateNamesList) {
                if (describeLaunchTemplatesRequestLaunchTemplateNamesListValue != null) {
                    request.addParameter("LaunchTemplateName." + launchTemplateNamesListIndex,
                            StringUtils.fromString(describeLaunchTemplatesRequestLaunchTemplateNamesListValue));
                }
                launchTemplateNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeLaunchTemplatesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeLaunchTemplatesRequest
                .getFilters();
        if (!describeLaunchTemplatesRequestFiltersList.isEmpty() || !describeLaunchTemplatesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeLaunchTemplatesRequestFiltersListValue : describeLaunchTemplatesRequestFiltersList) {

                if (describeLaunchTemplatesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeLaunchTemplatesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeLaunchTemplatesRequestFiltersListValue
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

        if (describeLaunchTemplatesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLaunchTemplatesRequest.getNextToken()));
        }

        if (describeLaunchTemplatesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeLaunchTemplatesRequest.getMaxResults()));
        }

        return request;
    }

}
