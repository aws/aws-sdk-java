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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DevEndpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DevEndpointJsonUnmarshaller implements Unmarshaller<DevEndpoint, JsonUnmarshallerContext> {

    public DevEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        DevEndpoint devEndpoint = new DevEndpoint();

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
                if (context.testExpression("EndpointName", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("YarnEndpointAddress", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setYarnEndpointAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateAddress", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setPrivateAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ZeppelinRemoteSparkInterpreterPort", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setZeppelinRemoteSparkInterpreterPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PublicAddress", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setPublicAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfNodes", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setNumberOfNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraPythonLibsS3Path", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setExtraPythonLibsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraJarsS3Path", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setExtraJarsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateStatus", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setLastUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PublicKey", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setPublicKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicKeys", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setPublicKeys(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arguments", targetDepth)) {
                    context.nextToken();
                    devEndpoint.setArguments(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return devEndpoint;
    }

    private static DevEndpointJsonUnmarshaller instance;

    public static DevEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DevEndpointJsonUnmarshaller();
        return instance;
    }
}
