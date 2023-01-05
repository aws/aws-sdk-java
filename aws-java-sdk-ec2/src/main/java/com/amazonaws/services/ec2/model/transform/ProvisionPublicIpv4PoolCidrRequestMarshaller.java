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
 * ProvisionPublicIpv4PoolCidrRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionPublicIpv4PoolCidrRequestMarshaller implements
        Marshaller<Request<ProvisionPublicIpv4PoolCidrRequest>, ProvisionPublicIpv4PoolCidrRequest> {

    public Request<ProvisionPublicIpv4PoolCidrRequest> marshall(ProvisionPublicIpv4PoolCidrRequest provisionPublicIpv4PoolCidrRequest) {

        if (provisionPublicIpv4PoolCidrRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ProvisionPublicIpv4PoolCidrRequest> request = new DefaultRequest<ProvisionPublicIpv4PoolCidrRequest>(provisionPublicIpv4PoolCidrRequest,
                "AmazonEC2");
        request.addParameter("Action", "ProvisionPublicIpv4PoolCidr");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (provisionPublicIpv4PoolCidrRequest.getIpamPoolId() != null) {
            request.addParameter("IpamPoolId", StringUtils.fromString(provisionPublicIpv4PoolCidrRequest.getIpamPoolId()));
        }

        if (provisionPublicIpv4PoolCidrRequest.getPoolId() != null) {
            request.addParameter("PoolId", StringUtils.fromString(provisionPublicIpv4PoolCidrRequest.getPoolId()));
        }

        if (provisionPublicIpv4PoolCidrRequest.getNetmaskLength() != null) {
            request.addParameter("NetmaskLength", StringUtils.fromInteger(provisionPublicIpv4PoolCidrRequest.getNetmaskLength()));
        }

        return request;
    }

}
