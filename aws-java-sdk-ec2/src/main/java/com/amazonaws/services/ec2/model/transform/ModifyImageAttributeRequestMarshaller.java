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
 * ModifyImageAttributeRequest Marshaller
 */

public class ModifyImageAttributeRequestMarshaller
        implements
        Marshaller<Request<ModifyImageAttributeRequest>, ModifyImageAttributeRequest> {

    public Request<ModifyImageAttributeRequest> marshall(
            ModifyImageAttributeRequest modifyImageAttributeRequest) {

        if (modifyImageAttributeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyImageAttributeRequest> request = new DefaultRequest<ModifyImageAttributeRequest>(
                modifyImageAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyImageAttribute");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyImageAttributeRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils
                    .fromString(modifyImageAttributeRequest.getImageId()));
        }

        if (modifyImageAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils
                    .fromString(modifyImageAttributeRequest.getAttribute()));
        }

        if (modifyImageAttributeRequest.getOperationType() != null) {
            request.addParameter("OperationType", StringUtils
                    .fromString(modifyImageAttributeRequest.getOperationType()));
        }

        com.amazonaws.internal.SdkInternalList<String> userIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyImageAttributeRequest
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

        com.amazonaws.internal.SdkInternalList<String> userGroupsList = (com.amazonaws.internal.SdkInternalList<String>) modifyImageAttributeRequest
                .getUserGroups();
        if (!userGroupsList.isEmpty() || !userGroupsList.isAutoConstruct()) {
            int userGroupsListIndex = 1;

            for (String userGroupsListValue : userGroupsList) {
                if (userGroupsListValue != null) {
                    request.addParameter("UserGroup." + userGroupsListIndex,
                            StringUtils.fromString(userGroupsListValue));
                }
                userGroupsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> productCodesList = (com.amazonaws.internal.SdkInternalList<String>) modifyImageAttributeRequest
                .getProductCodes();
        if (!productCodesList.isEmpty() || !productCodesList.isAutoConstruct()) {
            int productCodesListIndex = 1;

            for (String productCodesListValue : productCodesList) {
                if (productCodesListValue != null) {
                    request.addParameter(
                            "ProductCode." + productCodesListIndex,
                            StringUtils.fromString(productCodesListValue));
                }
                productCodesListIndex++;
            }
        }

        if (modifyImageAttributeRequest.getValue() != null) {
            request.addParameter("Value", StringUtils
                    .fromString(modifyImageAttributeRequest.getValue()));
        }

        LaunchPermissionModifications launchPermission = modifyImageAttributeRequest
                .getLaunchPermission();
        if (launchPermission != null) {

            com.amazonaws.internal.SdkInternalList<LaunchPermission> addList = (com.amazonaws.internal.SdkInternalList<LaunchPermission>) launchPermission
                    .getAdd();
            if (!addList.isEmpty() || !addList.isAutoConstruct()) {
                int addListIndex = 1;

                for (LaunchPermission addListValue : addList) {

                    if (addListValue.getUserId() != null) {
                        request.addParameter("LaunchPermission.Add."
                                + addListIndex + ".UserId", StringUtils
                                .fromString(addListValue.getUserId()));
                    }

                    if (addListValue.getGroup() != null) {
                        request.addParameter("LaunchPermission.Add."
                                + addListIndex + ".Group",
                                StringUtils.fromString(addListValue.getGroup()));
                    }
                    addListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<LaunchPermission> removeList = (com.amazonaws.internal.SdkInternalList<LaunchPermission>) launchPermission
                    .getRemove();
            if (!removeList.isEmpty() || !removeList.isAutoConstruct()) {
                int removeListIndex = 1;

                for (LaunchPermission removeListValue : removeList) {

                    if (removeListValue.getUserId() != null) {
                        request.addParameter("LaunchPermission.Remove."
                                + removeListIndex + ".UserId", StringUtils
                                .fromString(removeListValue.getUserId()));
                    }

                    if (removeListValue.getGroup() != null) {
                        request.addParameter("LaunchPermission.Remove."
                                + removeListIndex + ".Group", StringUtils
                                .fromString(removeListValue.getGroup()));
                    }
                    removeListIndex++;
                }
            }
        }

        if (modifyImageAttributeRequest.getDescription() != null) {
            request.addParameter("Description.Value", StringUtils
                    .fromString(modifyImageAttributeRequest.getDescription()));
        }

        return request;
    }

}
