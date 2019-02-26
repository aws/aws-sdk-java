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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DestinationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationDescriptionJsonUnmarshaller implements Unmarshaller<DestinationDescription, JsonUnmarshallerContext> {

    public DestinationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        DestinationDescription destinationDescription = new DestinationDescription();

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
                if (context.testExpression("DestinationId", targetDepth)) {
                    context.nextToken();
                    destinationDescription.setDestinationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3DestinationDescription", targetDepth)) {
                    context.nextToken();
                    destinationDescription.setS3DestinationDescription(S3DestinationDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExtendedS3DestinationDescription", targetDepth)) {
                    context.nextToken();
                    destinationDescription.setExtendedS3DestinationDescription(ExtendedS3DestinationDescriptionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("RedshiftDestinationDescription", targetDepth)) {
                    context.nextToken();
                    destinationDescription.setRedshiftDestinationDescription(RedshiftDestinationDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ElasticsearchDestinationDescription", targetDepth)) {
                    context.nextToken();
                    destinationDescription.setElasticsearchDestinationDescription(ElasticsearchDestinationDescriptionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("SplunkDestinationDescription", targetDepth)) {
                    context.nextToken();
                    destinationDescription.setSplunkDestinationDescription(SplunkDestinationDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return destinationDescription;
    }

    private static DestinationDescriptionJsonUnmarshaller instance;

    public static DestinationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DestinationDescriptionJsonUnmarshaller();
        return instance;
    }
}
