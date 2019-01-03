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
 * CreateServiceLinkedRoleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceLinkedRoleRequestMarshaller implements Marshaller<Request<CreateServiceLinkedRoleRequest>, CreateServiceLinkedRoleRequest> {

    public Request<CreateServiceLinkedRoleRequest> marshall(CreateServiceLinkedRoleRequest createServiceLinkedRoleRequest) {

        if (createServiceLinkedRoleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateServiceLinkedRoleRequest> request = new DefaultRequest<CreateServiceLinkedRoleRequest>(createServiceLinkedRoleRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "CreateServiceLinkedRole");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (createServiceLinkedRoleRequest.getAWSServiceName() != null) {
            request.addParameter("AWSServiceName", StringUtils.fromString(createServiceLinkedRoleRequest.getAWSServiceName()));
        }

        if (createServiceLinkedRoleRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createServiceLinkedRoleRequest.getDescription()));
        }

        if (createServiceLinkedRoleRequest.getCustomSuffix() != null) {
            request.addParameter("CustomSuffix", StringUtils.fromString(createServiceLinkedRoleRequest.getCustomSuffix()));
        }

        return request;
    }

}
