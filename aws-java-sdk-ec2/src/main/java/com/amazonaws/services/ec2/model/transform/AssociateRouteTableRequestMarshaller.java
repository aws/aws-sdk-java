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
 * AssociateRouteTableRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateRouteTableRequestMarshaller implements Marshaller<Request<AssociateRouteTableRequest>, AssociateRouteTableRequest> {

    public Request<AssociateRouteTableRequest> marshall(AssociateRouteTableRequest associateRouteTableRequest) {

        if (associateRouteTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateRouteTableRequest> request = new DefaultRequest<AssociateRouteTableRequest>(associateRouteTableRequest, "AmazonEC2");
        request.addParameter("Action", "AssociateRouteTable");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateRouteTableRequest.getRouteTableId() != null) {
            request.addParameter("RouteTableId", StringUtils.fromString(associateRouteTableRequest.getRouteTableId()));
        }

        if (associateRouteTableRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(associateRouteTableRequest.getSubnetId()));
        }

        return request;
    }

}
