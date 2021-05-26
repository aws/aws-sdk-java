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
package com.amazonaws.services.mwaa.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mwaa.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Environment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentJsonUnmarshaller implements Unmarshaller<Environment, JsonUnmarshallerContext> {

    public Environment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Environment environment = new Environment();

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
                if (context.testExpression("AirflowConfigurationOptions", targetDepth)) {
                    context.nextToken();
                    environment.setAirflowConfigurationOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AirflowVersion", targetDepth)) {
                    context.nextToken();
                    environment.setAirflowVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    environment.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    environment.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DagS3Path", targetDepth)) {
                    context.nextToken();
                    environment.setDagS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentClass", targetDepth)) {
                    context.nextToken();
                    environment.setEnvironmentClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    environment.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKey", targetDepth)) {
                    context.nextToken();
                    environment.setKmsKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdate", targetDepth)) {
                    context.nextToken();
                    environment.setLastUpdate(LastUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LoggingConfiguration", targetDepth)) {
                    context.nextToken();
                    environment.setLoggingConfiguration(LoggingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxWorkers", targetDepth)) {
                    context.nextToken();
                    environment.setMaxWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MinWorkers", targetDepth)) {
                    context.nextToken();
                    environment.setMinWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    environment.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkConfiguration", targetDepth)) {
                    context.nextToken();
                    environment.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PluginsS3ObjectVersion", targetDepth)) {
                    context.nextToken();
                    environment.setPluginsS3ObjectVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PluginsS3Path", targetDepth)) {
                    context.nextToken();
                    environment.setPluginsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequirementsS3ObjectVersion", targetDepth)) {
                    context.nextToken();
                    environment.setRequirementsS3ObjectVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequirementsS3Path", targetDepth)) {
                    context.nextToken();
                    environment.setRequirementsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedulers", targetDepth)) {
                    context.nextToken();
                    environment.setSchedulers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    context.nextToken();
                    environment.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBucketArn", targetDepth)) {
                    context.nextToken();
                    environment.setSourceBucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    environment.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    environment.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("WebserverAccessMode", targetDepth)) {
                    context.nextToken();
                    environment.setWebserverAccessMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WebserverUrl", targetDepth)) {
                    context.nextToken();
                    environment.setWebserverUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WeeklyMaintenanceWindowStart", targetDepth)) {
                    context.nextToken();
                    environment.setWeeklyMaintenanceWindowStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return environment;
    }

    private static EnvironmentJsonUnmarshaller instance;

    public static EnvironmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentJsonUnmarshaller();
        return instance;
    }
}
