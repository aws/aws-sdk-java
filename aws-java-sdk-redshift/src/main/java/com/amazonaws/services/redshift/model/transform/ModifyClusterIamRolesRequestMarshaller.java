/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ModifyClusterIamRolesRequest Marshaller
 */

public class ModifyClusterIamRolesRequestMarshaller implements Marshaller<Request<ModifyClusterIamRolesRequest>, ModifyClusterIamRolesRequest> {

    public Request<ModifyClusterIamRolesRequest> marshall(ModifyClusterIamRolesRequest modifyClusterIamRolesRequest) {

        if (modifyClusterIamRolesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyClusterIamRolesRequest> request = new DefaultRequest<ModifyClusterIamRolesRequest>(modifyClusterIamRolesRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyClusterIamRoles");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyClusterIamRolesRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(modifyClusterIamRolesRequest.getClusterIdentifier()));
        }

        com.amazonaws.internal.SdkInternalList<String> addIamRolesList = (com.amazonaws.internal.SdkInternalList<String>) modifyClusterIamRolesRequest
                .getAddIamRoles();
        if (!addIamRolesList.isEmpty() || !addIamRolesList.isAutoConstruct()) {
            int addIamRolesListIndex = 1;

            for (String addIamRolesListValue : addIamRolesList) {
                if (addIamRolesListValue != null) {
                    request.addParameter("AddIamRoles.IamRoleArn." + addIamRolesListIndex, StringUtils.fromString(addIamRolesListValue));
                }
                addIamRolesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> removeIamRolesList = (com.amazonaws.internal.SdkInternalList<String>) modifyClusterIamRolesRequest
                .getRemoveIamRoles();
        if (!removeIamRolesList.isEmpty() || !removeIamRolesList.isAutoConstruct()) {
            int removeIamRolesListIndex = 1;

            for (String removeIamRolesListValue : removeIamRolesList) {
                if (removeIamRolesListValue != null) {
                    request.addParameter("RemoveIamRoles.IamRoleArn." + removeIamRolesListIndex, StringUtils.fromString(removeIamRolesListValue));
                }
                removeIamRolesListIndex++;
            }
        }

        return request;
    }

}
