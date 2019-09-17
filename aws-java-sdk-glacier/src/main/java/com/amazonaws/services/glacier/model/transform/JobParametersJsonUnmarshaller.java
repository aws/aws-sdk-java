/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobParametersJsonUnmarshaller implements Unmarshaller<JobParameters, JsonUnmarshallerContext> {

    public JobParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobParameters jobParameters = new JobParameters();

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
                if (context.testExpression("Format", targetDepth)) {
                    context.nextToken();
                    jobParameters.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    jobParameters.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveId", targetDepth)) {
                    context.nextToken();
                    jobParameters.setArchiveId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    jobParameters.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SNSTopic", targetDepth)) {
                    context.nextToken();
                    jobParameters.setSNSTopic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetrievalByteRange", targetDepth)) {
                    context.nextToken();
                    jobParameters.setRetrievalByteRange(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tier", targetDepth)) {
                    context.nextToken();
                    jobParameters.setTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InventoryRetrievalParameters", targetDepth)) {
                    context.nextToken();
                    jobParameters.setInventoryRetrievalParameters(InventoryRetrievalJobInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelectParameters", targetDepth)) {
                    context.nextToken();
                    jobParameters.setSelectParameters(SelectParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputLocation", targetDepth)) {
                    context.nextToken();
                    jobParameters.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobParameters;
    }

    private static JobParametersJsonUnmarshaller instance;

    public static JobParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobParametersJsonUnmarshaller();
        return instance;
    }
}
