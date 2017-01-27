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
package com.amazonaws.services.clouddirectory.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * PutSchemaFromJsonRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSchemaFromJsonRequestMarshaller implements Marshaller<Request<PutSchemaFromJsonRequest>, PutSchemaFromJsonRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PutSchemaFromJsonRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutSchemaFromJsonRequest> marshall(PutSchemaFromJsonRequest putSchemaFromJsonRequest) {

        if (putSchemaFromJsonRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutSchemaFromJsonRequest> request = new DefaultRequest<PutSchemaFromJsonRequest>(putSchemaFromJsonRequest, "AmazonCloudDirectory");

        request.setHttpMethod(HttpMethodName.PUT);

        if (putSchemaFromJsonRequest.getSchemaArn() != null) {
            request.addHeader("x-amz-data-partition", StringUtils.fromString(putSchemaFromJsonRequest.getSchemaArn()));
        }

        String uriResourcePath = "/amazonclouddirectory/2017-01-11/schema/json";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (putSchemaFromJsonRequest.getDocument() != null) {
                jsonGenerator.writeFieldName("Document").writeValue(putSchemaFromJsonRequest.getDocument());
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
