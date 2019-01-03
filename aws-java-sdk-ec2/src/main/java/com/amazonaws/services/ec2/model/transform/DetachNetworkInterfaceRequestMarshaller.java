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
 * DetachNetworkInterfaceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachNetworkInterfaceRequestMarshaller implements Marshaller<Request<DetachNetworkInterfaceRequest>, DetachNetworkInterfaceRequest> {

    public Request<DetachNetworkInterfaceRequest> marshall(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest) {

        if (detachNetworkInterfaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DetachNetworkInterfaceRequest> request = new DefaultRequest<DetachNetworkInterfaceRequest>(detachNetworkInterfaceRequest, "AmazonEC2");
        request.addParameter("Action", "DetachNetworkInterface");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (detachNetworkInterfaceRequest.getAttachmentId() != null) {
            request.addParameter("AttachmentId", StringUtils.fromString(detachNetworkInterfaceRequest.getAttachmentId()));
        }

        if (detachNetworkInterfaceRequest.getForce() != null) {
            request.addParameter("Force", StringUtils.fromBoolean(detachNetworkInterfaceRequest.getForce()));
        }

        return request;
    }

}
