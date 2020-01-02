/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDomainConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDomainConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("domainConfigurationName").build();
    private static final MarshallingInfo<StructuredPojo> AUTHORIZERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerConfig").build();
    private static final MarshallingInfo<String> DOMAINCONFIGURATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainConfigurationStatus").build();
    private static final MarshallingInfo<Boolean> REMOVEAUTHORIZERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeAuthorizerConfig").build();

    private static final UpdateDomainConfigurationRequestMarshaller instance = new UpdateDomainConfigurationRequestMarshaller();

    public static UpdateDomainConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDomainConfigurationRequest updateDomainConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDomainConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDomainConfigurationRequest.getDomainConfigurationName(), DOMAINCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(updateDomainConfigurationRequest.getAuthorizerConfig(), AUTHORIZERCONFIG_BINDING);
            protocolMarshaller.marshall(updateDomainConfigurationRequest.getDomainConfigurationStatus(), DOMAINCONFIGURATIONSTATUS_BINDING);
            protocolMarshaller.marshall(updateDomainConfigurationRequest.getRemoveAuthorizerConfig(), REMOVEAUTHORIZERCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
