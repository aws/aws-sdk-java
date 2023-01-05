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
package com.amazonaws.services.securitylake.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSubscriberRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSubscriberRequestMarshaller {

    private static final MarshallingInfo<List> ACCESSTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accessTypes").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> EXTERNALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalId").build();
    private static final MarshallingInfo<List> SOURCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sourceTypes").build();
    private static final MarshallingInfo<String> SUBSCRIBERDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberDescription").build();
    private static final MarshallingInfo<String> SUBSCRIBERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberName").build();

    private static final CreateSubscriberRequestMarshaller instance = new CreateSubscriberRequestMarshaller();

    public static CreateSubscriberRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSubscriberRequest createSubscriberRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSubscriberRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSubscriberRequest.getAccessTypes(), ACCESSTYPES_BINDING);
            protocolMarshaller.marshall(createSubscriberRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(createSubscriberRequest.getExternalId(), EXTERNALID_BINDING);
            protocolMarshaller.marshall(createSubscriberRequest.getSourceTypes(), SOURCETYPES_BINDING);
            protocolMarshaller.marshall(createSubscriberRequest.getSubscriberDescription(), SUBSCRIBERDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createSubscriberRequest.getSubscriberName(), SUBSCRIBERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
