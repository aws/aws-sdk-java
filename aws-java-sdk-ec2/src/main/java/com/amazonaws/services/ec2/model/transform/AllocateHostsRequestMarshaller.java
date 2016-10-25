/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * AllocateHostsRequest Marshaller
 */

public class AllocateHostsRequestMarshaller implements Marshaller<Request<AllocateHostsRequest>, AllocateHostsRequest> {

    public Request<AllocateHostsRequest> marshall(AllocateHostsRequest allocateHostsRequest) {

        if (allocateHostsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AllocateHostsRequest> request = new DefaultRequest<AllocateHostsRequest>(allocateHostsRequest, "AmazonEC2");
        request.addParameter("Action", "AllocateHosts");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (allocateHostsRequest.getAutoPlacement() != null) {
            request.addParameter("AutoPlacement", StringUtils.fromString(allocateHostsRequest.getAutoPlacement()));
        }

        if (allocateHostsRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(allocateHostsRequest.getClientToken()));
        }

        if (allocateHostsRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(allocateHostsRequest.getInstanceType()));
        }

        if (allocateHostsRequest.getQuantity() != null) {
            request.addParameter("Quantity", StringUtils.fromInteger(allocateHostsRequest.getQuantity()));
        }

        if (allocateHostsRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(allocateHostsRequest.getAvailabilityZone()));
        }

        return request;
    }

}
