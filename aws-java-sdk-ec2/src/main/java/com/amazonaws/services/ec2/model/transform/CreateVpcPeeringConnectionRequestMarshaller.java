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
 * CreateVpcPeeringConnectionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcPeeringConnectionRequestMarshaller implements Marshaller<Request<CreateVpcPeeringConnectionRequest>, CreateVpcPeeringConnectionRequest> {

    public Request<CreateVpcPeeringConnectionRequest> marshall(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest) {

        if (createVpcPeeringConnectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpcPeeringConnectionRequest> request = new DefaultRequest<CreateVpcPeeringConnectionRequest>(createVpcPeeringConnectionRequest,
                "AmazonEC2");
        request.addParameter("Action", "CreateVpcPeeringConnection");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVpcPeeringConnectionRequest.getPeerOwnerId() != null) {
            request.addParameter("PeerOwnerId", StringUtils.fromString(createVpcPeeringConnectionRequest.getPeerOwnerId()));
        }

        if (createVpcPeeringConnectionRequest.getPeerVpcId() != null) {
            request.addParameter("PeerVpcId", StringUtils.fromString(createVpcPeeringConnectionRequest.getPeerVpcId()));
        }

        if (createVpcPeeringConnectionRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(createVpcPeeringConnectionRequest.getVpcId()));
        }

        if (createVpcPeeringConnectionRequest.getPeerRegion() != null) {
            request.addParameter("PeerRegion", StringUtils.fromString(createVpcPeeringConnectionRequest.getPeerRegion()));
        }

        return request;
    }

}
