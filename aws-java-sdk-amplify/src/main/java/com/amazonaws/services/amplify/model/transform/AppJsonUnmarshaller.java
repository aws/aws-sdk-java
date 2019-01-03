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
package com.amazonaws.services.amplify.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * App JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppJsonUnmarshaller implements Unmarshaller<App, JsonUnmarshallerContext> {

    public App unmarshall(JsonUnmarshallerContext context) throws Exception {
        App app = new App();

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
                if (context.testExpression("appId", targetDepth)) {
                    context.nextToken();
                    app.setAppId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appArn", targetDepth)) {
                    context.nextToken();
                    app.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    app.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    app.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    app.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repository", targetDepth)) {
                    context.nextToken();
                    app.setRepository(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    app.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    app.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    app.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("iamServiceRoleArn", targetDepth)) {
                    context.nextToken();
                    app.setIamServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentVariables", targetDepth)) {
                    context.nextToken();
                    app.setEnvironmentVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("defaultDomain", targetDepth)) {
                    context.nextToken();
                    app.setDefaultDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableBranchAutoBuild", targetDepth)) {
                    context.nextToken();
                    app.setEnableBranchAutoBuild(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("enableBasicAuth", targetDepth)) {
                    context.nextToken();
                    app.setEnableBasicAuth(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("basicAuthCredentials", targetDepth)) {
                    context.nextToken();
                    app.setBasicAuthCredentials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customRules", targetDepth)) {
                    context.nextToken();
                    app.setCustomRules(new ListUnmarshaller<CustomRule>(CustomRuleJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("productionBranch", targetDepth)) {
                    context.nextToken();
                    app.setProductionBranch(ProductionBranchJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("buildSpec", targetDepth)) {
                    context.nextToken();
                    app.setBuildSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return app;
    }

    private static AppJsonUnmarshaller instance;

    public static AppJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppJsonUnmarshaller();
        return instance;
    }
}
