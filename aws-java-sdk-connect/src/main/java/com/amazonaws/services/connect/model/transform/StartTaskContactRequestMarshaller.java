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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartTaskContactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartTaskContactRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> PREVIOUSCONTACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousContactId").build();
    private static final MarshallingInfo<String> CONTACTFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactFlowId").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Map> REFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("References").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<java.util.Date> SCHEDULEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TASKTEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskTemplateId").build();
    private static final MarshallingInfo<String> QUICKCONNECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuickConnectId").build();

    private static final StartTaskContactRequestMarshaller instance = new StartTaskContactRequestMarshaller();

    public static StartTaskContactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartTaskContactRequest startTaskContactRequest, ProtocolMarshaller protocolMarshaller) {

        if (startTaskContactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startTaskContactRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getPreviousContactId(), PREVIOUSCONTACTID_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getContactFlowId(), CONTACTFLOWID_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getReferences(), REFERENCES_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getScheduledTime(), SCHEDULEDTIME_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getTaskTemplateId(), TASKTEMPLATEID_BINDING);
            protocolMarshaller.marshall(startTaskContactRequest.getQuickConnectId(), QUICKCONNECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
