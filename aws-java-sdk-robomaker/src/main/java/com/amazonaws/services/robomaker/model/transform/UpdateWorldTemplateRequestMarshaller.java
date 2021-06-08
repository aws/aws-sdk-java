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
package com.amazonaws.services.robomaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateWorldTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWorldTemplateRequestMarshaller {

    private static final MarshallingInfo<String> TEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("template").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> TEMPLATEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateBody").build();
    private static final MarshallingInfo<StructuredPojo> TEMPLATELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateLocation").build();

    private static final UpdateWorldTemplateRequestMarshaller instance = new UpdateWorldTemplateRequestMarshaller();

    public static UpdateWorldTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWorldTemplateRequest updateWorldTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateWorldTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWorldTemplateRequest.getTemplate(), TEMPLATE_BINDING);
            protocolMarshaller.marshall(updateWorldTemplateRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateWorldTemplateRequest.getTemplateBody(), TEMPLATEBODY_BINDING);
            protocolMarshaller.marshall(updateWorldTemplateRequest.getTemplateLocation(), TEMPLATELOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
