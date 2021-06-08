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
package com.amazonaws.services.neptune.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyDBClusterEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBClusterEndpointRequestMarshaller implements Marshaller<Request<ModifyDBClusterEndpointRequest>, ModifyDBClusterEndpointRequest> {

    public Request<ModifyDBClusterEndpointRequest> marshall(ModifyDBClusterEndpointRequest modifyDBClusterEndpointRequest) {

        if (modifyDBClusterEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBClusterEndpointRequest> request = new DefaultRequest<ModifyDBClusterEndpointRequest>(modifyDBClusterEndpointRequest, "AmazonNeptune");
        request.addParameter("Action", "ModifyDBClusterEndpoint");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBClusterEndpointRequest.getDBClusterEndpointIdentifier() != null) {
            request.addParameter("DBClusterEndpointIdentifier", StringUtils.fromString(modifyDBClusterEndpointRequest.getDBClusterEndpointIdentifier()));
        }

        if (modifyDBClusterEndpointRequest.getEndpointType() != null) {
            request.addParameter("EndpointType", StringUtils.fromString(modifyDBClusterEndpointRequest.getEndpointType()));
        }

        if (modifyDBClusterEndpointRequest.getStaticMembers() != null) {
            java.util.List<String> staticMembersList = modifyDBClusterEndpointRequest.getStaticMembers();
            if (staticMembersList.isEmpty()) {
                request.addParameter("StaticMembers", "");
            } else {
                int staticMembersListIndex = 1;

                for (String staticMembersListValue : staticMembersList) {
                    if (staticMembersListValue != null) {
                        request.addParameter("StaticMembers.member." + staticMembersListIndex, StringUtils.fromString(staticMembersListValue));
                    }
                    staticMembersListIndex++;
                }
            }
        }

        if (modifyDBClusterEndpointRequest.getExcludedMembers() != null) {
            java.util.List<String> excludedMembersList = modifyDBClusterEndpointRequest.getExcludedMembers();
            if (excludedMembersList.isEmpty()) {
                request.addParameter("ExcludedMembers", "");
            } else {
                int excludedMembersListIndex = 1;

                for (String excludedMembersListValue : excludedMembersList) {
                    if (excludedMembersListValue != null) {
                        request.addParameter("ExcludedMembers.member." + excludedMembersListIndex, StringUtils.fromString(excludedMembersListValue));
                    }
                    excludedMembersListIndex++;
                }
            }
        }

        return request;
    }

}
