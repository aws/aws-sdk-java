/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ModifySnapshotAttributeRequest Marshaller
 */

public class ModifySnapshotAttributeRequestMarshaller
        implements
        Marshaller<Request<ModifySnapshotAttributeRequest>, ModifySnapshotAttributeRequest> {

    public Request<ModifySnapshotAttributeRequest> marshall(
            ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) {

        if (modifySnapshotAttributeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifySnapshotAttributeRequest> request = new DefaultRequest<ModifySnapshotAttributeRequest>(
                modifySnapshotAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifySnapshotAttribute");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifySnapshotAttributeRequest.getSnapshotId() != null) {
            request.addParameter("SnapshotId", StringUtils
                    .fromString(modifySnapshotAttributeRequest.getSnapshotId()));
        }

        if (modifySnapshotAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils
                    .fromString(modifySnapshotAttributeRequest.getAttribute()));
        }

        if (modifySnapshotAttributeRequest.getOperationType() != null) {
            request.addParameter("OperationType", StringUtils
                    .fromString(modifySnapshotAttributeRequest
                            .getOperationType()));
        }

        com.amazonaws.internal.SdkInternalList<String> userIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifySnapshotAttributeRequest
                .getUserIds();
        if (!userIdsList.isEmpty() || !userIdsList.isAutoConstruct()) {
            int userIdsListIndex = 1;

            for (String userIdsListValue : userIdsList) {
                if (userIdsListValue != null) {
                    request.addParameter("UserId." + userIdsListIndex,
                            StringUtils.fromString(userIdsListValue));
                }
                userIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> groupNamesList = (com.amazonaws.internal.SdkInternalList<String>) modifySnapshotAttributeRequest
                .getGroupNames();
        if (!groupNamesList.isEmpty() || !groupNamesList.isAutoConstruct()) {
            int groupNamesListIndex = 1;

            for (String groupNamesListValue : groupNamesList) {
                if (groupNamesListValue != null) {
                    request.addParameter("UserGroup." + groupNamesListIndex,
                            StringUtils.fromString(groupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }

        CreateVolumePermissionModifications createVolumePermission = modifySnapshotAttributeRequest
                .getCreateVolumePermission();
        if (createVolumePermission != null) {

            com.amazonaws.internal.SdkInternalList<CreateVolumePermission> addList = (com.amazonaws.internal.SdkInternalList<CreateVolumePermission>) createVolumePermission
                    .getAdd();
            if (!addList.isEmpty() || !addList.isAutoConstruct()) {
                int addListIndex = 1;

                for (CreateVolumePermission addListValue : addList) {

                    if (addListValue.getUserId() != null) {
                        request.addParameter("CreateVolumePermission.Add."
                                + addListIndex + ".UserId", StringUtils
                                .fromString(addListValue.getUserId()));
                    }

                    if (addListValue.getGroup() != null) {
                        request.addParameter("CreateVolumePermission.Add."
                                + addListIndex + ".Group",
                                StringUtils.fromString(addListValue.getGroup()));
                    }
                    addListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<CreateVolumePermission> removeList = (com.amazonaws.internal.SdkInternalList<CreateVolumePermission>) createVolumePermission
                    .getRemove();
            if (!removeList.isEmpty() || !removeList.isAutoConstruct()) {
                int removeListIndex = 1;

                for (CreateVolumePermission removeListValue : removeList) {

                    if (removeListValue.getUserId() != null) {
                        request.addParameter("CreateVolumePermission.Remove."
                                + removeListIndex + ".UserId", StringUtils
                                .fromString(removeListValue.getUserId()));
                    }

                    if (removeListValue.getGroup() != null) {
                        request.addParameter("CreateVolumePermission.Remove."
                                + removeListIndex + ".Group", StringUtils
                                .fromString(removeListValue.getGroup()));
                    }
                    removeListIndex++;
                }
            }
        }

        return request;
    }

}
