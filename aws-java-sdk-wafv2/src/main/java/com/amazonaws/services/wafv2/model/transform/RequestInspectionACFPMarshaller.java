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
package com.amazonaws.services.wafv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RequestInspectionACFPMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RequestInspectionACFPMarshaller {

    private static final MarshallingInfo<String> PAYLOADTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PayloadType").build();
    private static final MarshallingInfo<StructuredPojo> USERNAMEFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsernameField").build();
    private static final MarshallingInfo<StructuredPojo> PASSWORDFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PasswordField").build();
    private static final MarshallingInfo<StructuredPojo> EMAILFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailField").build();
    private static final MarshallingInfo<List> PHONENUMBERFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberFields").build();
    private static final MarshallingInfo<List> ADDRESSFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AddressFields").build();

    private static final RequestInspectionACFPMarshaller instance = new RequestInspectionACFPMarshaller();

    public static RequestInspectionACFPMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RequestInspectionACFP requestInspectionACFP, ProtocolMarshaller protocolMarshaller) {

        if (requestInspectionACFP == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(requestInspectionACFP.getPayloadType(), PAYLOADTYPE_BINDING);
            protocolMarshaller.marshall(requestInspectionACFP.getUsernameField(), USERNAMEFIELD_BINDING);
            protocolMarshaller.marshall(requestInspectionACFP.getPasswordField(), PASSWORDFIELD_BINDING);
            protocolMarshaller.marshall(requestInspectionACFP.getEmailField(), EMAILFIELD_BINDING);
            protocolMarshaller.marshall(requestInspectionACFP.getPhoneNumberFields(), PHONENUMBERFIELDS_BINDING);
            protocolMarshaller.marshall(requestInspectionACFP.getAddressFields(), ADDRESSFIELDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
