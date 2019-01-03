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
package com.amazonaws.services.lambda.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InvokeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeResultJsonUnmarshaller implements Unmarshaller<InvokeResult, JsonUnmarshallerContext> {

    public InvokeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InvokeResult invokeResult = new InvokeResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("X-Amz-Function-Error") != null) {
                context.setCurrentHeader("X-Amz-Function-Error");
                invokeResult.setFunctionError(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("X-Amz-Log-Result") != null) {
                context.setCurrentHeader("X-Amz-Log-Result");
                invokeResult.setLogResult(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("X-Amz-Executed-Version") != null) {
                context.setCurrentHeader("X-Amz-Executed-Version");
                invokeResult.setExecutedVersion(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        invokeResult.setStatusCode(context.getHttpResponse().getStatusCode());

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            try {
                invokeResult.setPayload(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }

        return invokeResult;
    }

    private static InvokeResultJsonUnmarshaller instance;

    public static InvokeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvokeResultJsonUnmarshaller();
        return instance;
    }
}
