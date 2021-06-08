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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfluenceConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluenceConfigurationJsonUnmarshaller implements Unmarshaller<ConfluenceConfiguration, JsonUnmarshallerContext> {

    public ConfluenceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfluenceConfiguration confluenceConfiguration = new ConfluenceConfiguration();

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
                if (context.testExpression("ServerUrl", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setServerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SpaceConfiguration", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setSpaceConfiguration(ConfluenceSpaceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PageConfiguration", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setPageConfiguration(ConfluencePageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BlogConfiguration", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setBlogConfiguration(ConfluenceBlogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachmentConfiguration", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setAttachmentConfiguration(ConfluenceAttachmentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InclusionPatterns", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionPatterns", targetDepth)) {
                    context.nextToken();
                    confluenceConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return confluenceConfiguration;
    }

    private static ConfluenceConfigurationJsonUnmarshaller instance;

    public static ConfluenceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfluenceConfigurationJsonUnmarshaller();
        return instance;
    }
}
