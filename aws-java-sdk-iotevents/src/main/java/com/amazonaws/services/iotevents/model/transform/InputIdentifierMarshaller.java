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
package com.amazonaws.services.iotevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputIdentifierMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputIdentifierMarshaller {

    private static final MarshallingInfo<StructuredPojo> IOTEVENTSINPUTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotEventsInputIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> IOTSITEWISEINPUTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotSiteWiseInputIdentifier").build();

    private static final InputIdentifierMarshaller instance = new InputIdentifierMarshaller();

    public static InputIdentifierMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputIdentifier inputIdentifier, ProtocolMarshaller protocolMarshaller) {

        if (inputIdentifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputIdentifier.getIotEventsInputIdentifier(), IOTEVENTSINPUTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(inputIdentifier.getIotSiteWiseInputIdentifier(), IOTSITEWISEINPUTIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
