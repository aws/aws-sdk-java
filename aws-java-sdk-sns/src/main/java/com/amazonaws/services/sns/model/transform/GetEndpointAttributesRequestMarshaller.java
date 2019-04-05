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
package com.amazonaws.services.sns.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetEndpointAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEndpointAttributesRequestMarshaller implements Marshaller<Request<GetEndpointAttributesRequest>, GetEndpointAttributesRequest> {

    public Request<GetEndpointAttributesRequest> marshall(GetEndpointAttributesRequest getEndpointAttributesRequest) {

        if (getEndpointAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetEndpointAttributesRequest> request = new DefaultRequest<GetEndpointAttributesRequest>(getEndpointAttributesRequest, "AmazonSNS");
        request.addParameter("Action", "GetEndpointAttributes");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (getEndpointAttributesRequest.getEndpointArn() != null) {
            request.addParameter("EndpointArn", StringUtils.fromString(getEndpointAttributesRequest.getEndpointArn()));
        }

        return request;
    }

}
