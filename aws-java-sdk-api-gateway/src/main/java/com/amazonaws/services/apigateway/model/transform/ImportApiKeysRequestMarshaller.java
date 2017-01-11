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
package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ImportApiKeysRequest Marshaller
 */
public class ImportApiKeysRequestMarshaller implements Marshaller<Request<ImportApiKeysRequest>, ImportApiKeysRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ImportApiKeysRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ImportApiKeysRequest> marshall(ImportApiKeysRequest importApiKeysRequest) {

        if (importApiKeysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportApiKeysRequest> request = new DefaultRequest<ImportApiKeysRequest>(importApiKeysRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apikeys?mode=import";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        if (importApiKeysRequest.getFormat() != null) {
            request.addParameter("format", StringUtils.fromString(importApiKeysRequest.getFormat()));
        }

        if (importApiKeysRequest.getFailOnWarnings() != null) {
            request.addParameter("failonwarnings", StringUtils.fromBoolean(importApiKeysRequest.getFailOnWarnings()));
        }

        request.setContent(BinaryUtils.toStream(importApiKeysRequest.getBody()));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
