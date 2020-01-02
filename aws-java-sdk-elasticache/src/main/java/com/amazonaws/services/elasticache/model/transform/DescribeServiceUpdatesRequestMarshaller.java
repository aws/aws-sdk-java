/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeServiceUpdatesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceUpdatesRequestMarshaller implements Marshaller<Request<DescribeServiceUpdatesRequest>, DescribeServiceUpdatesRequest> {

    public Request<DescribeServiceUpdatesRequest> marshall(DescribeServiceUpdatesRequest describeServiceUpdatesRequest) {

        if (describeServiceUpdatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeServiceUpdatesRequest> request = new DefaultRequest<DescribeServiceUpdatesRequest>(describeServiceUpdatesRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeServiceUpdates");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeServiceUpdatesRequest.getServiceUpdateName() != null) {
            request.addParameter("ServiceUpdateName", StringUtils.fromString(describeServiceUpdatesRequest.getServiceUpdateName()));
        }

        if (!describeServiceUpdatesRequest.getServiceUpdateStatus().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeServiceUpdatesRequest.getServiceUpdateStatus()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> serviceUpdateStatusList = (com.amazonaws.internal.SdkInternalList<String>) describeServiceUpdatesRequest
                    .getServiceUpdateStatus();
            int serviceUpdateStatusListIndex = 1;

            for (String serviceUpdateStatusListValue : serviceUpdateStatusList) {
                if (serviceUpdateStatusListValue != null) {
                    request.addParameter("ServiceUpdateStatus.member." + serviceUpdateStatusListIndex, StringUtils.fromString(serviceUpdateStatusListValue));
                }
                serviceUpdateStatusListIndex++;
            }
        }

        if (describeServiceUpdatesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeServiceUpdatesRequest.getMaxRecords()));
        }

        if (describeServiceUpdatesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeServiceUpdatesRequest.getMarker()));
        }

        return request;
    }

}
