/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActivityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActivityMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONDITIONALSPLIT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConditionalSplit").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EMAIL").build();
    private static final MarshallingInfo<StructuredPojo> HOLDOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Holdout").build();
    private static final MarshallingInfo<StructuredPojo> MULTICONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MultiCondition").build();
    private static final MarshallingInfo<StructuredPojo> RANDOMSPLIT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RandomSplit").build();
    private static final MarshallingInfo<StructuredPojo> WAIT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Wait").build();

    private static final ActivityMarshaller instance = new ActivityMarshaller();

    public static ActivityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Activity activity, ProtocolMarshaller protocolMarshaller) {

        if (activity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activity.getConditionalSplit(), CONDITIONALSPLIT_BINDING);
            protocolMarshaller.marshall(activity.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(activity.getEMAIL(), EMAIL_BINDING);
            protocolMarshaller.marshall(activity.getHoldout(), HOLDOUT_BINDING);
            protocolMarshaller.marshall(activity.getMultiCondition(), MULTICONDITION_BINDING);
            protocolMarshaller.marshall(activity.getRandomSplit(), RANDOMSPLIT_BINDING);
            protocolMarshaller.marshall(activity.getWait(), WAIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
