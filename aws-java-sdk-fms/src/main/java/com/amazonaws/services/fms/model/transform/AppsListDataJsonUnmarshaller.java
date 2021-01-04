/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppsListData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppsListDataJsonUnmarshaller implements Unmarshaller<AppsListData, JsonUnmarshallerContext> {

    public AppsListData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppsListData appsListData = new AppsListData();

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
                if (context.testExpression("ListId", targetDepth)) {
                    context.nextToken();
                    appsListData.setListId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ListName", targetDepth)) {
                    context.nextToken();
                    appsListData.setListName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ListUpdateToken", targetDepth)) {
                    context.nextToken();
                    appsListData.setListUpdateToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    appsListData.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdateTime", targetDepth)) {
                    context.nextToken();
                    appsListData.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AppsList", targetDepth)) {
                    context.nextToken();
                    appsListData.setAppsList(new ListUnmarshaller<App>(AppJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PreviousAppsList", targetDepth)) {
                    context.nextToken();
                    appsListData.setPreviousAppsList(new MapUnmarshaller<String, java.util.List<App>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<App>(AppJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return appsListData;
    }

    private static AppsListDataJsonUnmarshaller instance;

    public static AppsListDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppsListDataJsonUnmarshaller();
        return instance;
    }
}
