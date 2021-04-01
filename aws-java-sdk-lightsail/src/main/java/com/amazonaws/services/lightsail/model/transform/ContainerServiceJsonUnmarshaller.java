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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContainerService JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServiceJsonUnmarshaller implements Unmarshaller<ContainerService, JsonUnmarshallerContext> {

    public ContainerService unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerService containerService = new ContainerService();

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
                if (context.testExpression("containerServiceName", targetDepth)) {
                    context.nextToken();
                    containerService.setContainerServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    containerService.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    containerService.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    containerService.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    containerService.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    containerService.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("power", targetDepth)) {
                    context.nextToken();
                    containerService.setPower(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("powerId", targetDepth)) {
                    context.nextToken();
                    containerService.setPowerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    containerService.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateDetail", targetDepth)) {
                    context.nextToken();
                    containerService.setStateDetail(ContainerServiceStateDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scale", targetDepth)) {
                    context.nextToken();
                    containerService.setScale(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("currentDeployment", targetDepth)) {
                    context.nextToken();
                    containerService.setCurrentDeployment(ContainerServiceDeploymentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nextDeployment", targetDepth)) {
                    context.nextToken();
                    containerService.setNextDeployment(ContainerServiceDeploymentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("isDisabled", targetDepth)) {
                    context.nextToken();
                    containerService.setIsDisabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("principalArn", targetDepth)) {
                    context.nextToken();
                    containerService.setPrincipalArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privateDomainName", targetDepth)) {
                    context.nextToken();
                    containerService.setPrivateDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publicDomainNames", targetDepth)) {
                    context.nextToken();
                    containerService.setPublicDomainNames(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    containerService.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return containerService;
    }

    private static ContainerServiceJsonUnmarshaller instance;

    public static ContainerServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerServiceJsonUnmarshaller();
        return instance;
    }
}
