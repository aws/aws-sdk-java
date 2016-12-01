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
package com.amazonaws.services.codebuild.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ProjectEnvironmentMarshaller
 */
public class ProjectEnvironmentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ProjectEnvironment projectEnvironment, StructuredJsonGenerator jsonGenerator) {

        if (projectEnvironment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (projectEnvironment.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(projectEnvironment.getType());
            }
            if (projectEnvironment.getImage() != null) {
                jsonGenerator.writeFieldName("image").writeValue(projectEnvironment.getImage());
            }
            if (projectEnvironment.getComputeType() != null) {
                jsonGenerator.writeFieldName("computeType").writeValue(projectEnvironment.getComputeType());
            }

            java.util.List<EnvironmentVariable> environmentVariablesList = projectEnvironment.getEnvironmentVariables();
            if (environmentVariablesList != null) {
                jsonGenerator.writeFieldName("environmentVariables");
                jsonGenerator.writeStartArray();
                for (EnvironmentVariable environmentVariablesListValue : environmentVariablesList) {
                    if (environmentVariablesListValue != null) {

                        EnvironmentVariableJsonMarshaller.getInstance().marshall(environmentVariablesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProjectEnvironmentJsonMarshaller instance;

    public static ProjectEnvironmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectEnvironmentJsonMarshaller();
        return instance;
    }

}
