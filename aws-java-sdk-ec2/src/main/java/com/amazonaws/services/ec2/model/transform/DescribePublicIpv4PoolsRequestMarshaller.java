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
 * DescribePublicIpv4PoolsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePublicIpv4PoolsRequestMarshaller implements Marshaller<Request<DescribePublicIpv4PoolsRequest>, DescribePublicIpv4PoolsRequest> {

    public Request<DescribePublicIpv4PoolsRequest> marshall(DescribePublicIpv4PoolsRequest describePublicIpv4PoolsRequest) {

        if (describePublicIpv4PoolsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePublicIpv4PoolsRequest> request = new DefaultRequest<DescribePublicIpv4PoolsRequest>(describePublicIpv4PoolsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribePublicIpv4Pools");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describePublicIpv4PoolsRequestPoolIdsList = (com.amazonaws.internal.SdkInternalList<String>) describePublicIpv4PoolsRequest
                .getPoolIds();
        if (!describePublicIpv4PoolsRequestPoolIdsList.isEmpty() || !describePublicIpv4PoolsRequestPoolIdsList.isAutoConstruct()) {
            int poolIdsListIndex = 1;

            for (String describePublicIpv4PoolsRequestPoolIdsListValue : describePublicIpv4PoolsRequestPoolIdsList) {
                if (describePublicIpv4PoolsRequestPoolIdsListValue != null) {
                    request.addParameter("PoolId." + poolIdsListIndex, StringUtils.fromString(describePublicIpv4PoolsRequestPoolIdsListValue));
                }
                poolIdsListIndex++;
            }
        }

        if (describePublicIpv4PoolsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describePublicIpv4PoolsRequest.getNextToken()));
        }

        if (describePublicIpv4PoolsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describePublicIpv4PoolsRequest.getMaxResults()));
        }

        return request;
    }

}
