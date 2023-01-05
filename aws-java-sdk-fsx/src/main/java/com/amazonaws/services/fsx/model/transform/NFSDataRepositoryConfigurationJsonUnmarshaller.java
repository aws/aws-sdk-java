/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NFSDataRepositoryConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NFSDataRepositoryConfigurationJsonUnmarshaller implements Unmarshaller<NFSDataRepositoryConfiguration, JsonUnmarshallerContext> {

    public NFSDataRepositoryConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        NFSDataRepositoryConfiguration nFSDataRepositoryConfiguration = new NFSDataRepositoryConfiguration();

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
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    nFSDataRepositoryConfiguration.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsIps", targetDepth)) {
                    context.nextToken();
                    nFSDataRepositoryConfiguration.setDnsIps(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AutoExportPolicy", targetDepth)) {
                    context.nextToken();
                    nFSDataRepositoryConfiguration.setAutoExportPolicy(AutoExportPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return nFSDataRepositoryConfiguration;
    }

    private static NFSDataRepositoryConfigurationJsonUnmarshaller instance;

    public static NFSDataRepositoryConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NFSDataRepositoryConfigurationJsonUnmarshaller();
        return instance;
    }
}
