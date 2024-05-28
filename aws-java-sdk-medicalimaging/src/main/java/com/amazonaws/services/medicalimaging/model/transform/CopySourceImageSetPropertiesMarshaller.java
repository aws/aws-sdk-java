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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medicalimaging.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CopySourceImageSetPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CopySourceImageSetPropertiesMarshaller {

    private static final MarshallingInfo<String> IMAGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageSetId").build();
    private static final MarshallingInfo<String> LATESTVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestVersionId").build();
    private static final MarshallingInfo<String> IMAGESETSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageSetState").build();
    private static final MarshallingInfo<String> IMAGESETWORKFLOWSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageSetWorkflowStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IMAGESETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageSetArn").build();

    private static final CopySourceImageSetPropertiesMarshaller instance = new CopySourceImageSetPropertiesMarshaller();

    public static CopySourceImageSetPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CopySourceImageSetProperties copySourceImageSetProperties, ProtocolMarshaller protocolMarshaller) {

        if (copySourceImageSetProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(copySourceImageSetProperties.getImageSetId(), IMAGESETID_BINDING);
            protocolMarshaller.marshall(copySourceImageSetProperties.getLatestVersionId(), LATESTVERSIONID_BINDING);
            protocolMarshaller.marshall(copySourceImageSetProperties.getImageSetState(), IMAGESETSTATE_BINDING);
            protocolMarshaller.marshall(copySourceImageSetProperties.getImageSetWorkflowStatus(), IMAGESETWORKFLOWSTATUS_BINDING);
            protocolMarshaller.marshall(copySourceImageSetProperties.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(copySourceImageSetProperties.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(copySourceImageSetProperties.getImageSetArn(), IMAGESETARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
