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
package com.amazonaws.services.rekognition.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FaceDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaceDetailJsonUnmarshaller implements Unmarshaller<FaceDetail, JsonUnmarshallerContext> {

    public FaceDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        FaceDetail faceDetail = new FaceDetail();

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
                if (context.testExpression("BoundingBox", targetDepth)) {
                    context.nextToken();
                    faceDetail.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AgeRange", targetDepth)) {
                    context.nextToken();
                    faceDetail.setAgeRange(AgeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Smile", targetDepth)) {
                    context.nextToken();
                    faceDetail.setSmile(SmileJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Eyeglasses", targetDepth)) {
                    context.nextToken();
                    faceDetail.setEyeglasses(EyeglassesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Sunglasses", targetDepth)) {
                    context.nextToken();
                    faceDetail.setSunglasses(SunglassesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Gender", targetDepth)) {
                    context.nextToken();
                    faceDetail.setGender(GenderJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Beard", targetDepth)) {
                    context.nextToken();
                    faceDetail.setBeard(BeardJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Mustache", targetDepth)) {
                    context.nextToken();
                    faceDetail.setMustache(MustacheJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EyesOpen", targetDepth)) {
                    context.nextToken();
                    faceDetail.setEyesOpen(EyeOpenJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MouthOpen", targetDepth)) {
                    context.nextToken();
                    faceDetail.setMouthOpen(MouthOpenJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Emotions", targetDepth)) {
                    context.nextToken();
                    faceDetail.setEmotions(new ListUnmarshaller<Emotion>(EmotionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Landmarks", targetDepth)) {
                    context.nextToken();
                    faceDetail.setLandmarks(new ListUnmarshaller<Landmark>(LandmarkJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Pose", targetDepth)) {
                    context.nextToken();
                    faceDetail.setPose(PoseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Quality", targetDepth)) {
                    context.nextToken();
                    faceDetail.setQuality(ImageQualityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Confidence", targetDepth)) {
                    context.nextToken();
                    faceDetail.setConfidence(context.getUnmarshaller(Float.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return faceDetail;
    }

    private static FaceDetailJsonUnmarshaller instance;

    public static FaceDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FaceDetailJsonUnmarshaller();
        return instance;
    }
}
