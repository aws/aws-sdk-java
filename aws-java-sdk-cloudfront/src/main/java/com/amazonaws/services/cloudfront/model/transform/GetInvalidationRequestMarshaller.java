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
package com.amazonaws.services.cloudfront.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

/**
 * GetInvalidationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInvalidationRequestMarshaller implements Marshaller<Request<GetInvalidationRequest>, GetInvalidationRequest> {

    public Request<GetInvalidationRequest> marshall(GetInvalidationRequest getInvalidationRequest) {

        if (getInvalidationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetInvalidationRequest> request = new DefaultRequest<GetInvalidationRequest>(getInvalidationRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2018-11-05/distribution/{DistributionId}/invalidation/{Id}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "DistributionId",
                getInvalidationRequest.getDistributionId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", getInvalidationRequest.getId());
        request.setResourcePath(uriResourcePath);

        return request;
    }

}
