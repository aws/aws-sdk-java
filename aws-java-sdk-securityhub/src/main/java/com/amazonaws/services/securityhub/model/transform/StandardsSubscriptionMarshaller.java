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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StandardsSubscriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StandardsSubscriptionMarshaller {

    private static final MarshallingInfo<String> STANDARDSSUBSCRIPTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsSubscriptionArn").build();
    private static final MarshallingInfo<String> STANDARDSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsArn").build();
    private static final MarshallingInfo<Map> STANDARDSINPUT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StandardsInput").build();
    private static final MarshallingInfo<String> STANDARDSSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsStatus").build();

    private static final StandardsSubscriptionMarshaller instance = new StandardsSubscriptionMarshaller();

    public static StandardsSubscriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StandardsSubscription standardsSubscription, ProtocolMarshaller protocolMarshaller) {

        if (standardsSubscription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(standardsSubscription.getStandardsSubscriptionArn(), STANDARDSSUBSCRIPTIONARN_BINDING);
            protocolMarshaller.marshall(standardsSubscription.getStandardsArn(), STANDARDSARN_BINDING);
            protocolMarshaller.marshall(standardsSubscription.getStandardsInput(), STANDARDSINPUT_BINDING);
            protocolMarshaller.marshall(standardsSubscription.getStandardsStatus(), STANDARDSSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
