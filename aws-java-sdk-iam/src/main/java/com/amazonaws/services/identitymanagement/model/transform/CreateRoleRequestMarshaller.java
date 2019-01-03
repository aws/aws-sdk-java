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
 * CreateRoleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoleRequestMarshaller implements Marshaller<Request<CreateRoleRequest>, CreateRoleRequest> {

    public Request<CreateRoleRequest> marshall(CreateRoleRequest createRoleRequest) {

        if (createRoleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRoleRequest> request = new DefaultRequest<CreateRoleRequest>(createRoleRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "CreateRole");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (createRoleRequest.getPath() != null) {
            request.addParameter("Path", StringUtils.fromString(createRoleRequest.getPath()));
        }

        if (createRoleRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(createRoleRequest.getRoleName()));
        }

        if (createRoleRequest.getAssumeRolePolicyDocument() != null) {
            request.addParameter("AssumeRolePolicyDocument", StringUtils.fromString(createRoleRequest.getAssumeRolePolicyDocument()));
        }

        if (createRoleRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createRoleRequest.getDescription()));
        }

        if (createRoleRequest.getMaxSessionDuration() != null) {
            request.addParameter("MaxSessionDuration", StringUtils.fromInteger(createRoleRequest.getMaxSessionDuration()));
        }

        if (createRoleRequest.getPermissionsBoundary() != null) {
            request.addParameter("PermissionsBoundary", StringUtils.fromString(createRoleRequest.getPermissionsBoundary()));
        }

        if (!createRoleRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) createRoleRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createRoleRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
