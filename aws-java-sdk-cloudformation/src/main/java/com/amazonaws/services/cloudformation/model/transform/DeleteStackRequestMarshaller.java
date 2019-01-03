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
 * DeleteStackRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStackRequestMarshaller implements Marshaller<Request<DeleteStackRequest>, DeleteStackRequest> {

    public Request<DeleteStackRequest> marshall(DeleteStackRequest deleteStackRequest) {

        if (deleteStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteStackRequest> request = new DefaultRequest<DeleteStackRequest>(deleteStackRequest, "AmazonCloudFormation");
        request.addParameter("Action", "DeleteStack");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteStackRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(deleteStackRequest.getStackName()));
        }

        if (deleteStackRequest.getRetainResources().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) deleteStackRequest.getRetainResources()).isAutoConstruct()) {
            request.addParameter("RetainResources", "");
        }
        if (!deleteStackRequest.getRetainResources().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) deleteStackRequest.getRetainResources()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> retainResourcesList = (com.amazonaws.internal.SdkInternalList<String>) deleteStackRequest
                    .getRetainResources();
            int retainResourcesListIndex = 1;

            for (String retainResourcesListValue : retainResourcesList) {
                if (retainResourcesListValue != null) {
                    request.addParameter("RetainResources.member." + retainResourcesListIndex, StringUtils.fromString(retainResourcesListValue));
                }
                retainResourcesListIndex++;
            }
        }

        if (deleteStackRequest.getRoleARN() != null) {
            request.addParameter("RoleARN", StringUtils.fromString(deleteStackRequest.getRoleARN()));
        }

        if (deleteStackRequest.getClientRequestToken() != null) {
            request.addParameter("ClientRequestToken", StringUtils.fromString(deleteStackRequest.getClientRequestToken()));
        }

        return request;
    }

}
