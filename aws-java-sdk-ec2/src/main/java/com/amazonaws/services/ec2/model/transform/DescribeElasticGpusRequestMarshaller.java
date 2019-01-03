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
 * DescribeElasticGpusRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticGpusRequestMarshaller implements Marshaller<Request<DescribeElasticGpusRequest>, DescribeElasticGpusRequest> {

    public Request<DescribeElasticGpusRequest> marshall(DescribeElasticGpusRequest describeElasticGpusRequest) {

        if (describeElasticGpusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeElasticGpusRequest> request = new DefaultRequest<DescribeElasticGpusRequest>(describeElasticGpusRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeElasticGpus");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeElasticGpusRequestElasticGpuIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeElasticGpusRequest
                .getElasticGpuIds();
        if (!describeElasticGpusRequestElasticGpuIdsList.isEmpty() || !describeElasticGpusRequestElasticGpuIdsList.isAutoConstruct()) {
            int elasticGpuIdsListIndex = 1;

            for (String describeElasticGpusRequestElasticGpuIdsListValue : describeElasticGpusRequestElasticGpuIdsList) {
                if (describeElasticGpusRequestElasticGpuIdsListValue != null) {
                    request.addParameter("ElasticGpuId." + elasticGpuIdsListIndex, StringUtils.fromString(describeElasticGpusRequestElasticGpuIdsListValue));
                }
                elasticGpuIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeElasticGpusRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeElasticGpusRequest
                .getFilters();
        if (!describeElasticGpusRequestFiltersList.isEmpty() || !describeElasticGpusRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeElasticGpusRequestFiltersListValue : describeElasticGpusRequestFiltersList) {

                if (describeElasticGpusRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeElasticGpusRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeElasticGpusRequestFiltersListValue
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

        if (describeElasticGpusRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeElasticGpusRequest.getMaxResults()));
        }

        if (describeElasticGpusRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeElasticGpusRequest.getNextToken()));
        }

        return request;
    }

}
