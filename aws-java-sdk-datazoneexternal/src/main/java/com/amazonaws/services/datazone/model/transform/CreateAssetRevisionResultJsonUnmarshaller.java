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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateAssetRevisionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetRevisionResultJsonUnmarshaller implements Unmarshaller<CreateAssetRevisionResult, JsonUnmarshallerContext> {

    public CreateAssetRevisionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAssetRevisionResult createAssetRevisionResult = new CreateAssetRevisionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createAssetRevisionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalIdentifier", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setExternalIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstRevisionCreatedAt", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setFirstRevisionCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("firstRevisionCreatedBy", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setFirstRevisionCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("formsOutput", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setFormsOutput(new ListUnmarshaller<FormOutput>(FormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("glossaryTerms", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setGlossaryTerms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestTimeSeriesDataPointFormsOutput", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setLatestTimeSeriesDataPointFormsOutput(new ListUnmarshaller<TimeSeriesDataPointSummaryFormOutput>(
                            TimeSeriesDataPointSummaryFormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listing", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setListing(AssetListingDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owningProjectId", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setOwningProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("predictionConfiguration", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setPredictionConfiguration(PredictionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("readOnlyFormsOutput", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setReadOnlyFormsOutput(new ListUnmarshaller<FormOutput>(FormOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("typeIdentifier", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setTypeIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("typeRevision", targetDepth)) {
                    context.nextToken();
                    createAssetRevisionResult.setTypeRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createAssetRevisionResult;
    }

    private static CreateAssetRevisionResultJsonUnmarshaller instance;

    public static CreateAssetRevisionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAssetRevisionResultJsonUnmarshaller();
        return instance;
    }
}
