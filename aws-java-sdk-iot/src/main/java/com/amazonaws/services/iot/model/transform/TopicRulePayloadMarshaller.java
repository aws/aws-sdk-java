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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TopicRulePayloadMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TopicRulePayloadMarshaller {

    private static final MarshallingInfo<String> SQL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sql").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actions").build();
    private static final MarshallingInfo<Boolean> RULEDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleDisabled").build();
    private static final MarshallingInfo<String> AWSIOTSQLVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsIotSqlVersion").build();
    private static final MarshallingInfo<StructuredPojo> ERRORACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorAction").build();

    private static final TopicRulePayloadMarshaller instance = new TopicRulePayloadMarshaller();

    public static TopicRulePayloadMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TopicRulePayload topicRulePayload, ProtocolMarshaller protocolMarshaller) {

        if (topicRulePayload == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(topicRulePayload.getSql(), SQL_BINDING);
            protocolMarshaller.marshall(topicRulePayload.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(topicRulePayload.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(topicRulePayload.getRuleDisabled(), RULEDISABLED_BINDING);
            protocolMarshaller.marshall(topicRulePayload.getAwsIotSqlVersion(), AWSIOTSQLVERSION_BINDING);
            protocolMarshaller.marshall(topicRulePayload.getErrorAction(), ERRORACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
