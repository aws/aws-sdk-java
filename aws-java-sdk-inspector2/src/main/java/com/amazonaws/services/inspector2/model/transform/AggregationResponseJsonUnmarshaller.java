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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AggregationResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregationResponseJsonUnmarshaller implements Unmarshaller<AggregationResponse, JsonUnmarshallerContext> {

    public AggregationResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AggregationResponse aggregationResponse = new AggregationResponse();

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
                if (context.testExpression("accountAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setAccountAggregation(AccountAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("amiAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setAmiAggregation(AmiAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("awsEcrContainerAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setAwsEcrContainerAggregation(AwsEcrContainerAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2InstanceAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setEc2InstanceAggregation(Ec2InstanceAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("findingTypeAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setFindingTypeAggregation(FindingTypeAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageLayerAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setImageLayerAggregation(ImageLayerAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setLambdaFunctionAggregation(LambdaFunctionAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaLayerAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setLambdaLayerAggregation(LambdaLayerAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("packageAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setPackageAggregation(PackageAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("repositoryAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setRepositoryAggregation(RepositoryAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("titleAggregation", targetDepth)) {
                    context.nextToken();
                    aggregationResponse.setTitleAggregation(TitleAggregationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return aggregationResponse;
    }

    private static AggregationResponseJsonUnmarshaller instance;

    public static AggregationResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AggregationResponseJsonUnmarshaller();
        return instance;
    }
}
