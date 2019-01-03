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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Certificate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateJsonUnmarshaller implements Unmarshaller<Certificate, JsonUnmarshallerContext> {

    public Certificate unmarshall(JsonUnmarshallerContext context) throws Exception {
        Certificate certificate = new Certificate();

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
                if (context.testExpression("CertificateIdentifier", targetDepth)) {
                    context.nextToken();
                    certificate.setCertificateIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateCreationDate", targetDepth)) {
                    context.nextToken();
                    certificate.setCertificateCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CertificatePem", targetDepth)) {
                    context.nextToken();
                    certificate.setCertificatePem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateWallet", targetDepth)) {
                    context.nextToken();
                    certificate.setCertificateWallet(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("CertificateArn", targetDepth)) {
                    context.nextToken();
                    certificate.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateOwner", targetDepth)) {
                    context.nextToken();
                    certificate.setCertificateOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ValidFromDate", targetDepth)) {
                    context.nextToken();
                    certificate.setValidFromDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ValidToDate", targetDepth)) {
                    context.nextToken();
                    certificate.setValidToDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SigningAlgorithm", targetDepth)) {
                    context.nextToken();
                    certificate.setSigningAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyLength", targetDepth)) {
                    context.nextToken();
                    certificate.setKeyLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return certificate;
    }

    private static CertificateJsonUnmarshaller instance;

    public static CertificateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateJsonUnmarshaller();
        return instance;
    }
}
