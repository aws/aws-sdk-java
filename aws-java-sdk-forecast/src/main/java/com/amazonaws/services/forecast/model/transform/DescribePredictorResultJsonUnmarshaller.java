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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePredictorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePredictorResultJsonUnmarshaller implements Unmarshaller<DescribePredictorResult, JsonUnmarshallerContext> {

    public DescribePredictorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePredictorResult describePredictorResult = new DescribePredictorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePredictorResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PredictorArn", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setPredictorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredictorName", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setPredictorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlgorithmArn", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setAlgorithmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ForecastHorizon", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setForecastHorizon(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PerformAutoML", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setPerformAutoML(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PerformHPO", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setPerformHPO(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TrainingParameters", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setTrainingParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("EvaluationParameters", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setEvaluationParameters(EvaluationParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HPOConfig", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setHPOConfig(HyperParameterTuningJobConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FeaturizationConfig", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setFeaturizationConfig(FeaturizationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionConfig", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setEncryptionConfig(EncryptionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PredictorExecutionDetails", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setPredictorExecutionDetails(PredictorExecutionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DatasetImportJobArns", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setDatasetImportJobArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AutoMLAlgorithmArns", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setAutoMLAlgorithmArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    describePredictorResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePredictorResult;
    }

    private static DescribePredictorResultJsonUnmarshaller instance;

    public static DescribePredictorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePredictorResultJsonUnmarshaller();
        return instance;
    }
}
