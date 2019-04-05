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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeEventSubscriptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventSubscriptionsRequestMarshaller implements Marshaller<Request<DescribeEventSubscriptionsRequest>, DescribeEventSubscriptionsRequest> {

    public Request<DescribeEventSubscriptionsRequest> marshall(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest) {

        if (describeEventSubscriptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEventSubscriptionsRequest> request = new DefaultRequest<DescribeEventSubscriptionsRequest>(describeEventSubscriptionsRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeEventSubscriptions");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeEventSubscriptionsRequest.getSubscriptionName() != null) {
            request.addParameter("SubscriptionName", StringUtils.fromString(describeEventSubscriptionsRequest.getSubscriptionName()));
        }

        if (describeEventSubscriptionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeEventSubscriptionsRequest.getMaxRecords()));
        }

        if (describeEventSubscriptionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeEventSubscriptionsRequest.getMarker()));
        }

        if (!describeEventSubscriptionsRequest.getTagKeys().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeEventSubscriptionsRequest.getTagKeys()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) describeEventSubscriptionsRequest
                    .getTagKeys();
            int tagKeysListIndex = 1;

            for (String tagKeysListValue : tagKeysList) {
                if (tagKeysListValue != null) {
                    request.addParameter("TagKeys.TagKey." + tagKeysListIndex, StringUtils.fromString(tagKeysListValue));
                }
                tagKeysListIndex++;
            }
        }

        if (!describeEventSubscriptionsRequest.getTagValues().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeEventSubscriptionsRequest.getTagValues()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeEventSubscriptionsRequest
                    .getTagValues();
            int tagValuesListIndex = 1;

            for (String tagValuesListValue : tagValuesList) {
                if (tagValuesListValue != null) {
                    request.addParameter("TagValues.TagValue." + tagValuesListIndex, StringUtils.fromString(tagValuesListValue));
                }
                tagValuesListIndex++;
            }
        }

        return request;
    }

}
