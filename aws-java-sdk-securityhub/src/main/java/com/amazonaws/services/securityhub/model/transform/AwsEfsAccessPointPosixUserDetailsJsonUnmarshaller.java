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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEfsAccessPointPosixUserDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEfsAccessPointPosixUserDetailsJsonUnmarshaller implements Unmarshaller<AwsEfsAccessPointPosixUserDetails, JsonUnmarshallerContext> {

    public AwsEfsAccessPointPosixUserDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEfsAccessPointPosixUserDetails awsEfsAccessPointPosixUserDetails = new AwsEfsAccessPointPosixUserDetails();

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
                if (context.testExpression("Gid", targetDepth)) {
                    context.nextToken();
                    awsEfsAccessPointPosixUserDetails.setGid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecondaryGids", targetDepth)) {
                    context.nextToken();
                    awsEfsAccessPointPosixUserDetails.setSecondaryGids(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Uid", targetDepth)) {
                    context.nextToken();
                    awsEfsAccessPointPosixUserDetails.setUid(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEfsAccessPointPosixUserDetails;
    }

    private static AwsEfsAccessPointPosixUserDetailsJsonUnmarshaller instance;

    public static AwsEfsAccessPointPosixUserDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEfsAccessPointPosixUserDetailsJsonUnmarshaller();
        return instance;
    }
}
