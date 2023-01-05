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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RStudioServerProDomainSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RStudioServerProDomainSettingsMarshaller {

    private static final MarshallingInfo<String> DOMAINEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainExecutionRoleArn").build();
    private static final MarshallingInfo<String> RSTUDIOCONNECTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RStudioConnectUrl").build();
    private static final MarshallingInfo<String> RSTUDIOPACKAGEMANAGERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RStudioPackageManagerUrl").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTRESOURCESPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultResourceSpec").build();

    private static final RStudioServerProDomainSettingsMarshaller instance = new RStudioServerProDomainSettingsMarshaller();

    public static RStudioServerProDomainSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RStudioServerProDomainSettings rStudioServerProDomainSettings, ProtocolMarshaller protocolMarshaller) {

        if (rStudioServerProDomainSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rStudioServerProDomainSettings.getDomainExecutionRoleArn(), DOMAINEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(rStudioServerProDomainSettings.getRStudioConnectUrl(), RSTUDIOCONNECTURL_BINDING);
            protocolMarshaller.marshall(rStudioServerProDomainSettings.getRStudioPackageManagerUrl(), RSTUDIOPACKAGEMANAGERURL_BINDING);
            protocolMarshaller.marshall(rStudioServerProDomainSettings.getDefaultResourceSpec(), DEFAULTRESOURCESPEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
