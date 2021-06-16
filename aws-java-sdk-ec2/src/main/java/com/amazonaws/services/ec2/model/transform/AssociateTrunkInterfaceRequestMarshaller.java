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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * AssociateTrunkInterfaceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateTrunkInterfaceRequestMarshaller implements Marshaller<Request<AssociateTrunkInterfaceRequest>, AssociateTrunkInterfaceRequest> {

    public Request<AssociateTrunkInterfaceRequest> marshall(AssociateTrunkInterfaceRequest associateTrunkInterfaceRequest) {

        if (associateTrunkInterfaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateTrunkInterfaceRequest> request = new DefaultRequest<AssociateTrunkInterfaceRequest>(associateTrunkInterfaceRequest, "AmazonEC2");
        request.addParameter("Action", "AssociateTrunkInterface");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateTrunkInterfaceRequest.getBranchInterfaceId() != null) {
            request.addParameter("BranchInterfaceId", StringUtils.fromString(associateTrunkInterfaceRequest.getBranchInterfaceId()));
        }

        if (associateTrunkInterfaceRequest.getTrunkInterfaceId() != null) {
            request.addParameter("TrunkInterfaceId", StringUtils.fromString(associateTrunkInterfaceRequest.getTrunkInterfaceId()));
        }

        if (associateTrunkInterfaceRequest.getVlanId() != null) {
            request.addParameter("VlanId", StringUtils.fromInteger(associateTrunkInterfaceRequest.getVlanId()));
        }

        if (associateTrunkInterfaceRequest.getGreKey() != null) {
            request.addParameter("GreKey", StringUtils.fromInteger(associateTrunkInterfaceRequest.getGreKey()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(associateTrunkInterfaceRequest.getClientToken()));

        return request;
    }

}
