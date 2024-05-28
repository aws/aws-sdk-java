/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medicalimaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DICOMTags JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DICOMTagsJsonUnmarshaller implements Unmarshaller<DICOMTags, JsonUnmarshallerContext> {

    public DICOMTags unmarshall(JsonUnmarshallerContext context) throws Exception {
        DICOMTags dICOMTags = new DICOMTags();

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
                if (context.testExpression("DICOMPatientId", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMPatientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMPatientName", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMPatientName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMPatientBirthDate", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMPatientBirthDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMPatientSex", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMPatientSex(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMStudyInstanceUID", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMStudyInstanceUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMStudyId", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMStudyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMStudyDescription", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMStudyDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMNumberOfStudyRelatedSeries", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMNumberOfStudyRelatedSeries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DICOMNumberOfStudyRelatedInstances", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMNumberOfStudyRelatedInstances(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DICOMAccessionNumber", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMAccessionNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMSeriesInstanceUID", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMSeriesInstanceUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMSeriesModality", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMSeriesModality(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMSeriesBodyPart", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMSeriesBodyPart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMSeriesNumber", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMSeriesNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DICOMStudyDate", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMStudyDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DICOMStudyTime", targetDepth)) {
                    context.nextToken();
                    dICOMTags.setDICOMStudyTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dICOMTags;
    }

    private static DICOMTagsJsonUnmarshaller instance;

    public static DICOMTagsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DICOMTagsJsonUnmarshaller();
        return instance;
    }
}
