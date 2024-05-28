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
package com.amazonaws.services.pcaconnectorad.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pcaconnectorad.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TemplateV4 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateV4JsonUnmarshaller implements Unmarshaller<TemplateV4, JsonUnmarshallerContext> {

    public TemplateV4 unmarshall(JsonUnmarshallerContext context) throws Exception {
        TemplateV4 templateV4 = new TemplateV4();

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
                if (context.testExpression("CertificateValidity", targetDepth)) {
                    context.nextToken();
                    templateV4.setCertificateValidity(CertificateValidityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EnrollmentFlags", targetDepth)) {
                    context.nextToken();
                    templateV4.setEnrollmentFlags(EnrollmentFlagsV4JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Extensions", targetDepth)) {
                    context.nextToken();
                    templateV4.setExtensions(ExtensionsV4JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GeneralFlags", targetDepth)) {
                    context.nextToken();
                    templateV4.setGeneralFlags(GeneralFlagsV4JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HashAlgorithm", targetDepth)) {
                    context.nextToken();
                    templateV4.setHashAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateKeyAttributes", targetDepth)) {
                    context.nextToken();
                    templateV4.setPrivateKeyAttributes(PrivateKeyAttributesV4JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrivateKeyFlags", targetDepth)) {
                    context.nextToken();
                    templateV4.setPrivateKeyFlags(PrivateKeyFlagsV4JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SubjectNameFlags", targetDepth)) {
                    context.nextToken();
                    templateV4.setSubjectNameFlags(SubjectNameFlagsV4JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SupersededTemplates", targetDepth)) {
                    context.nextToken();
                    templateV4.setSupersededTemplates(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return templateV4;
    }

    private static TemplateV4JsonUnmarshaller instance;

    public static TemplateV4JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TemplateV4JsonUnmarshaller();
        return instance;
    }
}
