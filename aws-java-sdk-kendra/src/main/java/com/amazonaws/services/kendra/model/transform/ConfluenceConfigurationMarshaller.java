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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfluenceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfluenceConfigurationMarshaller {

    private static final MarshallingInfo<String> SERVERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ServerUrl").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<StructuredPojo> SPACECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpaceConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> PAGECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PageConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> BLOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlogConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ATTACHMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();

    private static final ConfluenceConfigurationMarshaller instance = new ConfluenceConfigurationMarshaller();

    public static ConfluenceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfluenceConfiguration confluenceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (confluenceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(confluenceConfiguration.getServerUrl(), SERVERURL_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getSpaceConfiguration(), SPACECONFIGURATION_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getPageConfiguration(), PAGECONFIGURATION_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getBlogConfiguration(), BLOGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getAttachmentConfiguration(), ATTACHMENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(confluenceConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
