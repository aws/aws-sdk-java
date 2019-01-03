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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigRuleEvaluationStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigRuleEvaluationStatusMarshaller {

    private static final MarshallingInfo<String> CONFIGRULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigRuleName").build();
    private static final MarshallingInfo<String> CONFIGRULEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigRuleArn").build();
    private static final MarshallingInfo<String> CONFIGRULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigRuleId").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULINVOCATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulInvocationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTFAILEDINVOCATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastFailedInvocationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULEVALUATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulEvaluationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTFAILEDEVALUATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastFailedEvaluationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> FIRSTACTIVATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirstActivatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastErrorCode").build();
    private static final MarshallingInfo<String> LASTERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastErrorMessage").build();
    private static final MarshallingInfo<Boolean> FIRSTEVALUATIONSTARTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirstEvaluationStarted").build();

    private static final ConfigRuleEvaluationStatusMarshaller instance = new ConfigRuleEvaluationStatusMarshaller();

    public static ConfigRuleEvaluationStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigRuleEvaluationStatus configRuleEvaluationStatus, ProtocolMarshaller protocolMarshaller) {

        if (configRuleEvaluationStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configRuleEvaluationStatus.getConfigRuleName(), CONFIGRULENAME_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getConfigRuleArn(), CONFIGRULEARN_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getConfigRuleId(), CONFIGRULEID_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getLastSuccessfulInvocationTime(), LASTSUCCESSFULINVOCATIONTIME_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getLastFailedInvocationTime(), LASTFAILEDINVOCATIONTIME_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getLastSuccessfulEvaluationTime(), LASTSUCCESSFULEVALUATIONTIME_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getLastFailedEvaluationTime(), LASTFAILEDEVALUATIONTIME_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getFirstActivatedTime(), FIRSTACTIVATEDTIME_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getLastErrorCode(), LASTERRORCODE_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getLastErrorMessage(), LASTERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(configRuleEvaluationStatus.getFirstEvaluationStarted(), FIRSTEVALUATIONSTARTED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
