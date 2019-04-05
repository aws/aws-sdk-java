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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyVpcEndpointServicePermissionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcEndpointServicePermissionsRequestMarshaller implements
        Marshaller<Request<ModifyVpcEndpointServicePermissionsRequest>, ModifyVpcEndpointServicePermissionsRequest> {

    public Request<ModifyVpcEndpointServicePermissionsRequest> marshall(ModifyVpcEndpointServicePermissionsRequest modifyVpcEndpointServicePermissionsRequest) {

        if (modifyVpcEndpointServicePermissionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpcEndpointServicePermissionsRequest> request = new DefaultRequest<ModifyVpcEndpointServicePermissionsRequest>(
                modifyVpcEndpointServicePermissionsRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVpcEndpointServicePermissions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVpcEndpointServicePermissionsRequest.getServiceId() != null) {
            request.addParameter("ServiceId", StringUtils.fromString(modifyVpcEndpointServicePermissionsRequest.getServiceId()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointServicePermissionsRequestAddAllowedPrincipalsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointServicePermissionsRequest
                .getAddAllowedPrincipals();
        if (!modifyVpcEndpointServicePermissionsRequestAddAllowedPrincipalsList.isEmpty()
                || !modifyVpcEndpointServicePermissionsRequestAddAllowedPrincipalsList.isAutoConstruct()) {
            int addAllowedPrincipalsListIndex = 1;

            for (String modifyVpcEndpointServicePermissionsRequestAddAllowedPrincipalsListValue : modifyVpcEndpointServicePermissionsRequestAddAllowedPrincipalsList) {
                if (modifyVpcEndpointServicePermissionsRequestAddAllowedPrincipalsListValue != null) {
                    request.addParameter("AddAllowedPrincipals." + addAllowedPrincipalsListIndex,
                            StringUtils.fromString(modifyVpcEndpointServicePermissionsRequestAddAllowedPrincipalsListValue));
                }
                addAllowedPrincipalsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointServicePermissionsRequestRemoveAllowedPrincipalsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointServicePermissionsRequest
                .getRemoveAllowedPrincipals();
        if (!modifyVpcEndpointServicePermissionsRequestRemoveAllowedPrincipalsList.isEmpty()
                || !modifyVpcEndpointServicePermissionsRequestRemoveAllowedPrincipalsList.isAutoConstruct()) {
            int removeAllowedPrincipalsListIndex = 1;

            for (String modifyVpcEndpointServicePermissionsRequestRemoveAllowedPrincipalsListValue : modifyVpcEndpointServicePermissionsRequestRemoveAllowedPrincipalsList) {
                if (modifyVpcEndpointServicePermissionsRequestRemoveAllowedPrincipalsListValue != null) {
                    request.addParameter("RemoveAllowedPrincipals." + removeAllowedPrincipalsListIndex,
                            StringUtils.fromString(modifyVpcEndpointServicePermissionsRequestRemoveAllowedPrincipalsListValue));
                }
                removeAllowedPrincipalsListIndex++;
            }
        }

        return request;
    }

}
