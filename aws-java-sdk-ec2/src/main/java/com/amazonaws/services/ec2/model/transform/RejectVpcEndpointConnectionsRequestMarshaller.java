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
 * RejectVpcEndpointConnectionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectVpcEndpointConnectionsRequestMarshaller implements
        Marshaller<Request<RejectVpcEndpointConnectionsRequest>, RejectVpcEndpointConnectionsRequest> {

    public Request<RejectVpcEndpointConnectionsRequest> marshall(RejectVpcEndpointConnectionsRequest rejectVpcEndpointConnectionsRequest) {

        if (rejectVpcEndpointConnectionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RejectVpcEndpointConnectionsRequest> request = new DefaultRequest<RejectVpcEndpointConnectionsRequest>(rejectVpcEndpointConnectionsRequest,
                "AmazonEC2");
        request.addParameter("Action", "RejectVpcEndpointConnections");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (rejectVpcEndpointConnectionsRequest.getServiceId() != null) {
            request.addParameter("ServiceId", StringUtils.fromString(rejectVpcEndpointConnectionsRequest.getServiceId()));
        }

        com.amazonaws.internal.SdkInternalList<String> rejectVpcEndpointConnectionsRequestVpcEndpointIdsList = (com.amazonaws.internal.SdkInternalList<String>) rejectVpcEndpointConnectionsRequest
                .getVpcEndpointIds();
        if (!rejectVpcEndpointConnectionsRequestVpcEndpointIdsList.isEmpty() || !rejectVpcEndpointConnectionsRequestVpcEndpointIdsList.isAutoConstruct()) {
            int vpcEndpointIdsListIndex = 1;

            for (String rejectVpcEndpointConnectionsRequestVpcEndpointIdsListValue : rejectVpcEndpointConnectionsRequestVpcEndpointIdsList) {
                if (rejectVpcEndpointConnectionsRequestVpcEndpointIdsListValue != null) {
                    request.addParameter("VpcEndpointId." + vpcEndpointIdsListIndex,
                            StringUtils.fromString(rejectVpcEndpointConnectionsRequestVpcEndpointIdsListValue));
                }
                vpcEndpointIdsListIndex++;
            }
        }

        return request;
    }

}
