/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateLocalGatewayRouteRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocalGatewayRouteRequestMarshaller implements Marshaller<Request<CreateLocalGatewayRouteRequest>, CreateLocalGatewayRouteRequest> {

    public Request<CreateLocalGatewayRouteRequest> marshall(CreateLocalGatewayRouteRequest createLocalGatewayRouteRequest) {

        if (createLocalGatewayRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLocalGatewayRouteRequest> request = new DefaultRequest<CreateLocalGatewayRouteRequest>(createLocalGatewayRouteRequest, "AmazonEC2");
        request.addParameter("Action", "CreateLocalGatewayRoute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createLocalGatewayRouteRequest.getDestinationCidrBlock() != null) {
            request.addParameter("DestinationCidrBlock", StringUtils.fromString(createLocalGatewayRouteRequest.getDestinationCidrBlock()));
        }

        if (createLocalGatewayRouteRequest.getLocalGatewayRouteTableId() != null) {
            request.addParameter("LocalGatewayRouteTableId", StringUtils.fromString(createLocalGatewayRouteRequest.getLocalGatewayRouteTableId()));
        }

        if (createLocalGatewayRouteRequest.getLocalGatewayVirtualInterfaceGroupId() != null) {
            request.addParameter("LocalGatewayVirtualInterfaceGroupId",
                    StringUtils.fromString(createLocalGatewayRouteRequest.getLocalGatewayVirtualInterfaceGroupId()));
        }

        return request;
    }

}
