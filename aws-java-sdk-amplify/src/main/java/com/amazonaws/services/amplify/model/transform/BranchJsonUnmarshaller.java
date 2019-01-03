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
 * Branch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BranchJsonUnmarshaller implements Unmarshaller<Branch, JsonUnmarshallerContext> {

    public Branch unmarshall(JsonUnmarshallerContext context) throws Exception {
        Branch branch = new Branch();

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
                if (context.testExpression("branchArn", targetDepth)) {
                    context.nextToken();
                    branch.setBranchArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("branchName", targetDepth)) {
                    context.nextToken();
                    branch.setBranchName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    branch.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    branch.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("stage", targetDepth)) {
                    context.nextToken();
                    branch.setStage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    branch.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableNotification", targetDepth)) {
                    context.nextToken();
                    branch.setEnableNotification(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    branch.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    branch.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("environmentVariables", targetDepth)) {
                    context.nextToken();
                    branch.setEnvironmentVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("enableAutoBuild", targetDepth)) {
                    context.nextToken();
                    branch.setEnableAutoBuild(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("customDomains", targetDepth)) {
                    context.nextToken();
                    branch.setCustomDomains(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("framework", targetDepth)) {
                    context.nextToken();
                    branch.setFramework(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("activeJobId", targetDepth)) {
                    context.nextToken();
                    branch.setActiveJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalNumberOfJobs", targetDepth)) {
                    context.nextToken();
                    branch.setTotalNumberOfJobs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableBasicAuth", targetDepth)) {
                    context.nextToken();
                    branch.setEnableBasicAuth(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("thumbnailUrl", targetDepth)) {
                    context.nextToken();
                    branch.setThumbnailUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("basicAuthCredentials", targetDepth)) {
                    context.nextToken();
                    branch.setBasicAuthCredentials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("buildSpec", targetDepth)) {
                    context.nextToken();
                    branch.setBuildSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ttl", targetDepth)) {
                    context.nextToken();
                    branch.setTtl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return branch;
    }

    private static BranchJsonUnmarshaller instance;

    public static BranchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BranchJsonUnmarshaller();
        return instance;
    }
}
