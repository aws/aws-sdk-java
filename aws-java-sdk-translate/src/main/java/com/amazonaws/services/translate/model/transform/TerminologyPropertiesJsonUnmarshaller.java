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
package com.amazonaws.services.translate.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TerminologyProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminologyPropertiesJsonUnmarshaller implements Unmarshaller<TerminologyProperties, JsonUnmarshallerContext> {

    public TerminologyProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        TerminologyProperties terminologyProperties = new TerminologyProperties();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceLanguageCode", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setSourceLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetLanguageCodes", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setTargetLanguageCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("EncryptionKey", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setEncryptionKey(EncryptionKeyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SizeBytes", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setSizeBytes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TermCount", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setTermCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    terminologyProperties.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return terminologyProperties;
    }

    private static TerminologyPropertiesJsonUnmarshaller instance;

    public static TerminologyPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TerminologyPropertiesJsonUnmarshaller();
        return instance;
    }
}
