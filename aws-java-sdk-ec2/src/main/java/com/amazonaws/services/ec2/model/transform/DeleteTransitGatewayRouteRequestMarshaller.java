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
 * DeleteTransitGatewayRouteRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTransitGatewayRouteRequestMarshaller implements Marshaller<Request<DeleteTransitGatewayRouteRequest>, DeleteTransitGatewayRouteRequest> {

    public Request<DeleteTransitGatewayRouteRequest> marshall(DeleteTransitGatewayRouteRequest deleteTransitGatewayRouteRequest) {

        if (deleteTransitGatewayRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteTransitGatewayRouteRequest> request = new DefaultRequest<DeleteTransitGatewayRouteRequest>(deleteTransitGatewayRouteRequest, "AmazonEC2");
        request.addParameter("Action", "DeleteTransitGatewayRoute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteTransitGatewayRouteRequest.getTransitGatewayRouteTableId() != null) {
            request.addParameter("TransitGatewayRouteTableId", StringUtils.fromString(deleteTransitGatewayRouteRequest.getTransitGatewayRouteTableId()));
        }

        if (deleteTransitGatewayRouteRequest.getDestinationCidrBlock() != null) {
            request.addParameter("DestinationCidrBlock", StringUtils.fromString(deleteTransitGatewayRouteRequest.getDestinationCidrBlock()));
        }

        return request;
    }

}
