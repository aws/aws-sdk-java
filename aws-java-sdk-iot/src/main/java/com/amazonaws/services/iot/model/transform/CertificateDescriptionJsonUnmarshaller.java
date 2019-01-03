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
 * CertificateDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateDescriptionJsonUnmarshaller implements Unmarshaller<CertificateDescription, JsonUnmarshallerContext> {

    public CertificateDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        CertificateDescription certificateDescription = new CertificateDescription();

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
                    certificateDescription.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateId", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("caCertificateId", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setCaCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificatePem", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setCertificatePem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownedBy", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setOwnedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("previousOwnedBy", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setPreviousOwnedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("customerVersion", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setCustomerVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("transferData", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setTransferData(TransferDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("generationId", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setGenerationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("validity", targetDepth)) {
                    context.nextToken();
                    certificateDescription.setValidity(CertificateValidityJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return certificateDescription;
    }

    private static CertificateDescriptionJsonUnmarshaller instance;

    public static CertificateDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateDescriptionJsonUnmarshaller();
        return instance;
    }
}
