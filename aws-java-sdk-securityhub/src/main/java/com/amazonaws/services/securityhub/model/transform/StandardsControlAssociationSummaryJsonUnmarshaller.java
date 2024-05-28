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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StandardsControlAssociationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsControlAssociationSummaryJsonUnmarshaller implements Unmarshaller<StandardsControlAssociationSummary, JsonUnmarshallerContext> {

    public StandardsControlAssociationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        StandardsControlAssociationSummary standardsControlAssociationSummary = new StandardsControlAssociationSummary();

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
                if (context.testExpression("StandardsArn", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setStandardsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityControlId", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setSecurityControlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityControlArn", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setSecurityControlArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationStatus", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setAssociationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RelatedRequirements", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setRelatedRequirements(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedReason", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setUpdatedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardsControlTitle", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setStandardsControlTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardsControlDescription", targetDepth)) {
                    context.nextToken();
                    standardsControlAssociationSummary.setStandardsControlDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return standardsControlAssociationSummary;
    }

    private static StandardsControlAssociationSummaryJsonUnmarshaller instance;

    public static StandardsControlAssociationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StandardsControlAssociationSummaryJsonUnmarshaller();
        return instance;
    }
}
