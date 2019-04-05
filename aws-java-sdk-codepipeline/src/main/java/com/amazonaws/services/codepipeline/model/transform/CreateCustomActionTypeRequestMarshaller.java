/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCustomActionTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCustomActionTypeRequestMarshaller {

    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("category").build();
    private static final MarshallingInfo<String> PROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("provider").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<StructuredPojo> SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("settings").build();
    private static final MarshallingInfo<List> CONFIGURATIONPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationProperties").build();
    private static final MarshallingInfo<StructuredPojo> INPUTARTIFACTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputArtifactDetails").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTARTIFACTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputArtifactDetails").build();

    private static final CreateCustomActionTypeRequestMarshaller instance = new CreateCustomActionTypeRequestMarshaller();

    public static CreateCustomActionTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCustomActionTypeRequest createCustomActionTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCustomActionTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCustomActionTypeRequest.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(createCustomActionTypeRequest.getProvider(), PROVIDER_BINDING);
            protocolMarshaller.marshall(createCustomActionTypeRequest.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(createCustomActionTypeRequest.getSettings(), SETTINGS_BINDING);
            protocolMarshaller.marshall(createCustomActionTypeRequest.getConfigurationProperties(), CONFIGURATIONPROPERTIES_BINDING);
            protocolMarshaller.marshall(createCustomActionTypeRequest.getInputArtifactDetails(), INPUTARTIFACTDETAILS_BINDING);
            protocolMarshaller.marshall(createCustomActionTypeRequest.getOutputArtifactDetails(), OUTPUTARTIFACTDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
