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
 * CreateClientVpnRouteRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClientVpnRouteRequestMarshaller implements Marshaller<Request<CreateClientVpnRouteRequest>, CreateClientVpnRouteRequest> {

    public Request<CreateClientVpnRouteRequest> marshall(CreateClientVpnRouteRequest createClientVpnRouteRequest) {

        if (createClientVpnRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateClientVpnRouteRequest> request = new DefaultRequest<CreateClientVpnRouteRequest>(createClientVpnRouteRequest, "AmazonEC2");
        request.addParameter("Action", "CreateClientVpnRoute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createClientVpnRouteRequest.getClientVpnEndpointId() != null) {
            request.addParameter("ClientVpnEndpointId", StringUtils.fromString(createClientVpnRouteRequest.getClientVpnEndpointId()));
        }

        if (createClientVpnRouteRequest.getDestinationCidrBlock() != null) {
            request.addParameter("DestinationCidrBlock", StringUtils.fromString(createClientVpnRouteRequest.getDestinationCidrBlock()));
        }

        if (createClientVpnRouteRequest.getTargetVpcSubnetId() != null) {
            request.addParameter("TargetVpcSubnetId", StringUtils.fromString(createClientVpnRouteRequest.getTargetVpcSubnetId()));
        }

        if (createClientVpnRouteRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createClientVpnRouteRequest.getDescription()));
        }

        return request;
    }

}
