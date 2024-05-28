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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegistrationFieldValueInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegistrationFieldValueInformationMarshaller {

    private static final MarshallingInfo<String> FIELDPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldPath").build();
    private static final MarshallingInfo<List> SELECTCHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SelectChoices").build();
    private static final MarshallingInfo<String> TEXTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextValue").build();
    private static final MarshallingInfo<String> REGISTRATIONATTACHMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationAttachmentId").build();
    private static final MarshallingInfo<String> DENIEDREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeniedReason").build();

    private static final RegistrationFieldValueInformationMarshaller instance = new RegistrationFieldValueInformationMarshaller();

    public static RegistrationFieldValueInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegistrationFieldValueInformation registrationFieldValueInformation, ProtocolMarshaller protocolMarshaller) {

        if (registrationFieldValueInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registrationFieldValueInformation.getFieldPath(), FIELDPATH_BINDING);
            protocolMarshaller.marshall(registrationFieldValueInformation.getSelectChoices(), SELECTCHOICES_BINDING);
            protocolMarshaller.marshall(registrationFieldValueInformation.getTextValue(), TEXTVALUE_BINDING);
            protocolMarshaller.marshall(registrationFieldValueInformation.getRegistrationAttachmentId(), REGISTRATIONATTACHMENTID_BINDING);
            protocolMarshaller.marshall(registrationFieldValueInformation.getDeniedReason(), DENIEDREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
