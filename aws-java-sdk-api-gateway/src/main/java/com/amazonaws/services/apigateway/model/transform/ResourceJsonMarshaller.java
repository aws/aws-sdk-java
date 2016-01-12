/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ResourceMarshaller
 */
public class ResourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Resource resource, JSONWriter jsonWriter) {
        if (resource == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (resource.getId() != null) {
                jsonWriter.key("id").value(resource.getId());
            }

            if (resource.getParentId() != null) {
                jsonWriter.key("parentId").value(resource.getParentId());
            }

            if (resource.getPathPart() != null) {
                jsonWriter.key("pathPart").value(resource.getPathPart());
            }

            if (resource.getPath() != null) {
                jsonWriter.key("path").value(resource.getPath());
            }

            java.util.Map<String, Method> resourceMethodsMap = resource
                    .getResourceMethods();
            if (resourceMethodsMap != null) {
                jsonWriter.key("resourceMethods");
                jsonWriter.object();

                for (Map.Entry<String, Method> resourceMethodsMapValue : resourceMethodsMap
                        .entrySet()) {
                    if (resourceMethodsMapValue.getValue() != null) {
                        jsonWriter.key(resourceMethodsMapValue.getKey());

                        MethodJsonMarshaller.getInstance().marshall(
                                resourceMethodsMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ResourceJsonMarshaller instance;

    public static ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceJsonMarshaller();
        return instance;
    }

}
