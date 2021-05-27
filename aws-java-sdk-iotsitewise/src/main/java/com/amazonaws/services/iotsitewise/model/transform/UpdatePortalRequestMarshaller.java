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
package com.amazonaws.services.iotsitewise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePortalRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePortalRequestMarshaller {

    private static final MarshallingInfo<String> PORTALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("portalId").build();
    private static final MarshallingInfo<String> PORTALNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portalName").build();
    private static final MarshallingInfo<String> PORTALDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portalDescription").build();
    private static final MarshallingInfo<String> PORTALCONTACTEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portalContactEmail").build();
    private static final MarshallingInfo<StructuredPojo> PORTALLOGOIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portalLogoImage").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> NOTIFICATIONSENDEREMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notificationSenderEmail").build();
    private static final MarshallingInfo<StructuredPojo> ALARMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarms").build();

    private static final UpdatePortalRequestMarshaller instance = new UpdatePortalRequestMarshaller();

    public static UpdatePortalRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePortalRequest updatePortalRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePortalRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePortalRequest.getPortalId(), PORTALID_BINDING);
            protocolMarshaller.marshall(updatePortalRequest.getPortalName(), PORTALNAME_BINDING);
            protocolMarshaller.marshall(updatePortalRequest.getPortalDescription(), PORTALDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updatePortalRequest.getPortalContactEmail(), PORTALCONTACTEMAIL_BINDING);
            protocolMarshaller.marshall(updatePortalRequest.getPortalLogoImage(), PORTALLOGOIMAGE_BINDING);
            protocolMarshaller.marshall(updatePortalRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updatePortalRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updatePortalRequest.getNotificationSenderEmail(), NOTIFICATIONSENDEREMAIL_BINDING);
            protocolMarshaller.marshall(updatePortalRequest.getAlarms(), ALARMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
