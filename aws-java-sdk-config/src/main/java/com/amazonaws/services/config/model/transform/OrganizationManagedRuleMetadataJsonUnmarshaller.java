/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OrganizationManagedRuleMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationManagedRuleMetadataJsonUnmarshaller implements Unmarshaller<OrganizationManagedRuleMetadata, JsonUnmarshallerContext> {

    public OrganizationManagedRuleMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrganizationManagedRuleMetadata organizationManagedRuleMetadata = new OrganizationManagedRuleMetadata();

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
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    organizationManagedRuleMetadata.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleIdentifier", targetDepth)) {
                    context.nextToken();
                    organizationManagedRuleMetadata.setRuleIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputParameters", targetDepth)) {
                    context.nextToken();
                    organizationManagedRuleMetadata.setInputParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaximumExecutionFrequency", targetDepth)) {
                    context.nextToken();
                    organizationManagedRuleMetadata.setMaximumExecutionFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceTypesScope", targetDepth)) {
                    context.nextToken();
                    organizationManagedRuleMetadata.setResourceTypesScope(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceIdScope", targetDepth)) {
                    context.nextToken();
                    organizationManagedRuleMetadata.setResourceIdScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TagKeyScope", targetDepth)) {
                    context.nextToken();
                    organizationManagedRuleMetadata.setTagKeyScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TagValueScope", targetDepth)) {
                    context.nextToken();
                    organizationManagedRuleMetadata.setTagValueScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return organizationManagedRuleMetadata;
    }

    private static OrganizationManagedRuleMetadataJsonUnmarshaller instance;

    public static OrganizationManagedRuleMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationManagedRuleMetadataJsonUnmarshaller();
        return instance;
    }
}
