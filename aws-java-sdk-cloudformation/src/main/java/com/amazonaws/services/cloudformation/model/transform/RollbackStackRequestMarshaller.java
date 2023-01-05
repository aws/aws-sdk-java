/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * RollbackStackRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollbackStackRequestMarshaller implements Marshaller<Request<RollbackStackRequest>, RollbackStackRequest> {

    public Request<RollbackStackRequest> marshall(RollbackStackRequest rollbackStackRequest) {

        if (rollbackStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RollbackStackRequest> request = new DefaultRequest<RollbackStackRequest>(rollbackStackRequest, "AmazonCloudFormation");
        request.addParameter("Action", "RollbackStack");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (rollbackStackRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(rollbackStackRequest.getStackName()));
        }

        if (rollbackStackRequest.getRoleARN() != null) {
            request.addParameter("RoleARN", StringUtils.fromString(rollbackStackRequest.getRoleARN()));
        }

        if (rollbackStackRequest.getClientRequestToken() != null) {
            request.addParameter("ClientRequestToken", StringUtils.fromString(rollbackStackRequest.getClientRequestToken()));
        }

        return request;
    }

}
