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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SecurityControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SecurityControlMarshaller {

    private static final MarshallingInfo<String> SECURITYCONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityControlId").build();
    private static final MarshallingInfo<String> SECURITYCONTROLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityControlArn").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> REMEDIATIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemediationUrl").build();
    private static final MarshallingInfo<String> SEVERITYRATING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SeverityRating").build();
    private static final MarshallingInfo<String> SECURITYCONTROLSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityControlStatus").build();
    private static final MarshallingInfo<String> UPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateStatus").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<String> LASTUPDATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateReason").build();

    private static final SecurityControlMarshaller instance = new SecurityControlMarshaller();

    public static SecurityControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SecurityControl securityControl, ProtocolMarshaller protocolMarshaller) {

        if (securityControl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(securityControl.getSecurityControlId(), SECURITYCONTROLID_BINDING);
            protocolMarshaller.marshall(securityControl.getSecurityControlArn(), SECURITYCONTROLARN_BINDING);
            protocolMarshaller.marshall(securityControl.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(securityControl.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(securityControl.getRemediationUrl(), REMEDIATIONURL_BINDING);
            protocolMarshaller.marshall(securityControl.getSeverityRating(), SEVERITYRATING_BINDING);
            protocolMarshaller.marshall(securityControl.getSecurityControlStatus(), SECURITYCONTROLSTATUS_BINDING);
            protocolMarshaller.marshall(securityControl.getUpdateStatus(), UPDATESTATUS_BINDING);
            protocolMarshaller.marshall(securityControl.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(securityControl.getLastUpdateReason(), LASTUPDATEREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
