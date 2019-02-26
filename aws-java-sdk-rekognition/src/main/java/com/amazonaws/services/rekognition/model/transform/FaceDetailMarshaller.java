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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FaceDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FaceDetailMarshaller {

    private static final MarshallingInfo<StructuredPojo> BOUNDINGBOX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BoundingBox").build();
    private static final MarshallingInfo<StructuredPojo> AGERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgeRange").build();
    private static final MarshallingInfo<StructuredPojo> SMILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Smile").build();
    private static final MarshallingInfo<StructuredPojo> EYEGLASSES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Eyeglasses").build();
    private static final MarshallingInfo<StructuredPojo> SUNGLASSES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Sunglasses").build();
    private static final MarshallingInfo<StructuredPojo> GENDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Gender").build();
    private static final MarshallingInfo<StructuredPojo> BEARD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Beard").build();
    private static final MarshallingInfo<StructuredPojo> MUSTACHE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Mustache").build();
    private static final MarshallingInfo<StructuredPojo> EYESOPEN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EyesOpen").build();
    private static final MarshallingInfo<StructuredPojo> MOUTHOPEN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MouthOpen").build();
    private static final MarshallingInfo<List> EMOTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Emotions").build();
    private static final MarshallingInfo<List> LANDMARKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Landmarks").build();
    private static final MarshallingInfo<StructuredPojo> POSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Pose").build();
    private static final MarshallingInfo<StructuredPojo> QUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Quality").build();
    private static final MarshallingInfo<Float> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Confidence").build();

    private static final FaceDetailMarshaller instance = new FaceDetailMarshaller();

    public static FaceDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FaceDetail faceDetail, ProtocolMarshaller protocolMarshaller) {

        if (faceDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(faceDetail.getBoundingBox(), BOUNDINGBOX_BINDING);
            protocolMarshaller.marshall(faceDetail.getAgeRange(), AGERANGE_BINDING);
            protocolMarshaller.marshall(faceDetail.getSmile(), SMILE_BINDING);
            protocolMarshaller.marshall(faceDetail.getEyeglasses(), EYEGLASSES_BINDING);
            protocolMarshaller.marshall(faceDetail.getSunglasses(), SUNGLASSES_BINDING);
            protocolMarshaller.marshall(faceDetail.getGender(), GENDER_BINDING);
            protocolMarshaller.marshall(faceDetail.getBeard(), BEARD_BINDING);
            protocolMarshaller.marshall(faceDetail.getMustache(), MUSTACHE_BINDING);
            protocolMarshaller.marshall(faceDetail.getEyesOpen(), EYESOPEN_BINDING);
            protocolMarshaller.marshall(faceDetail.getMouthOpen(), MOUTHOPEN_BINDING);
            protocolMarshaller.marshall(faceDetail.getEmotions(), EMOTIONS_BINDING);
            protocolMarshaller.marshall(faceDetail.getLandmarks(), LANDMARKS_BINDING);
            protocolMarshaller.marshall(faceDetail.getPose(), POSE_BINDING);
            protocolMarshaller.marshall(faceDetail.getQuality(), QUALITY_BINDING);
            protocolMarshaller.marshall(faceDetail.getConfidence(), CONFIDENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
