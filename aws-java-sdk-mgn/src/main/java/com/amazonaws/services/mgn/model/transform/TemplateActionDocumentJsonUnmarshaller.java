/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TemplateActionDocument JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateActionDocumentJsonUnmarshaller implements Unmarshaller<TemplateActionDocument, JsonUnmarshallerContext> {

    public TemplateActionDocument unmarshall(JsonUnmarshallerContext context) throws Exception {
        TemplateActionDocument templateActionDocument = new TemplateActionDocument();

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
                if (context.testExpression("actionID", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setActionID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionName", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("active", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("documentIdentifier", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setDocumentIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("documentVersion", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mustSucceedForCutover", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setMustSucceedForCutover(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("operatingSystem", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setOperatingSystem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("order", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setOrder(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setParameters(new MapUnmarshaller<String, java.util.List<SsmParameterStoreParameter>>(context
                            .getUnmarshaller(String.class), new ListUnmarshaller<SsmParameterStoreParameter>(SsmParameterStoreParameterJsonUnmarshaller
                            .getInstance())

                    ).unmarshall(context));
                }
                if (context.testExpression("timeoutSeconds", targetDepth)) {
                    context.nextToken();
                    templateActionDocument.setTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return templateActionDocument;
    }

    private static TemplateActionDocumentJsonUnmarshaller instance;

    public static TemplateActionDocumentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TemplateActionDocumentJsonUnmarshaller();
        return instance;
    }
}
