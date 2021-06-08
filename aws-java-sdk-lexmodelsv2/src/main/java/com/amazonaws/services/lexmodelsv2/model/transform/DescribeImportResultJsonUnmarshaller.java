/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeImportResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImportResultJsonUnmarshaller implements Unmarshaller<DescribeImportResult, JsonUnmarshallerContext> {

    public DescribeImportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeImportResult describeImportResult = new DescribeImportResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeImportResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("importId", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setImportId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceSpecification", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setResourceSpecification(ImportResourceSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("importedResourceId", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setImportedResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importedResourceName", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setImportedResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mergeStrategy", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setMergeStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importStatus", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setImportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    describeImportResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeImportResult;
    }

    private static DescribeImportResultJsonUnmarshaller instance;

    public static DescribeImportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeImportResultJsonUnmarshaller();
        return instance;
    }
}
