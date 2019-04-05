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
 * PutUserPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutUserPolicyRequestMarshaller implements Marshaller<Request<PutUserPolicyRequest>, PutUserPolicyRequest> {

    public Request<PutUserPolicyRequest> marshall(PutUserPolicyRequest putUserPolicyRequest) {

        if (putUserPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutUserPolicyRequest> request = new DefaultRequest<PutUserPolicyRequest>(putUserPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "PutUserPolicy");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (putUserPolicyRequest.getUserName() != null) {
            request.addParameter("UserName", StringUtils.fromString(putUserPolicyRequest.getUserName()));
        }

        if (putUserPolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(putUserPolicyRequest.getPolicyName()));
        }

        if (putUserPolicyRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(putUserPolicyRequest.getPolicyDocument()));
        }

        return request;
    }

}
