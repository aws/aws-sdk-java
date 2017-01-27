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
 * ListObjectAttributesRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListObjectAttributesRequestMarshaller implements Marshaller<Request<ListObjectAttributesRequest>, ListObjectAttributesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListObjectAttributesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListObjectAttributesRequest> marshall(ListObjectAttributesRequest listObjectAttributesRequest) {

        if (listObjectAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListObjectAttributesRequest> request = new DefaultRequest<ListObjectAttributesRequest>(listObjectAttributesRequest, "AmazonCloudDirectory");

        request.setHttpMethod(HttpMethodName.POST);

        if (listObjectAttributesRequest.getDirectoryArn() != null) {
            request.addHeader("x-amz-data-partition", StringUtils.fromString(listObjectAttributesRequest.getDirectoryArn()));
        }

        if (listObjectAttributesRequest.getConsistencyLevel() != null) {
            request.addHeader("x-amz-consistency-level", StringUtils.fromString(listObjectAttributesRequest.getConsistencyLevel()));
        }

        String uriResourcePath = "/amazonclouddirectory/2017-01-11/object/attributes";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (listObjectAttributesRequest.getObjectReference() != null) {
                jsonGenerator.writeFieldName("ObjectReference");
                ObjectReferenceJsonMarshaller.getInstance().marshall(listObjectAttributesRequest.getObjectReference(), jsonGenerator);
            }
            if (listObjectAttributesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(listObjectAttributesRequest.getNextToken());
            }
            if (listObjectAttributesRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(listObjectAttributesRequest.getMaxResults());
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
