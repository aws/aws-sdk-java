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
 * CreateRouteRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteRequestMarshaller implements Marshaller<Request<CreateRouteRequest>, CreateRouteRequest> {

    public Request<CreateRouteRequest> marshall(CreateRouteRequest createRouteRequest) {

        if (createRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRouteRequest> request = new DefaultRequest<CreateRouteRequest>(createRouteRequest, "AmazonEC2");
        request.addParameter("Action", "CreateRoute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createRouteRequest.getDestinationCidrBlock() != null) {
            request.addParameter("DestinationCidrBlock", StringUtils.fromString(createRouteRequest.getDestinationCidrBlock()));
        }

        if (createRouteRequest.getDestinationIpv6CidrBlock() != null) {
            request.addParameter("DestinationIpv6CidrBlock", StringUtils.fromString(createRouteRequest.getDestinationIpv6CidrBlock()));
        }

        if (createRouteRequest.getEgressOnlyInternetGatewayId() != null) {
            request.addParameter("EgressOnlyInternetGatewayId", StringUtils.fromString(createRouteRequest.getEgressOnlyInternetGatewayId()));
        }

        if (createRouteRequest.getGatewayId() != null) {
            request.addParameter("GatewayId", StringUtils.fromString(createRouteRequest.getGatewayId()));
        }

        if (createRouteRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createRouteRequest.getInstanceId()));
        }

        if (createRouteRequest.getNatGatewayId() != null) {
            request.addParameter("NatGatewayId", StringUtils.fromString(createRouteRequest.getNatGatewayId()));
        }

        if (createRouteRequest.getTransitGatewayId() != null) {
            request.addParameter("TransitGatewayId", StringUtils.fromString(createRouteRequest.getTransitGatewayId()));
        }

        if (createRouteRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(createRouteRequest.getNetworkInterfaceId()));
        }

        if (createRouteRequest.getRouteTableId() != null) {
            request.addParameter("RouteTableId", StringUtils.fromString(createRouteRequest.getRouteTableId()));
        }

        if (createRouteRequest.getVpcPeeringConnectionId() != null) {
            request.addParameter("VpcPeeringConnectionId", StringUtils.fromString(createRouteRequest.getVpcPeeringConnectionId()));
        }

        return request;
    }

}
