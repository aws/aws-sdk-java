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
 * ModifyLocalGatewayRouteRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyLocalGatewayRouteRequestMarshaller implements Marshaller<Request<ModifyLocalGatewayRouteRequest>, ModifyLocalGatewayRouteRequest> {

    public Request<ModifyLocalGatewayRouteRequest> marshall(ModifyLocalGatewayRouteRequest modifyLocalGatewayRouteRequest) {

        if (modifyLocalGatewayRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyLocalGatewayRouteRequest> request = new DefaultRequest<ModifyLocalGatewayRouteRequest>(modifyLocalGatewayRouteRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyLocalGatewayRoute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyLocalGatewayRouteRequest.getDestinationCidrBlock() != null) {
            request.addParameter("DestinationCidrBlock", StringUtils.fromString(modifyLocalGatewayRouteRequest.getDestinationCidrBlock()));
        }

        if (modifyLocalGatewayRouteRequest.getLocalGatewayRouteTableId() != null) {
            request.addParameter("LocalGatewayRouteTableId", StringUtils.fromString(modifyLocalGatewayRouteRequest.getLocalGatewayRouteTableId()));
        }

        if (modifyLocalGatewayRouteRequest.getLocalGatewayVirtualInterfaceGroupId() != null) {
            request.addParameter("LocalGatewayVirtualInterfaceGroupId",
                    StringUtils.fromString(modifyLocalGatewayRouteRequest.getLocalGatewayVirtualInterfaceGroupId()));
        }

        if (modifyLocalGatewayRouteRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(modifyLocalGatewayRouteRequest.getNetworkInterfaceId()));
        }

        return request;
    }

}
