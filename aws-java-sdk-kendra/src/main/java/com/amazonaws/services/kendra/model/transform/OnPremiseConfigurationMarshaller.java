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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OnPremiseConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OnPremiseConfigurationMarshaller {

    private static final MarshallingInfo<String> HOSTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HostUrl").build();
    private static final MarshallingInfo<String> ORGANIZATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationName").build();
    private static final MarshallingInfo<StructuredPojo> SSLCERTIFICATES3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslCertificateS3Path").build();

    private static final OnPremiseConfigurationMarshaller instance = new OnPremiseConfigurationMarshaller();

    public static OnPremiseConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OnPremiseConfiguration onPremiseConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (onPremiseConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(onPremiseConfiguration.getHostUrl(), HOSTURL_BINDING);
            protocolMarshaller.marshall(onPremiseConfiguration.getOrganizationName(), ORGANIZATIONNAME_BINDING);
            protocolMarshaller.marshall(onPremiseConfiguration.getSslCertificateS3Path(), SSLCERTIFICATES3PATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
