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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartFaceSearchRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartFaceSearchRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> VIDEO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Video").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken").build();
    private static final MarshallingInfo<Float> FACEMATCHTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FaceMatchThreshold").build();
    private static final MarshallingInfo<String> COLLECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectionId").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationChannel").build();
    private static final MarshallingInfo<String> JOBTAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobTag").build();

    private static final StartFaceSearchRequestMarshaller instance = new StartFaceSearchRequestMarshaller();

    public static StartFaceSearchRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartFaceSearchRequest startFaceSearchRequest, ProtocolMarshaller protocolMarshaller) {

        if (startFaceSearchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startFaceSearchRequest.getVideo(), VIDEO_BINDING);
            protocolMarshaller.marshall(startFaceSearchRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(startFaceSearchRequest.getFaceMatchThreshold(), FACEMATCHTHRESHOLD_BINDING);
            protocolMarshaller.marshall(startFaceSearchRequest.getCollectionId(), COLLECTIONID_BINDING);
            protocolMarshaller.marshall(startFaceSearchRequest.getNotificationChannel(), NOTIFICATIONCHANNEL_BINDING);
            protocolMarshaller.marshall(startFaceSearchRequest.getJobTag(), JOBTAG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
