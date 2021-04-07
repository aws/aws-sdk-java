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
 * CreateUserGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserGroupRequestMarshaller implements Marshaller<Request<CreateUserGroupRequest>, CreateUserGroupRequest> {

    public Request<CreateUserGroupRequest> marshall(CreateUserGroupRequest createUserGroupRequest) {

        if (createUserGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateUserGroupRequest> request = new DefaultRequest<CreateUserGroupRequest>(createUserGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateUserGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (createUserGroupRequest.getUserGroupId() != null) {
            request.addParameter("UserGroupId", StringUtils.fromString(createUserGroupRequest.getUserGroupId()));
        }

        if (createUserGroupRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createUserGroupRequest.getEngine()));
        }

        if (!createUserGroupRequest.getUserIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createUserGroupRequest.getUserIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> userIdsList = (com.amazonaws.internal.SdkInternalList<String>) createUserGroupRequest.getUserIds();
            int userIdsListIndex = 1;

            for (String userIdsListValue : userIdsList) {
                if (userIdsListValue != null) {
                    request.addParameter("UserIds.member." + userIdsListIndex, StringUtils.fromString(userIdsListValue));
                }
                userIdsListIndex++;
            }
        }

        if (!createUserGroupRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) createUserGroupRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createUserGroupRequest.getTags();
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
