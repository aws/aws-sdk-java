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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ModifyVerifiedAccessGroupPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessGroupPolicyRequestMarshaller implements
        Marshaller<Request<ModifyVerifiedAccessGroupPolicyRequest>, ModifyVerifiedAccessGroupPolicyRequest> {

    public Request<ModifyVerifiedAccessGroupPolicyRequest> marshall(ModifyVerifiedAccessGroupPolicyRequest modifyVerifiedAccessGroupPolicyRequest) {

        if (modifyVerifiedAccessGroupPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVerifiedAccessGroupPolicyRequest> request = new DefaultRequest<ModifyVerifiedAccessGroupPolicyRequest>(
                modifyVerifiedAccessGroupPolicyRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVerifiedAccessGroupPolicy");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVerifiedAccessGroupPolicyRequest.getVerifiedAccessGroupId() != null) {
            request.addParameter("VerifiedAccessGroupId", StringUtils.fromString(modifyVerifiedAccessGroupPolicyRequest.getVerifiedAccessGroupId()));
        }

        if (modifyVerifiedAccessGroupPolicyRequest.getPolicyEnabled() != null) {
            request.addParameter("PolicyEnabled", StringUtils.fromBoolean(modifyVerifiedAccessGroupPolicyRequest.getPolicyEnabled()));
        }

        if (modifyVerifiedAccessGroupPolicyRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(modifyVerifiedAccessGroupPolicyRequest.getPolicyDocument()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(modifyVerifiedAccessGroupPolicyRequest.getClientToken()));

        return request;
    }

}
