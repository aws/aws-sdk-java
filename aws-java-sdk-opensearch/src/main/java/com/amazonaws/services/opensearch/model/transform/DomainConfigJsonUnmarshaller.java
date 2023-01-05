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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DomainConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainConfigJsonUnmarshaller implements Unmarshaller<DomainConfig, JsonUnmarshallerContext> {

    public DomainConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainConfig domainConfig = new DomainConfig();

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
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    domainConfig.setEngineVersion(VersionStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClusterConfig", targetDepth)) {
                    context.nextToken();
                    domainConfig.setClusterConfig(ClusterConfigStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EBSOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setEBSOptions(EBSOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AccessPolicies", targetDepth)) {
                    context.nextToken();
                    domainConfig.setAccessPolicies(AccessPoliciesStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnapshotOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setSnapshotOptions(SnapshotOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VPCOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setVPCOptions(VPCDerivedInfoStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CognitoOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setCognitoOptions(CognitoOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionAtRestOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setEncryptionAtRestOptions(EncryptionAtRestOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NodeToNodeEncryptionOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setAdvancedOptions(AdvancedOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LogPublishingOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setLogPublishingOptions(LogPublishingOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DomainEndpointOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setDomainEndpointOptions(DomainEndpointOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedSecurityOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setAdvancedSecurityOptions(AdvancedSecurityOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoTuneOptions", targetDepth)) {
                    context.nextToken();
                    domainConfig.setAutoTuneOptions(AutoTuneOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChangeProgressDetails", targetDepth)) {
                    context.nextToken();
                    domainConfig.setChangeProgressDetails(ChangeProgressDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainConfig;
    }

    private static DomainConfigJsonUnmarshaller instance;

    public static DomainConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainConfigJsonUnmarshaller();
        return instance;
    }
}
