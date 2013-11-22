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
 * Deregister Image Request Marshaller
 */
public class DeregisterImageRequestMarshaller implements Marshaller<Request<DeregisterImageRequest>, DeregisterImageRequest> {

    public Request<DeregisterImageRequest> marshall(DeregisterImageRequest deregisterImageRequest) {

        if (deregisterImageRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeregisterImageRequest> request = new DefaultRequest<DeregisterImageRequest>(deregisterImageRequest, "AmazonEC2");
        request.addParameter("Action", "DeregisterImage");
        request.addParameter("Version", "2013-10-15");

        if (deregisterImageRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(deregisterImageRequest.getImageId()));
        }


        return request;
    }
}
