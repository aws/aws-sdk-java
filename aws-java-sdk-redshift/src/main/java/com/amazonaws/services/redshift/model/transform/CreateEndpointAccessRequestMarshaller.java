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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateEndpointAccessRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointAccessRequestMarshaller implements Marshaller<Request<CreateEndpointAccessRequest>, CreateEndpointAccessRequest> {

    public Request<CreateEndpointAccessRequest> marshall(CreateEndpointAccessRequest createEndpointAccessRequest) {

        if (createEndpointAccessRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateEndpointAccessRequest> request = new DefaultRequest<CreateEndpointAccessRequest>(createEndpointAccessRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateEndpointAccess");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createEndpointAccessRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(createEndpointAccessRequest.getClusterIdentifier()));
        }

        if (createEndpointAccessRequest.getResourceOwner() != null) {
            request.addParameter("ResourceOwner", StringUtils.fromString(createEndpointAccessRequest.getResourceOwner()));
        }

        if (createEndpointAccessRequest.getEndpointName() != null) {
            request.addParameter("EndpointName", StringUtils.fromString(createEndpointAccessRequest.getEndpointName()));
        }

        if (createEndpointAccessRequest.getSubnetGroupName() != null) {
            request.addParameter("SubnetGroupName", StringUtils.fromString(createEndpointAccessRequest.getSubnetGroupName()));
        }

        if (!createEndpointAccessRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createEndpointAccessRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createEndpointAccessRequest
                    .getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsListIndex = 1;

            for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                if (vpcSecurityGroupIdsListValue != null) {
                    request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex,
                            StringUtils.fromString(vpcSecurityGroupIdsListValue));
                }
                vpcSecurityGroupIdsListIndex++;
            }
        }

        return request;
    }

}
