/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model.transform;

import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetFunctionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionResultStaxUnmarshaller implements Unmarshaller<GetFunctionResult, StaxUnmarshallerContext> {

    public GetFunctionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetFunctionResult getFunctionResult = new GetFunctionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            context.setCurrentHeader("ETag");
            getFunctionResult.setETag(StringStaxUnmarshaller.getInstance().unmarshall(context));

            context.setCurrentHeader("Content-Type");
            getFunctionResult.setContentType(StringStaxUnmarshaller.getInstance().unmarshall(context));

        }

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            try {
                getFunctionResult.setFunctionCode(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }
        return getFunctionResult;
    }

    private static GetFunctionResultStaxUnmarshaller instance;

    public static GetFunctionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetFunctionResultStaxUnmarshaller();
        return instance;
    }
}
