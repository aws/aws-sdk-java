/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.paymentcryptography.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptography.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportTr34KeyBlock JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTr34KeyBlockJsonUnmarshaller implements Unmarshaller<ImportTr34KeyBlock, JsonUnmarshallerContext> {

    public ImportTr34KeyBlock unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportTr34KeyBlock importTr34KeyBlock = new ImportTr34KeyBlock();

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
                if (context.testExpression("CertificateAuthorityPublicKeyIdentifier", targetDepth)) {
                    context.nextToken();
                    importTr34KeyBlock.setCertificateAuthorityPublicKeyIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SigningKeyCertificate", targetDepth)) {
                    context.nextToken();
                    importTr34KeyBlock.setSigningKeyCertificate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportToken", targetDepth)) {
                    context.nextToken();
                    importTr34KeyBlock.setImportToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WrappedKeyBlock", targetDepth)) {
                    context.nextToken();
                    importTr34KeyBlock.setWrappedKeyBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyBlockFormat", targetDepth)) {
                    context.nextToken();
                    importTr34KeyBlock.setKeyBlockFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RandomNonce", targetDepth)) {
                    context.nextToken();
                    importTr34KeyBlock.setRandomNonce(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return importTr34KeyBlock;
    }

    private static ImportTr34KeyBlockJsonUnmarshaller instance;

    public static ImportTr34KeyBlockJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportTr34KeyBlockJsonUnmarshaller();
        return instance;
    }
}
