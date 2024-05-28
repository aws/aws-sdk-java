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
package com.amazonaws.services.appsync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appsync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SourceApiAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceApiAssociationJsonUnmarshaller implements Unmarshaller<SourceApiAssociation, JsonUnmarshallerContext> {

    public SourceApiAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        SourceApiAssociation sourceApiAssociation = new SourceApiAssociation();

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
                if (context.testExpression("associationId", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associationArn", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setAssociationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceApiId", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setSourceApiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceApiArn", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setSourceApiArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mergedApiArn", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setMergedApiArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mergedApiId", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setMergedApiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceApiAssociationConfig", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setSourceApiAssociationConfig(SourceApiAssociationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceApiAssociationStatus", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setSourceApiAssociationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceApiAssociationStatusDetail", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setSourceApiAssociationStatusDetail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastSuccessfulMergeDate", targetDepth)) {
                    context.nextToken();
                    sourceApiAssociation.setLastSuccessfulMergeDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sourceApiAssociation;
    }

    private static SourceApiAssociationJsonUnmarshaller instance;

    public static SourceApiAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SourceApiAssociationJsonUnmarshaller();
        return instance;
    }
}
