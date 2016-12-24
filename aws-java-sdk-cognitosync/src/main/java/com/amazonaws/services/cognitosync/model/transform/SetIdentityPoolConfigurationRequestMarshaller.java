/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * SetIdentityPoolConfigurationRequest Marshaller
 */
public class SetIdentityPoolConfigurationRequestMarshaller implements
        Marshaller<Request<SetIdentityPoolConfigurationRequest>, SetIdentityPoolConfigurationRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public SetIdentityPoolConfigurationRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SetIdentityPoolConfigurationRequest> marshall(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest) {

        if (setIdentityPoolConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetIdentityPoolConfigurationRequest> request = new DefaultRequest<SetIdentityPoolConfigurationRequest>(setIdentityPoolConfigurationRequest,
                "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/identitypools/{IdentityPoolId}/configuration";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "IdentityPoolId",
                setIdentityPoolConfigurationRequest.getIdentityPoolId());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (setIdentityPoolConfigurationRequest.getPushSync() != null) {
                jsonGenerator.writeFieldName("PushSync");
                PushSyncJsonMarshaller.getInstance().marshall(setIdentityPoolConfigurationRequest.getPushSync(), jsonGenerator);
            }
            if (setIdentityPoolConfigurationRequest.getCognitoStreams() != null) {
                jsonGenerator.writeFieldName("CognitoStreams");
                CognitoStreamsJsonMarshaller.getInstance().marshall(setIdentityPoolConfigurationRequest.getCognitoStreams(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
