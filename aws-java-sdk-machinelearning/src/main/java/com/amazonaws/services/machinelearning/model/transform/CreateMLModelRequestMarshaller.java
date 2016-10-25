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
package com.amazonaws.services.machinelearning.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateMLModelRequest Marshaller
 */
public class CreateMLModelRequestMarshaller implements Marshaller<Request<CreateMLModelRequest>, CreateMLModelRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateMLModelRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateMLModelRequest> marshall(CreateMLModelRequest createMLModelRequest) {

        if (createMLModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateMLModelRequest> request = new DefaultRequest<CreateMLModelRequest>(createMLModelRequest, "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.CreateMLModel");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createMLModelRequest.getMLModelId() != null) {
                jsonGenerator.writeFieldName("MLModelId").writeValue(createMLModelRequest.getMLModelId());
            }
            if (createMLModelRequest.getMLModelName() != null) {
                jsonGenerator.writeFieldName("MLModelName").writeValue(createMLModelRequest.getMLModelName());
            }
            if (createMLModelRequest.getMLModelType() != null) {
                jsonGenerator.writeFieldName("MLModelType").writeValue(createMLModelRequest.getMLModelType());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> parametersMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createMLModelRequest
                    .getParameters();
            if (!parametersMap.isEmpty() || !parametersMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeValue(parametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (createMLModelRequest.getTrainingDataSourceId() != null) {
                jsonGenerator.writeFieldName("TrainingDataSourceId").writeValue(createMLModelRequest.getTrainingDataSourceId());
            }
            if (createMLModelRequest.getRecipe() != null) {
                jsonGenerator.writeFieldName("Recipe").writeValue(createMLModelRequest.getRecipe());
            }
            if (createMLModelRequest.getRecipeUri() != null) {
                jsonGenerator.writeFieldName("RecipeUri").writeValue(createMLModelRequest.getRecipeUri());
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
