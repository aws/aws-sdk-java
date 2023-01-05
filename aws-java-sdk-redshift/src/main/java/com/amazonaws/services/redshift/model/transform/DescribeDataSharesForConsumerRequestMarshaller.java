/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeDataSharesForConsumerRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataSharesForConsumerRequestMarshaller implements
        Marshaller<Request<DescribeDataSharesForConsumerRequest>, DescribeDataSharesForConsumerRequest> {

    public Request<DescribeDataSharesForConsumerRequest> marshall(DescribeDataSharesForConsumerRequest describeDataSharesForConsumerRequest) {

        if (describeDataSharesForConsumerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDataSharesForConsumerRequest> request = new DefaultRequest<DescribeDataSharesForConsumerRequest>(describeDataSharesForConsumerRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeDataSharesForConsumer");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDataSharesForConsumerRequest.getConsumerArn() != null) {
            request.addParameter("ConsumerArn", StringUtils.fromString(describeDataSharesForConsumerRequest.getConsumerArn()));
        }

        if (describeDataSharesForConsumerRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(describeDataSharesForConsumerRequest.getStatus()));
        }

        if (describeDataSharesForConsumerRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDataSharesForConsumerRequest.getMaxRecords()));
        }

        if (describeDataSharesForConsumerRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDataSharesForConsumerRequest.getMarker()));
        }

        return request;
    }

}
