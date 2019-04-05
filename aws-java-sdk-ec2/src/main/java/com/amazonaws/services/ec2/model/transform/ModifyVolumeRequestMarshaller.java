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
 * ModifyVolumeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVolumeRequestMarshaller implements Marshaller<Request<ModifyVolumeRequest>, ModifyVolumeRequest> {

    public Request<ModifyVolumeRequest> marshall(ModifyVolumeRequest modifyVolumeRequest) {

        if (modifyVolumeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVolumeRequest> request = new DefaultRequest<ModifyVolumeRequest>(modifyVolumeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVolume");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVolumeRequest.getVolumeId() != null) {
            request.addParameter("VolumeId", StringUtils.fromString(modifyVolumeRequest.getVolumeId()));
        }

        if (modifyVolumeRequest.getSize() != null) {
            request.addParameter("Size", StringUtils.fromInteger(modifyVolumeRequest.getSize()));
        }

        if (modifyVolumeRequest.getVolumeType() != null) {
            request.addParameter("VolumeType", StringUtils.fromString(modifyVolumeRequest.getVolumeType()));
        }

        if (modifyVolumeRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(modifyVolumeRequest.getIops()));
        }

        return request;
    }

}
