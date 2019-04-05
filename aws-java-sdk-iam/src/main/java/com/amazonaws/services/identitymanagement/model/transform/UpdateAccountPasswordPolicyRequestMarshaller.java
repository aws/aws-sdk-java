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
 * UpdateAccountPasswordPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountPasswordPolicyRequestMarshaller implements
        Marshaller<Request<UpdateAccountPasswordPolicyRequest>, UpdateAccountPasswordPolicyRequest> {

    public Request<UpdateAccountPasswordPolicyRequest> marshall(UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest) {

        if (updateAccountPasswordPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateAccountPasswordPolicyRequest> request = new DefaultRequest<UpdateAccountPasswordPolicyRequest>(updateAccountPasswordPolicyRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "UpdateAccountPasswordPolicy");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateAccountPasswordPolicyRequest.getMinimumPasswordLength() != null) {
            request.addParameter("MinimumPasswordLength", StringUtils.fromInteger(updateAccountPasswordPolicyRequest.getMinimumPasswordLength()));
        }

        if (updateAccountPasswordPolicyRequest.getRequireSymbols() != null) {
            request.addParameter("RequireSymbols", StringUtils.fromBoolean(updateAccountPasswordPolicyRequest.getRequireSymbols()));
        }

        if (updateAccountPasswordPolicyRequest.getRequireNumbers() != null) {
            request.addParameter("RequireNumbers", StringUtils.fromBoolean(updateAccountPasswordPolicyRequest.getRequireNumbers()));
        }

        if (updateAccountPasswordPolicyRequest.getRequireUppercaseCharacters() != null) {
            request.addParameter("RequireUppercaseCharacters", StringUtils.fromBoolean(updateAccountPasswordPolicyRequest.getRequireUppercaseCharacters()));
        }

        if (updateAccountPasswordPolicyRequest.getRequireLowercaseCharacters() != null) {
            request.addParameter("RequireLowercaseCharacters", StringUtils.fromBoolean(updateAccountPasswordPolicyRequest.getRequireLowercaseCharacters()));
        }

        if (updateAccountPasswordPolicyRequest.getAllowUsersToChangePassword() != null) {
            request.addParameter("AllowUsersToChangePassword", StringUtils.fromBoolean(updateAccountPasswordPolicyRequest.getAllowUsersToChangePassword()));
        }

        if (updateAccountPasswordPolicyRequest.getMaxPasswordAge() != null) {
            request.addParameter("MaxPasswordAge", StringUtils.fromInteger(updateAccountPasswordPolicyRequest.getMaxPasswordAge()));
        }

        if (updateAccountPasswordPolicyRequest.getPasswordReusePrevention() != null) {
            request.addParameter("PasswordReusePrevention", StringUtils.fromInteger(updateAccountPasswordPolicyRequest.getPasswordReusePrevention()));
        }

        if (updateAccountPasswordPolicyRequest.getHardExpiry() != null) {
            request.addParameter("HardExpiry", StringUtils.fromBoolean(updateAccountPasswordPolicyRequest.getHardExpiry()));
        }

        return request;
    }

}
