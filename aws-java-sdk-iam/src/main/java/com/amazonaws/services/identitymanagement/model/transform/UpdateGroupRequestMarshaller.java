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
 * UpdateGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGroupRequestMarshaller implements Marshaller<Request<UpdateGroupRequest>, UpdateGroupRequest> {

    public Request<UpdateGroupRequest> marshall(UpdateGroupRequest updateGroupRequest) {

        if (updateGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateGroupRequest> request = new DefaultRequest<UpdateGroupRequest>(updateGroupRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "UpdateGroup");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateGroupRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(updateGroupRequest.getGroupName()));
        }

        if (updateGroupRequest.getNewPath() != null) {
            request.addParameter("NewPath", StringUtils.fromString(updateGroupRequest.getNewPath()));
        }

        if (updateGroupRequest.getNewGroupName() != null) {
            request.addParameter("NewGroupName", StringUtils.fromString(updateGroupRequest.getNewGroupName()));
        }

        return request;
    }

}
