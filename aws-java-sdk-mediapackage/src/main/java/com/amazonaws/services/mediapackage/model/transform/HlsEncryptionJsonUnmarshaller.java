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
package com.amazonaws.services.mediapackage.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HlsEncryption JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsEncryptionJsonUnmarshaller implements Unmarshaller<HlsEncryption, JsonUnmarshallerContext> {

    public HlsEncryption unmarshall(JsonUnmarshallerContext context) throws Exception {
        HlsEncryption hlsEncryption = new HlsEncryption();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("constantInitializationVector", targetDepth)) {
                    context.nextToken();
                    hlsEncryption.setConstantInitializationVector(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionMethod", targetDepth)) {
                    context.nextToken();
                    hlsEncryption.setEncryptionMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("keyRotationIntervalSeconds", targetDepth)) {
                    context.nextToken();
                    hlsEncryption.setKeyRotationIntervalSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("repeatExtXKey", targetDepth)) {
                    context.nextToken();
                    hlsEncryption.setRepeatExtXKey(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("spekeKeyProvider", targetDepth)) {
                    context.nextToken();
                    hlsEncryption.setSpekeKeyProvider(SpekeKeyProviderJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hlsEncryption;
    }

    private static HlsEncryptionJsonUnmarshaller instance;

    public static HlsEncryptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HlsEncryptionJsonUnmarshaller();
        return instance;
    }
}
