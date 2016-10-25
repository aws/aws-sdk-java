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
 * PredictRequest Marshaller
 */
public class PredictRequestMarshaller implements Marshaller<Request<PredictRequest>, PredictRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public PredictRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PredictRequest> marshall(PredictRequest predictRequest) {

        if (predictRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PredictRequest> request = new DefaultRequest<PredictRequest>(predictRequest, "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.Predict");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (predictRequest.getMLModelId() != null) {
                jsonGenerator.writeFieldName("MLModelId").writeValue(predictRequest.getMLModelId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> recordMap = (com.amazonaws.internal.SdkInternalMap<String, String>) predictRequest
                    .getRecord();
            if (!recordMap.isEmpty() || !recordMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Record");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> recordMapValue : recordMap.entrySet()) {
                    if (recordMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(recordMapValue.getKey());

                        jsonGenerator.writeValue(recordMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (predictRequest.getPredictEndpoint() != null) {
                jsonGenerator.writeFieldName("PredictEndpoint").writeValue(predictRequest.getPredictEndpoint());
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
