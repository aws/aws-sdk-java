/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationResultJsonUnmarshaller implements Unmarshaller<GetConfigurationResult, JsonUnmarshallerContext> {

    public GetConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetConfigurationResult getConfigurationResult = new GetConfigurationResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Configuration-Version") != null) {
                context.setCurrentHeader("Configuration-Version");
                getConfigurationResult.setConfigurationVersion(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                getConfigurationResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            try {
                getConfigurationResult.setContent(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }

        return getConfigurationResult;
    }

    private static GetConfigurationResultJsonUnmarshaller instance;

    public static GetConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
