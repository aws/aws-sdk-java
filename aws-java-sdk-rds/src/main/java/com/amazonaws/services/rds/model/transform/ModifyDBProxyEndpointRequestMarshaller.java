/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyDBProxyEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBProxyEndpointRequestMarshaller implements Marshaller<Request<ModifyDBProxyEndpointRequest>, ModifyDBProxyEndpointRequest> {

    public Request<ModifyDBProxyEndpointRequest> marshall(ModifyDBProxyEndpointRequest modifyDBProxyEndpointRequest) {

        if (modifyDBProxyEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBProxyEndpointRequest> request = new DefaultRequest<ModifyDBProxyEndpointRequest>(modifyDBProxyEndpointRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBProxyEndpoint");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBProxyEndpointRequest.getDBProxyEndpointName() != null) {
            request.addParameter("DBProxyEndpointName", StringUtils.fromString(modifyDBProxyEndpointRequest.getDBProxyEndpointName()));
        }

        if (modifyDBProxyEndpointRequest.getNewDBProxyEndpointName() != null) {
            request.addParameter("NewDBProxyEndpointName", StringUtils.fromString(modifyDBProxyEndpointRequest.getNewDBProxyEndpointName()));
        }

        if (!modifyDBProxyEndpointRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyDBProxyEndpointRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyDBProxyEndpointRequest
                    .getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsListIndex = 1;

            for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                if (vpcSecurityGroupIdsListValue != null) {
                    request.addParameter("VpcSecurityGroupIds.member." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
                }
                vpcSecurityGroupIdsListIndex++;
            }
        }

        return request;
    }

}
