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
 * DeleteRouteRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRouteRequestMarshaller implements Marshaller<Request<DeleteRouteRequest>, DeleteRouteRequest> {

    public Request<DeleteRouteRequest> marshall(DeleteRouteRequest deleteRouteRequest) {

        if (deleteRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteRouteRequest> request = new DefaultRequest<DeleteRouteRequest>(deleteRouteRequest, "AmazonEC2");
        request.addParameter("Action", "DeleteRoute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteRouteRequest.getDestinationCidrBlock() != null) {
            request.addParameter("DestinationCidrBlock", StringUtils.fromString(deleteRouteRequest.getDestinationCidrBlock()));
        }

        if (deleteRouteRequest.getDestinationIpv6CidrBlock() != null) {
            request.addParameter("DestinationIpv6CidrBlock", StringUtils.fromString(deleteRouteRequest.getDestinationIpv6CidrBlock()));
        }

        if (deleteRouteRequest.getRouteTableId() != null) {
            request.addParameter("RouteTableId", StringUtils.fromString(deleteRouteRequest.getRouteTableId()));
        }

        return request;
    }

}
