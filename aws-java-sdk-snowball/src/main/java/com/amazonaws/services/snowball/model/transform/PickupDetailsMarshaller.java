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
package com.amazonaws.services.snowball.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PickupDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PickupDetailsMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> PHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumber").build();
    private static final MarshallingInfo<String> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Email").build();
    private static final MarshallingInfo<String> IDENTIFICATIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentificationNumber").build();
    private static final MarshallingInfo<java.util.Date> IDENTIFICATIONEXPIRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentificationExpirationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IDENTIFICATIONISSUINGORG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentificationIssuingOrg").build();
    private static final MarshallingInfo<String> DEVICEPICKUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DevicePickupId").build();

    private static final PickupDetailsMarshaller instance = new PickupDetailsMarshaller();

    public static PickupDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PickupDetails pickupDetails, ProtocolMarshaller protocolMarshaller) {

        if (pickupDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pickupDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(pickupDetails.getPhoneNumber(), PHONENUMBER_BINDING);
            protocolMarshaller.marshall(pickupDetails.getEmail(), EMAIL_BINDING);
            protocolMarshaller.marshall(pickupDetails.getIdentificationNumber(), IDENTIFICATIONNUMBER_BINDING);
            protocolMarshaller.marshall(pickupDetails.getIdentificationExpirationDate(), IDENTIFICATIONEXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(pickupDetails.getIdentificationIssuingOrg(), IDENTIFICATIONISSUINGORG_BINDING);
            protocolMarshaller.marshall(pickupDetails.getDevicePickupId(), DEVICEPICKUPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
