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
package com.amazonaws.services.proton.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.proton.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateEnvironmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateEnvironmentRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ENVIRONMENTACCOUNTCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentAccountConnectionId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROTONSERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("protonServiceRoleArn").build();
    private static final MarshallingInfo<String> SPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("spec").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TEMPLATEMAJORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateMajorVersion").build();
    private static final MarshallingInfo<String> TEMPLATEMINORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateMinorVersion").build();
    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateName").build();

    private static final CreateEnvironmentRequestMarshaller instance = new CreateEnvironmentRequestMarshaller();

    public static CreateEnvironmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateEnvironmentRequest createEnvironmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createEnvironmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createEnvironmentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getEnvironmentAccountConnectionId(), ENVIRONMENTACCOUNTCONNECTIONID_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getProtonServiceRoleArn(), PROTONSERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getSpec(), SPEC_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getTemplateMajorVersion(), TEMPLATEMAJORVERSION_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getTemplateMinorVersion(), TEMPLATEMINORVERSION_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getTemplateName(), TEMPLATENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
