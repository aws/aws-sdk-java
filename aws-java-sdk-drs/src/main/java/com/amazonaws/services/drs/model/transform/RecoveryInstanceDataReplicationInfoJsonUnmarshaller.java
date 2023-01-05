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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecoveryInstanceDataReplicationInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstanceDataReplicationInfoJsonUnmarshaller implements Unmarshaller<RecoveryInstanceDataReplicationInfo, JsonUnmarshallerContext> {

    public RecoveryInstanceDataReplicationInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecoveryInstanceDataReplicationInfo recoveryInstanceDataReplicationInfo = new RecoveryInstanceDataReplicationInfo();

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
                if (context.testExpression("dataReplicationError", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceDataReplicationInfo.setDataReplicationError(RecoveryInstanceDataReplicationErrorJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("dataReplicationInitiation", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceDataReplicationInfo.setDataReplicationInitiation(RecoveryInstanceDataReplicationInitiationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("dataReplicationState", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceDataReplicationInfo.setDataReplicationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("etaDateTime", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceDataReplicationInfo.setEtaDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lagDuration", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceDataReplicationInfo.setLagDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatedDisks", targetDepth)) {
                    context.nextToken();
                    recoveryInstanceDataReplicationInfo.setReplicatedDisks(new ListUnmarshaller<RecoveryInstanceDataReplicationInfoReplicatedDisk>(
                            RecoveryInstanceDataReplicationInfoReplicatedDiskJsonUnmarshaller.getInstance())

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

        return recoveryInstanceDataReplicationInfo;
    }

    private static RecoveryInstanceDataReplicationInfoJsonUnmarshaller instance;

    public static RecoveryInstanceDataReplicationInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryInstanceDataReplicationInfoJsonUnmarshaller();
        return instance;
    }
}
