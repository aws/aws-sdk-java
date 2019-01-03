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
package com.amazonaws.services.globalaccelerator.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.globalaccelerator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AcceleratorAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AcceleratorAttributesMarshaller {

    private static final MarshallingInfo<Boolean> FLOWLOGSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlowLogsEnabled").build();
    private static final MarshallingInfo<String> FLOWLOGSS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlowLogsS3Bucket").build();
    private static final MarshallingInfo<String> FLOWLOGSS3PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlowLogsS3Prefix").build();

    private static final AcceleratorAttributesMarshaller instance = new AcceleratorAttributesMarshaller();

    public static AcceleratorAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AcceleratorAttributes acceleratorAttributes, ProtocolMarshaller protocolMarshaller) {

        if (acceleratorAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(acceleratorAttributes.getFlowLogsEnabled(), FLOWLOGSENABLED_BINDING);
            protocolMarshaller.marshall(acceleratorAttributes.getFlowLogsS3Bucket(), FLOWLOGSS3BUCKET_BINDING);
            protocolMarshaller.marshall(acceleratorAttributes.getFlowLogsS3Prefix(), FLOWLOGSS3PREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
