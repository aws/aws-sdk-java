/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleActionMarshaller {

    private static final MarshallingInfo<String> ACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionType").build();
    private static final MarshallingInfo<StructuredPojo> TASKACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskAction").build();
    private static final MarshallingInfo<StructuredPojo> EVENTBRIDGEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventBridgeAction").build();
    private static final MarshallingInfo<StructuredPojo> ASSIGNCONTACTCATEGORYACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignContactCategoryAction").build();
    private static final MarshallingInfo<StructuredPojo> SENDNOTIFICATIONACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SendNotificationAction").build();

    private static final RuleActionMarshaller instance = new RuleActionMarshaller();

    public static RuleActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuleAction ruleAction, ProtocolMarshaller protocolMarshaller) {

        if (ruleAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ruleAction.getActionType(), ACTIONTYPE_BINDING);
            protocolMarshaller.marshall(ruleAction.getTaskAction(), TASKACTION_BINDING);
            protocolMarshaller.marshall(ruleAction.getEventBridgeAction(), EVENTBRIDGEACTION_BINDING);
            protocolMarshaller.marshall(ruleAction.getAssignContactCategoryAction(), ASSIGNCONTACTCATEGORYACTION_BINDING);
            protocolMarshaller.marshall(ruleAction.getSendNotificationAction(), SENDNOTIFICATIONACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
