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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CACertificateDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CACertificateDescriptionJsonUnmarshaller implements Unmarshaller<CACertificateDescription, JsonUnmarshallerContext> {

    public CACertificateDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        CACertificateDescription cACertificateDescription = new CACertificateDescription();

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
                if (context.testExpression("certificateArn", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateId", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificatePem", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setCertificatePem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownedBy", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setOwnedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("autoRegistrationStatus", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setAutoRegistrationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("customerVersion", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setCustomerVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("generationId", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setGenerationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("validity", targetDepth)) {
                    context.nextToken();
                    cACertificateDescription.setValidity(CertificateValidityJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cACertificateDescription;
    }

    private static CACertificateDescriptionJsonUnmarshaller instance;

    public static CACertificateDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CACertificateDescriptionJsonUnmarshaller();
        return instance;
    }
}
