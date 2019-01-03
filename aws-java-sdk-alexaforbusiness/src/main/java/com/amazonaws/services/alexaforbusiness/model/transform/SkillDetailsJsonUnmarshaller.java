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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SkillDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SkillDetailsJsonUnmarshaller implements Unmarshaller<SkillDetails, JsonUnmarshallerContext> {

    public SkillDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        SkillDetails skillDetails = new SkillDetails();

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
                if (context.testExpression("ProductDescription", targetDepth)) {
                    context.nextToken();
                    skillDetails.setProductDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvocationPhrase", targetDepth)) {
                    context.nextToken();
                    skillDetails.setInvocationPhrase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReleaseDate", targetDepth)) {
                    context.nextToken();
                    skillDetails.setReleaseDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndUserLicenseAgreement", targetDepth)) {
                    context.nextToken();
                    skillDetails.setEndUserLicenseAgreement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenericKeywords", targetDepth)) {
                    context.nextToken();
                    skillDetails.setGenericKeywords(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("BulletPoints", targetDepth)) {
                    context.nextToken();
                    skillDetails.setBulletPoints(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NewInThisVersionBulletPoints", targetDepth)) {
                    context.nextToken();
                    skillDetails.setNewInThisVersionBulletPoints(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SkillTypes", targetDepth)) {
                    context.nextToken();
                    skillDetails.setSkillTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Reviews", targetDepth)) {
                    context.nextToken();
                    skillDetails.setReviews(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("DeveloperInfo", targetDepth)) {
                    context.nextToken();
                    skillDetails.setDeveloperInfo(DeveloperInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return skillDetails;
    }

    private static SkillDetailsJsonUnmarshaller instance;

    public static SkillDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SkillDetailsJsonUnmarshaller();
        return instance;
    }
}
