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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ListStepsRequest Marshaller
 */
public class ListStepsRequestMarshaller implements Marshaller<Request<ListStepsRequest>, ListStepsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListStepsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListStepsRequest> marshall(ListStepsRequest listStepsRequest) {

        if (listStepsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListStepsRequest> request = new DefaultRequest<ListStepsRequest>(listStepsRequest, "AmazonElasticMapReduce");
        request.addHeader("X-Amz-Target", "ElasticMapReduce.ListSteps");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listStepsRequest.getClusterId() != null) {
                jsonGenerator.writeFieldName("ClusterId").writeValue(listStepsRequest.getClusterId());
            }

            com.amazonaws.internal.SdkInternalList<String> stepStatesList = (com.amazonaws.internal.SdkInternalList<String>) listStepsRequest.getStepStates();
            if (!stepStatesList.isEmpty() || !stepStatesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("StepStates");
                jsonGenerator.writeStartArray();
                for (String stepStatesListValue : stepStatesList) {
                    if (stepStatesListValue != null) {
                        jsonGenerator.writeValue(stepStatesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> stepIdsList = (com.amazonaws.internal.SdkInternalList<String>) listStepsRequest.getStepIds();
            if (!stepIdsList.isEmpty() || !stepIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("StepIds");
                jsonGenerator.writeStartArray();
                for (String stepIdsListValue : stepIdsList) {
                    if (stepIdsListValue != null) {
                        jsonGenerator.writeValue(stepIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (listStepsRequest.getMarker() != null) {
                jsonGenerator.writeFieldName("Marker").writeValue(listStepsRequest.getMarker());
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
