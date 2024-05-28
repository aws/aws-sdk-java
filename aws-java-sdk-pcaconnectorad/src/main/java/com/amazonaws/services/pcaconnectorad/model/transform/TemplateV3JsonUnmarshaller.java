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
 * TemplateV3 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateV3JsonUnmarshaller implements Unmarshaller<TemplateV3, JsonUnmarshallerContext> {

    public TemplateV3 unmarshall(JsonUnmarshallerContext context) throws Exception {
        TemplateV3 templateV3 = new TemplateV3();

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
                    templateV3.setCertificateValidity(CertificateValidityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EnrollmentFlags", targetDepth)) {
                    context.nextToken();
                    templateV3.setEnrollmentFlags(EnrollmentFlagsV3JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Extensions", targetDepth)) {
                    context.nextToken();
                    templateV3.setExtensions(ExtensionsV3JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GeneralFlags", targetDepth)) {
                    context.nextToken();
                    templateV3.setGeneralFlags(GeneralFlagsV3JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HashAlgorithm", targetDepth)) {
                    context.nextToken();
                    templateV3.setHashAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateKeyAttributes", targetDepth)) {
                    context.nextToken();
                    templateV3.setPrivateKeyAttributes(PrivateKeyAttributesV3JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrivateKeyFlags", targetDepth)) {
                    context.nextToken();
                    templateV3.setPrivateKeyFlags(PrivateKeyFlagsV3JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SubjectNameFlags", targetDepth)) {
                    context.nextToken();
                    templateV3.setSubjectNameFlags(SubjectNameFlagsV3JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SupersededTemplates", targetDepth)) {
                    context.nextToken();
                    templateV3.setSupersededTemplates(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return templateV3;
    }

    private static TemplateV3JsonUnmarshaller instance;

    public static TemplateV3JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TemplateV3JsonUnmarshaller();
        return instance;
    }
}
