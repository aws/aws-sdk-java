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
 * CreateDBProxyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBProxyRequestMarshaller implements Marshaller<Request<CreateDBProxyRequest>, CreateDBProxyRequest> {

    public Request<CreateDBProxyRequest> marshall(CreateDBProxyRequest createDBProxyRequest) {

        if (createDBProxyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBProxyRequest> request = new DefaultRequest<CreateDBProxyRequest>(createDBProxyRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBProxy");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBProxyRequest.getDBProxyName() != null) {
            request.addParameter("DBProxyName", StringUtils.fromString(createDBProxyRequest.getDBProxyName()));
        }

        if (createDBProxyRequest.getEngineFamily() != null) {
            request.addParameter("EngineFamily", StringUtils.fromString(createDBProxyRequest.getEngineFamily()));
        }

        if (!createDBProxyRequest.getAuth().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<UserAuthConfig>) createDBProxyRequest.getAuth()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<UserAuthConfig> authList = (com.amazonaws.internal.SdkInternalList<UserAuthConfig>) createDBProxyRequest
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

        if (createDBProxyRequest.getRoleArn() != null) {
            request.addParameter("RoleArn", StringUtils.fromString(createDBProxyRequest.getRoleArn()));
        }

        if (!createDBProxyRequest.getVpcSubnetIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createDBProxyRequest.getVpcSubnetIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) createDBProxyRequest
                    .getVpcSubnetIds();
            int vpcSubnetIdsListIndex = 1;

            for (String vpcSubnetIdsListValue : vpcSubnetIdsList) {
                if (vpcSubnetIdsListValue != null) {
                    request.addParameter("VpcSubnetIds.member." + vpcSubnetIdsListIndex, StringUtils.fromString(vpcSubnetIdsListValue));
                }
                vpcSubnetIdsListIndex++;
            }
        }

        if (!createDBProxyRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createDBProxyRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createDBProxyRequest
                    .getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsListIndex = 1;

            for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                if (vpcSecurityGroupIdsListValue != null) {
                    request.addParameter("VpcSecurityGroupIds.member." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
                }
                vpcSecurityGroupIdsListIndex++;
            }
        }

        if (createDBProxyRequest.getRequireTLS() != null) {
            request.addParameter("RequireTLS", StringUtils.fromBoolean(createDBProxyRequest.getRequireTLS()));
        }

        if (createDBProxyRequest.getIdleClientTimeout() != null) {
            request.addParameter("IdleClientTimeout", StringUtils.fromInteger(createDBProxyRequest.getIdleClientTimeout()));
        }

        if (createDBProxyRequest.getDebugLogging() != null) {
            request.addParameter("DebugLogging", StringUtils.fromBoolean(createDBProxyRequest.getDebugLogging()));
        }

        if (!createDBProxyRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) createDBProxyRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createDBProxyRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
