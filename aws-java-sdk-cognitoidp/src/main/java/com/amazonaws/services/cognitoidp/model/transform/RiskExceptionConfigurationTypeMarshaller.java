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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RiskExceptionConfigurationTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RiskExceptionConfigurationTypeMarshaller {

    private static final MarshallingInfo<List> BLOCKEDIPRANGELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockedIPRangeList").build();
    private static final MarshallingInfo<List> SKIPPEDIPRANGELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkippedIPRangeList").build();

    private static final RiskExceptionConfigurationTypeMarshaller instance = new RiskExceptionConfigurationTypeMarshaller();

    public static RiskExceptionConfigurationTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RiskExceptionConfigurationType riskExceptionConfigurationType, ProtocolMarshaller protocolMarshaller) {

        if (riskExceptionConfigurationType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(riskExceptionConfigurationType.getBlockedIPRangeList(), BLOCKEDIPRANGELIST_BINDING);
            protocolMarshaller.marshall(riskExceptionConfigurationType.getSkippedIPRangeList(), SKIPPEDIPRANGELIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
