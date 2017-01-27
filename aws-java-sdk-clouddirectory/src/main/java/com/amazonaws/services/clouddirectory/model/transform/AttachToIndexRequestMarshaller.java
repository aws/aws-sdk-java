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
 * AttachToIndexRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachToIndexRequestMarshaller implements Marshaller<Request<AttachToIndexRequest>, AttachToIndexRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public AttachToIndexRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AttachToIndexRequest> marshall(AttachToIndexRequest attachToIndexRequest) {

        if (attachToIndexRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AttachToIndexRequest> request = new DefaultRequest<AttachToIndexRequest>(attachToIndexRequest, "AmazonCloudDirectory");

        request.setHttpMethod(HttpMethodName.PUT);

        if (attachToIndexRequest.getDirectoryArn() != null) {
            request.addHeader("x-amz-data-partition", StringUtils.fromString(attachToIndexRequest.getDirectoryArn()));
        }

        String uriResourcePath = "/amazonclouddirectory/2017-01-11/index/attach";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (attachToIndexRequest.getIndexReference() != null) {
                jsonGenerator.writeFieldName("IndexReference");
                ObjectReferenceJsonMarshaller.getInstance().marshall(attachToIndexRequest.getIndexReference(), jsonGenerator);
            }
            if (attachToIndexRequest.getTargetReference() != null) {
                jsonGenerator.writeFieldName("TargetReference");
                ObjectReferenceJsonMarshaller.getInstance().marshall(attachToIndexRequest.getTargetReference(), jsonGenerator);
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
