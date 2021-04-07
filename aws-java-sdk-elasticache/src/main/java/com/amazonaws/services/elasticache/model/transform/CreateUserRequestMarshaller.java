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
 * CreateUserRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequestMarshaller implements Marshaller<Request<CreateUserRequest>, CreateUserRequest> {

    public Request<CreateUserRequest> marshall(CreateUserRequest createUserRequest) {

        if (createUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateUserRequest> request = new DefaultRequest<CreateUserRequest>(createUserRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateUser");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (createUserRequest.getUserId() != null) {
            request.addParameter("UserId", StringUtils.fromString(createUserRequest.getUserId()));
        }

        if (createUserRequest.getUserName() != null) {
            request.addParameter("UserName", StringUtils.fromString(createUserRequest.getUserName()));
        }

        if (createUserRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createUserRequest.getEngine()));
        }

        if (!createUserRequest.getPasswords().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createUserRequest.getPasswords()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> passwordsList = (com.amazonaws.internal.SdkInternalList<String>) createUserRequest.getPasswords();
            int passwordsListIndex = 1;

            for (String passwordsListValue : passwordsList) {
                if (passwordsListValue != null) {
                    request.addParameter("Passwords.member." + passwordsListIndex, StringUtils.fromString(passwordsListValue));
                }
                passwordsListIndex++;
            }
        }

        if (createUserRequest.getAccessString() != null) {
            request.addParameter("AccessString", StringUtils.fromString(createUserRequest.getAccessString()));
        }

        if (createUserRequest.getNoPasswordRequired() != null) {
            request.addParameter("NoPasswordRequired", StringUtils.fromBoolean(createUserRequest.getNoPasswordRequired()));
        }

        if (!createUserRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) createUserRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createUserRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
