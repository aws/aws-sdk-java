/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakerruntime.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.sagemakerruntime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InvokeEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeEndpointResultJsonUnmarshaller implements Unmarshaller<InvokeEndpointResult, JsonUnmarshallerContext> {

    public InvokeEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InvokeEndpointResult invokeEndpointResult = new InvokeEndpointResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                invokeEndpointResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-Amzn-Invoked-Production-Variant") != null) {
                context.setCurrentHeader("x-Amzn-Invoked-Production-Variant");
                invokeEndpointResult.setInvokedProductionVariant(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("X-Amzn-SageMaker-Custom-Attributes") != null) {
                context.setCurrentHeader("X-Amzn-SageMaker-Custom-Attributes");
                invokeEndpointResult.setCustomAttributes(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            try {
                invokeEndpointResult.setBody(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }

        return invokeEndpointResult;
    }

    private static InvokeEndpointResultJsonUnmarshaller instance;

    public static InvokeEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvokeEndpointResultJsonUnmarshaller();
        return instance;
    }
}
