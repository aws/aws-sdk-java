/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ProtectiveEquipmentPersonMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProtectiveEquipmentPersonMarshaller {

    private static final MarshallingInfo<List> BODYPARTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BodyParts").build();
    private static final MarshallingInfo<StructuredPojo> BOUNDINGBOX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BoundingBox").build();
    private static final MarshallingInfo<Float> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Confidence").build();
    private static final MarshallingInfo<Integer> ID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();

    private static final ProtectiveEquipmentPersonMarshaller instance = new ProtectiveEquipmentPersonMarshaller();

    public static ProtectiveEquipmentPersonMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProtectiveEquipmentPerson protectiveEquipmentPerson, ProtocolMarshaller protocolMarshaller) {

        if (protectiveEquipmentPerson == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(protectiveEquipmentPerson.getBodyParts(), BODYPARTS_BINDING);
            protocolMarshaller.marshall(protectiveEquipmentPerson.getBoundingBox(), BOUNDINGBOX_BINDING);
            protocolMarshaller.marshall(protectiveEquipmentPerson.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(protectiveEquipmentPerson.getId(), ID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
