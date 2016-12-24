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
package com.amazonaws.services.batch.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * ListJobsRequest Marshaller
 */
public class ListJobsRequestMarshaller implements Marshaller<Request<ListJobsRequest>, ListJobsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListJobsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListJobsRequest> marshall(ListJobsRequest listJobsRequest) {

        if (listJobsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListJobsRequest> request = new DefaultRequest<ListJobsRequest>(listJobsRequest, "AWSBatch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/listjobs";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (listJobsRequest.getJobQueue() != null) {
                jsonGenerator.writeFieldName("jobQueue").writeValue(listJobsRequest.getJobQueue());
            }
            if (listJobsRequest.getJobStatus() != null) {
                jsonGenerator.writeFieldName("jobStatus").writeValue(listJobsRequest.getJobStatus());
            }
            if (listJobsRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("maxResults").writeValue(listJobsRequest.getMaxResults());
            }
            if (listJobsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(listJobsRequest.getNextToken());
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
