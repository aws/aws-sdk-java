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
package com.amazonaws.services.iotdata.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateThingShadowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThingShadowResultJsonUnmarshaller implements Unmarshaller<UpdateThingShadowResult, JsonUnmarshallerContext> {

    public UpdateThingShadowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateThingShadowResult updateThingShadowResult = new UpdateThingShadowResult();

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            try {
                updateThingShadowResult.setPayload(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }

        return updateThingShadowResult;
    }

    private static UpdateThingShadowResultJsonUnmarshaller instance;

    public static UpdateThingShadowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateThingShadowResultJsonUnmarshaller();
        return instance;
    }
}
