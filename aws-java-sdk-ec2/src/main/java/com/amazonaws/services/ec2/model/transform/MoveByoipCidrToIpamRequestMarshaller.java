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
 * MoveByoipCidrToIpamRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MoveByoipCidrToIpamRequestMarshaller implements Marshaller<Request<MoveByoipCidrToIpamRequest>, MoveByoipCidrToIpamRequest> {

    public Request<MoveByoipCidrToIpamRequest> marshall(MoveByoipCidrToIpamRequest moveByoipCidrToIpamRequest) {

        if (moveByoipCidrToIpamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<MoveByoipCidrToIpamRequest> request = new DefaultRequest<MoveByoipCidrToIpamRequest>(moveByoipCidrToIpamRequest, "AmazonEC2");
        request.addParameter("Action", "MoveByoipCidrToIpam");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (moveByoipCidrToIpamRequest.getCidr() != null) {
            request.addParameter("Cidr", StringUtils.fromString(moveByoipCidrToIpamRequest.getCidr()));
        }

        if (moveByoipCidrToIpamRequest.getIpamPoolId() != null) {
            request.addParameter("IpamPoolId", StringUtils.fromString(moveByoipCidrToIpamRequest.getIpamPoolId()));
        }

        if (moveByoipCidrToIpamRequest.getIpamPoolOwner() != null) {
            request.addParameter("IpamPoolOwner", StringUtils.fromString(moveByoipCidrToIpamRequest.getIpamPoolOwner()));
        }

        return request;
    }

}
