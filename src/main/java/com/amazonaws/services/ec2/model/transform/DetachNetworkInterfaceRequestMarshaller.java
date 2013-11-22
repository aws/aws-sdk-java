/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Detach Network Interface Request Marshaller
 */
public class DetachNetworkInterfaceRequestMarshaller implements Marshaller<Request<DetachNetworkInterfaceRequest>, DetachNetworkInterfaceRequest> {

    public Request<DetachNetworkInterfaceRequest> marshall(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest) {

        if (detachNetworkInterfaceRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DetachNetworkInterfaceRequest> request = new DefaultRequest<DetachNetworkInterfaceRequest>(detachNetworkInterfaceRequest, "AmazonEC2");
        request.addParameter("Action", "DetachNetworkInterface");
        request.addParameter("Version", "2013-10-15");

        if (detachNetworkInterfaceRequest.getAttachmentId() != null) {
            request.addParameter("AttachmentId", StringUtils.fromString(detachNetworkInterfaceRequest.getAttachmentId()));
        }
        if (detachNetworkInterfaceRequest.isForce() != null) {
            request.addParameter("Force", StringUtils.fromBoolean(detachNetworkInterfaceRequest.isForce()));
        }


        return request;
    }
}
