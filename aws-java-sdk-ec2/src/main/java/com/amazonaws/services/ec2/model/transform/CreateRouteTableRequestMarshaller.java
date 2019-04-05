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
 * CreateRouteTableRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteTableRequestMarshaller implements Marshaller<Request<CreateRouteTableRequest>, CreateRouteTableRequest> {

    public Request<CreateRouteTableRequest> marshall(CreateRouteTableRequest createRouteTableRequest) {

        if (createRouteTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRouteTableRequest> request = new DefaultRequest<CreateRouteTableRequest>(createRouteTableRequest, "AmazonEC2");
        request.addParameter("Action", "CreateRouteTable");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createRouteTableRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(createRouteTableRequest.getVpcId()));
        }

        return request;
    }

}
