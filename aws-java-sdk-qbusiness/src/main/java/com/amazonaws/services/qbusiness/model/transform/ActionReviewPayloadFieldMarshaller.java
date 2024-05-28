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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionReviewPayloadFieldMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionReviewPayloadFieldMarshaller {

    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<Integer> DISPLAYORDER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayOrder").build();
    private static final MarshallingInfo<String> DISPLAYDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayDescription").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<List> ALLOWEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("allowedValues").build();
    private static final MarshallingInfo<String> ALLOWEDFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedFormat").build();
    private static final MarshallingInfo<Boolean> REQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("required").build();

    private static final ActionReviewPayloadFieldMarshaller instance = new ActionReviewPayloadFieldMarshaller();

    public static ActionReviewPayloadFieldMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionReviewPayloadField actionReviewPayloadField, ProtocolMarshaller protocolMarshaller) {

        if (actionReviewPayloadField == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionReviewPayloadField.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(actionReviewPayloadField.getDisplayOrder(), DISPLAYORDER_BINDING);
            protocolMarshaller.marshall(actionReviewPayloadField.getDisplayDescription(), DISPLAYDESCRIPTION_BINDING);
            protocolMarshaller.marshall(actionReviewPayloadField.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(actionReviewPayloadField.getAllowedValues(), ALLOWEDVALUES_BINDING);
            protocolMarshaller.marshall(actionReviewPayloadField.getAllowedFormat(), ALLOWEDFORMAT_BINDING);
            protocolMarshaller.marshall(actionReviewPayloadField.getRequired(), REQUIRED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
