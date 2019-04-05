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
 * DetachVolumeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachVolumeRequestMarshaller implements Marshaller<Request<DetachVolumeRequest>, DetachVolumeRequest> {

    public Request<DetachVolumeRequest> marshall(DetachVolumeRequest detachVolumeRequest) {

        if (detachVolumeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DetachVolumeRequest> request = new DefaultRequest<DetachVolumeRequest>(detachVolumeRequest, "AmazonEC2");
        request.addParameter("Action", "DetachVolume");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (detachVolumeRequest.getDevice() != null) {
            request.addParameter("Device", StringUtils.fromString(detachVolumeRequest.getDevice()));
        }

        if (detachVolumeRequest.getForce() != null) {
            request.addParameter("Force", StringUtils.fromBoolean(detachVolumeRequest.getForce()));
        }

        if (detachVolumeRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(detachVolumeRequest.getInstanceId()));
        }

        if (detachVolumeRequest.getVolumeId() != null) {
            request.addParameter("VolumeId", StringUtils.fromString(detachVolumeRequest.getVolumeId()));
        }

        return request;
    }

}
