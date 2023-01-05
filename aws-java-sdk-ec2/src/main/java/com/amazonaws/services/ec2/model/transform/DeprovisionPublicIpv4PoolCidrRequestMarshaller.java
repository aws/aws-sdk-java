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
 * DeprovisionPublicIpv4PoolCidrRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprovisionPublicIpv4PoolCidrRequestMarshaller implements
        Marshaller<Request<DeprovisionPublicIpv4PoolCidrRequest>, DeprovisionPublicIpv4PoolCidrRequest> {

    public Request<DeprovisionPublicIpv4PoolCidrRequest> marshall(DeprovisionPublicIpv4PoolCidrRequest deprovisionPublicIpv4PoolCidrRequest) {

        if (deprovisionPublicIpv4PoolCidrRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeprovisionPublicIpv4PoolCidrRequest> request = new DefaultRequest<DeprovisionPublicIpv4PoolCidrRequest>(deprovisionPublicIpv4PoolCidrRequest,
                "AmazonEC2");
        request.addParameter("Action", "DeprovisionPublicIpv4PoolCidr");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deprovisionPublicIpv4PoolCidrRequest.getPoolId() != null) {
            request.addParameter("PoolId", StringUtils.fromString(deprovisionPublicIpv4PoolCidrRequest.getPoolId()));
        }

        if (deprovisionPublicIpv4PoolCidrRequest.getCidr() != null) {
            request.addParameter("Cidr", StringUtils.fromString(deprovisionPublicIpv4PoolCidrRequest.getCidr()));
        }

        return request;
    }

}
