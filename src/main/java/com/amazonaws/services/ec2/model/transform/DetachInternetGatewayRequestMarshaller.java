/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Detach Internet Gateway Request Marshaller
 */
public class DetachInternetGatewayRequestMarshaller implements Marshaller<Request<DetachInternetGatewayRequest>, DetachInternetGatewayRequest> {

    public Request<DetachInternetGatewayRequest> marshall(DetachInternetGatewayRequest detachInternetGatewayRequest) {

        if (detachInternetGatewayRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DetachInternetGatewayRequest> request = new DefaultRequest<DetachInternetGatewayRequest>(detachInternetGatewayRequest, "AmazonEC2");
        request.addParameter("Action", "DetachInternetGateway");
        request.addParameter("Version", "2013-10-15");

        if (detachInternetGatewayRequest.getInternetGatewayId() != null) {
            request.addParameter("InternetGatewayId", StringUtils.fromString(detachInternetGatewayRequest.getInternetGatewayId()));
        }
        if (detachInternetGatewayRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(detachInternetGatewayRequest.getVpcId()));
        }


        return request;
    }
}
