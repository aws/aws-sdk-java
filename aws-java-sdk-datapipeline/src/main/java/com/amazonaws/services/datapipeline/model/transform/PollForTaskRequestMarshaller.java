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
package com.amazonaws.services.datapipeline.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PollForTaskRequest Marshaller
 */
public class PollForTaskRequestMarshaller implements Marshaller<Request<PollForTaskRequest>, PollForTaskRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public PollForTaskRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PollForTaskRequest> marshall(PollForTaskRequest pollForTaskRequest) {

        if (pollForTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PollForTaskRequest> request = new DefaultRequest<PollForTaskRequest>(pollForTaskRequest, "DataPipeline");
        request.addHeader("X-Amz-Target", "DataPipeline.PollForTask");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (pollForTaskRequest.getWorkerGroup() != null) {
                jsonGenerator.writeFieldName("workerGroup").writeValue(pollForTaskRequest.getWorkerGroup());
            }
            if (pollForTaskRequest.getHostname() != null) {
                jsonGenerator.writeFieldName("hostname").writeValue(pollForTaskRequest.getHostname());
            }
            if (pollForTaskRequest.getInstanceIdentity() != null) {
                jsonGenerator.writeFieldName("instanceIdentity");
                InstanceIdentityJsonMarshaller.getInstance().marshall(pollForTaskRequest.getInstanceIdentity(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
