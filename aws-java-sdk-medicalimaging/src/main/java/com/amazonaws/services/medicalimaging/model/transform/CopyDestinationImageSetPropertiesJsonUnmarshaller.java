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
package com.amazonaws.services.medicalimaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medicalimaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CopyDestinationImageSetProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDestinationImageSetPropertiesJsonUnmarshaller implements Unmarshaller<CopyDestinationImageSetProperties, JsonUnmarshallerContext> {

    public CopyDestinationImageSetProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        CopyDestinationImageSetProperties copyDestinationImageSetProperties = new CopyDestinationImageSetProperties();

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
                if (context.testExpression("imageSetId", targetDepth)) {
                    context.nextToken();
                    copyDestinationImageSetProperties.setImageSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestVersionId", targetDepth)) {
                    context.nextToken();
                    copyDestinationImageSetProperties.setLatestVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetState", targetDepth)) {
                    context.nextToken();
                    copyDestinationImageSetProperties.setImageSetState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetWorkflowStatus", targetDepth)) {
                    context.nextToken();
                    copyDestinationImageSetProperties.setImageSetWorkflowStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    copyDestinationImageSetProperties.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    copyDestinationImageSetProperties.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("imageSetArn", targetDepth)) {
                    context.nextToken();
                    copyDestinationImageSetProperties.setImageSetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return copyDestinationImageSetProperties;
    }

    private static CopyDestinationImageSetPropertiesJsonUnmarshaller instance;

    public static CopyDestinationImageSetPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CopyDestinationImageSetPropertiesJsonUnmarshaller();
        return instance;
    }
}
