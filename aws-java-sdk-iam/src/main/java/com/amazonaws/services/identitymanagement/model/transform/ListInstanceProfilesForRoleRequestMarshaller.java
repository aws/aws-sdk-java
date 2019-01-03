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
 * ListInstanceProfilesForRoleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstanceProfilesForRoleRequestMarshaller implements
        Marshaller<Request<ListInstanceProfilesForRoleRequest>, ListInstanceProfilesForRoleRequest> {

    public Request<ListInstanceProfilesForRoleRequest> marshall(ListInstanceProfilesForRoleRequest listInstanceProfilesForRoleRequest) {

        if (listInstanceProfilesForRoleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListInstanceProfilesForRoleRequest> request = new DefaultRequest<ListInstanceProfilesForRoleRequest>(listInstanceProfilesForRoleRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "ListInstanceProfilesForRole");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (listInstanceProfilesForRoleRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(listInstanceProfilesForRoleRequest.getRoleName()));
        }

        if (listInstanceProfilesForRoleRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listInstanceProfilesForRoleRequest.getMarker()));
        }

        if (listInstanceProfilesForRoleRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listInstanceProfilesForRoleRequest.getMaxItems()));
        }

        return request;
    }

}
