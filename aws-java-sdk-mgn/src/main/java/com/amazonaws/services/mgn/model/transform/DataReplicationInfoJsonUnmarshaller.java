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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataReplicationInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataReplicationInfoJsonUnmarshaller implements Unmarshaller<DataReplicationInfo, JsonUnmarshallerContext> {

    public DataReplicationInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataReplicationInfo dataReplicationInfo = new DataReplicationInfo();

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
                    dataReplicationInfo.setDataReplicationError(DataReplicationErrorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataReplicationInitiation", targetDepth)) {
                    context.nextToken();
                    dataReplicationInfo.setDataReplicationInitiation(DataReplicationInitiationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataReplicationState", targetDepth)) {
                    context.nextToken();
                    dataReplicationInfo.setDataReplicationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("etaDateTime", targetDepth)) {
                    context.nextToken();
                    dataReplicationInfo.setEtaDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lagDuration", targetDepth)) {
                    context.nextToken();
                    dataReplicationInfo.setLagDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatedDisks", targetDepth)) {
                    context.nextToken();
                    dataReplicationInfo.setReplicatedDisks(new ListUnmarshaller<DataReplicationInfoReplicatedDisk>(
                            DataReplicationInfoReplicatedDiskJsonUnmarshaller.getInstance())

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

        return dataReplicationInfo;
    }

    private static DataReplicationInfoJsonUnmarshaller instance;

    public static DataReplicationInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataReplicationInfoJsonUnmarshaller();
        return instance;
    }
}
