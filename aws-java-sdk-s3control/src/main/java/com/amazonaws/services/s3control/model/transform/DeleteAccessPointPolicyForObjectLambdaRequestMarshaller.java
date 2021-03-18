/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * DeleteAccessPointPolicyForObjectLambdaRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccessPointPolicyForObjectLambdaRequestMarshaller implements
        Marshaller<Request<DeleteAccessPointPolicyForObjectLambdaRequest>, DeleteAccessPointPolicyForObjectLambdaRequest> {

    public Request<DeleteAccessPointPolicyForObjectLambdaRequest> marshall(
            DeleteAccessPointPolicyForObjectLambdaRequest deleteAccessPointPolicyForObjectLambdaRequest) {

        if (deleteAccessPointPolicyForObjectLambdaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteAccessPointPolicyForObjectLambdaRequest> request = new DefaultRequest<DeleteAccessPointPolicyForObjectLambdaRequest>(
                deleteAccessPointPolicyForObjectLambdaRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.DELETE);

        if (deleteAccessPointPolicyForObjectLambdaRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(deleteAccessPointPolicyForObjectLambdaRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/accesspointforobjectlambda/{name}/policy";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "name",
                deleteAccessPointPolicyForObjectLambdaRequest.getName());
        request.setResourcePath(uriResourcePath);

        return request;
    }

}
