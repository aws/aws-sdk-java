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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsSecurityFinding JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSecurityFindingJsonUnmarshaller implements Unmarshaller<AwsSecurityFinding, JsonUnmarshallerContext> {

    public AwsSecurityFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsSecurityFinding awsSecurityFinding = new AwsSecurityFinding();

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
                if (context.testExpression("SchemaVersion", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductArn", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setProductArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GeneratorId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setGeneratorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Types", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("FirstObservedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setFirstObservedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastObservedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setLastObservedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setUpdatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setSeverity(SeverityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Confidence", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Criticality", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setCriticality(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Remediation", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setRemediation(RemediationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceUrl", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setSourceUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductFields", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setProductFields(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("UserDefinedFields", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setUserDefinedFields(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Malware", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setMalware(new ListUnmarshaller<Malware>(MalwareJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Network", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setNetwork(NetworkJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Process", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setProcess(ProcessDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicators", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setThreatIntelIndicators(new ListUnmarshaller<ThreatIntelIndicator>(ThreatIntelIndicatorJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Resources", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Compliance", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setCompliance(ComplianceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VerificationState", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setVerificationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkflowState", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setWorkflowState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecordState", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setRecordState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RelatedFindings", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setRelatedFindings(new ListUnmarshaller<RelatedFinding>(RelatedFindingJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Note", targetDepth)) {
                    context.nextToken();
                    awsSecurityFinding.setNote(NoteJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsSecurityFinding;
    }

    private static AwsSecurityFindingJsonUnmarshaller instance;

    public static AwsSecurityFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecurityFindingJsonUnmarshaller();
        return instance;
    }
}
