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
package com.amazonaws.services.lambda.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * CreateFunctionRequest Marshaller
 */
public class CreateFunctionRequestMarshaller implements Marshaller<Request<CreateFunctionRequest>, CreateFunctionRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateFunctionRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateFunctionRequest> marshall(CreateFunctionRequest createFunctionRequest) {

        if (createFunctionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFunctionRequest> request = new DefaultRequest<CreateFunctionRequest>(createFunctionRequest, "AWSLambda");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-03-31/functions";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createFunctionRequest.getFunctionName() != null) {
                jsonGenerator.writeFieldName("FunctionName").writeValue(createFunctionRequest.getFunctionName());
            }
            if (createFunctionRequest.getRuntime() != null) {
                jsonGenerator.writeFieldName("Runtime").writeValue(createFunctionRequest.getRuntime());
            }
            if (createFunctionRequest.getRole() != null) {
                jsonGenerator.writeFieldName("Role").writeValue(createFunctionRequest.getRole());
            }
            if (createFunctionRequest.getHandler() != null) {
                jsonGenerator.writeFieldName("Handler").writeValue(createFunctionRequest.getHandler());
            }
            if (createFunctionRequest.getCode() != null) {
                jsonGenerator.writeFieldName("Code");
                FunctionCodeJsonMarshaller.getInstance().marshall(createFunctionRequest.getCode(), jsonGenerator);
            }
            if (createFunctionRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createFunctionRequest.getDescription());
            }
            if (createFunctionRequest.getTimeout() != null) {
                jsonGenerator.writeFieldName("Timeout").writeValue(createFunctionRequest.getTimeout());
            }
            if (createFunctionRequest.getMemorySize() != null) {
                jsonGenerator.writeFieldName("MemorySize").writeValue(createFunctionRequest.getMemorySize());
            }
            if (createFunctionRequest.getPublish() != null) {
                jsonGenerator.writeFieldName("Publish").writeValue(createFunctionRequest.getPublish());
            }
            if (createFunctionRequest.getVpcConfig() != null) {
                jsonGenerator.writeFieldName("VpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(createFunctionRequest.getVpcConfig(), jsonGenerator);
            }
            if (createFunctionRequest.getEnvironment() != null) {
                jsonGenerator.writeFieldName("Environment");
                EnvironmentJsonMarshaller.getInstance().marshall(createFunctionRequest.getEnvironment(), jsonGenerator);
            }
            if (createFunctionRequest.getKMSKeyArn() != null) {
                jsonGenerator.writeFieldName("KMSKeyArn").writeValue(createFunctionRequest.getKMSKeyArn());
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
