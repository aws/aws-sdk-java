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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DebugRuleConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DebugRuleConfigurationMarshaller {

    private static final MarshallingInfo<String> RULECONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleConfigurationName").build();
    private static final MarshallingInfo<String> LOCALPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LocalPath").build();
    private static final MarshallingInfo<String> S3OUTPUTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3OutputPath").build();
    private static final MarshallingInfo<String> RULEEVALUATORIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleEvaluatorImage").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<Integer> VOLUMESIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeSizeInGB").build();
    private static final MarshallingInfo<Map> RULEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleParameters").build();

    private static final DebugRuleConfigurationMarshaller instance = new DebugRuleConfigurationMarshaller();

    public static DebugRuleConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DebugRuleConfiguration debugRuleConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (debugRuleConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(debugRuleConfiguration.getRuleConfigurationName(), RULECONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(debugRuleConfiguration.getLocalPath(), LOCALPATH_BINDING);
            protocolMarshaller.marshall(debugRuleConfiguration.getS3OutputPath(), S3OUTPUTPATH_BINDING);
            protocolMarshaller.marshall(debugRuleConfiguration.getRuleEvaluatorImage(), RULEEVALUATORIMAGE_BINDING);
            protocolMarshaller.marshall(debugRuleConfiguration.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(debugRuleConfiguration.getVolumeSizeInGB(), VOLUMESIZEINGB_BINDING);
            protocolMarshaller.marshall(debugRuleConfiguration.getRuleParameters(), RULEPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
