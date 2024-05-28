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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RegistrationVersionStatusHistory JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationVersionStatusHistoryJsonUnmarshaller implements Unmarshaller<RegistrationVersionStatusHistory, JsonUnmarshallerContext> {

    public RegistrationVersionStatusHistory unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegistrationVersionStatusHistory registrationVersionStatusHistory = new RegistrationVersionStatusHistory();

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
                if (context.testExpression("DraftTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationVersionStatusHistory.setDraftTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SubmittedTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationVersionStatusHistory.setSubmittedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReviewingTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationVersionStatusHistory.setReviewingTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ApprovedTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationVersionStatusHistory.setApprovedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DiscardedTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationVersionStatusHistory.setDiscardedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeniedTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationVersionStatusHistory.setDeniedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RevokedTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationVersionStatusHistory.setRevokedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ArchivedTimestamp", targetDepth)) {
                    context.nextToken();
                    registrationVersionStatusHistory.setArchivedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return registrationVersionStatusHistory;
    }

    private static RegistrationVersionStatusHistoryJsonUnmarshaller instance;

    public static RegistrationVersionStatusHistoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegistrationVersionStatusHistoryJsonUnmarshaller();
        return instance;
    }
}
