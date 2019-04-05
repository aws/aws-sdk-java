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
package com.amazonaws.services.servermigration.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicationJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationJobJsonUnmarshaller implements Unmarshaller<ReplicationJob, JsonUnmarshallerContext> {

    public ReplicationJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationJob replicationJob = new ReplicationJob();

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
                if (context.testExpression("replicationJobId", targetDepth)) {
                    context.nextToken();
                    replicationJob.setReplicationJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serverId", targetDepth)) {
                    context.nextToken();
                    replicationJob.setServerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serverType", targetDepth)) {
                    context.nextToken();
                    replicationJob.setServerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vmServer", targetDepth)) {
                    context.nextToken();
                    replicationJob.setVmServer(VmServerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("seedReplicationTime", targetDepth)) {
                    context.nextToken();
                    replicationJob.setSeedReplicationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("frequency", targetDepth)) {
                    context.nextToken();
                    replicationJob.setFrequency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("runOnce", targetDepth)) {
                    context.nextToken();
                    replicationJob.setRunOnce(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("nextReplicationRunStartTime", targetDepth)) {
                    context.nextToken();
                    replicationJob.setNextReplicationRunStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("licenseType", targetDepth)) {
                    context.nextToken();
                    replicationJob.setLicenseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleName", targetDepth)) {
                    context.nextToken();
                    replicationJob.setRoleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestAmiId", targetDepth)) {
                    context.nextToken();
                    replicationJob.setLatestAmiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    replicationJob.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    replicationJob.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    replicationJob.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfRecentAmisToKeep", targetDepth)) {
                    context.nextToken();
                    replicationJob.setNumberOfRecentAmisToKeep(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("encrypted", targetDepth)) {
                    context.nextToken();
                    replicationJob.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    replicationJob.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationRunList", targetDepth)) {
                    context.nextToken();
                    replicationJob
                            .setReplicationRunList(new ListUnmarshaller<ReplicationRun>(ReplicationRunJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicationJob;
    }

    private static ReplicationJobJsonUnmarshaller instance;

    public static ReplicationJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationJobJsonUnmarshaller();
        return instance;
    }
}
