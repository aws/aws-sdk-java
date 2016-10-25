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
 * CreateApplicationRequest Marshaller
 */
public class CreateApplicationRequestMarshaller implements Marshaller<Request<CreateApplicationRequest>, CreateApplicationRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateApplicationRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateApplicationRequest> marshall(CreateApplicationRequest createApplicationRequest) {

        if (createApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateApplicationRequest> request = new DefaultRequest<CreateApplicationRequest>(createApplicationRequest, "AmazonKinesisAnalytics");
        request.addHeader("X-Amz-Target", "KinesisAnalytics_20150814.CreateApplication");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createApplicationRequest.getApplicationName() != null) {
                jsonGenerator.writeFieldName("ApplicationName").writeValue(createApplicationRequest.getApplicationName());
            }
            if (createApplicationRequest.getApplicationDescription() != null) {
                jsonGenerator.writeFieldName("ApplicationDescription").writeValue(createApplicationRequest.getApplicationDescription());
            }

            java.util.List<Input> inputsList = createApplicationRequest.getInputs();
            if (inputsList != null) {
                jsonGenerator.writeFieldName("Inputs");
                jsonGenerator.writeStartArray();
                for (Input inputsListValue : inputsList) {
                    if (inputsListValue != null) {

                        InputJsonMarshaller.getInstance().marshall(inputsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Output> outputsList = createApplicationRequest.getOutputs();
            if (outputsList != null) {
                jsonGenerator.writeFieldName("Outputs");
                jsonGenerator.writeStartArray();
                for (Output outputsListValue : outputsList) {
                    if (outputsListValue != null) {

                        OutputJsonMarshaller.getInstance().marshall(outputsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createApplicationRequest.getApplicationCode() != null) {
                jsonGenerator.writeFieldName("ApplicationCode").writeValue(createApplicationRequest.getApplicationCode());
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
