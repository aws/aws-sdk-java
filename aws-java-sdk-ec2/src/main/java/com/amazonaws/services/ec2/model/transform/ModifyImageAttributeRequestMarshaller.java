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
 * ModifyImageAttributeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyImageAttributeRequestMarshaller implements Marshaller<Request<ModifyImageAttributeRequest>, ModifyImageAttributeRequest> {

    public Request<ModifyImageAttributeRequest> marshall(ModifyImageAttributeRequest modifyImageAttributeRequest) {

        if (modifyImageAttributeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyImageAttributeRequest> request = new DefaultRequest<ModifyImageAttributeRequest>(modifyImageAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyImageAttribute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyImageAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(modifyImageAttributeRequest.getAttribute()));
        }

        if (modifyImageAttributeRequest.getDescription() != null) {
            request.addParameter("Description.Value", StringUtils.fromString(modifyImageAttributeRequest.getDescription()));
        }

        if (modifyImageAttributeRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(modifyImageAttributeRequest.getImageId()));
        }

        LaunchPermissionModifications launchPermission = modifyImageAttributeRequest.getLaunchPermission();
        if (launchPermission != null) {

            com.amazonaws.internal.SdkInternalList<LaunchPermission> launchPermissionModificationsAddList = (com.amazonaws.internal.SdkInternalList<LaunchPermission>) launchPermission
                    .getAdd();
            if (!launchPermissionModificationsAddList.isEmpty() || !launchPermissionModificationsAddList.isAutoConstruct()) {
                int addListIndex = 1;

                for (LaunchPermission launchPermissionModificationsAddListValue : launchPermissionModificationsAddList) {

                    if (launchPermissionModificationsAddListValue.getGroup() != null) {
                        request.addParameter("LaunchPermission.Add." + addListIndex + ".Group",
                                StringUtils.fromString(launchPermissionModificationsAddListValue.getGroup()));
                    }

                    if (launchPermissionModificationsAddListValue.getUserId() != null) {
                        request.addParameter("LaunchPermission.Add." + addListIndex + ".UserId",
                                StringUtils.fromString(launchPermissionModificationsAddListValue.getUserId()));
                    }
                    addListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<LaunchPermission> launchPermissionModificationsRemoveList = (com.amazonaws.internal.SdkInternalList<LaunchPermission>) launchPermission
                    .getRemove();
            if (!launchPermissionModificationsRemoveList.isEmpty() || !launchPermissionModificationsRemoveList.isAutoConstruct()) {
                int removeListIndex = 1;

                for (LaunchPermission launchPermissionModificationsRemoveListValue : launchPermissionModificationsRemoveList) {

                    if (launchPermissionModificationsRemoveListValue.getGroup() != null) {
                        request.addParameter("LaunchPermission.Remove." + removeListIndex + ".Group",
                                StringUtils.fromString(launchPermissionModificationsRemoveListValue.getGroup()));
                    }

                    if (launchPermissionModificationsRemoveListValue.getUserId() != null) {
                        request.addParameter("LaunchPermission.Remove." + removeListIndex + ".UserId",
                                StringUtils.fromString(launchPermissionModificationsRemoveListValue.getUserId()));
                    }
                    removeListIndex++;
                }
            }
        }

        if (modifyImageAttributeRequest.getOperationType() != null) {
            request.addParameter("OperationType", StringUtils.fromString(modifyImageAttributeRequest.getOperationType()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyImageAttributeRequestProductCodesList = (com.amazonaws.internal.SdkInternalList<String>) modifyImageAttributeRequest
                .getProductCodes();
        if (!modifyImageAttributeRequestProductCodesList.isEmpty() || !modifyImageAttributeRequestProductCodesList.isAutoConstruct()) {
            int productCodesListIndex = 1;

            for (String modifyImageAttributeRequestProductCodesListValue : modifyImageAttributeRequestProductCodesList) {
                if (modifyImageAttributeRequestProductCodesListValue != null) {
                    request.addParameter("ProductCode." + productCodesListIndex, StringUtils.fromString(modifyImageAttributeRequestProductCodesListValue));
                }
                productCodesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyImageAttributeRequestUserGroupsList = (com.amazonaws.internal.SdkInternalList<String>) modifyImageAttributeRequest
                .getUserGroups();
        if (!modifyImageAttributeRequestUserGroupsList.isEmpty() || !modifyImageAttributeRequestUserGroupsList.isAutoConstruct()) {
            int userGroupsListIndex = 1;

            for (String modifyImageAttributeRequestUserGroupsListValue : modifyImageAttributeRequestUserGroupsList) {
                if (modifyImageAttributeRequestUserGroupsListValue != null) {
                    request.addParameter("UserGroup." + userGroupsListIndex, StringUtils.fromString(modifyImageAttributeRequestUserGroupsListValue));
                }
                userGroupsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyImageAttributeRequestUserIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyImageAttributeRequest
                .getUserIds();
        if (!modifyImageAttributeRequestUserIdsList.isEmpty() || !modifyImageAttributeRequestUserIdsList.isAutoConstruct()) {
            int userIdsListIndex = 1;

            for (String modifyImageAttributeRequestUserIdsListValue : modifyImageAttributeRequestUserIdsList) {
                if (modifyImageAttributeRequestUserIdsListValue != null) {
                    request.addParameter("UserId." + userIdsListIndex, StringUtils.fromString(modifyImageAttributeRequestUserIdsListValue));
                }
                userIdsListIndex++;
            }
        }

        if (modifyImageAttributeRequest.getValue() != null) {
            request.addParameter("Value", StringUtils.fromString(modifyImageAttributeRequest.getValue()));
        }

        return request;
    }

}
