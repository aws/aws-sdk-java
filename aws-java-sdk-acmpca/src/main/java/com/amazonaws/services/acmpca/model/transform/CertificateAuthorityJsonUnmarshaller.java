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
package com.amazonaws.services.acmpca.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CertificateAuthority JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateAuthorityJsonUnmarshaller implements Unmarshaller<CertificateAuthority, JsonUnmarshallerContext> {

    public CertificateAuthority unmarshall(JsonUnmarshallerContext context) throws Exception {
        CertificateAuthority certificateAuthority = new CertificateAuthority();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastStateChangeAt", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setLastStateChangeAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Serial", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setSerial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotBefore", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setNotBefore(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NotAfter", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setNotAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateAuthorityConfiguration", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setCertificateAuthorityConfiguration(CertificateAuthorityConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("RevocationConfiguration", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setRevocationConfiguration(RevocationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RestorableUntil", targetDepth)) {
                    context.nextToken();
                    certificateAuthority.setRestorableUntil(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return certificateAuthority;
    }

    private static CertificateAuthorityJsonUnmarshaller instance;

    public static CertificateAuthorityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateAuthorityJsonUnmarshaller();
        return instance;
    }
}
