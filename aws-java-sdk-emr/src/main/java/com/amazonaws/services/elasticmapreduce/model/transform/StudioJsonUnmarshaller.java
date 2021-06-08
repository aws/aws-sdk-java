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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Studio JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioJsonUnmarshaller implements Unmarshaller<Studio, JsonUnmarshallerContext> {

    public Studio unmarshall(JsonUnmarshallerContext context) throws Exception {
        Studio studio = new Studio();

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
                if (context.testExpression("StudioId", targetDepth)) {
                    context.nextToken();
                    studio.setStudioId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StudioArn", targetDepth)) {
                    context.nextToken();
                    studio.setStudioArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    studio.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    studio.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthMode", targetDepth)) {
                    context.nextToken();
                    studio.setAuthMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    studio.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    context.nextToken();
                    studio.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    studio.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserRole", targetDepth)) {
                    context.nextToken();
                    studio.setUserRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkspaceSecurityGroupId", targetDepth)) {
                    context.nextToken();
                    studio.setWorkspaceSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineSecurityGroupId", targetDepth)) {
                    context.nextToken();
                    studio.setEngineSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    studio.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    studio.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DefaultS3Location", targetDepth)) {
                    context.nextToken();
                    studio.setDefaultS3Location(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    studio.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return studio;
    }

    private static StudioJsonUnmarshaller instance;

    public static StudioJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StudioJsonUnmarshaller();
        return instance;
    }
}
