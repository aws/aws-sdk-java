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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyUserRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyUserRequestMarshaller implements Marshaller<Request<ModifyUserRequest>, ModifyUserRequest> {

    public Request<ModifyUserRequest> marshall(ModifyUserRequest modifyUserRequest) {

        if (modifyUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyUserRequest> request = new DefaultRequest<ModifyUserRequest>(modifyUserRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyUser");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyUserRequest.getUserId() != null) {
            request.addParameter("UserId", StringUtils.fromString(modifyUserRequest.getUserId()));
        }

        if (modifyUserRequest.getAccessString() != null) {
            request.addParameter("AccessString", StringUtils.fromString(modifyUserRequest.getAccessString()));
        }

        if (modifyUserRequest.getAppendAccessString() != null) {
            request.addParameter("AppendAccessString", StringUtils.fromString(modifyUserRequest.getAppendAccessString()));
        }

        if (!modifyUserRequest.getPasswords().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyUserRequest.getPasswords()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> passwordsList = (com.amazonaws.internal.SdkInternalList<String>) modifyUserRequest.getPasswords();
            int passwordsListIndex = 1;

            for (String passwordsListValue : passwordsList) {
                if (passwordsListValue != null) {
                    request.addParameter("Passwords.member." + passwordsListIndex, StringUtils.fromString(passwordsListValue));
                }
                passwordsListIndex++;
            }
        }

        if (modifyUserRequest.getNoPasswordRequired() != null) {
            request.addParameter("NoPasswordRequired", StringUtils.fromBoolean(modifyUserRequest.getNoPasswordRequired()));
        }

        return request;
    }

}
