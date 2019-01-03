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
 * GetStreamingDistributionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStreamingDistributionRequestMarshaller implements Marshaller<Request<GetStreamingDistributionRequest>, GetStreamingDistributionRequest> {

    public Request<GetStreamingDistributionRequest> marshall(GetStreamingDistributionRequest getStreamingDistributionRequest) {

        if (getStreamingDistributionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetStreamingDistributionRequest> request = new DefaultRequest<GetStreamingDistributionRequest>(getStreamingDistributionRequest,
                "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2018-11-05/streaming-distribution/{Id}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", getStreamingDistributionRequest.getId());
        request.setResourcePath(uriResourcePath);

        return request;
    }

}
