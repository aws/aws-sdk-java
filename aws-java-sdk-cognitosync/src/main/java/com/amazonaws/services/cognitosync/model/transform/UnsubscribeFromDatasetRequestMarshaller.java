/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * UnsubscribeFromDatasetRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsubscribeFromDatasetRequestMarshaller implements Marshaller<Request<UnsubscribeFromDatasetRequest>, UnsubscribeFromDatasetRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UnsubscribeFromDatasetRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UnsubscribeFromDatasetRequest> marshall(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest) {

        if (unsubscribeFromDatasetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UnsubscribeFromDatasetRequest> request = new DefaultRequest<UnsubscribeFromDatasetRequest>(unsubscribeFromDatasetRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "IdentityPoolId",
                unsubscribeFromDatasetRequest.getIdentityPoolId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "IdentityId",
                unsubscribeFromDatasetRequest.getIdentityId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "DatasetName",
                unsubscribeFromDatasetRequest.getDatasetName());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "DeviceId", unsubscribeFromDatasetRequest.getDeviceId());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
