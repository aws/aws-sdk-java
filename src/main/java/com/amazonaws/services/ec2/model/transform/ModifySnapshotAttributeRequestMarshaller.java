/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Snapshot Attribute Request Marshaller
 */
public class ModifySnapshotAttributeRequestMarshaller implements Marshaller<Request<ModifySnapshotAttributeRequest>, ModifySnapshotAttributeRequest> {

    public Request<ModifySnapshotAttributeRequest> marshall(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) {
        Request<ModifySnapshotAttributeRequest> request = new DefaultRequest<ModifySnapshotAttributeRequest>(modifySnapshotAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifySnapshotAttribute");
        request.addParameter("Version", "2011-05-15");
        if (modifySnapshotAttributeRequest != null) {
            if (modifySnapshotAttributeRequest.getSnapshotId() != null) {
                request.addParameter("SnapshotId", StringUtils.fromString(modifySnapshotAttributeRequest.getSnapshotId()));
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            if (modifySnapshotAttributeRequest.getAttribute() != null) {
                request.addParameter("Attribute", StringUtils.fromString(modifySnapshotAttributeRequest.getAttribute()));
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            if (modifySnapshotAttributeRequest.getOperationType() != null) {
                request.addParameter("OperationType", StringUtils.fromString(modifySnapshotAttributeRequest.getOperationType()));
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            java.util.List<String> userIdsList = modifySnapshotAttributeRequest.getUserIds();
            int userIdsListIndex = 1;

            for (String userIdsListValue : userIdsList) {
                if (userIdsListValue != null) {
                    request.addParameter("UserId." + userIdsListIndex, StringUtils.fromString(userIdsListValue));
                }
                userIdsListIndex++;
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            java.util.List<String> groupNamesList = modifySnapshotAttributeRequest.getGroupNames();
            int groupNamesListIndex = 1;

            for (String groupNamesListValue : groupNamesList) {
                if (groupNamesListValue != null) {
                    request.addParameter("UserGroup." + groupNamesListIndex, StringUtils.fromString(groupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }
        if (modifySnapshotAttributeRequest != null) {
            CreateVolumePermissionModifications createVolumePermission = modifySnapshotAttributeRequest.getCreateVolumePermission();

            if (createVolumePermission != null) {
                java.util.List<CreateVolumePermission> addList = createVolumePermission.getAdd();
                int addListIndex = 1;
                for (CreateVolumePermission addListValue : addList) {
                    if (addListValue != null) {
                        if (addListValue.getUserId() != null) {
                            request.addParameter("CreateVolumePermission.Add." + addListIndex + ".UserId", StringUtils.fromString(addListValue.getUserId()));
                        }
                    }
                    if (addListValue != null) {
                        if (addListValue.getGroup() != null) {
                            request.addParameter("CreateVolumePermission.Add." + addListIndex + ".Group", StringUtils.fromString(addListValue.getGroup()));
                        }
                    }

                    addListIndex++;
                }
            }

            if (createVolumePermission != null) {
                java.util.List<CreateVolumePermission> removeList = createVolumePermission.getRemove();
                int removeListIndex = 1;
                for (CreateVolumePermission removeListValue : removeList) {
                    if (removeListValue != null) {
                        if (removeListValue.getUserId() != null) {
                            request.addParameter("CreateVolumePermission.Remove." + removeListIndex + ".UserId", StringUtils.fromString(removeListValue.getUserId()));
                        }
                    }
                    if (removeListValue != null) {
                        if (removeListValue.getGroup() != null) {
                            request.addParameter("CreateVolumePermission.Remove." + removeListIndex + ".Group", StringUtils.fromString(removeListValue.getGroup()));
                        }
                    }

                    removeListIndex++;
                }
            }
        }


        return request;
    }
}
