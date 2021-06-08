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
package com.amazonaws.services.dlm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ShareRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ShareRuleMarshaller {

    private static final MarshallingInfo<List> TARGETACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetAccounts").build();
    private static final MarshallingInfo<Integer> UNSHAREINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnshareInterval").build();
    private static final MarshallingInfo<String> UNSHAREINTERVALUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnshareIntervalUnit").build();

    private static final ShareRuleMarshaller instance = new ShareRuleMarshaller();

    public static ShareRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ShareRule shareRule, ProtocolMarshaller protocolMarshaller) {

        if (shareRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(shareRule.getTargetAccounts(), TARGETACCOUNTS_BINDING);
            protocolMarshaller.marshall(shareRule.getUnshareInterval(), UNSHAREINTERVAL_BINDING);
            protocolMarshaller.marshall(shareRule.getUnshareIntervalUnit(), UNSHAREINTERVALUNIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
