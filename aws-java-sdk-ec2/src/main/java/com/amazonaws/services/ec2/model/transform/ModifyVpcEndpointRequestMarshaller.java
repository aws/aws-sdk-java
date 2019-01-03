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
 * ModifyVpcEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcEndpointRequestMarshaller implements Marshaller<Request<ModifyVpcEndpointRequest>, ModifyVpcEndpointRequest> {

    public Request<ModifyVpcEndpointRequest> marshall(ModifyVpcEndpointRequest modifyVpcEndpointRequest) {

        if (modifyVpcEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpcEndpointRequest> request = new DefaultRequest<ModifyVpcEndpointRequest>(modifyVpcEndpointRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVpcEndpoint");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVpcEndpointRequest.getVpcEndpointId() != null) {
            request.addParameter("VpcEndpointId", StringUtils.fromString(modifyVpcEndpointRequest.getVpcEndpointId()));
        }

        if (modifyVpcEndpointRequest.getResetPolicy() != null) {
            request.addParameter("ResetPolicy", StringUtils.fromBoolean(modifyVpcEndpointRequest.getResetPolicy()));
        }

        if (modifyVpcEndpointRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(modifyVpcEndpointRequest.getPolicyDocument()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointRequestAddRouteTableIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointRequest
                .getAddRouteTableIds();
        if (!modifyVpcEndpointRequestAddRouteTableIdsList.isEmpty() || !modifyVpcEndpointRequestAddRouteTableIdsList.isAutoConstruct()) {
            int addRouteTableIdsListIndex = 1;

            for (String modifyVpcEndpointRequestAddRouteTableIdsListValue : modifyVpcEndpointRequestAddRouteTableIdsList) {
                if (modifyVpcEndpointRequestAddRouteTableIdsListValue != null) {
                    request.addParameter("AddRouteTableId." + addRouteTableIdsListIndex,
                            StringUtils.fromString(modifyVpcEndpointRequestAddRouteTableIdsListValue));
                }
                addRouteTableIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointRequestRemoveRouteTableIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointRequest
                .getRemoveRouteTableIds();
        if (!modifyVpcEndpointRequestRemoveRouteTableIdsList.isEmpty() || !modifyVpcEndpointRequestRemoveRouteTableIdsList.isAutoConstruct()) {
            int removeRouteTableIdsListIndex = 1;

            for (String modifyVpcEndpointRequestRemoveRouteTableIdsListValue : modifyVpcEndpointRequestRemoveRouteTableIdsList) {
                if (modifyVpcEndpointRequestRemoveRouteTableIdsListValue != null) {
                    request.addParameter("RemoveRouteTableId." + removeRouteTableIdsListIndex,
                            StringUtils.fromString(modifyVpcEndpointRequestRemoveRouteTableIdsListValue));
                }
                removeRouteTableIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointRequestAddSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointRequest
                .getAddSubnetIds();
        if (!modifyVpcEndpointRequestAddSubnetIdsList.isEmpty() || !modifyVpcEndpointRequestAddSubnetIdsList.isAutoConstruct()) {
            int addSubnetIdsListIndex = 1;

            for (String modifyVpcEndpointRequestAddSubnetIdsListValue : modifyVpcEndpointRequestAddSubnetIdsList) {
                if (modifyVpcEndpointRequestAddSubnetIdsListValue != null) {
                    request.addParameter("AddSubnetId." + addSubnetIdsListIndex, StringUtils.fromString(modifyVpcEndpointRequestAddSubnetIdsListValue));
                }
                addSubnetIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointRequestRemoveSubnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointRequest
                .getRemoveSubnetIds();
        if (!modifyVpcEndpointRequestRemoveSubnetIdsList.isEmpty() || !modifyVpcEndpointRequestRemoveSubnetIdsList.isAutoConstruct()) {
            int removeSubnetIdsListIndex = 1;

            for (String modifyVpcEndpointRequestRemoveSubnetIdsListValue : modifyVpcEndpointRequestRemoveSubnetIdsList) {
                if (modifyVpcEndpointRequestRemoveSubnetIdsListValue != null) {
                    request.addParameter("RemoveSubnetId." + removeSubnetIdsListIndex, StringUtils.fromString(modifyVpcEndpointRequestRemoveSubnetIdsListValue));
                }
                removeSubnetIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointRequestAddSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointRequest
                .getAddSecurityGroupIds();
        if (!modifyVpcEndpointRequestAddSecurityGroupIdsList.isEmpty() || !modifyVpcEndpointRequestAddSecurityGroupIdsList.isAutoConstruct()) {
            int addSecurityGroupIdsListIndex = 1;

            for (String modifyVpcEndpointRequestAddSecurityGroupIdsListValue : modifyVpcEndpointRequestAddSecurityGroupIdsList) {
                if (modifyVpcEndpointRequestAddSecurityGroupIdsListValue != null) {
                    request.addParameter("AddSecurityGroupId." + addSecurityGroupIdsListIndex,
                            StringUtils.fromString(modifyVpcEndpointRequestAddSecurityGroupIdsListValue));
                }
                addSecurityGroupIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyVpcEndpointRequestRemoveSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyVpcEndpointRequest
                .getRemoveSecurityGroupIds();
        if (!modifyVpcEndpointRequestRemoveSecurityGroupIdsList.isEmpty() || !modifyVpcEndpointRequestRemoveSecurityGroupIdsList.isAutoConstruct()) {
            int removeSecurityGroupIdsListIndex = 1;

            for (String modifyVpcEndpointRequestRemoveSecurityGroupIdsListValue : modifyVpcEndpointRequestRemoveSecurityGroupIdsList) {
                if (modifyVpcEndpointRequestRemoveSecurityGroupIdsListValue != null) {
                    request.addParameter("RemoveSecurityGroupId." + removeSecurityGroupIdsListIndex,
                            StringUtils.fromString(modifyVpcEndpointRequestRemoveSecurityGroupIdsListValue));
                }
                removeSecurityGroupIdsListIndex++;
            }
        }

        if (modifyVpcEndpointRequest.getPrivateDnsEnabled() != null) {
            request.addParameter("PrivateDnsEnabled", StringUtils.fromBoolean(modifyVpcEndpointRequest.getPrivateDnsEnabled()));
        }

        return request;
    }

}
