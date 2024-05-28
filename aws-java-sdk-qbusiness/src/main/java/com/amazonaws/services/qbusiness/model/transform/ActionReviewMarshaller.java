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
package com.amazonaws.services.qbusiness.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionReviewMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionReviewMarshaller {

    private static final MarshallingInfo<String> PLUGINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pluginId").build();
    private static final MarshallingInfo<String> PLUGINTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pluginType").build();
    private static final MarshallingInfo<Map> PAYLOAD_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("payload").build();
    private static final MarshallingInfo<String> PAYLOADFIELDNAMESEPARATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("payloadFieldNameSeparator").build();

    private static final ActionReviewMarshaller instance = new ActionReviewMarshaller();

    public static ActionReviewMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionReview actionReview, ProtocolMarshaller protocolMarshaller) {

        if (actionReview == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionReview.getPluginId(), PLUGINID_BINDING);
            protocolMarshaller.marshall(actionReview.getPluginType(), PLUGINTYPE_BINDING);
            protocolMarshaller.marshall(actionReview.getPayload(), PAYLOAD_BINDING);
            protocolMarshaller.marshall(actionReview.getPayloadFieldNameSeparator(), PAYLOADFIELDNAMESEPARATOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
