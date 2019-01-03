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
 * CreatePlacementGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlacementGroupRequestMarshaller implements Marshaller<Request<CreatePlacementGroupRequest>, CreatePlacementGroupRequest> {

    public Request<CreatePlacementGroupRequest> marshall(CreatePlacementGroupRequest createPlacementGroupRequest) {

        if (createPlacementGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePlacementGroupRequest> request = new DefaultRequest<CreatePlacementGroupRequest>(createPlacementGroupRequest, "AmazonEC2");
        request.addParameter("Action", "CreatePlacementGroup");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createPlacementGroupRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(createPlacementGroupRequest.getGroupName()));
        }

        if (createPlacementGroupRequest.getStrategy() != null) {
            request.addParameter("Strategy", StringUtils.fromString(createPlacementGroupRequest.getStrategy()));
        }

        if (createPlacementGroupRequest.getPartitionCount() != null) {
            request.addParameter("PartitionCount", StringUtils.fromInteger(createPlacementGroupRequest.getPartitionCount()));
        }

        return request;
    }

}
