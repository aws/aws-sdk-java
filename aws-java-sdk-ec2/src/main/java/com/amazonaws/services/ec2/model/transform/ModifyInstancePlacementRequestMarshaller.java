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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ModifyInstancePlacementRequest Marshaller
 */

public class ModifyInstancePlacementRequestMarshaller implements Marshaller<Request<ModifyInstancePlacementRequest>, ModifyInstancePlacementRequest> {

    public Request<ModifyInstancePlacementRequest> marshall(ModifyInstancePlacementRequest modifyInstancePlacementRequest) {

        if (modifyInstancePlacementRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstancePlacementRequest> request = new DefaultRequest<ModifyInstancePlacementRequest>(modifyInstancePlacementRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyInstancePlacement");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyInstancePlacementRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(modifyInstancePlacementRequest.getInstanceId()));
        }

        if (modifyInstancePlacementRequest.getTenancy() != null) {
            request.addParameter("Tenancy", StringUtils.fromString(modifyInstancePlacementRequest.getTenancy()));
        }

        if (modifyInstancePlacementRequest.getAffinity() != null) {
            request.addParameter("Affinity", StringUtils.fromString(modifyInstancePlacementRequest.getAffinity()));
        }

        if (modifyInstancePlacementRequest.getHostId() != null) {
            request.addParameter("HostId", StringUtils.fromString(modifyInstancePlacementRequest.getHostId()));
        }

        return request;
    }

}
