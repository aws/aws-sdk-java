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
 * DomainStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainStatusJsonUnmarshaller implements Unmarshaller<DomainStatus, JsonUnmarshallerContext> {

    public DomainStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainStatus domainStatus = new DomainStatus();

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
                if (context.testExpression("DomainId", targetDepth)) {
                    context.nextToken();
                    domainStatus.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    domainStatus.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ARN", targetDepth)) {
                    context.nextToken();
                    domainStatus.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    domainStatus.setCreated(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Deleted", targetDepth)) {
                    context.nextToken();
                    domainStatus.setDeleted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    domainStatus.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Endpoints", targetDepth)) {
                    context.nextToken();
                    domainStatus.setEndpoints(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("Processing", targetDepth)) {
                    context.nextToken();
                    domainStatus.setProcessing(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UpgradeProcessing", targetDepth)) {
                    context.nextToken();
                    domainStatus.setUpgradeProcessing(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    domainStatus.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterConfig", targetDepth)) {
                    context.nextToken();
                    domainStatus.setClusterConfig(ClusterConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EBSOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setEBSOptions(EBSOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AccessPolicies", targetDepth)) {
                    context.nextToken();
                    domainStatus.setAccessPolicies(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setSnapshotOptions(SnapshotOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VPCOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setVPCOptions(VPCDerivedInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CognitoOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setCognitoOptions(CognitoOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionAtRestOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setEncryptionAtRestOptions(EncryptionAtRestOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NodeToNodeEncryptionOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setAdvancedOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LogPublishingOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setLogPublishingOptions(new MapUnmarshaller<String, LogPublishingOption>(context.getUnmarshaller(String.class),
                            LogPublishingOptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ServiceSoftwareOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setServiceSoftwareOptions(ServiceSoftwareOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DomainEndpointOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setDomainEndpointOptions(DomainEndpointOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedSecurityOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setAdvancedSecurityOptions(AdvancedSecurityOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoTuneOptions", targetDepth)) {
                    context.nextToken();
                    domainStatus.setAutoTuneOptions(AutoTuneOptionsOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChangeProgressDetails", targetDepth)) {
                    context.nextToken();
                    domainStatus.setChangeProgressDetails(ChangeProgressDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainStatus;
    }

    private static DomainStatusJsonUnmarshaller instance;

    public static DomainStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainStatusJsonUnmarshaller();
        return instance;
    }
}
