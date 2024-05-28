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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SearchCriteria JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchCriteriaJsonUnmarshaller implements Unmarshaller<SearchCriteria, JsonUnmarshallerContext> {

    public SearchCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchCriteria searchCriteria = new SearchCriteria();

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
                if (context.testExpression("AgentIds", targetDepth)) {
                    context.nextToken();
                    searchCriteria.setAgentIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AgentHierarchyGroups", targetDepth)) {
                    context.nextToken();
                    searchCriteria.setAgentHierarchyGroups(AgentHierarchyGroupsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Channels", targetDepth)) {
                    context.nextToken();
                    searchCriteria.setChannels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ContactAnalysis", targetDepth)) {
                    context.nextToken();
                    searchCriteria.setContactAnalysis(ContactAnalysisJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InitiationMethods", targetDepth)) {
                    context.nextToken();
                    searchCriteria.setInitiationMethods(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("QueueIds", targetDepth)) {
                    context.nextToken();
                    searchCriteria.setQueueIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SearchableContactAttributes", targetDepth)) {
                    context.nextToken();
                    searchCriteria.setSearchableContactAttributes(SearchableContactAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return searchCriteria;
    }

    private static SearchCriteriaJsonUnmarshaller instance;

    public static SearchCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchCriteriaJsonUnmarshaller();
        return instance;
    }
}
