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
 * DescribeDataSharesForProducerRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataSharesForProducerRequestMarshaller implements
        Marshaller<Request<DescribeDataSharesForProducerRequest>, DescribeDataSharesForProducerRequest> {

    public Request<DescribeDataSharesForProducerRequest> marshall(DescribeDataSharesForProducerRequest describeDataSharesForProducerRequest) {

        if (describeDataSharesForProducerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDataSharesForProducerRequest> request = new DefaultRequest<DescribeDataSharesForProducerRequest>(describeDataSharesForProducerRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeDataSharesForProducer");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDataSharesForProducerRequest.getProducerArn() != null) {
            request.addParameter("ProducerArn", StringUtils.fromString(describeDataSharesForProducerRequest.getProducerArn()));
        }

        if (describeDataSharesForProducerRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(describeDataSharesForProducerRequest.getStatus()));
        }

        if (describeDataSharesForProducerRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDataSharesForProducerRequest.getMaxRecords()));
        }

        if (describeDataSharesForProducerRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDataSharesForProducerRequest.getMarker()));
        }

        return request;
    }

}
