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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChannelSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChannelSpecificationMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Boolean> ISREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsRequired").build();
    private static final MarshallingInfo<List> SUPPORTEDCONTENTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedContentTypes").build();
    private static final MarshallingInfo<List> SUPPORTEDCOMPRESSIONTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedCompressionTypes").build();
    private static final MarshallingInfo<List> SUPPORTEDINPUTMODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedInputModes").build();

    private static final ChannelSpecificationMarshaller instance = new ChannelSpecificationMarshaller();

    public static ChannelSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChannelSpecification channelSpecification, ProtocolMarshaller protocolMarshaller) {

        if (channelSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(channelSpecification.getName(), NAME_BINDING);
            protocolMarshaller.marshall(channelSpecification.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(channelSpecification.getIsRequired(), ISREQUIRED_BINDING);
            protocolMarshaller.marshall(channelSpecification.getSupportedContentTypes(), SUPPORTEDCONTENTTYPES_BINDING);
            protocolMarshaller.marshall(channelSpecification.getSupportedCompressionTypes(), SUPPORTEDCOMPRESSIONTYPES_BINDING);
            protocolMarshaller.marshall(channelSpecification.getSupportedInputModes(), SUPPORTEDINPUTMODES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
