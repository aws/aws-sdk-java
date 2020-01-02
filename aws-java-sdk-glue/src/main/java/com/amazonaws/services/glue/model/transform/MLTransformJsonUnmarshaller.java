/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * MLTransform JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MLTransformJsonUnmarshaller implements Unmarshaller<MLTransform, JsonUnmarshallerContext> {

    public MLTransform unmarshall(JsonUnmarshallerContext context) throws Exception {
        MLTransform mLTransform = new MLTransform();

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
                if (context.testExpression("TransformId", targetDepth)) {
                    context.nextToken();
                    mLTransform.setTransformId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    mLTransform.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    mLTransform.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    mLTransform.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedOn", targetDepth)) {
                    context.nextToken();
                    mLTransform.setCreatedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    context.nextToken();
                    mLTransform.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputRecordTables", targetDepth)) {
                    context.nextToken();
                    mLTransform.setInputRecordTables(new ListUnmarshaller<GlueTable>(GlueTableJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    mLTransform.setParameters(TransformParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluationMetrics", targetDepth)) {
                    context.nextToken();
                    mLTransform.setEvaluationMetrics(EvaluationMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LabelCount", targetDepth)) {
                    context.nextToken();
                    mLTransform.setLabelCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    mLTransform.setSchema(new ListUnmarshaller<SchemaColumn>(SchemaColumnJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    mLTransform.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlueVersion", targetDepth)) {
                    context.nextToken();
                    mLTransform.setGlueVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    context.nextToken();
                    mLTransform.setMaxCapacity(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("WorkerType", targetDepth)) {
                    context.nextToken();
                    mLTransform.setWorkerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    context.nextToken();
                    mLTransform.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    context.nextToken();
                    mLTransform.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxRetries", targetDepth)) {
                    context.nextToken();
                    mLTransform.setMaxRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mLTransform;
    }

    private static MLTransformJsonUnmarshaller instance;

    public static MLTransformJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MLTransformJsonUnmarshaller();
        return instance;
    }
}
