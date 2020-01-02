/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyDBProxyTargetGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBProxyTargetGroupRequestMarshaller implements Marshaller<Request<ModifyDBProxyTargetGroupRequest>, ModifyDBProxyTargetGroupRequest> {

    public Request<ModifyDBProxyTargetGroupRequest> marshall(ModifyDBProxyTargetGroupRequest modifyDBProxyTargetGroupRequest) {

        if (modifyDBProxyTargetGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBProxyTargetGroupRequest> request = new DefaultRequest<ModifyDBProxyTargetGroupRequest>(modifyDBProxyTargetGroupRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBProxyTargetGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBProxyTargetGroupRequest.getTargetGroupName() != null) {
            request.addParameter("TargetGroupName", StringUtils.fromString(modifyDBProxyTargetGroupRequest.getTargetGroupName()));
        }

        if (modifyDBProxyTargetGroupRequest.getDBProxyName() != null) {
            request.addParameter("DBProxyName", StringUtils.fromString(modifyDBProxyTargetGroupRequest.getDBProxyName()));
        }

        {
            ConnectionPoolConfiguration connectionPoolConfig = modifyDBProxyTargetGroupRequest.getConnectionPoolConfig();
            if (connectionPoolConfig != null) {

                if (connectionPoolConfig.getMaxConnectionsPercent() != null) {
                    request.addParameter("ConnectionPoolConfig.MaxConnectionsPercent", StringUtils.fromInteger(connectionPoolConfig.getMaxConnectionsPercent()));
                }

                if (connectionPoolConfig.getMaxIdleConnectionsPercent() != null) {
                    request.addParameter("ConnectionPoolConfig.MaxIdleConnectionsPercent",
                            StringUtils.fromInteger(connectionPoolConfig.getMaxIdleConnectionsPercent()));
                }

                if (connectionPoolConfig.getConnectionBorrowTimeout() != null) {
                    request.addParameter("ConnectionPoolConfig.ConnectionBorrowTimeout",
                            StringUtils.fromInteger(connectionPoolConfig.getConnectionBorrowTimeout()));
                }

                if (!connectionPoolConfig.getSessionPinningFilters().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) connectionPoolConfig.getSessionPinningFilters()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> sessionPinningFiltersList = (com.amazonaws.internal.SdkInternalList<String>) connectionPoolConfig
                            .getSessionPinningFilters();
                    int sessionPinningFiltersListIndex = 1;

                    for (String sessionPinningFiltersListValue : sessionPinningFiltersList) {
                        if (sessionPinningFiltersListValue != null) {
                            request.addParameter("ConnectionPoolConfig.SessionPinningFilters.member." + sessionPinningFiltersListIndex,
                                    StringUtils.fromString(sessionPinningFiltersListValue));
                        }
                        sessionPinningFiltersListIndex++;
                    }
                }

                if (connectionPoolConfig.getInitQuery() != null) {
                    request.addParameter("ConnectionPoolConfig.InitQuery", StringUtils.fromString(connectionPoolConfig.getInitQuery()));
                }
            }
        }

        if (modifyDBProxyTargetGroupRequest.getNewName() != null) {
            request.addParameter("NewName", StringUtils.fromString(modifyDBProxyTargetGroupRequest.getNewName()));
        }

        return request;
    }

}
