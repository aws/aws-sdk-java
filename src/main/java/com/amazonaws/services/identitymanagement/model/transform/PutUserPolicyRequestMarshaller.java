/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Put User Policy Request Marshaller
 */
public class PutUserPolicyRequestMarshaller implements Marshaller<Request<PutUserPolicyRequest>, PutUserPolicyRequest> {

    public Request<PutUserPolicyRequest> marshall(PutUserPolicyRequest putUserPolicyRequest) {
        Request<PutUserPolicyRequest> request = new DefaultRequest<PutUserPolicyRequest>(putUserPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "PutUserPolicy");
        request.addParameter("Version", "2010-05-08");
        if (putUserPolicyRequest != null) {
            if (putUserPolicyRequest.getUserName() != null) {
                request.addParameter("UserName", StringUtils.fromString(putUserPolicyRequest.getUserName()));
            }
        }
        if (putUserPolicyRequest != null) {
            if (putUserPolicyRequest.getPolicyName() != null) {
                request.addParameter("PolicyName", StringUtils.fromString(putUserPolicyRequest.getPolicyName()));
            }
        }
        if (putUserPolicyRequest != null) {
            if (putUserPolicyRequest.getPolicyDocument() != null) {
                request.addParameter("PolicyDocument", StringUtils.fromString(putUserPolicyRequest.getPolicyDocument()));
            }
        }


        return request;
    }
}
