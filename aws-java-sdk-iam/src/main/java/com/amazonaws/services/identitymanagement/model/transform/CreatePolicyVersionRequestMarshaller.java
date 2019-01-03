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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreatePolicyVersionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyVersionRequestMarshaller implements Marshaller<Request<CreatePolicyVersionRequest>, CreatePolicyVersionRequest> {

    public Request<CreatePolicyVersionRequest> marshall(CreatePolicyVersionRequest createPolicyVersionRequest) {

        if (createPolicyVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePolicyVersionRequest> request = new DefaultRequest<CreatePolicyVersionRequest>(createPolicyVersionRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "CreatePolicyVersion");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (createPolicyVersionRequest.getPolicyArn() != null) {
            request.addParameter("PolicyArn", StringUtils.fromString(createPolicyVersionRequest.getPolicyArn()));
        }

        if (createPolicyVersionRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(createPolicyVersionRequest.getPolicyDocument()));
        }

        if (createPolicyVersionRequest.getSetAsDefault() != null) {
            request.addParameter("SetAsDefault", StringUtils.fromBoolean(createPolicyVersionRequest.getSetAsDefault()));
        }

        return request;
    }

}
