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
package com.amazonaws.services.emrcontainers.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrcontainers.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LakeFormationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LakeFormationConfigurationMarshaller {

    private static final MarshallingInfo<String> AUTHORIZEDSESSIONTAGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizedSessionTagValue").build();
    private static final MarshallingInfo<StructuredPojo> SECURENAMESPACEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secureNamespaceInfo").build();
    private static final MarshallingInfo<String> QUERYENGINEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryEngineRoleArn").build();

    private static final LakeFormationConfigurationMarshaller instance = new LakeFormationConfigurationMarshaller();

    public static LakeFormationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LakeFormationConfiguration lakeFormationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (lakeFormationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lakeFormationConfiguration.getAuthorizedSessionTagValue(), AUTHORIZEDSESSIONTAGVALUE_BINDING);
            protocolMarshaller.marshall(lakeFormationConfiguration.getSecureNamespaceInfo(), SECURENAMESPACEINFO_BINDING);
            protocolMarshaller.marshall(lakeFormationConfiguration.getQueryEngineRoleArn(), QUERYENGINEROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
