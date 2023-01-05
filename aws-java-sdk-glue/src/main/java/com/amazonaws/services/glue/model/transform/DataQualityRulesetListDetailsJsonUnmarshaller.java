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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataQualityRulesetListDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityRulesetListDetailsJsonUnmarshaller implements Unmarshaller<DataQualityRulesetListDetails, JsonUnmarshallerContext> {

    public DataQualityRulesetListDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataQualityRulesetListDetails dataQualityRulesetListDetails = new DataQualityRulesetListDetails();

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
                    dataQualityRulesetListDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    dataQualityRulesetListDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedOn", targetDepth)) {
                    context.nextToken();
                    dataQualityRulesetListDetails.setCreatedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    context.nextToken();
                    dataQualityRulesetListDetails.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TargetTable", targetDepth)) {
                    context.nextToken();
                    dataQualityRulesetListDetails.setTargetTable(DataQualityTargetTableJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecommendationRunId", targetDepth)) {
                    context.nextToken();
                    dataQualityRulesetListDetails.setRecommendationRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleCount", targetDepth)) {
                    context.nextToken();
                    dataQualityRulesetListDetails.setRuleCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataQualityRulesetListDetails;
    }

    private static DataQualityRulesetListDetailsJsonUnmarshaller instance;

    public static DataQualityRulesetListDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataQualityRulesetListDetailsJsonUnmarshaller();
        return instance;
    }
}
