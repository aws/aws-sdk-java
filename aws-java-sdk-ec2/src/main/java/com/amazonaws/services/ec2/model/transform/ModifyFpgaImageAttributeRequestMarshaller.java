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
 * ModifyFpgaImageAttributeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyFpgaImageAttributeRequestMarshaller implements Marshaller<Request<ModifyFpgaImageAttributeRequest>, ModifyFpgaImageAttributeRequest> {

    public Request<ModifyFpgaImageAttributeRequest> marshall(ModifyFpgaImageAttributeRequest modifyFpgaImageAttributeRequest) {

        if (modifyFpgaImageAttributeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyFpgaImageAttributeRequest> request = new DefaultRequest<ModifyFpgaImageAttributeRequest>(modifyFpgaImageAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyFpgaImageAttribute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyFpgaImageAttributeRequest.getFpgaImageId() != null) {
            request.addParameter("FpgaImageId", StringUtils.fromString(modifyFpgaImageAttributeRequest.getFpgaImageId()));
        }

        if (modifyFpgaImageAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(modifyFpgaImageAttributeRequest.getAttribute()));
        }

        if (modifyFpgaImageAttributeRequest.getOperationType() != null) {
            request.addParameter("OperationType", StringUtils.fromString(modifyFpgaImageAttributeRequest.getOperationType()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyFpgaImageAttributeRequestUserIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyFpgaImageAttributeRequest
                .getUserIds();
        if (!modifyFpgaImageAttributeRequestUserIdsList.isEmpty() || !modifyFpgaImageAttributeRequestUserIdsList.isAutoConstruct()) {
            int userIdsListIndex = 1;

            for (String modifyFpgaImageAttributeRequestUserIdsListValue : modifyFpgaImageAttributeRequestUserIdsList) {
                if (modifyFpgaImageAttributeRequestUserIdsListValue != null) {
                    request.addParameter("UserId." + userIdsListIndex, StringUtils.fromString(modifyFpgaImageAttributeRequestUserIdsListValue));
                }
                userIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyFpgaImageAttributeRequestUserGroupsList = (com.amazonaws.internal.SdkInternalList<String>) modifyFpgaImageAttributeRequest
                .getUserGroups();
        if (!modifyFpgaImageAttributeRequestUserGroupsList.isEmpty() || !modifyFpgaImageAttributeRequestUserGroupsList.isAutoConstruct()) {
            int userGroupsListIndex = 1;

            for (String modifyFpgaImageAttributeRequestUserGroupsListValue : modifyFpgaImageAttributeRequestUserGroupsList) {
                if (modifyFpgaImageAttributeRequestUserGroupsListValue != null) {
                    request.addParameter("UserGroup." + userGroupsListIndex, StringUtils.fromString(modifyFpgaImageAttributeRequestUserGroupsListValue));
                }
                userGroupsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyFpgaImageAttributeRequestProductCodesList = (com.amazonaws.internal.SdkInternalList<String>) modifyFpgaImageAttributeRequest
                .getProductCodes();
        if (!modifyFpgaImageAttributeRequestProductCodesList.isEmpty() || !modifyFpgaImageAttributeRequestProductCodesList.isAutoConstruct()) {
            int productCodesListIndex = 1;

            for (String modifyFpgaImageAttributeRequestProductCodesListValue : modifyFpgaImageAttributeRequestProductCodesList) {
                if (modifyFpgaImageAttributeRequestProductCodesListValue != null) {
                    request.addParameter("ProductCode." + productCodesListIndex, StringUtils.fromString(modifyFpgaImageAttributeRequestProductCodesListValue));
                }
                productCodesListIndex++;
            }
        }

        LoadPermissionModifications loadPermission = modifyFpgaImageAttributeRequest.getLoadPermission();
        if (loadPermission != null) {

            com.amazonaws.internal.SdkInternalList<LoadPermissionRequest> loadPermissionModificationsAddList = (com.amazonaws.internal.SdkInternalList<LoadPermissionRequest>) loadPermission
                    .getAdd();
            if (!loadPermissionModificationsAddList.isEmpty() || !loadPermissionModificationsAddList.isAutoConstruct()) {
                int addListIndex = 1;

                for (LoadPermissionRequest loadPermissionModificationsAddListValue : loadPermissionModificationsAddList) {

                    if (loadPermissionModificationsAddListValue.getGroup() != null) {
                        request.addParameter("LoadPermission.Add." + addListIndex + ".Group",
                                StringUtils.fromString(loadPermissionModificationsAddListValue.getGroup()));
                    }

                    if (loadPermissionModificationsAddListValue.getUserId() != null) {
                        request.addParameter("LoadPermission.Add." + addListIndex + ".UserId",
                                StringUtils.fromString(loadPermissionModificationsAddListValue.getUserId()));
                    }
                    addListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<LoadPermissionRequest> loadPermissionModificationsRemoveList = (com.amazonaws.internal.SdkInternalList<LoadPermissionRequest>) loadPermission
                    .getRemove();
            if (!loadPermissionModificationsRemoveList.isEmpty() || !loadPermissionModificationsRemoveList.isAutoConstruct()) {
                int removeListIndex = 1;

                for (LoadPermissionRequest loadPermissionModificationsRemoveListValue : loadPermissionModificationsRemoveList) {

                    if (loadPermissionModificationsRemoveListValue.getGroup() != null) {
                        request.addParameter("LoadPermission.Remove." + removeListIndex + ".Group",
                                StringUtils.fromString(loadPermissionModificationsRemoveListValue.getGroup()));
                    }

                    if (loadPermissionModificationsRemoveListValue.getUserId() != null) {
                        request.addParameter("LoadPermission.Remove." + removeListIndex + ".UserId",
                                StringUtils.fromString(loadPermissionModificationsRemoveListValue.getUserId()));
                    }
                    removeListIndex++;
                }
            }
        }

        if (modifyFpgaImageAttributeRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyFpgaImageAttributeRequest.getDescription()));
        }

        if (modifyFpgaImageAttributeRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(modifyFpgaImageAttributeRequest.getName()));
        }

        return request;
    }

}
