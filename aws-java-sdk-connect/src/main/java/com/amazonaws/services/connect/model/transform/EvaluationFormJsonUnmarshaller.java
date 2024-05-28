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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EvaluationForm JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormJsonUnmarshaller implements Unmarshaller<EvaluationForm, JsonUnmarshallerContext> {

    public EvaluationForm unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluationForm evaluationForm = new EvaluationForm();

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
                if (context.testExpression("EvaluationFormId", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setEvaluationFormId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationFormVersion", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setEvaluationFormVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Locked", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setLocked(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationFormArn", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setEvaluationFormArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Items", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setItems(new ListUnmarshaller<EvaluationFormItem>(EvaluationFormItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ScoringStrategy", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setScoringStrategy(EvaluationFormScoringStrategyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    evaluationForm.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return evaluationForm;
    }

    private static EvaluationFormJsonUnmarshaller instance;

    public static EvaluationFormJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormJsonUnmarshaller();
        return instance;
    }
}
