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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AddApplicationInputRequest Marshaller
 */
public class AddApplicationInputRequestMarshaller implements Marshaller<Request<AddApplicationInputRequest>, AddApplicationInputRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public AddApplicationInputRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AddApplicationInputRequest> marshall(AddApplicationInputRequest addApplicationInputRequest) {

        if (addApplicationInputRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddApplicationInputRequest> request = new DefaultRequest<AddApplicationInputRequest>(addApplicationInputRequest, "AmazonKinesisAnalytics");
        request.addHeader("X-Amz-Target", "KinesisAnalytics_20150814.AddApplicationInput");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (addApplicationInputRequest.getApplicationName() != null) {
                jsonGenerator.writeFieldName("ApplicationName").writeValue(addApplicationInputRequest.getApplicationName());
            }
            if (addApplicationInputRequest.getCurrentApplicationVersionId() != null) {
                jsonGenerator.writeFieldName("CurrentApplicationVersionId").writeValue(addApplicationInputRequest.getCurrentApplicationVersionId());
            }
            if (addApplicationInputRequest.getInput() != null) {
                jsonGenerator.writeFieldName("Input");
                InputJsonMarshaller.getInstance().marshall(addApplicationInputRequest.getInput(), jsonGenerator);
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
