/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * FaceDetailMarshaller
 */
public class FaceDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FaceDetail faceDetail, StructuredJsonGenerator jsonGenerator) {

        if (faceDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (faceDetail.getBoundingBox() != null) {
                jsonGenerator.writeFieldName("BoundingBox");
                BoundingBoxJsonMarshaller.getInstance().marshall(faceDetail.getBoundingBox(), jsonGenerator);
            }
            if (faceDetail.getSmile() != null) {
                jsonGenerator.writeFieldName("Smile");
                SmileJsonMarshaller.getInstance().marshall(faceDetail.getSmile(), jsonGenerator);
            }
            if (faceDetail.getEyeglasses() != null) {
                jsonGenerator.writeFieldName("Eyeglasses");
                EyeglassesJsonMarshaller.getInstance().marshall(faceDetail.getEyeglasses(), jsonGenerator);
            }
            if (faceDetail.getSunglasses() != null) {
                jsonGenerator.writeFieldName("Sunglasses");
                SunglassesJsonMarshaller.getInstance().marshall(faceDetail.getSunglasses(), jsonGenerator);
            }
            if (faceDetail.getGender() != null) {
                jsonGenerator.writeFieldName("Gender");
                GenderJsonMarshaller.getInstance().marshall(faceDetail.getGender(), jsonGenerator);
            }
            if (faceDetail.getBeard() != null) {
                jsonGenerator.writeFieldName("Beard");
                BeardJsonMarshaller.getInstance().marshall(faceDetail.getBeard(), jsonGenerator);
            }
            if (faceDetail.getMustache() != null) {
                jsonGenerator.writeFieldName("Mustache");
                MustacheJsonMarshaller.getInstance().marshall(faceDetail.getMustache(), jsonGenerator);
            }
            if (faceDetail.getEyesOpen() != null) {
                jsonGenerator.writeFieldName("EyesOpen");
                EyeOpenJsonMarshaller.getInstance().marshall(faceDetail.getEyesOpen(), jsonGenerator);
            }
            if (faceDetail.getMouthOpen() != null) {
                jsonGenerator.writeFieldName("MouthOpen");
                MouthOpenJsonMarshaller.getInstance().marshall(faceDetail.getMouthOpen(), jsonGenerator);
            }

            java.util.List<Emotion> emotionsList = faceDetail.getEmotions();
            if (emotionsList != null) {
                jsonGenerator.writeFieldName("Emotions");
                jsonGenerator.writeStartArray();
                for (Emotion emotionsListValue : emotionsList) {
                    if (emotionsListValue != null) {

                        EmotionJsonMarshaller.getInstance().marshall(emotionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Landmark> landmarksList = faceDetail.getLandmarks();
            if (landmarksList != null) {
                jsonGenerator.writeFieldName("Landmarks");
                jsonGenerator.writeStartArray();
                for (Landmark landmarksListValue : landmarksList) {
                    if (landmarksListValue != null) {

                        LandmarkJsonMarshaller.getInstance().marshall(landmarksListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (faceDetail.getPose() != null) {
                jsonGenerator.writeFieldName("Pose");
                PoseJsonMarshaller.getInstance().marshall(faceDetail.getPose(), jsonGenerator);
            }
            if (faceDetail.getQuality() != null) {
                jsonGenerator.writeFieldName("Quality");
                ImageQualityJsonMarshaller.getInstance().marshall(faceDetail.getQuality(), jsonGenerator);
            }
            if (faceDetail.getConfidence() != null) {
                jsonGenerator.writeFieldName("Confidence").writeValue(faceDetail.getConfidence());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FaceDetailJsonMarshaller instance;

    public static FaceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FaceDetailJsonMarshaller();
        return instance;
    }

}
