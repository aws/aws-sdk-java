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
 * CreateDBProxyEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBProxyEndpointRequestMarshaller implements Marshaller<Request<CreateDBProxyEndpointRequest>, CreateDBProxyEndpointRequest> {

    public Request<CreateDBProxyEndpointRequest> marshall(CreateDBProxyEndpointRequest createDBProxyEndpointRequest) {

        if (createDBProxyEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBProxyEndpointRequest> request = new DefaultRequest<CreateDBProxyEndpointRequest>(createDBProxyEndpointRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBProxyEndpoint");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBProxyEndpointRequest.getDBProxyName() != null) {
            request.addParameter("DBProxyName", StringUtils.fromString(createDBProxyEndpointRequest.getDBProxyName()));
        }

        if (createDBProxyEndpointRequest.getDBProxyEndpointName() != null) {
            request.addParameter("DBProxyEndpointName", StringUtils.fromString(createDBProxyEndpointRequest.getDBProxyEndpointName()));
        }

        if (!createDBProxyEndpointRequest.getVpcSubnetIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createDBProxyEndpointRequest.getVpcSubnetIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) createDBProxyEndpointRequest
                    .getVpcSubnetIds();
            int vpcSubnetIdsListIndex = 1;

            for (String vpcSubnetIdsListValue : vpcSubnetIdsList) {
                if (vpcSubnetIdsListValue != null) {
                    request.addParameter("VpcSubnetIds.member." + vpcSubnetIdsListIndex, StringUtils.fromString(vpcSubnetIdsListValue));
                }
                vpcSubnetIdsListIndex++;
            }
        }

        if (!createDBProxyEndpointRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createDBProxyEndpointRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createDBProxyEndpointRequest
                    .getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsListIndex = 1;

            for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                if (vpcSecurityGroupIdsListValue != null) {
                    request.addParameter("VpcSecurityGroupIds.member." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
                }
                vpcSecurityGroupIdsListIndex++;
            }
        }

        if (createDBProxyEndpointRequest.getTargetRole() != null) {
            request.addParameter("TargetRole", StringUtils.fromString(createDBProxyEndpointRequest.getTargetRole()));
        }

        if (!createDBProxyEndpointRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createDBProxyEndpointRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createDBProxyEndpointRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
