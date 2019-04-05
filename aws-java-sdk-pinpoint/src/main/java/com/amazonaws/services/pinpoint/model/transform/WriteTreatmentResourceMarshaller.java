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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WriteTreatmentResourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WriteTreatmentResourceMarshaller {

    private static final MarshallingInfo<StructuredPojo> MESSAGECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schedule").build();
    private static final MarshallingInfo<Integer> SIZEPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizePercent").build();
    private static final MarshallingInfo<String> TREATMENTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatmentDescription").build();
    private static final MarshallingInfo<String> TREATMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatmentName").build();

    private static final WriteTreatmentResourceMarshaller instance = new WriteTreatmentResourceMarshaller();

    public static WriteTreatmentResourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WriteTreatmentResource writeTreatmentResource, ProtocolMarshaller protocolMarshaller) {

        if (writeTreatmentResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(writeTreatmentResource.getMessageConfiguration(), MESSAGECONFIGURATION_BINDING);
            protocolMarshaller.marshall(writeTreatmentResource.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(writeTreatmentResource.getSizePercent(), SIZEPERCENT_BINDING);
            protocolMarshaller.marshall(writeTreatmentResource.getTreatmentDescription(), TREATMENTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(writeTreatmentResource.getTreatmentName(), TREATMENTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
