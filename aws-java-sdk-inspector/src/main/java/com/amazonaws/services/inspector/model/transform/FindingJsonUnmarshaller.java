/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Finding JSON Unmarshaller
 */
public class FindingJsonUnmarshaller implements
        Unmarshaller<Finding, JsonUnmarshallerContext> {

    public Finding unmarshall(JsonUnmarshallerContext context) throws Exception {
        Finding finding = new Finding();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    finding.setArn(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("schemaVersion", targetDepth)) {
                    context.nextToken();
                    finding.setSchemaVersion(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("service", targetDepth)) {
                    context.nextToken();
                    finding.setService(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("serviceAttributes", targetDepth)) {
                    context.nextToken();
                    finding.setServiceAttributes(InspectorServiceAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("assetType", targetDepth)) {
                    context.nextToken();
                    finding.setAssetType(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("assetAttributes", targetDepth)) {
                    context.nextToken();
                    finding.setAssetAttributes(AssetAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    finding.setId(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    finding.setTitle(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    finding.setDescription(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("recommendation", targetDepth)) {
                    context.nextToken();
                    finding.setRecommendation(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    context.nextToken();
                    finding.setSeverity(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("numericSeverity", targetDepth)) {
                    context.nextToken();
                    finding.setNumericSeverity(DoubleJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("confidence", targetDepth)) {
                    context.nextToken();
                    finding.setConfidence(IntegerJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context
                        .testExpression("indicatorOfCompromise", targetDepth)) {
                    context.nextToken();
                    finding.setIndicatorOfCompromise(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    context.nextToken();
                    finding.setAttributes(new ListUnmarshaller<Attribute>(
                            AttributeJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("userAttributes", targetDepth)) {
                    context.nextToken();
                    finding.setUserAttributes(new ListUnmarshaller<Attribute>(
                            AttributeJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    finding.setCreatedAt(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    finding.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return finding;
    }

    private static FindingJsonUnmarshaller instance;

    public static FindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FindingJsonUnmarshaller();
        return instance;
    }
}
