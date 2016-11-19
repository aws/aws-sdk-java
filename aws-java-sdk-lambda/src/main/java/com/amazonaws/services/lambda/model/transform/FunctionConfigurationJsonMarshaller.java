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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * FunctionConfigurationMarshaller
 */
public class FunctionConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FunctionConfiguration functionConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (functionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (functionConfiguration.getFunctionName() != null) {
                jsonGenerator.writeFieldName("FunctionName").writeValue(functionConfiguration.getFunctionName());
            }
            if (functionConfiguration.getFunctionArn() != null) {
                jsonGenerator.writeFieldName("FunctionArn").writeValue(functionConfiguration.getFunctionArn());
            }
            if (functionConfiguration.getRuntime() != null) {
                jsonGenerator.writeFieldName("Runtime").writeValue(functionConfiguration.getRuntime());
            }
            if (functionConfiguration.getRole() != null) {
                jsonGenerator.writeFieldName("Role").writeValue(functionConfiguration.getRole());
            }
            if (functionConfiguration.getHandler() != null) {
                jsonGenerator.writeFieldName("Handler").writeValue(functionConfiguration.getHandler());
            }
            if (functionConfiguration.getCodeSize() != null) {
                jsonGenerator.writeFieldName("CodeSize").writeValue(functionConfiguration.getCodeSize());
            }
            if (functionConfiguration.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(functionConfiguration.getDescription());
            }
            if (functionConfiguration.getTimeout() != null) {
                jsonGenerator.writeFieldName("Timeout").writeValue(functionConfiguration.getTimeout());
            }
            if (functionConfiguration.getMemorySize() != null) {
                jsonGenerator.writeFieldName("MemorySize").writeValue(functionConfiguration.getMemorySize());
            }
            if (functionConfiguration.getLastModified() != null) {
                jsonGenerator.writeFieldName("LastModified").writeValue(functionConfiguration.getLastModified());
            }
            if (functionConfiguration.getCodeSha256() != null) {
                jsonGenerator.writeFieldName("CodeSha256").writeValue(functionConfiguration.getCodeSha256());
            }
            if (functionConfiguration.getVersion() != null) {
                jsonGenerator.writeFieldName("Version").writeValue(functionConfiguration.getVersion());
            }
            if (functionConfiguration.getVpcConfig() != null) {
                jsonGenerator.writeFieldName("VpcConfig");
                VpcConfigResponseJsonMarshaller.getInstance().marshall(functionConfiguration.getVpcConfig(), jsonGenerator);
            }
            if (functionConfiguration.getEnvironment() != null) {
                jsonGenerator.writeFieldName("Environment");
                EnvironmentResponseJsonMarshaller.getInstance().marshall(functionConfiguration.getEnvironment(), jsonGenerator);
            }
            if (functionConfiguration.getKMSKeyArn() != null) {
                jsonGenerator.writeFieldName("KMSKeyArn").writeValue(functionConfiguration.getKMSKeyArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FunctionConfigurationJsonMarshaller instance;

    public static FunctionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FunctionConfigurationJsonMarshaller();
        return instance;
    }

}
