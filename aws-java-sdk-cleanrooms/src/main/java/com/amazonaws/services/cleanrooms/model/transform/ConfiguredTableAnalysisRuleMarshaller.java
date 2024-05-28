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
package com.amazonaws.services.cleanrooms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfiguredTableAnalysisRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfiguredTableAnalysisRuleMarshaller {

    private static final MarshallingInfo<String> CONFIGUREDTABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredTableId").build();
    private static final MarshallingInfo<String> CONFIGUREDTABLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredTableArn").build();
    private static final MarshallingInfo<StructuredPojo> POLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policy").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();

    private static final ConfiguredTableAnalysisRuleMarshaller instance = new ConfiguredTableAnalysisRuleMarshaller();

    public static ConfiguredTableAnalysisRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfiguredTableAnalysisRule configuredTableAnalysisRule, ProtocolMarshaller protocolMarshaller) {

        if (configuredTableAnalysisRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configuredTableAnalysisRule.getConfiguredTableId(), CONFIGUREDTABLEID_BINDING);
            protocolMarshaller.marshall(configuredTableAnalysisRule.getConfiguredTableArn(), CONFIGUREDTABLEARN_BINDING);
            protocolMarshaller.marshall(configuredTableAnalysisRule.getPolicy(), POLICY_BINDING);
            protocolMarshaller.marshall(configuredTableAnalysisRule.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(configuredTableAnalysisRule.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(configuredTableAnalysisRule.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
