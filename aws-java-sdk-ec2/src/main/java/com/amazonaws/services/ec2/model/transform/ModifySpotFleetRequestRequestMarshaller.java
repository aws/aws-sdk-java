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
 * ModifySpotFleetRequestRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySpotFleetRequestRequestMarshaller implements Marshaller<Request<ModifySpotFleetRequestRequest>, ModifySpotFleetRequestRequest> {

    public Request<ModifySpotFleetRequestRequest> marshall(ModifySpotFleetRequestRequest modifySpotFleetRequestRequest) {

        if (modifySpotFleetRequestRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySpotFleetRequestRequest> request = new DefaultRequest<ModifySpotFleetRequestRequest>(modifySpotFleetRequestRequest, "AmazonEC2");
        request.addParameter("Action", "ModifySpotFleetRequest");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifySpotFleetRequestRequest.getExcessCapacityTerminationPolicy() != null) {
            request.addParameter("ExcessCapacityTerminationPolicy", StringUtils.fromString(modifySpotFleetRequestRequest.getExcessCapacityTerminationPolicy()));
        }

        if (modifySpotFleetRequestRequest.getSpotFleetRequestId() != null) {
            request.addParameter("SpotFleetRequestId", StringUtils.fromString(modifySpotFleetRequestRequest.getSpotFleetRequestId()));
        }

        if (modifySpotFleetRequestRequest.getTargetCapacity() != null) {
            request.addParameter("TargetCapacity", StringUtils.fromInteger(modifySpotFleetRequestRequest.getTargetCapacity()));
        }

        return request;
    }

}
