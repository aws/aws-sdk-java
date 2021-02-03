/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeAddressesAttributeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddressesAttributeRequestMarshaller implements Marshaller<Request<DescribeAddressesAttributeRequest>, DescribeAddressesAttributeRequest> {

    public Request<DescribeAddressesAttributeRequest> marshall(DescribeAddressesAttributeRequest describeAddressesAttributeRequest) {

        if (describeAddressesAttributeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAddressesAttributeRequest> request = new DefaultRequest<DescribeAddressesAttributeRequest>(describeAddressesAttributeRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeAddressesAttribute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeAddressesAttributeRequestAllocationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeAddressesAttributeRequest
                .getAllocationIds();
        if (!describeAddressesAttributeRequestAllocationIdsList.isEmpty() || !describeAddressesAttributeRequestAllocationIdsList.isAutoConstruct()) {
            int allocationIdsListIndex = 1;

            for (String describeAddressesAttributeRequestAllocationIdsListValue : describeAddressesAttributeRequestAllocationIdsList) {
                if (describeAddressesAttributeRequestAllocationIdsListValue != null) {
                    request.addParameter("AllocationId." + allocationIdsListIndex,
                            StringUtils.fromString(describeAddressesAttributeRequestAllocationIdsListValue));
                }
                allocationIdsListIndex++;
            }
        }

        if (describeAddressesAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(describeAddressesAttributeRequest.getAttribute()));
        }

        if (describeAddressesAttributeRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeAddressesAttributeRequest.getNextToken()));
        }

        if (describeAddressesAttributeRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeAddressesAttributeRequest.getMaxResults()));
        }

        return request;
    }

}
