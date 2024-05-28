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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SecurityControlDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SecurityControlDefinitionMarshaller {

    private static final MarshallingInfo<String> SECURITYCONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityControlId").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> REMEDIATIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemediationUrl").build();
    private static final MarshallingInfo<String> SEVERITYRATING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SeverityRating").build();
    private static final MarshallingInfo<String> CURRENTREGIONAVAILABILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentRegionAvailability").build();
    private static final MarshallingInfo<List> CUSTOMIZABLEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomizableProperties").build();
    private static final MarshallingInfo<Map> PARAMETERDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterDefinitions").build();

    private static final SecurityControlDefinitionMarshaller instance = new SecurityControlDefinitionMarshaller();

    public static SecurityControlDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SecurityControlDefinition securityControlDefinition, ProtocolMarshaller protocolMarshaller) {

        if (securityControlDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(securityControlDefinition.getSecurityControlId(), SECURITYCONTROLID_BINDING);
            protocolMarshaller.marshall(securityControlDefinition.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(securityControlDefinition.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(securityControlDefinition.getRemediationUrl(), REMEDIATIONURL_BINDING);
            protocolMarshaller.marshall(securityControlDefinition.getSeverityRating(), SEVERITYRATING_BINDING);
            protocolMarshaller.marshall(securityControlDefinition.getCurrentRegionAvailability(), CURRENTREGIONAVAILABILITY_BINDING);
            protocolMarshaller.marshall(securityControlDefinition.getCustomizableProperties(), CUSTOMIZABLEPROPERTIES_BINDING);
            protocolMarshaller.marshall(securityControlDefinition.getParameterDefinitions(), PARAMETERDEFINITIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
