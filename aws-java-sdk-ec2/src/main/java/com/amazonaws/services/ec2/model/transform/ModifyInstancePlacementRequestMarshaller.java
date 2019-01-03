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
 * ModifyInstancePlacementRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstancePlacementRequestMarshaller implements Marshaller<Request<ModifyInstancePlacementRequest>, ModifyInstancePlacementRequest> {

    public Request<ModifyInstancePlacementRequest> marshall(ModifyInstancePlacementRequest modifyInstancePlacementRequest) {

        if (modifyInstancePlacementRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstancePlacementRequest> request = new DefaultRequest<ModifyInstancePlacementRequest>(modifyInstancePlacementRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyInstancePlacement");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyInstancePlacementRequest.getAffinity() != null) {
            request.addParameter("Affinity", StringUtils.fromString(modifyInstancePlacementRequest.getAffinity()));
        }

        if (modifyInstancePlacementRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(modifyInstancePlacementRequest.getGroupName()));
        }

        if (modifyInstancePlacementRequest.getHostId() != null) {
            request.addParameter("HostId", StringUtils.fromString(modifyInstancePlacementRequest.getHostId()));
        }

        if (modifyInstancePlacementRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(modifyInstancePlacementRequest.getInstanceId()));
        }

        if (modifyInstancePlacementRequest.getTenancy() != null) {
            request.addParameter("Tenancy", StringUtils.fromString(modifyInstancePlacementRequest.getTenancy()));
        }

        if (modifyInstancePlacementRequest.getPartitionNumber() != null) {
            request.addParameter("PartitionNumber", StringUtils.fromInteger(modifyInstancePlacementRequest.getPartitionNumber()));
        }

        return request;
    }

}
