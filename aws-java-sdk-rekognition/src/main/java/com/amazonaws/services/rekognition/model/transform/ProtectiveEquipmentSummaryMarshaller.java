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
 * ProtectiveEquipmentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProtectiveEquipmentSummaryMarshaller {

    private static final MarshallingInfo<List> PERSONSWITHREQUIREDEQUIPMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PersonsWithRequiredEquipment").build();
    private static final MarshallingInfo<List> PERSONSWITHOUTREQUIREDEQUIPMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PersonsWithoutRequiredEquipment").build();
    private static final MarshallingInfo<List> PERSONSINDETERMINATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PersonsIndeterminate").build();

    private static final ProtectiveEquipmentSummaryMarshaller instance = new ProtectiveEquipmentSummaryMarshaller();

    public static ProtectiveEquipmentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProtectiveEquipmentSummary protectiveEquipmentSummary, ProtocolMarshaller protocolMarshaller) {

        if (protectiveEquipmentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(protectiveEquipmentSummary.getPersonsWithRequiredEquipment(), PERSONSWITHREQUIREDEQUIPMENT_BINDING);
            protocolMarshaller.marshall(protectiveEquipmentSummary.getPersonsWithoutRequiredEquipment(), PERSONSWITHOUTREQUIREDEQUIPMENT_BINDING);
            protocolMarshaller.marshall(protectiveEquipmentSummary.getPersonsIndeterminate(), PERSONSINDETERMINATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
