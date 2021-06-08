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
 * ModifyUserGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyUserGroupRequestMarshaller implements Marshaller<Request<ModifyUserGroupRequest>, ModifyUserGroupRequest> {

    public Request<ModifyUserGroupRequest> marshall(ModifyUserGroupRequest modifyUserGroupRequest) {

        if (modifyUserGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyUserGroupRequest> request = new DefaultRequest<ModifyUserGroupRequest>(modifyUserGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyUserGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyUserGroupRequest.getUserGroupId() != null) {
            request.addParameter("UserGroupId", StringUtils.fromString(modifyUserGroupRequest.getUserGroupId()));
        }

        if (!modifyUserGroupRequest.getUserIdsToAdd().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyUserGroupRequest.getUserIdsToAdd()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> userIdsToAddList = (com.amazonaws.internal.SdkInternalList<String>) modifyUserGroupRequest
                    .getUserIdsToAdd();
            int userIdsToAddListIndex = 1;

            for (String userIdsToAddListValue : userIdsToAddList) {
                if (userIdsToAddListValue != null) {
                    request.addParameter("UserIdsToAdd.member." + userIdsToAddListIndex, StringUtils.fromString(userIdsToAddListValue));
                }
                userIdsToAddListIndex++;
            }
        }

        if (!modifyUserGroupRequest.getUserIdsToRemove().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyUserGroupRequest.getUserIdsToRemove()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> userIdsToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) modifyUserGroupRequest
                    .getUserIdsToRemove();
            int userIdsToRemoveListIndex = 1;

            for (String userIdsToRemoveListValue : userIdsToRemoveList) {
                if (userIdsToRemoveListValue != null) {
                    request.addParameter("UserIdsToRemove.member." + userIdsToRemoveListIndex, StringUtils.fromString(userIdsToRemoveListValue));
                }
                userIdsToRemoveListIndex++;
            }
        }

        return request;
    }

}
