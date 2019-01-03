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
 * ModifySnapshotAttributeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotAttributeRequestMarshaller implements Marshaller<Request<ModifySnapshotAttributeRequest>, ModifySnapshotAttributeRequest> {

    public Request<ModifySnapshotAttributeRequest> marshall(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) {

        if (modifySnapshotAttributeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySnapshotAttributeRequest> request = new DefaultRequest<ModifySnapshotAttributeRequest>(modifySnapshotAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifySnapshotAttribute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifySnapshotAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(modifySnapshotAttributeRequest.getAttribute()));
        }

        CreateVolumePermissionModifications createVolumePermission = modifySnapshotAttributeRequest.getCreateVolumePermission();
        if (createVolumePermission != null) {

            com.amazonaws.internal.SdkInternalList<CreateVolumePermission> createVolumePermissionModificationsAddList = (com.amazonaws.internal.SdkInternalList<CreateVolumePermission>) createVolumePermission
                    .getAdd();
            if (!createVolumePermissionModificationsAddList.isEmpty() || !createVolumePermissionModificationsAddList.isAutoConstruct()) {
                int addListIndex = 1;

                for (CreateVolumePermission createVolumePermissionModificationsAddListValue : createVolumePermissionModificationsAddList) {

                    if (createVolumePermissionModificationsAddListValue.getGroup() != null) {
                        request.addParameter("CreateVolumePermission.Add." + addListIndex + ".Group",
                                StringUtils.fromString(createVolumePermissionModificationsAddListValue.getGroup()));
                    }

                    if (createVolumePermissionModificationsAddListValue.getUserId() != null) {
                        request.addParameter("CreateVolumePermission.Add." + addListIndex + ".UserId",
                                StringUtils.fromString(createVolumePermissionModificationsAddListValue.getUserId()));
                    }
                    addListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<CreateVolumePermission> createVolumePermissionModificationsRemoveList = (com.amazonaws.internal.SdkInternalList<CreateVolumePermission>) createVolumePermission
                    .getRemove();
            if (!createVolumePermissionModificationsRemoveList.isEmpty() || !createVolumePermissionModificationsRemoveList.isAutoConstruct()) {
                int removeListIndex = 1;

                for (CreateVolumePermission createVolumePermissionModificationsRemoveListValue : createVolumePermissionModificationsRemoveList) {

                    if (createVolumePermissionModificationsRemoveListValue.getGroup() != null) {
                        request.addParameter("CreateVolumePermission.Remove." + removeListIndex + ".Group",
                                StringUtils.fromString(createVolumePermissionModificationsRemoveListValue.getGroup()));
                    }

                    if (createVolumePermissionModificationsRemoveListValue.getUserId() != null) {
                        request.addParameter("CreateVolumePermission.Remove." + removeListIndex + ".UserId",
                                StringUtils.fromString(createVolumePermissionModificationsRemoveListValue.getUserId()));
                    }
                    removeListIndex++;
                }
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifySnapshotAttributeRequestGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) modifySnapshotAttributeRequest
                .getGroupNames();
        if (!modifySnapshotAttributeRequestGroupNamesList.isEmpty() || !modifySnapshotAttributeRequestGroupNamesList.isAutoConstruct()) {
            int groupNamesListIndex = 1;

            for (String modifySnapshotAttributeRequestGroupNamesListValue : modifySnapshotAttributeRequestGroupNamesList) {
                if (modifySnapshotAttributeRequestGroupNamesListValue != null) {
                    request.addParameter("UserGroup." + groupNamesListIndex, StringUtils.fromString(modifySnapshotAttributeRequestGroupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }

        if (modifySnapshotAttributeRequest.getOperationType() != null) {
            request.addParameter("OperationType", StringUtils.fromString(modifySnapshotAttributeRequest.getOperationType()));
        }

        if (modifySnapshotAttributeRequest.getSnapshotId() != null) {
            request.addParameter("SnapshotId", StringUtils.fromString(modifySnapshotAttributeRequest.getSnapshotId()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifySnapshotAttributeRequestUserIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifySnapshotAttributeRequest
                .getUserIds();
        if (!modifySnapshotAttributeRequestUserIdsList.isEmpty() || !modifySnapshotAttributeRequestUserIdsList.isAutoConstruct()) {
            int userIdsListIndex = 1;

            for (String modifySnapshotAttributeRequestUserIdsListValue : modifySnapshotAttributeRequestUserIdsList) {
                if (modifySnapshotAttributeRequestUserIdsListValue != null) {
                    request.addParameter("UserId." + userIdsListIndex, StringUtils.fromString(modifySnapshotAttributeRequestUserIdsListValue));
                }
                userIdsListIndex++;
            }
        }

        return request;
    }

}
