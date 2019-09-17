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
package com.amazonaws.services.shield.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AttackDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttackDetailJsonUnmarshaller implements Unmarshaller<AttackDetail, JsonUnmarshallerContext> {

    public AttackDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AttackDetail attackDetail = new AttackDetail();

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
                if (context.testExpression("AttackId", targetDepth)) {
                    context.nextToken();
                    attackDetail.setAttackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    attackDetail.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubResources", targetDepth)) {
                    context.nextToken();
                    attackDetail
                            .setSubResources(new ListUnmarshaller<SubResourceSummary>(SubResourceSummaryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    attackDetail.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    attackDetail.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AttackCounters", targetDepth)) {
                    context.nextToken();
                    attackDetail
                            .setAttackCounters(new ListUnmarshaller<SummarizedCounter>(SummarizedCounterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("AttackProperties", targetDepth)) {
                    context.nextToken();
                    attackDetail.setAttackProperties(new ListUnmarshaller<AttackProperty>(AttackPropertyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Mitigations", targetDepth)) {
                    context.nextToken();
                    attackDetail.setMitigations(new ListUnmarshaller<Mitigation>(MitigationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return attackDetail;
    }

    private static AttackDetailJsonUnmarshaller instance;

    public static AttackDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttackDetailJsonUnmarshaller();
        return instance;
    }
}
