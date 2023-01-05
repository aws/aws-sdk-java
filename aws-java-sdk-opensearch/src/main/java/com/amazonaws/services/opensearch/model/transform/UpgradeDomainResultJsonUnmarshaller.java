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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpgradeDomainResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeDomainResultJsonUnmarshaller implements Unmarshaller<UpgradeDomainResult, JsonUnmarshallerContext> {

    public UpgradeDomainResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpgradeDomainResult upgradeDomainResult = new UpgradeDomainResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return upgradeDomainResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UpgradeId", targetDepth)) {
                    context.nextToken();
                    upgradeDomainResult.setUpgradeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    upgradeDomainResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetVersion", targetDepth)) {
                    context.nextToken();
                    upgradeDomainResult.setTargetVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PerformCheckOnly", targetDepth)) {
                    context.nextToken();
                    upgradeDomainResult.setPerformCheckOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AdvancedOptions", targetDepth)) {
                    context.nextToken();
                    upgradeDomainResult.setAdvancedOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ChangeProgressDetails", targetDepth)) {
                    context.nextToken();
                    upgradeDomainResult.setChangeProgressDetails(ChangeProgressDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return upgradeDomainResult;
    }

    private static UpgradeDomainResultJsonUnmarshaller instance;

    public static UpgradeDomainResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpgradeDomainResultJsonUnmarshaller();
        return instance;
    }
}
