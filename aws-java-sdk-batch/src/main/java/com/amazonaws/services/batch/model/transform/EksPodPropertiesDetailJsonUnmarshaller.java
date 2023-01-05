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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EksPodPropertiesDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksPodPropertiesDetailJsonUnmarshaller implements Unmarshaller<EksPodPropertiesDetail, JsonUnmarshallerContext> {

    public EksPodPropertiesDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        EksPodPropertiesDetail eksPodPropertiesDetail = new EksPodPropertiesDetail();

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
                if (context.testExpression("serviceAccountName", targetDepth)) {
                    context.nextToken();
                    eksPodPropertiesDetail.setServiceAccountName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostNetwork", targetDepth)) {
                    context.nextToken();
                    eksPodPropertiesDetail.setHostNetwork(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("dnsPolicy", targetDepth)) {
                    context.nextToken();
                    eksPodPropertiesDetail.setDnsPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("containers", targetDepth)) {
                    context.nextToken();
                    eksPodPropertiesDetail.setContainers(new ListUnmarshaller<EksContainerDetail>(EksContainerDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("volumes", targetDepth)) {
                    context.nextToken();
                    eksPodPropertiesDetail.setVolumes(new ListUnmarshaller<EksVolume>(EksVolumeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("podName", targetDepth)) {
                    context.nextToken();
                    eksPodPropertiesDetail.setPodName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nodeName", targetDepth)) {
                    context.nextToken();
                    eksPodPropertiesDetail.setNodeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eksPodPropertiesDetail;
    }

    private static EksPodPropertiesDetailJsonUnmarshaller instance;

    public static EksPodPropertiesDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EksPodPropertiesDetailJsonUnmarshaller();
        return instance;
    }
}
