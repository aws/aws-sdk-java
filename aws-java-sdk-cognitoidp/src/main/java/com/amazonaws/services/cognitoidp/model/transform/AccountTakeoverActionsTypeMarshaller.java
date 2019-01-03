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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccountTakeoverActionsTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountTakeoverActionsTypeMarshaller {

    private static final MarshallingInfo<StructuredPojo> LOWACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LowAction").build();
    private static final MarshallingInfo<StructuredPojo> MEDIUMACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediumAction").build();
    private static final MarshallingInfo<StructuredPojo> HIGHACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HighAction").build();

    private static final AccountTakeoverActionsTypeMarshaller instance = new AccountTakeoverActionsTypeMarshaller();

    public static AccountTakeoverActionsTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountTakeoverActionsType accountTakeoverActionsType, ProtocolMarshaller protocolMarshaller) {

        if (accountTakeoverActionsType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountTakeoverActionsType.getLowAction(), LOWACTION_BINDING);
            protocolMarshaller.marshall(accountTakeoverActionsType.getMediumAction(), MEDIUMACTION_BINDING);
            protocolMarshaller.marshall(accountTakeoverActionsType.getHighAction(), HIGHACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
