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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FindingDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingDetailJsonUnmarshaller implements Unmarshaller<FindingDetail, JsonUnmarshallerContext> {

    public FindingDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        FindingDetail findingDetail = new FindingDetail();

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
                if (context.testExpression("cisaData", targetDepth)) {
                    context.nextToken();
                    findingDetail.setCisaData(CisaDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cwes", targetDepth)) {
                    context.nextToken();
                    findingDetail.setCwes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("epssScore", targetDepth)) {
                    context.nextToken();
                    findingDetail.setEpssScore(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("evidences", targetDepth)) {
                    context.nextToken();
                    findingDetail.setEvidences(new ListUnmarshaller<Evidence>(EvidenceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("exploitObserved", targetDepth)) {
                    context.nextToken();
                    findingDetail.setExploitObserved(ExploitObservedJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("findingArn", targetDepth)) {
                    context.nextToken();
                    findingDetail.setFindingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("referenceUrls", targetDepth)) {
                    context.nextToken();
                    findingDetail.setReferenceUrls(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("riskScore", targetDepth)) {
                    context.nextToken();
                    findingDetail.setRiskScore(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tools", targetDepth)) {
                    context.nextToken();
                    findingDetail.setTools(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ttps", targetDepth)) {
                    context.nextToken();
                    findingDetail.setTtps(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return findingDetail;
    }

    private static FindingDetailJsonUnmarshaller instance;

    public static FindingDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FindingDetailJsonUnmarshaller();
        return instance;
    }
}
