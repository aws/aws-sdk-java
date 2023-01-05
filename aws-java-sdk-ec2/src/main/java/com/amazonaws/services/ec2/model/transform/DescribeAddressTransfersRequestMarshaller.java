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
 * DescribeAddressTransfersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddressTransfersRequestMarshaller implements Marshaller<Request<DescribeAddressTransfersRequest>, DescribeAddressTransfersRequest> {

    public Request<DescribeAddressTransfersRequest> marshall(DescribeAddressTransfersRequest describeAddressTransfersRequest) {

        if (describeAddressTransfersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAddressTransfersRequest> request = new DefaultRequest<DescribeAddressTransfersRequest>(describeAddressTransfersRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeAddressTransfers");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeAddressTransfersRequestAllocationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeAddressTransfersRequest
                .getAllocationIds();
        if (!describeAddressTransfersRequestAllocationIdsList.isEmpty() || !describeAddressTransfersRequestAllocationIdsList.isAutoConstruct()) {
            int allocationIdsListIndex = 1;

            for (String describeAddressTransfersRequestAllocationIdsListValue : describeAddressTransfersRequestAllocationIdsList) {
                if (describeAddressTransfersRequestAllocationIdsListValue != null) {
                    request.addParameter("AllocationId." + allocationIdsListIndex,
                            StringUtils.fromString(describeAddressTransfersRequestAllocationIdsListValue));
                }
                allocationIdsListIndex++;
            }
        }

        if (describeAddressTransfersRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeAddressTransfersRequest.getNextToken()));
        }

        if (describeAddressTransfersRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeAddressTransfersRequest.getMaxResults()));
        }

        return request;
    }

}
