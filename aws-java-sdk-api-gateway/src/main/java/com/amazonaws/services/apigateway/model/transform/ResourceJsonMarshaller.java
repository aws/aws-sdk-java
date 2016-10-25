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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ResourceMarshaller
 */
public class ResourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Resource resource, StructuredJsonGenerator jsonGenerator) {

        if (resource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (resource.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(resource.getId());
            }
            if (resource.getParentId() != null) {
                jsonGenerator.writeFieldName("parentId").writeValue(resource.getParentId());
            }
            if (resource.getPathPart() != null) {
                jsonGenerator.writeFieldName("pathPart").writeValue(resource.getPathPart());
            }
            if (resource.getPath() != null) {
                jsonGenerator.writeFieldName("path").writeValue(resource.getPath());
            }

            java.util.Map<String, Method> resourceMethodsMap = resource.getResourceMethods();
            if (resourceMethodsMap != null) {
                jsonGenerator.writeFieldName("resourceMethods");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Method> resourceMethodsMapValue : resourceMethodsMap.entrySet()) {
                    if (resourceMethodsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(resourceMethodsMapValue.getKey());

                        MethodJsonMarshaller.getInstance().marshall(resourceMethodsMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ResourceJsonMarshaller instance;

    public static ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceJsonMarshaller();
        return instance;
    }

}
