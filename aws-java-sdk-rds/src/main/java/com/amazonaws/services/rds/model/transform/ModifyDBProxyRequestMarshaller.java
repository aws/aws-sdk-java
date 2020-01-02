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
 * ModifyDBProxyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBProxyRequestMarshaller implements Marshaller<Request<ModifyDBProxyRequest>, ModifyDBProxyRequest> {

    public Request<ModifyDBProxyRequest> marshall(ModifyDBProxyRequest modifyDBProxyRequest) {

        if (modifyDBProxyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBProxyRequest> request = new DefaultRequest<ModifyDBProxyRequest>(modifyDBProxyRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBProxy");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBProxyRequest.getDBProxyName() != null) {
            request.addParameter("DBProxyName", StringUtils.fromString(modifyDBProxyRequest.getDBProxyName()));
        }

        if (modifyDBProxyRequest.getNewDBProxyName() != null) {
            request.addParameter("NewDBProxyName", StringUtils.fromString(modifyDBProxyRequest.getNewDBProxyName()));
        }

        if (!modifyDBProxyRequest.getAuth().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<UserAuthConfig>) modifyDBProxyRequest.getAuth()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<UserAuthConfig> authList = (com.amazonaws.internal.SdkInternalList<UserAuthConfig>) modifyDBProxyRequest
                    .getAuth();
            int authListIndex = 1;

            for (UserAuthConfig authListValue : authList) {

                if (authListValue.getDescription() != null) {
                    request.addParameter("Auth.member." + authListIndex + ".Description", StringUtils.fromString(authListValue.getDescription()));
                }

                if (authListValue.getUserName() != null) {
                    request.addParameter("Auth.member." + authListIndex + ".UserName", StringUtils.fromString(authListValue.getUserName()));
                }

                if (authListValue.getAuthScheme() != null) {
                    request.addParameter("Auth.member." + authListIndex + ".AuthScheme", StringUtils.fromString(authListValue.getAuthScheme()));
                }

                if (authListValue.getSecretArn() != null) {
                    request.addParameter("Auth.member." + authListIndex + ".SecretArn", StringUtils.fromString(authListValue.getSecretArn()));
                }

                if (authListValue.getIAMAuth() != null) {
                    request.addParameter("Auth.member." + authListIndex + ".IAMAuth", StringUtils.fromString(authListValue.getIAMAuth()));
                }
                authListIndex++;
            }
        }

        if (modifyDBProxyRequest.getRequireTLS() != null) {
            request.addParameter("RequireTLS", StringUtils.fromBoolean(modifyDBProxyRequest.getRequireTLS()));
        }

        if (modifyDBProxyRequest.getIdleClientTimeout() != null) {
            request.addParameter("IdleClientTimeout", StringUtils.fromInteger(modifyDBProxyRequest.getIdleClientTimeout()));
        }

        if (modifyDBProxyRequest.getDebugLogging() != null) {
            request.addParameter("DebugLogging", StringUtils.fromBoolean(modifyDBProxyRequest.getDebugLogging()));
        }

        if (modifyDBProxyRequest.getRoleArn() != null) {
            request.addParameter("RoleArn", StringUtils.fromString(modifyDBProxyRequest.getRoleArn()));
        }

        if (!modifyDBProxyRequest.getSecurityGroups().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyDBProxyRequest.getSecurityGroups()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> securityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) modifyDBProxyRequest
                    .getSecurityGroups();
            int securityGroupsListIndex = 1;

            for (String securityGroupsListValue : securityGroupsList) {
                if (securityGroupsListValue != null) {
                    request.addParameter("SecurityGroups.member." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                }
                securityGroupsListIndex++;
            }
        }

        return request;
    }

}
