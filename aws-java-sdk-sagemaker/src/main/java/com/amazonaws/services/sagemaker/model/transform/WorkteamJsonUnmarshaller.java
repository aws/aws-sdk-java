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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Workteam JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkteamJsonUnmarshaller implements Unmarshaller<Workteam, JsonUnmarshallerContext> {

    public Workteam unmarshall(JsonUnmarshallerContext context) throws Exception {
        Workteam workteam = new Workteam();

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
                if (context.testExpression("WorkteamName", targetDepth)) {
                    context.nextToken();
                    workteam.setWorkteamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MemberDefinitions", targetDepth)) {
                    context.nextToken();
                    workteam.setMemberDefinitions(new ListUnmarshaller<MemberDefinition>(MemberDefinitionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("WorkteamArn", targetDepth)) {
                    context.nextToken();
                    workteam.setWorkteamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductListingIds", targetDepth)) {
                    context.nextToken();
                    workteam.setProductListingIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    workteam.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubDomain", targetDepth)) {
                    context.nextToken();
                    workteam.setSubDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    workteam.setCreateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    workteam.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workteam;
    }

    private static WorkteamJsonUnmarshaller instance;

    public static WorkteamJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkteamJsonUnmarshaller();
        return instance;
    }
}
