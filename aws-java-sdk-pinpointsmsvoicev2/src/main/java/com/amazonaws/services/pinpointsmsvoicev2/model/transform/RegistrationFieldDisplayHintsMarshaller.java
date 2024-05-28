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
 * RegistrationFieldDisplayHintsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegistrationFieldDisplayHintsMarshaller {

    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> SHORTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShortDescription").build();
    private static final MarshallingInfo<String> LONGDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongDescription").build();
    private static final MarshallingInfo<String> DOCUMENTATIONTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentationTitle").build();
    private static final MarshallingInfo<String> DOCUMENTATIONLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentationLink").build();
    private static final MarshallingInfo<List> SELECTOPTIONDESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectOptionDescriptions").build();
    private static final MarshallingInfo<String> TEXTVALIDATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextValidationDescription").build();
    private static final MarshallingInfo<String> EXAMPLETEXTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExampleTextValue").build();

    private static final RegistrationFieldDisplayHintsMarshaller instance = new RegistrationFieldDisplayHintsMarshaller();

    public static RegistrationFieldDisplayHintsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegistrationFieldDisplayHints registrationFieldDisplayHints, ProtocolMarshaller protocolMarshaller) {

        if (registrationFieldDisplayHints == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registrationFieldDisplayHints.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(registrationFieldDisplayHints.getShortDescription(), SHORTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(registrationFieldDisplayHints.getLongDescription(), LONGDESCRIPTION_BINDING);
            protocolMarshaller.marshall(registrationFieldDisplayHints.getDocumentationTitle(), DOCUMENTATIONTITLE_BINDING);
            protocolMarshaller.marshall(registrationFieldDisplayHints.getDocumentationLink(), DOCUMENTATIONLINK_BINDING);
            protocolMarshaller.marshall(registrationFieldDisplayHints.getSelectOptionDescriptions(), SELECTOPTIONDESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(registrationFieldDisplayHints.getTextValidationDescription(), TEXTVALIDATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(registrationFieldDisplayHints.getExampleTextValue(), EXAMPLETEXTVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
