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

import java.util.Map;

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
 * ImportRestApiRequest Marshaller
 */
public class ImportRestApiRequestMarshaller implements Marshaller<Request<ImportRestApiRequest>, ImportRestApiRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ImportRestApiRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ImportRestApiRequest> marshall(ImportRestApiRequest importRestApiRequest) {

        if (importRestApiRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportRestApiRequest> request = new DefaultRequest<ImportRestApiRequest>(importRestApiRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/restapis?mode=import";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        if (importRestApiRequest.getFailOnWarnings() != null) {
            request.addParameter("failonwarnings", StringUtils.fromBoolean(importRestApiRequest.getFailOnWarnings()));
        }

        java.util.Map<String, String> parameters = importRestApiRequest.getParameters();
        if (parameters != null) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                if (entry.getValue() != null) {
                    request.addParameter(StringUtils.fromString(entry.getKey()), StringUtils.fromString(entry.getValue()));
                }
            }
        }

        request.setContent(BinaryUtils.toStream(importRestApiRequest.getBody()));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
