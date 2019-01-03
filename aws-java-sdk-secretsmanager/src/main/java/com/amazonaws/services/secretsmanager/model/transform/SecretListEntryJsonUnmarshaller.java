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
package com.amazonaws.services.secretsmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.secretsmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SecretListEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretListEntryJsonUnmarshaller implements Unmarshaller<SecretListEntry, JsonUnmarshallerContext> {

    public SecretListEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        SecretListEntry secretListEntry = new SecretListEntry();

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
                if (context.testExpression("ARN", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RotationEnabled", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setRotationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RotationLambdaARN", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setRotationLambdaARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RotationRules", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setRotationRules(RotationRulesTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastRotatedDate", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setLastRotatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastChangedDate", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setLastChangedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAccessedDate", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setLastAccessedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeletedDate", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setDeletedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("SecretVersionsToStages", targetDepth)) {
                    context.nextToken();
                    secretListEntry.setSecretVersionsToStages(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return secretListEntry;
    }

    private static SecretListEntryJsonUnmarshaller instance;

    public static SecretListEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SecretListEntryJsonUnmarshaller();
        return instance;
    }
}
