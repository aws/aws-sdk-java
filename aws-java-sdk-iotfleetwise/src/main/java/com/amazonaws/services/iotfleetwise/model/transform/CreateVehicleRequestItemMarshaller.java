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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateVehicleRequestItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateVehicleRequestItemMarshaller {

    private static final MarshallingInfo<String> VEHICLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vehicleName").build();
    private static final MarshallingInfo<String> MODELMANIFESTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelManifestArn").build();
    private static final MarshallingInfo<String> DECODERMANIFESTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decoderManifestArn").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();
    private static final MarshallingInfo<String> ASSOCIATIONBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationBehavior").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateVehicleRequestItemMarshaller instance = new CreateVehicleRequestItemMarshaller();

    public static CreateVehicleRequestItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateVehicleRequestItem createVehicleRequestItem, ProtocolMarshaller protocolMarshaller) {

        if (createVehicleRequestItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createVehicleRequestItem.getVehicleName(), VEHICLENAME_BINDING);
            protocolMarshaller.marshall(createVehicleRequestItem.getModelManifestArn(), MODELMANIFESTARN_BINDING);
            protocolMarshaller.marshall(createVehicleRequestItem.getDecoderManifestArn(), DECODERMANIFESTARN_BINDING);
            protocolMarshaller.marshall(createVehicleRequestItem.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(createVehicleRequestItem.getAssociationBehavior(), ASSOCIATIONBEHAVIOR_BINDING);
            protocolMarshaller.marshall(createVehicleRequestItem.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
