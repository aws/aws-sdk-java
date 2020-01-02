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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConformancePackDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackDetailJsonUnmarshaller implements Unmarshaller<ConformancePackDetail, JsonUnmarshallerContext> {

    public ConformancePackDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConformancePackDetail conformancePackDetail = new ConformancePackDetail();

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
                if (context.testExpression("ConformancePackName", targetDepth)) {
                    context.nextToken();
                    conformancePackDetail.setConformancePackName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConformancePackArn", targetDepth)) {
                    context.nextToken();
                    conformancePackDetail.setConformancePackArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConformancePackId", targetDepth)) {
                    context.nextToken();
                    conformancePackDetail.setConformancePackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryS3Bucket", targetDepth)) {
                    context.nextToken();
                    conformancePackDetail.setDeliveryS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryS3KeyPrefix", targetDepth)) {
                    context.nextToken();
                    conformancePackDetail.setDeliveryS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConformancePackInputParameters", targetDepth)) {
                    context.nextToken();
                    conformancePackDetail.setConformancePackInputParameters(new ListUnmarshaller<ConformancePackInputParameter>(
                            ConformancePackInputParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("LastUpdateRequestedTime", targetDepth)) {
                    context.nextToken();
                    conformancePackDetail.setLastUpdateRequestedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    conformancePackDetail.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return conformancePackDetail;
    }

    private static ConformancePackDetailJsonUnmarshaller instance;

    public static ConformancePackDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConformancePackDetailJsonUnmarshaller();
        return instance;
    }
}
