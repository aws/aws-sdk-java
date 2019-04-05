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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SignalResourceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalResourceRequestMarshaller implements Marshaller<Request<SignalResourceRequest>, SignalResourceRequest> {

    public Request<SignalResourceRequest> marshall(SignalResourceRequest signalResourceRequest) {

        if (signalResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SignalResourceRequest> request = new DefaultRequest<SignalResourceRequest>(signalResourceRequest, "AmazonCloudFormation");
        request.addParameter("Action", "SignalResource");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (signalResourceRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(signalResourceRequest.getStackName()));
        }

        if (signalResourceRequest.getLogicalResourceId() != null) {
            request.addParameter("LogicalResourceId", StringUtils.fromString(signalResourceRequest.getLogicalResourceId()));
        }

        if (signalResourceRequest.getUniqueId() != null) {
            request.addParameter("UniqueId", StringUtils.fromString(signalResourceRequest.getUniqueId()));
        }

        if (signalResourceRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(signalResourceRequest.getStatus()));
        }

        return request;
    }

}
